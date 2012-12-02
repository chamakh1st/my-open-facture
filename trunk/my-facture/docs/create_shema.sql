/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     02/12/2012 23:59:45                          */
/*==============================================================*/


drop table if exists CIVILITE;

drop table if exists COMPANY;

drop table if exists FACTURE;

drop table if exists FACTURE_LIGNE;

drop table if exists PAYMENT_TYPE;

drop table if exists PRODUCT;

drop table if exists TVA_TYPE;

drop table if exists UNIT;

drop table if exists USER;

/*==============================================================*/
/* Table: CIVILITE                                              */
/*==============================================================*/
create table CIVILITE
(
   ID                   numeric(15) not null,
   CODE                 varchar(5),
   "LABEL"              varchar(25),
   primary key (ID)
);

/*==============================================================*/
/* Table: COMPANY                                               */
/*==============================================================*/
create table COMPANY
(
   ID                   numeric(15) not null,
   NAME                 varchar(25),
   SIRET                varchar(25),
   NAF_APE              varchar(25),
   TVA_CODE             numeric(15),
   CAPITAL              numeric(15),
   URL                  varchar(25),
   TEL                  varchar(25),
   FAX                  varchar(25),
   MAIL                 varchar(25),
   LOGO                 blob,
   USER_ID              numeric(15),
   primary key (ID)
);

/*==============================================================*/
/* Table: FACTURE                                               */
/*==============================================================*/
create table FACTURE
(
   ID                   numeric(15) not null,
   primary key (ID)
);

/*==============================================================*/
/* Table: FACTURE_LIGNE                                         */
/*==============================================================*/
create table FACTURE_LIGNE
(
   ID                   numeric(15) not null,
   primary key (ID)
);

/*==============================================================*/
/* Table: PAYMENT_TYPE                                          */
/*==============================================================*/
create table PAYMENT_TYPE
(
   ID                   numeric(15) not null,
   CODE                 varchar(25),
   "LABEL"              varchar(255),
   primary key (ID)
);

/*==============================================================*/
/* Table: PRODUCT                                               */
/*==============================================================*/
create table PRODUCT
(
   ID                   numeric(15) not null,
   CODE                 varchar(25),
   DESCRIPTION          varchar(255),
   PRICE                numeric(15),
   TVA_ID               numeric(15),
   UNIT_ID              numeric(15),
   primary key (ID)
);

/*==============================================================*/
/* Table: TVA_TYPE                                              */
/*==============================================================*/
create table TVA_TYPE
(
   ID                   numeric(15) not null,
   CODE                 varchar(5),
   "LABEL"              varchar(25),
   VALUE                numeric(6,2),
   primary key (ID)
);

/*==============================================================*/
/* Table: UNIT                                                  */
/*==============================================================*/
create table UNIT
(
   ID                   numeric(15) not null,
   "LABEL"              varchar(25),
   SYMBOLE              varchar(5),
   primary key (ID)
);

/*==============================================================*/
/* Table: USER                                                  */
/*==============================================================*/
create table USER
(
   ID                   numeric(15) not null,
   LOGIN                varchar(30),
   PASSWORD             varchar(30),
   FIRST_NAME           varchar(30),
   LAST_NAME            varchar(30),
   MAIL                 varchar(30),
   BIRTH_DATE           varchar(30),
   TEL                  varchar(30),
   primary key (ID)
);

alter table COMPANY add constraint FK_COMPANY_USER foreign key (USER_ID)
      references USER (ID) on delete restrict on update restrict;

alter table PRODUCT add constraint FK_REFERENCE_3 foreign key (UNIT_ID)
      references UNIT (ID) on delete restrict on update restrict;

alter table PRODUCT add constraint FK_REFERENCE_4 foreign key (TVA_ID)
      references TVA_TYPE (ID) on delete restrict on update restrict;

