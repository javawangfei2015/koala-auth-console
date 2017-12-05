package org.koala.auth.db.svc;

import org.koala.auth.db.po.PermissionPO;
import org.koala.auth.db.po.RolePO;

import java.util.Set;

/**
 * Svc - 角色
 */
public interface IRoleSvc {

    /**
     * 新建角色
     * @param role
     * @return
     */
    RolePO add(RolePO role);

    /**
     * 删除角色
     * @param ids
     */
    void delete(String[] ids);

    /**
     * 修改角色
     * @param role
     * @return
     */
    RolePO update(RolePO role);

    /**
     * 为角色绑定权限
     * @param id
     * @param permissions
     */
    void bindPermission(String id, Set<PermissionPO> permissions);

}
