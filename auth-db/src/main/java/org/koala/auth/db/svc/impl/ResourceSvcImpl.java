package org.koala.auth.db.svc.impl;

import org.koala.auth.db.dao.IResourceDao;
import org.koala.auth.db.po.ResourcePO;
import org.koala.auth.db.svc.IResourceSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SvcImpl - 资源
 */
@Service("resourceSvcImpl")
public class ResourceSvcImpl implements IResourceSvc {

    @Autowired
    private IResourceDao iResourceDao;

    @Override
    public ResourcePO add(ResourcePO resource) {
        return null;
    }

    @Override
    public void delete(String[] ids) {

    }

    @Override
    public ResourcePO update(ResourcePO resource) {
        return null;
    }
}
