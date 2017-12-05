package org.koala.auth.db.svc;

import org.koala.auth.db.po.ResourcePO;

/**
 * Svc - 资源
 */
public interface IResourceSvc {

    /**
     * 新建资源
     * @param resource
     * @return
     */
    ResourcePO add(ResourcePO resource);

    /**
     * 删除资源
     * @param ids
     */
    void delete(String[] ids);

    /**
     * 修改资源
     * @param resource
     * @return
     */
    ResourcePO update(ResourcePO resource);

}
