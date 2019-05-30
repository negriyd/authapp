INSERT INTO auser VALUES (1, true, 'admin', 'admin');
INSERT INTO auser VALUES (2, true, 'user', 'user');

INSERT INTO arole VALUES (1, 'ROLE_ADMIN');
INSERT INTO arole VALUES (2, 'ROLE_USER');

INSERT INTO auser_roles VALUES (1, 1);
INSERT INTO auser_roles VALUES (2, 2);