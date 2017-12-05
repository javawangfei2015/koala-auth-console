package org.koala.auth.db.svc.impl;

import org.koala.auth.db.dao.IUserDao;
import org.koala.auth.db.svc.IUserSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SvcImpl - 用户
 */
@Service("userSvcImpl")
public class UserSvcImpl implements IUserSvc {

    @Autowired
    private IUserDao iUserDao;

}
