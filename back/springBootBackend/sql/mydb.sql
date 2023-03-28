----------------------------------------------------------
create table member
(
    id    varchar(50) primary key,
    pwd   varchar(50) not null,
    name  varchar(50) not null,
    email varchar(50) unique,
    auth  int
);
----------------------------------------------------------
create table bbs
(
    seq       int auto_increment primary key,
    id        varchar(50)   not null,

    ref       decimal(8)    not null,
    step      decimal(8)    not null,
    depth     decimal(8)    not null,

    title     varchar(200)  not null,
    content   varchar(4000) not null,
    wdate     timestamp     not null,

    del       decimal(1)    not null,
    readcount decimal(8)    not null
);

alter table bbs
    add foreign key (id) references member (id);
----------------------------------------------------------
create table bbscomment
(
    seq     decimal(5)    not null,
    id      varchar(50),
    content varchar(1000) not null,
    wdate   timestamp     not null
);

alter table bbscomment
    add foreign key (id) references member (id);
----------------------------------------------------------
create table pds(
                    seq int auto_increment primary key,
                    id varchar(50) not null,
                    title varchar(200) not null,
                    content varchar(4000) not null,
                    filename varchar(50) not null,
                    newfilename varchar(50) not null,
                    readcount decimal(8) not null,
                    downcount decimal(8) not null,
                    regdate timestamp not null
);

alter table pds
    add foreign key(id) references member(id);
----------------------------------------------------------