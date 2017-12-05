package org.koala.auth.db.svc.impl;

import org.koala.auth.db.dao.IUserGroupRoleDao;
import org.koala.auth.db.svc.IUserGroupRoleSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SvcImpl - 用户,用户组,角色 关联对象
 */
@Service("userGroupRoleSvcImpl")
public class UserGroupRoleSvcImpl implements IUserGroupRoleSvc {

    @Autowired
    private IUserGroupRoleDao iUserGroupRoleDao;

}
