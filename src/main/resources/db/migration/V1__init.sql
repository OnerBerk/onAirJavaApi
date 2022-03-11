create table api_user
(
    id  bigserial constraint pk_api_user primary key,
    lastname text not null,
    firstname text not null
);
