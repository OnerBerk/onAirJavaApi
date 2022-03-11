create table if not exists skill
(
    id bigserial constraint pk_skill primary key,
    name  varchar(50) not null,
    level int         not null
)