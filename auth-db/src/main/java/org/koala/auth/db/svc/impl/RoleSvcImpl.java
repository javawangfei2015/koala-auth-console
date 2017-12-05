package org.koala.auth.db.svc.impl;

import org.koala.auth.db.dao.IRoleDao;
import org.koala.auth.db.po.PermissionPO;
import org.koala.auth.db.po.RolePO;
import org.koala.auth.db.svc.IRoleSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * SvcImpl - 角色
 */
@Service("roleSvcImpl")
public class RoleSvcImpl implements IRoleSvc {

    @Autowired
    private IRoleDao iRoleDao;

    @Override
    public RolePO add(RolePO role) {
        return null;
    }

    @Override
    public void delete(String[] ids) {

    }

    @Override
    public RolePO update(RolePO role) {
        return null;
    }

    @Override
    public void bindPermission(String id, Set<PermissionPO> permissions) {

    }
}
