/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     01/01/2013 19:56:43                          */
/*==============================================================*/


drop table if exists BANK_ACCOUNT;

drop table if exists COMPANY;

drop table if exists PARAMETER;

drop table if exists USER;

/*==============================================================*/
/* Table: BANK_ACCOUNT                                          */
/*==============================================================*/
create table BANK_ACCOUNT
(
   ID                   numeric(15) not null,
   NAME                 varchar(25) not null,
   BANK_NAME            varchar(25),
   BANK_CODE            varchar(25),
   BANK_WINDOW          varchar(25),
   ACCOUNT_NUMBER       varchar(25),
   ACCOUNT_KEY          varchar(2),
   AGENCY_NAME          varchar(25),
   ADRESS               varchar(25),
   ZIPCODE              varchar(25),
   CITY                 varchar(25),
   COUNTRY              varchar(25),
   IBAN                 varchar(25),
   BIC                  varchar(25),
   COMPANY_ID           numeric(15),
   primary key (ID)
);

/*==============================================================*/
/* Table: COMPANY                                               */
/*==============================================================*/
create table COMPANY
(
   ID                   numeric(15) not null,
   NAME                 varchar(25),
   SIREN                varchar(25),
   SIRET                varchar(25),
   CODE_APE             varchar(25),
   CAPITAL              numeric(15),
   URL                  varchar(25),
   TEL                  varchar(25),
   FAX                  varchar(25),
   MAIL                 varchar(25),
   primary key (ID)
);

/*==============================================================*/
/* Table: PARAMETER                                             */
/*==============================================================*/
create table PARAMETER
(
   CODE                 varchar(25) not null,
   VALUE                varchar(25) not null,
   DESCRIPTION          varchar(255),
   VALUE_TXT            varchar(255),
   primary key (CODE, VALUE)
);

/*==============================================================*/
/* Table: USER                                                  */
/*==============================================================*/
create table USER
(
   ID                   numeric(15) not null,
   FIRST_NAME           varchar(30),
   LAST_NAME            varchar(30),
   LOGIN                varchar(30),
   PASSWORD             varchar(30),
   MAIL                 varchar(30),
   BIRTH_DATE           date,
   PHONE                varchar(30),
   COMPANY_ID           numeric(15),
   primary key (ID)
);

alter table BANK_ACCOUNT add constraint FK_REFERENCE_5 foreign key (COMPANY_ID)
      references COMPANY (ID) on delete restrict on update restrict;

alter table USER add constraint FK_USER_COMPANY foreign key (COMPANY_ID)
      references COMPANY (ID) on delete restrict on update restrict;

