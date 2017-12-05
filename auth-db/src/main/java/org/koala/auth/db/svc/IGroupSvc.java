package org.koala.auth.db.svc;

import org.koala.auth.db.po.GroupPO;
import org.koala.auth.db.po.RolePO;
import org.koala.auth.db.po.UserPO;

import java.util.Set;

/**
 * Svc - 用户组
 */
public interface IGroupSvc {

    /**
     * 新建用户组
     * @param group
     * @return
     */
    GroupPO add(GroupPO group);

    /**
     * 删除用户组
     * @param ids
     */
    void delete(String[] ids);

    /**
     * 修改用户组
     * @param group
     * @return
     */
    GroupPO update(GroupPO group);

    /**
     * 为用户组绑定角色
     * @param id
     * @param roles
     */
    void bindRoles(String id, Set<RolePO> roles);

    /**
     * 为用户组绑定用户
     * @param id
     * @param users
     */
    void bindUsers(String id, Set<UserPO> users);

}
