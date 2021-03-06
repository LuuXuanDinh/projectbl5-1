USE [projectbl5]
GO
/****** Object:  Table [dbo].[tuan]    Script Date: 12/05/2021 12:07:44 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tuan](
	[idtuan] [int] NOT NULL,
	[tuan] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_ngay] PRIMARY KEY CLUSTERED 
(
	[idtuan] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[tuan] ([idtuan], [tuan]) VALUES (1, N'29/11 To 05/11')
INSERT [dbo].[tuan] ([idtuan], [tuan]) VALUES (2, N'06/12 To 12/12')
INSERT [dbo].[tuan] ([idtuan], [tuan]) VALUES (3, N'13/12 To 19/12')
INSERT [dbo].[tuan] ([idtuan], [tuan]) VALUES (4, N'20/12 To 27/12')
/****** Object:  Table [dbo].[slot]    Script Date: 12/05/2021 12:07:44 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[slot](
	[idslot] [int] NOT NULL,
	[slot] [nvarchar](max) NOT NULL,
	[ngayid] [int] NOT NULL,
 CONSTRAINT [PK_slot] PRIMARY KEY CLUSTERED 
(
	[idslot] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
INSERT [dbo].[slot] ([idslot], [slot], [ngayid]) VALUES (1, N'slot1', 1)
INSERT [dbo].[slot] ([idslot], [slot], [ngayid]) VALUES (2, N'slot2', 1)
INSERT [dbo].[slot] ([idslot], [slot], [ngayid]) VALUES (3, N'slot3', 1)
INSERT [dbo].[slot] ([idslot], [slot], [ngayid]) VALUES (4, N'slot4', 1)
INSERT [dbo].[slot] ([idslot], [slot], [ngayid]) VALUES (5, N'slot5', 1)
INSERT [dbo].[slot] ([idslot], [slot], [ngayid]) VALUES (6, N'slot1', 2)
INSERT [dbo].[slot] ([idslot], [slot], [ngayid]) VALUES (7, N'slot2', 2)
INSERT [dbo].[slot] ([idslot], [slot], [ngayid]) VALUES (8, N'slot3', 2)
INSERT [dbo].[slot] ([idslot], [slot], [ngayid]) VALUES (9, N'slot4', 2)
INSERT [dbo].[slot] ([idslot], [slot], [ngayid]) VALUES (10, N'slot5', 2)
INSERT [dbo].[slot] ([idslot], [slot], [ngayid]) VALUES (11, N'slot6', 2)
/****** Object:  Table [dbo].[ngay]    Script Date: 12/05/2021 12:07:44 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ngay](
	[idngay] [int] NOT NULL,
	[ngay] [nvarchar](max) NOT NULL,
	[tuanid] [int] NOT NULL,
 CONSTRAINT [PK_ngay_1] PRIMARY KEY CLUSTERED 
(
	[idngay] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
INSERT [dbo].[ngay] ([idngay], [ngay], [tuanid]) VALUES (1, N'29/11', 1)
INSERT [dbo].[ngay] ([idngay], [ngay], [tuanid]) VALUES (2, N'30/11', 1)
INSERT [dbo].[ngay] ([idngay], [ngay], [tuanid]) VALUES (3, N'1/12', 1)
INSERT [dbo].[ngay] ([idngay], [ngay], [tuanid]) VALUES (4, N'2/12', 1)
INSERT [dbo].[ngay] ([idngay], [ngay], [tuanid]) VALUES (5, N'3/12', 1)
INSERT [dbo].[ngay] ([idngay], [ngay], [tuanid]) VALUES (6, N'4/12', 1)
INSERT [dbo].[ngay] ([idngay], [ngay], [tuanid]) VALUES (7, N'5/12', 1)
INSERT [dbo].[ngay] ([idngay], [ngay], [tuanid]) VALUES (8, N'6/12', 2)
INSERT [dbo].[ngay] ([idngay], [ngay], [tuanid]) VALUES (9, N'7/12', 2)
INSERT [dbo].[ngay] ([idngay], [ngay], [tuanid]) VALUES (10, N'8/12', 2)
INSERT [dbo].[ngay] ([idngay], [ngay], [tuanid]) VALUES (11, N'9/12', 2)
INSERT [dbo].[ngay] ([idngay], [ngay], [tuanid]) VALUES (12, N'10/12', 2)
INSERT [dbo].[ngay] ([idngay], [ngay], [tuanid]) VALUES (13, N'11/12', 2)
INSERT [dbo].[ngay] ([idngay], [ngay], [tuanid]) VALUES (14, N'12/12', 2)
/****** Object:  Table [dbo].[lop]    Script Date: 12/05/2021 12:07:44 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[lop](
	[idlop] [int] NOT NULL,
	[lop] [nchar](10) NOT NULL,
	[slotid] [int] NOT NULL,
 CONSTRAINT [PK_lop] PRIMARY KEY CLUSTERED 
(
	[idlop] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[lop] ([idlop], [lop], [slotid]) VALUES (1, N'SE1515    ', 1)
INSERT [dbo].[lop] ([idlop], [lop], [slotid]) VALUES (2, N'SE1511    ', 1)
/****** Object:  Table [dbo].[hocsinh]    Script Date: 12/05/2021 12:07:44 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[hocsinh](
	[idhocsinh] [int] NOT NULL,
	[lopid] [int] NOT NULL,
	[name] [nvarchar](150) NOT NULL,
	[slotid] [int] NOT NULL,
	[tuanid] [int] NOT NULL,
	[ngayid] [int] NOT NULL,
	[mssv] [nvarchar](50) NOT NULL,
	[diemdanh] [bit] NULL,
 CONSTRAINT [PK_hocsinh] PRIMARY KEY CLUSTERED 
(
	[idhocsinh] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[hocsinh] ([idhocsinh], [lopid], [name], [slotid], [tuanid], [ngayid], [mssv], [diemdanh]) VALUES (1, 1, N'Lưu Xuân Dinh', 1, 1, 1, N'HE151214', 0)
INSERT [dbo].[hocsinh] ([idhocsinh], [lopid], [name], [slotid], [tuanid], [ngayid], [mssv], [diemdanh]) VALUES (2, 1, N'Hoàng Trần ĐỨc', 1, 1, 1, N'HE151215', 0)
INSERT [dbo].[hocsinh] ([idhocsinh], [lopid], [name], [slotid], [tuanid], [ngayid], [mssv], [diemdanh]) VALUES (3, 1, N'Nguyễn Như Việt Anh ', 1, 1, 1, N'HE151216', 0)
INSERT [dbo].[hocsinh] ([idhocsinh], [lopid], [name], [slotid], [tuanid], [ngayid], [mssv], [diemdanh]) VALUES (4, 1, N'Lưu Đức Anh', 1, 1, 1, N'HE151217', 0)
INSERT [dbo].[hocsinh] ([idhocsinh], [lopid], [name], [slotid], [tuanid], [ngayid], [mssv], [diemdanh]) VALUES (5, 1, N'Nguyễn văn Họa', 1, 1, 1, N'HE151218', 0)
INSERT [dbo].[hocsinh] ([idhocsinh], [lopid], [name], [slotid], [tuanid], [ngayid], [mssv], [diemdanh]) VALUES (6, 1, N'Trần Văn Vịnh', 1, 1, 1, N'HE151218', 0)
INSERT [dbo].[hocsinh] ([idhocsinh], [lopid], [name], [slotid], [tuanid], [ngayid], [mssv], [diemdanh]) VALUES (7, 2, N'Lưu Xuân Dinh', 1, 1, 1, N'HE151219', 0)
INSERT [dbo].[hocsinh] ([idhocsinh], [lopid], [name], [slotid], [tuanid], [ngayid], [mssv], [diemdanh]) VALUES (8, 2, N'hoàng Trần Đức', 1, 1, 1, N'HR151220', 0)
INSERT [dbo].[hocsinh] ([idhocsinh], [lopid], [name], [slotid], [tuanid], [ngayid], [mssv], [diemdanh]) VALUES (9, 2, N'Nguyễn Như Việt Anh', 1, 1, 1, N'HR151221', 0)
INSERT [dbo].[hocsinh] ([idhocsinh], [lopid], [name], [slotid], [tuanid], [ngayid], [mssv], [diemdanh]) VALUES (10, 2, N'Lưu Đức Anh', 1, 1, 1, N'HE151222', 0)
INSERT [dbo].[hocsinh] ([idhocsinh], [lopid], [name], [slotid], [tuanid], [ngayid], [mssv], [diemdanh]) VALUES (11, 2, N'Nguyễn Văn Khoa', 1, 1, 1, N'HE151223', 0)
INSERT [dbo].[hocsinh] ([idhocsinh], [lopid], [name], [slotid], [tuanid], [ngayid], [mssv], [diemdanh]) VALUES (12, 2, N'Trần Văn Vịnh', 1, 1, 1, N'HE151224', 0)
