SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

ALTER PROCEDURE [dbo].[sp_TransponerEAV_pag_22]
AS
BEGIN
    SET NOCOUNT ON;

    DECLARE @cols NVARCHAR(MAX);
    DECLARE @query NVARCHAR(MAX);

    SELECT @cols = STRING_AGG(QUOTENAME(Nombre02+'  '+Nombre01), ',')
    FROM columns_pag_22;

    SET @query = '
    SELECT RowID, RowNombre3,RowNombre,RowNombre2,' + @cols + '
    FROM
    (
        SELECT 
            a.RowID,
            a.Nombre01 AS RowNombre,
            a.Nombre02 AS RowNombre2,
            a.Nombre03 AS RowNombre3,
            pr.Nombre02+''  ''+pr.Nombre01 AS ColumnNombre,
            concat(pa.Valor01,''     '',pa.Valor02) as Valor01
        FROM ColumnRows_pag_22 pa
        INNER JOIN Columns_pag_22 pr ON pr.ColumnID = pa.ColumnID
        INNER JOIN Rows_pag_22 a ON a.RowID = pa.RowID
    ) AS src
    PIVOT
    (
        MAX(Valor01)
        FOR ColumnNombre IN (' + @cols + ')
    ) AS pvt
    order by RowID;
    ';

    EXEC sp_executesql @query;

END
GO

exec sp_TransponerEAV_pag_22
