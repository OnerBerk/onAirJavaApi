create table mt_user
(
    id       bigserial
        constraint pk_user primary key,
    nickname text not null unique
);

create table task
(
    id   bigserial
        constraint pk_task primary key,
    name text not null
);