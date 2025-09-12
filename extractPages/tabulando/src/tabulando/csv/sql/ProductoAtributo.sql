SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ProductoAtributos_pag_22](
	[ProductoAtributoID] [int] IDENTITY(1,1) NOT NULL,
	[ProductoID] [int] NOT NULL,
	[AtributoID] [int] NOT NULL,
	[Valor01] [nvarchar](100) NULL,
	[Valor02] [nvarchar](100) NULL
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[ProductoAtributos_pag_22] ADD PRIMARY KEY CLUSTERED 
(
	[ProductoAtributoID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [dbo].[ProductoAtributos_pag_22]  WITH CHECK ADD FOREIGN KEY([AtributoID])
REFERENCES [dbo].[Atributos_pag_22] ([AtributoID])
GO
ALTER TABLE [dbo].[ProductoAtributos_pag_22]  WITH CHECK ADD FOREIGN KEY([AtributoID])
REFERENCES [dbo].[Atributos_pag_22] ([AtributoID])
GO
ALTER TABLE [dbo].[ProductoAtributos_pag_22]  WITH CHECK ADD FOREIGN KEY([ProductoID])
REFERENCES [dbo].[Productos_pag_22] ([ProductoID])
GO
ALTER TABLE [dbo].[ProductoAtributos_pag_22]  WITH CHECK ADD FOREIGN KEY([ProductoID])
REFERENCES [dbo].[Productos_pag_22] ([ProductoID])
GO
