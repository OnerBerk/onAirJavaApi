create table api_user_skills
(
    user_id  bigint not null,
    skill_id bigint not null,
    primary key (user_id, skill_id),
    unique (user_id, skill_id),
    FOREIGN KEY (user_id) references api_user (id),
    FOREIGN KEY (skill_id) references skill (id)
);
