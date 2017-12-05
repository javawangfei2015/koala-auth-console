package org.koala.auth.db.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 实体类 - 用户,用户组,角色 关联对象
 */
@Entity
@Table(name = "T_USER_GROUP_ROLE")
public class UserGroupRolePO extends BasePO {

    /**
     * 用户id
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 用户组id
     */
    @Column(name = "GROUP_ID")
    private String groupId;

    /**
     * 角色id
     */
    @Column(name = "ROLE_ID")
    private String roleId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
