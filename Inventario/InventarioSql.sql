USE [master]
GO
/****** Object:  Database [inventario]    Script Date: 6/5/2023 20:55:21 ******/
CREATE DATABASE [inventario]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'inventario', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\inventario.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'inventario_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\inventario_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [inventario] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [inventario].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [inventario] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [inventario] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [inventario] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [inventario] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [inventario] SET ARITHABORT OFF 
GO
ALTER DATABASE [inventario] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [inventario] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [inventario] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [inventario] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [inventario] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [inventario] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [inventario] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [inventario] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [inventario] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [inventario] SET  DISABLE_BROKER 
GO
ALTER DATABASE [inventario] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [inventario] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [inventario] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [inventario] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [inventario] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [inventario] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [inventario] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [inventario] SET RECOVERY FULL 
GO
ALTER DATABASE [inventario] SET  MULTI_USER 
GO
ALTER DATABASE [inventario] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [inventario] SET DB_CHAINING OFF 
GO
ALTER DATABASE [inventario] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [inventario] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [inventario] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [inventario] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'inventario', N'ON'
GO
ALTER DATABASE [inventario] SET QUERY_STORE = ON
GO
ALTER DATABASE [inventario] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [inventario]
GO
/****** Object:  Table [dbo].[Articulo]    Script Date: 6/5/2023 20:55:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Articulo](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](20) NOT NULL,
	[Descripcion] [varchar](100) NOT NULL,
	[Valor] [float] NOT NULL,
	[Categoria] [varchar](20) NOT NULL,
	[Cantidad] [int] NOT NULL,
 CONSTRAINT [PK_Articulo] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Entrada]    Script Date: 6/5/2023 20:55:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Entrada](
	[Factura] [int] IDENTITY(1,1) NOT NULL,
	[Fecha] [date] NOT NULL,
	[Cantidad] [int] NOT NULL,
	[Articulo] [int] NOT NULL,
 CONSTRAINT [PK_Table_1] PRIMARY KEY CLUSTERED 
(
	[Factura] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Salida]    Script Date: 6/5/2023 20:55:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Salida](
	[Factura] [int] IDENTITY(1,1) NOT NULL,
	[Fecha] [date] NOT NULL,
	[Cantidad] [int] NOT NULL,
	[Articulo] [int] NOT NULL,
	[TelefonoC] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Salida] PRIMARY KEY CLUSTERED 
(
	[Factura] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Articulo] ON 

INSERT [dbo].[Articulo] ([ID], [Nombre], [Descripcion], [Valor], [Categoria], [Cantidad]) VALUES (1, N'CN001', N'Nike Roja Hombre', 75, N'Camisa', 1)
INSERT [dbo].[Articulo] ([ID], [Nombre], [Descripcion], [Valor], [Categoria], [Cantidad]) VALUES (2, N'ZN001', N'Nike Blanco Unisexo', 75, N'Zapato', 0)
INSERT [dbo].[Articulo] ([ID], [Nombre], [Descripcion], [Valor], [Categoria], [Cantidad]) VALUES (3, N'PA023', N'Adidas Gris Mujer', 40.5, N'Pantalon', 0)
INSERT [dbo].[Articulo] ([ID], [Nombre], [Descripcion], [Valor], [Categoria], [Cantidad]) VALUES (5, N'CP001', N'Puma Negra Unisexo', 70.2300033569336, N'Camisa', 0)
INSERT [dbo].[Articulo] ([ID], [Nombre], [Descripcion], [Valor], [Categoria], [Cantidad]) VALUES (6, N'ZR005', N'Reebok Negro Unisexo', 80.34, N'Zapato', 0)
INSERT [dbo].[Articulo] ([ID], [Nombre], [Descripcion], [Valor], [Categoria], [Cantidad]) VALUES (7, N'PV004', N'Vanz Cafe Unisexo', 60, N'Pantalon', 0)
INSERT [dbo].[Articulo] ([ID], [Nombre], [Descripcion], [Valor], [Categoria], [Cantidad]) VALUES (8, N'ZC008', N'Converse Negro Unisexo', 50, N'Zapato', 0)
INSERT [dbo].[Articulo] ([ID], [Nombre], [Descripcion], [Valor], [Categoria], [Cantidad]) VALUES (9, N'CL008', N'Levi´s Blanca Hombre', 73, N'Camisa', 0)
SET IDENTITY_INSERT [dbo].[Articulo] OFF
GO
SET IDENTITY_INSERT [dbo].[Entrada] ON 

INSERT [dbo].[Entrada] ([Factura], [Fecha], [Cantidad], [Articulo]) VALUES (9, CAST(N'2023-05-23' AS Date), 1, 1)
SET IDENTITY_INSERT [dbo].[Entrada] OFF
GO
ALTER TABLE [dbo].[Entrada]  WITH CHECK ADD  CONSTRAINT [FK_Entrada_Articulo] FOREIGN KEY([Articulo])
REFERENCES [dbo].[Articulo] ([ID])
GO
ALTER TABLE [dbo].[Entrada] CHECK CONSTRAINT [FK_Entrada_Articulo]
GO
ALTER TABLE [dbo].[Salida]  WITH CHECK ADD  CONSTRAINT [FK_Salida_Articulo] FOREIGN KEY([Articulo])
REFERENCES [dbo].[Articulo] ([ID])
GO
ALTER TABLE [dbo].[Salida] CHECK CONSTRAINT [FK_Salida_Articulo]
GO
ALTER TABLE [dbo].[Articulo]  WITH CHECK ADD  CONSTRAINT [chk_cantidad] CHECK  (([cantidad]>=(0)))
GO
ALTER TABLE [dbo].[Articulo] CHECK CONSTRAINT [chk_cantidad]
GO
USE [master]
GO
ALTER DATABASE [inventario] SET  READ_WRITE 
GO
