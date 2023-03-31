drop table if exists `test`;
create table `test` (
    `id` bigint not null comment 'id',
    `name` varchar(50) comment 'name',
    `password` varchar(50) comment 'password',
    primary key(`id`)
) engine=innodb default charset=utf8mb4 comment='test';

insert into `test` (id, name, password) VALUES (1, 'test', '123');




drop table if exists `demo`;
create table `demo`(
    `id` bigint not null comment 'id',
    `name` varchar(50) comment 'name',
    primary key(`id`)
) engine = innodb default charset = utf8mb4 comment = 'test';

insert into `demo` (id,name) values(1,'test');




drop table if exists `ebook`;
create table `ebook`(
    `id` bigint not null comment 'id',
    `name` varchar(50) comment 'name',
    `category1_id` bigint comment 'type1',
    `catogory2_id` bigint comment 'type2',
    `description` varchar(200) comment 'description',
    `cover` varchar(200) comment 'cover',
    `doc_count` int comment 'doc count',
    `view_count` int comment 'view count',
    `vote_count` int comment 'like count',
    primary key (`id`)
)engine =innodb default  charset = utf8mb4  comment='e book';

insert into `ebook` (id, name, description) values (1,'spring boot start','spring boot book for starter');
insert into `ebook` (id, name, description) values (2,'vue start','vue book for starter');
insert into `ebook` (id, name, description) values (3,'python start','python book for starter');
insert into `ebook` (id, name, description) values (4,'mysql start','mysql book for starter');
insert into `ebook` (id, name, description) values (5,'oracle start','oracle book for starter');