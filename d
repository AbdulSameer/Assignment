
CREATE TABLE [E_1]
( 
	[test]               char(18)  NOT NULL 
)
go

ALTER TABLE [E_1]
	ADD CONSTRAINT [XPKE_1] PRIMARY KEY  CLUSTERED ([test] ASC)
go
