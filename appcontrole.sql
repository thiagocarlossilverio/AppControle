CREATE TABLE /*!32312 IF NOT EXISTS*/ "animal" (
  "cod_animal" int(11)  NULL auto_increment,
  "cod_raca" int(11)  NULL,
  "mes_nascimento" int(11) NOT NULL,
  "ano_nascimento" int(11) NOT NULL,
  "sexo" char(1) NOT NULL,
  "cor" varchar(20) NOT NULL,
  "data_compra" date NOT NULL,
  "preco_compra" float(10,2) NOT NULL,
  "data_venda" date default NULL,
  "peso_entrada" double(10,2) NOT NULL,
  "peso_saida" double(10,2) default NULL,
  "preco_venda" double(10,2) default NULL,
  PRIMARY KEY  ("cod_animal"),
  KEY "cod_raca" ("cod_raca"),
  CONSTRAINT "animal_ibfk_1" FOREIGN KEY ("cod_raca") REFERENCES "raca" ("cod_raca")
) /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'animal'
#

LOCK TABLES "animal" WRITE;
/*!40000 ALTER TABLE "animal" DISABLE KEYS;*/
INSERT INTO "animal" ("cod_animal", "cod_raca", "mes_nascimento", "ano_nascimento", "sexo", "cor", "data_compra", "preco_compra", "data_venda", "peso_entrada", "peso_saida", "preco_venda") VALUES
	(1,21,1,2009,'M','AZUL','2010-11-11','2',NULL,'2','0','0');
INSERT INTO "animal" ("cod_animal", "cod_raca", "mes_nascimento", "ano_nascimento", "sexo", "cor", "data_compra", "preco_compra", "data_venda", "peso_entrada", "peso_saida", "preco_venda") VALUES
	(4,6,4,1998,'F','branca','2010-11-11','2.1','2010-11-19','3','200','123');
INSERT INTO "animal" ("cod_animal", "cod_raca", "mes_nascimento", "ano_nascimento", "sexo", "cor", "data_compra", "preco_compra", "data_venda", "peso_entrada", "peso_saida", "preco_venda") VALUES
	(5,6,2,2008,'M','marron','2010-11-25','4.5',NULL,'350','0','0');
INSERT INTO "animal" ("cod_animal", "cod_raca", "mes_nascimento", "ano_nascimento", "sexo", "cor", "data_compra", "preco_compra", "data_venda", "peso_entrada", "peso_saida", "preco_venda") VALUES
	(9,11,3,2008,'M','marron','2010-11-26','234',NULL,'52.9','0','0');
INSERT INTO "animal" ("cod_animal", "cod_raca", "mes_nascimento", "ano_nascimento", "sexo", "cor", "data_compra", "preco_compra", "data_venda", "peso_entrada", "peso_saida", "preco_venda") VALUES
	(10,11,6,2006,'F','AMARELA','2010-12-23','650','2010-11-27','550','550','850');
/*!40000 ALTER TABLE "animal" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'gasto'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "gasto" (
  "cod_gasto" int(11) NOT NULL auto_increment,
  "cod_tipo" int(11) NOT NULL,
  "cod_animal" int(11) NOT NULL,
  "data_gasto" date default NULL,
  "valor_gasto" double(10,2) NOT NULL,
  PRIMARY KEY  ("cod_gasto"),
  KEY "cod_animal" ("cod_animal"),
  KEY "cod_tipo" ("cod_tipo"),
  CONSTRAINT "gasto_ibfk_1" FOREIGN KEY ("cod_animal") REFERENCES "animal" ("cod_animal"),
  CONSTRAINT "gasto_ibfk_2" FOREIGN KEY ("cod_tipo") REFERENCES "tipo_gasto" ("cod_tipo")
) /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'gasto'
#

LOCK TABLES "gasto" WRITE;
/*!40000 ALTER TABLE "gasto" DISABLE KEYS;*/
INSERT INTO "gasto" ("cod_gasto", "cod_tipo", "cod_animal", "data_gasto", "valor_gasto") VALUES
	(2,37,1,'2010-09-09','3000');
INSERT INTO "gasto" ("cod_gasto", "cod_tipo", "cod_animal", "data_gasto", "valor_gasto") VALUES
	(3,33,1,'2010-09-09','23000');
/*!40000 ALTER TABLE "gasto" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'raca'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "raca" (
  "cod_raca" int(11) NOT NULL auto_increment,
  "nome_raca" varchar(30) NOT NULL,
  PRIMARY KEY  ("cod_raca")
) /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'raca'
#

LOCK TABLES "raca" WRITE;
/*!40000 ALTER TABLE "raca" DISABLE KEYS;*/
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(1,'nelore');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(2,'Holandês');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(3,'Simenthal');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(4,'Limousin');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(5,'Red Angus');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(6,'Charolês');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(7,'Devon');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(8,'Hereford');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(9,'Blonde d''Aquitaine');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(10,'Piemontês');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(11,'Pardo Suiço');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(12,'Shorthorn');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(13,'Chianina');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(14,'Marchigiana');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(15,'Canchim');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(16,'Gir');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(17,'Guzerá');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(19,'Indubrasil');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(20,'Sindi');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(21,'Aberdeen Angus');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(22,'Girolanda');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(24,'gerse');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(25,'nelore');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(26,'zebu');
INSERT INTO "raca" ("cod_raca", "nome_raca") VALUES
	(27,'Tabapuã');
/*!40000 ALTER TABLE "raca" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tipo_gasto'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tipo_gasto" (
  "cod_tipo" int(11) NOT NULL auto_increment,
  "nome_tipo" varchar(60) NOT NULL,
  PRIMARY KEY  ("cod_tipo"),
  UNIQUE KEY "nome_tipo" ("nome_tipo")
) /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'tipo_gasto'
#

LOCK TABLES "tipo_gasto" WRITE;
/*!40000 ALTER TABLE "tipo_gasto" DISABLE KEYS;*/
INSERT INTO "tipo_gasto" ("cod_tipo", "nome_tipo") VALUES
	(36,'');
INSERT INTO "tipo_gasto" ("cod_tipo", "nome_tipo") VALUES
	(39,'ccc');
INSERT INTO "tipo_gasto" ("cod_tipo", "nome_tipo") VALUES
	(34,'lepec');
INSERT INTO "tipo_gasto" ("cod_tipo", "nome_tipo") VALUES
	(37,'lepecide');
INSERT INTO "tipo_gasto" ("cod_tipo", "nome_tipo") VALUES
	(35,'malandro');
INSERT INTO "tipo_gasto" ("cod_tipo", "nome_tipo") VALUES
	(38,'qqq');
INSERT INTO "tipo_gasto" ("cod_tipo", "nome_tipo") VALUES
	(33,'ração');
INSERT INTO "tipo_gasto" ("cod_tipo", "nome_tipo") VALUES
	(40,'trigulho');
INSERT INTO "tipo_gasto" ("cod_tipo", "nome_tipo") VALUES
	(22,'vacina');
/*!40000 ALTER TABLE "tipo_gasto" ENABLE KEYS;*/
UNLOCK TABLES;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE;*/
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;*/
