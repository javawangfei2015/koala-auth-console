package org.koala.auth.db.svc;

import org.koala.auth.db.po.PermissionPO;
import org.koala.auth.db.po.ResourcePO;

import java.util.Set;

/**
 * Svc - 权限
 */
public interface IPermissionSvc {

    /**
     * 新建权限
     * @param permission
     * @return
     */
    PermissionPO add(PermissionPO permission);

    /**
     * 删除权限
     * @param ids
     */
    void delete(String[] ids);

    /**
     * 修改权限
     * @param permission
     * @return
     */
    PermissionPO update(PermissionPO permission);

    /**
     * 为权限绑定资源
     * @param id
     * @param resources
     */
    void bindResource(String id, Set<ResourcePO> resources);

}
