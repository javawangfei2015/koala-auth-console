package org.koala.auth.db.svc.impl;

import org.koala.auth.db.dao.IPermissionDao;
import org.koala.auth.db.po.PermissionPO;
import org.koala.auth.db.po.ResourcePO;
import org.koala.auth.db.svc.IPermissionSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * SvcImpl - 权限
 */
@Service("permissionSvcImpl")
public class PermissionSvcImpl implements IPermissionSvc {

    @Autowired
    private IPermissionDao iPermissionDao;


    @Override
    public PermissionPO add(PermissionPO permission) {
        return null;
    }

    @Override
    public void delete(String[] ids) {

    }

    @Override
    public PermissionPO update(PermissionPO permission) {
        return null;
    }

    @Override
    public void bindResource(String id, Set<ResourcePO> resources) {

    }
}
