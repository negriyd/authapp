select user.user_name, privilege.name
from user, users_roles, role, roles_privileges, privilege
where user.user_name = 'admin'
  and user.id = users_roles.user_id
  and users_roles.role_id = role.id
  and roles_privileges.role_id = role.id
  and privilege.id = roles_privileges.privilege_id

------------------------
delete from roles_privileges;
delete from users_roles;
delete from role;
delete from user;