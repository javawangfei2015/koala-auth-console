package org.koala.auth.db.svc.impl;

import org.koala.auth.db.dao.IUserExtDao;
import org.koala.auth.db.svc.IUserExtSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SvcImpl - 用户扩展对象
 */
@Service("userExtSvcImpl")
public class UserExtSvcImpl implements IUserExtSvc {

    @Autowired
    private IUserExtDao iUserExtDao;

}
