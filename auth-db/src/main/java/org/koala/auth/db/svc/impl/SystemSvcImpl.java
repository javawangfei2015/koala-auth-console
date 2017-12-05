package org.koala.auth.db.svc.impl;

import org.koala.auth.db.dao.ISystemDao;
import org.koala.auth.db.po.SystemPO;
import org.koala.auth.db.svc.ISystemSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SvcImpl - 系统
 */
@Service("systemSvcImpl")
public class SystemSvcImpl implements ISystemSvc {

    @Autowired
    private ISystemDao iSystemDao;

    @Override
    public SystemPO add(SystemPO system) {
        return null;
    }

    @Override
    public void delete(String[] ids) {

    }

    @Override
    public SystemPO update(SystemPO system) {
        return null;
    }


    @Override
    public void enable(String[] ids) {

    }

    @Override
    public void disable(String[] ids) {

    }
}
