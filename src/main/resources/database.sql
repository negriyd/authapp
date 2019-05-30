INSERT INTO a_user VALUES (1, true, 'admin', 'admin');
INSERT INTO a_user VALUES (2, true, 'user', 'user');

INSERT INTO a_role VALUES (1, 'ROLE_ADMIN');
INSERT INTO a_role VALUES (2, 'ROLE_USER');

INSERT INTO user_roles VALUES (1, 1);
INSERT INTO user_roles VALUES (2, 2);