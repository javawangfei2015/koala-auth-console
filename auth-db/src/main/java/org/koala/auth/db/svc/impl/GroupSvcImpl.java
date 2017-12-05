package org.koala.auth.db.svc.impl;

import org.koala.auth.db.dao.IGroupDao;
import org.koala.auth.db.po.GroupPO;
import org.koala.auth.db.po.RolePO;
import org.koala.auth.db.po.UserPO;
import org.koala.auth.db.svc.IGroupSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * SvcImpl - 用户组
 */
@Service("groupSvcImpl")
public class GroupSvcImpl implements IGroupSvc {

    @Autowired
    private IGroupDao iGroupDao;

    @Override
    public GroupPO add(GroupPO group) {
        return null;
    }

    @Override
    public void delete(String[] ids) {

    }

    @Override
    public GroupPO update(GroupPO group) {
        return null;
    }

    @Override
    public void bindRoles(String id, Set<RolePO> roles) {

    }

    @Override
    public void bindUsers(String id, Set<UserPO> users) {

    }
}
