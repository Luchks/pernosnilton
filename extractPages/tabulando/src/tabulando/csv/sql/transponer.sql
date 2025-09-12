SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[sp_TransponerEAV_pag_22]
AS
BEGIN
    SET NOCOUNT ON;

    DECLARE @cols NVARCHAR(MAX);
    DECLARE @query NVARCHAR(MAX);

    SELECT @cols = STRING_AGG(QUOTENAME(Nombre03+'  '+Nombre02), ',')
    FROM productos_pag_22;

    SET @query = '
    SELECT AtributoID, AtributoNombre,AtributoNombre2,' + @cols + '
    FROM
    (
        SELECT 
            a.AtributoID,
            a.Nombre01 AS AtributoNombre,
            a.Nombre02 AS AtributoNombre2,
            pr.Nombre03+''  ''+pr.Nombre02 AS ProductoNombre,
            concat(pa.Valor01,''     '',pa.Valor02) as Valor01
        FROM ProductoAtributos_pag_22 pa
        INNER JOIN Productos_pag_22 pr ON pr.ProductoID = pa.ProductoID
        INNER JOIN Atributos_pag_22 a ON a.AtributoID = pa.AtributoID
    ) AS src
    PIVOT
    (
        MAX(Valor01)
        FOR ProductoNombre IN (' + @cols + ')
    ) AS pvt
    order by AtributoID;
    ';

    EXEC sp_executesql @query;

END
GO
