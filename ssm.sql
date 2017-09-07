prompt PL/SQL Developer import file
prompt Created on 2017年9月7日 by Kor_Zhang
set feedback off
set define off
prompt Creating ITEMS...
create table ITEMS
(
  ID          NVARCHAR2(40) not null,
  NAME        NVARCHAR2(40) not null,
  DESCRIPTION CHAR(50) not null,
  PRICE       NUMBER(5,2) not null,
  QUANTITY    NUMBER(5) not null
)
tablespace SYSTEM
  pctfree 10
  pctused 40
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ITEMS
  add constraint ITEMS_PK_ID primary key (ID)
  using index 
  tablespace SYSTEM
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating USERS...
create table USERS
(
  ID       NVARCHAR2(40) not null,
  USERNAME CHAR(15) not null,
  PASSWORD CHAR(15) not null
)
tablespace SYSTEM
  pctfree 10
  pctused 40
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table USERS
  add constraint USERS_PK_ID primary key (ID)
  using index 
  tablespace SYSTEM
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating ORDERS...
create table ORDERS
(
  ID         NVARCHAR2(40) not null,
  CREATETIME TIMESTAMP(6) not null,
  STATUS     NUMBER(5) not null,
  USERID     NVARCHAR2(40) not null
)
tablespace SYSTEM
  pctfree 10
  pctused 40
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ORDERS
  add constraint ORDERS_PK_ID primary key (ID)
  using index 
  tablespace SYSTEM
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ORDERS
  add constraint ORDERS_FK_USERID foreign key (USERID)
  references USERS (ID) on delete cascade;

prompt Creating ORDERDETAIL...
create table ORDERDETAIL
(
  ORDERID  NVARCHAR2(40) not null,
  ITEMID   NVARCHAR2(40) not null,
  QUANTITY NUMBER(5) not null,
  PRICE    NUMBER(5,2) not null
)
tablespace SYSTEM
  pctfree 10
  pctused 40
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ORDERDETAIL
  add constraint ORDERDETAIL_FK_ITEMID foreign key (ITEMID)
  references ITEMS (ID) on delete cascade;
alter table ORDERDETAIL
  add constraint ORDERDETAIL_FK_ORDERID foreign key (ORDERID)
  references ORDERS (ID) on delete cascade;

prompt Loading ITEMS...
insert into ITEMS (ID, NAME, DESCRIPTION, PRICE, QUANTITY)
values ('1', 'asdad', 'asd                                               ', .2, 1);
insert into ITEMS (ID, NAME, DESCRIPTION, PRICE, QUANTITY)
values ('2', '222', 'aaa                                               ', 27.8, 222);
commit;
prompt 2 records loaded
prompt Loading USERS...
prompt Table is empty
prompt Loading ORDERS...
prompt Table is empty
prompt Loading ORDERDETAIL...
prompt Table is empty
set feedback on
set define on
prompt Done.
