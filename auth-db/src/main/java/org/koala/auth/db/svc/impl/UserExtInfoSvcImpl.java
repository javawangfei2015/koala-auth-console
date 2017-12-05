package org.koala.auth.db.svc.impl;

import org.koala.auth.db.dao.IUserExtInfoDao;
import org.koala.auth.db.svc.IUserExtInfoSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SvcImpl - 用户扩展信息对象
 */
@Service("userExtInfoSvcImpl")
public class UserExtInfoSvcImpl implements IUserExtInfoSvc {

    @Autowired
    private IUserExtInfoDao iUserExtInfoDao;

}
