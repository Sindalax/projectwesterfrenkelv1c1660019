--------------------------------------------------------
--  File created - woensdag-juli-19-2017   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ADMINISTRATOR
--------------------------------------------------------

  CREATE TABLE "JAAP"."ADMINISTRATOR" 
   (	"GEBRUIKERSNAAM" VARCHAR2(20 BYTE), 
	"WACHTWOORD" VARCHAR2(20 BYTE), 
	"TOETSAANTAL" NUMBER, 
	"PUNTENTOTAAL" NUMBER, 
	"PUNTENGEMIDDELD" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table ENGELSE_WOORDEN
--------------------------------------------------------

  CREATE TABLE "JAAP"."ENGELSE_WOORDEN" 
   (	"ID" NUMBER, 
	"WOORD" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table GEBRUIKER
--------------------------------------------------------

  CREATE TABLE "JAAP"."GEBRUIKER" 
   (	"GEBRUIKERSNAAM" VARCHAR2(20 BYTE), 
	"WACHTWOORD" VARCHAR2(20 BYTE), 
	"TOETSAANTAL" NUMBER, 
	"PUNTENTOTAAL" NUMBER, 
	"PUNTENGEMIDDELD" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table NEDERLANDSE_WOORDEN
--------------------------------------------------------

  CREATE TABLE "JAAP"."NEDERLANDSE_WOORDEN" 
   (	"ID" NUMBER, 
	"WOORD" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into JAAP.ADMINISTRATOR
SET DEFINE OFF;
Insert into JAAP.ADMINISTRATOR (GEBRUIKERSNAAM,WACHTWOORD,TOETSAANTAL,PUNTENTOTAAL,PUNTENGEMIDDELD) values ('Kees','1234','0','0','0');
REM INSERTING into JAAP.ENGELSE_WOORDEN
SET DEFINE OFF;
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('1','Iron Ore');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('2','Green Dragon');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('3','Gnome');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('4','Lizardman');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('5','Flax');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('6','Party Hat');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('7','Cowhide');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('8','Lobster');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('9','Uncut Sapphire');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('10','Goblin');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('11','Tree Spirit');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('12','Granite Maul');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('13','Gargoyle');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('14','Mystic Robe');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('15','Eternal Boots');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('16','Fire Giant');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('17','Dust Devil');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('18','Ghoul');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('19','Barbarian');
Insert into JAAP.ENGELSE_WOORDEN (ID,WOORD) values ('20','Wilderness');
REM INSERTING into JAAP.GEBRUIKER
SET DEFINE OFF;
Insert into JAAP.GEBRUIKER (GEBRUIKERSNAAM,WACHTWOORD,TOETSAANTAL,PUNTENTOTAAL,PUNTENGEMIDDELD) values ('Piet','1337','0','0','0');
REM INSERTING into JAAP.NEDERLANDSE_WOORDEN
SET DEFINE OFF;
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('1','Ijzererts');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('2','Groene Draak');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('3','Kabouter');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('4','Hagedis Man');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('5','Vlas');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('6','Feesthoed');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('7','Koeienhuid ');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('8','Kreeft ');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('9','Ongesneden Saffier ');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('10','Aardmannetje ');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('11','Boomgeest ');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('12','Graniet Moker ');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('13','Waterspuwer ');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('14','Mystieke Mantel ');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('15','Eeuwige Laarzen ');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('16','Vuur Reus ');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('17','Kruimeldief ');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('18','Grafschender ');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('19','Barbaar ');
Insert into JAAP.NEDERLANDSE_WOORDEN (ID,WOORD) values ('20','Wildernis ');
