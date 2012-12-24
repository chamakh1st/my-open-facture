/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     24/12/2012 15:36:44                          */
/*==============================================================*/

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
   primary key (ID)
);

