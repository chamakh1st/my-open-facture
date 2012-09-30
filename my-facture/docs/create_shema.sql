/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     30/09/2012 13:37:06                          */
/*==============================================================*/


drop table if exists ADRESS;

drop table if exists ARTICLE;

drop table if exists ARTICLE_TYPE;

drop table if exists BANK_ACCOUNT;

drop table if exists COMPANY;

drop table if exists COMPANY_TYPE;

drop table if exists COUNTRY;

drop table if exists CURRENCY;

drop table if exists DOCUMENT;

drop table if exists DOCUMENT_LINE;

drop table if exists DOCUMENT_TYPE;

drop table if exists LEGAL_FORM;

drop table if exists TVA_TYPE;

drop table if exists USER;

/*==============================================================*/
/* Table: ADRESS                                                */
/*==============================================================*/
create table ADRESS
(
   ID                   numeric(15) not null,
   ADRESS1              varchar(255),
   ADRESS2              varchar(255),
   ZIPCODE              varchar(30),
   REGION               varchar(30),
   COUNTRY_ID           numeric(15),
   primary key (ID)
);

/*==============================================================*/
/* Table: ARTICLE                                               */
/*==============================================================*/
create table ARTICLE
(
   ID                   numeric(15) not null,
   NAME                 varchar(15),
   ARTICLE_TYPE_ID      numeric(15),
   primary key (ID)
);

/*==============================================================*/
/* Table: ARTICLE_TYPE                                          */
/*==============================================================*/
create table ARTICLE_TYPE
(
   ID                   numeric(15) not null,
   CODE                 varchar(30),
   LIBELLE              varchar(255),
   primary key (ID)
);

/*==============================================================*/
/* Table: BANK_ACCOUNT                                          */
/*==============================================================*/
create table BANK_ACCOUNT
(
   ID                   numeric(15) not null,
   NAME                 varchar(30),
   BANK_CODE            varchar(30),
   OFFICE               varchar(30),
   ACCOUNT_NUMBER       varchar(30),
   RIB_KEY              varchar(30),
   IBAN                 varchar(30),
   BIC                  varchar(30),
   ADRESS_ID            numeric(15),
   primary key (ID)
);

/*==============================================================*/
/* Table: COMPANY                                               */
/*==============================================================*/
create table COMPANY
(
   ID                   numeric(15) not null,
   COMPANY_TYPE_ID      numeric(15),
   ADRESS_ID            numeric(15),
   LEGAL_FORM_ID        numeric(15),
   NAME                 varchar(30),
   SIRET                varchar(30),
   NAF_APE              varchar(30),
   TVA_CODE             numeric(15),
   CAPITAL              numeric(15),
   URL                  varchar(30),
   TEL                  varchar(30),
   FAX                  varchar(30),
   MAIL                 varchar(30),
   LOGO                 blob,
   USER_ID              numeric(15),
   ROOT_COMPANY_ID      numeric(15),
   primary key (ID)
);

/*==============================================================*/
/* Table: COMPANY_TYPE                                          */
/*==============================================================*/
create table COMPANY_TYPE
(
   ID                   numeric(15) not null,
   CODE                 varchar(30),
   LIBELLE              varchar(255),
   primary key (ID)
);

/*==============================================================*/
/* Table: COUNTRY                                               */
/*==============================================================*/
create table COUNTRY
(
   ID                   numeric(15) not null,
   CODE_ISO             varchar(30),
   NAME                 varchar(255),
   primary key (ID)
);

/*==============================================================*/
/* Table: CURRENCY                                              */
/*==============================================================*/
create table CURRENCY
(
   ID                   numeric(15) not null,
   CODE                 varchar(30),
   LIBELLE              varchar(255),
   primary key (ID)
);

/*==============================================================*/
/* Table: DOCUMENT                                              */
/*==============================================================*/
create table DOCUMENT
(
   ID                   numeric(15) not null,
   COMPANY_ID           numeric(15),
   CURRENCY_ID          numeric(15),
   DOCUMENT_TYPE_ID     numeric(15),
   primary key (ID)
);

/*==============================================================*/
/* Table: DOCUMENT_LINE                                         */
/*==============================================================*/
create table DOCUMENT_LINE
(
   ID                   numeric(15) not null,
   LINE_NUMBER          numeric(15),
   ARTICLE_ID           numeric(15),
   FACTURE_ID           numeric(15),
   TVA_ID               numeric(15),
   DESCRIPTION          varchar(100),
   QUANTITY             numeric(15),
   UNIT_PRICE_HT        numeric(15),
   UNIT_PRICE_TTC       numeric(15),
   DISCOUNT_PCT         numeric(15),
   DISCOUNT_MNT_HT      numeric(15),
   DISCOUNT_MNT_TTC     numeric(15),
   TOT_AMOUNT_HT        numeric(15),
   TOT_AMOUNT_TTC       numeric(15),
   primary key (ID)
);

/*==============================================================*/
/* Table: DOCUMENT_TYPE                                         */
/*==============================================================*/
create table DOCUMENT_TYPE
(
   ID                   numeric(15) not null,
   CODE                 varchar(30),
   LIBELLE              varchar(255),
   primary key (ID)
);

/*==============================================================*/
/* Table: LEGAL_FORM                                            */
/*==============================================================*/
create table LEGAL_FORM
(
   ID                   numeric(15) not null,
   CODE                 varchar(30),
   LIBELLE              varchar(255),
   primary key (ID)
);

/*==============================================================*/
/* Table: TVA_TYPE                                              */
/*==============================================================*/
create table TVA_TYPE
(
   ID                   numeric(15) not null,
   LIBELLE              varchar(30),
   VALUE                numeric(6,2),
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

alter table ADRESS add constraint FK_ADRESS_COUNTRY foreign key (COUNTRY_ID)
      references COUNTRY (ID) on delete restrict on update restrict;

alter table ARTICLE add constraint FK_ARTICLE_TYPE foreign key (ARTICLE_TYPE_ID)
      references ARTICLE_TYPE (ID) on delete restrict on update restrict;

alter table BANK_ACCOUNT add constraint FK_BANK_ACCOUNT_ADRESS foreign key (ADRESS_ID)
      references ADRESS (ID) on delete restrict on update restrict;

alter table COMPANY add constraint FK_COMPANY_ADRESS foreign key (ADRESS_ID)
      references ADRESS (ID) on delete restrict on update restrict;

alter table COMPANY add constraint FK_COMPANY_LEGAL_FORM foreign key (LEGAL_FORM_ID)
      references LEGAL_FORM (ID) on delete restrict on update restrict;

alter table COMPANY add constraint FK_COMPANY_PROVIDER foreign key (ROOT_COMPANY_ID)
      references COMPANY (ID) on delete restrict on update restrict;

alter table COMPANY add constraint FK_COMPANY_TYPE foreign key (COMPANY_TYPE_ID)
      references COMPANY_TYPE (ID) on delete restrict on update restrict;

alter table COMPANY add constraint FK_COMPANY_USER foreign key (USER_ID)
      references USER (ID) on delete restrict on update restrict;

alter table COMPANY add constraint FK_CUSTOMER_COMPANY foreign key (ROOT_COMPANY_ID)
      references COMPANY (ID) on delete restrict on update restrict;

alter table DOCUMENT add constraint FK_FACTURE_COMPANY foreign key (COMPANY_ID)
      references COMPANY (ID) on delete restrict on update restrict;

alter table DOCUMENT add constraint FK_FACTURE_CURRENCY foreign key (CURRENCY_ID)
      references CURRENCY (ID) on delete restrict on update restrict;

alter table DOCUMENT add constraint FK_REFERENCE_15 foreign key (DOCUMENT_TYPE_ID)
      references DOCUMENT_TYPE (ID) on delete restrict on update restrict;

alter table DOCUMENT_LINE add constraint FK_FACTURE_LINE foreign key (FACTURE_ID)
      references DOCUMENT (ID) on delete restrict on update restrict;

alter table DOCUMENT_LINE add constraint FK_FACTURE_LINE_ARTICLE foreign key (ARTICLE_ID)
      references ARTICLE (ID) on delete restrict on update restrict;

alter table DOCUMENT_LINE add constraint FK_FACTURE_LINE_TYPE_TVA foreign key (TVA_ID)
      references TVA_TYPE (ID) on delete restrict on update restrict;

