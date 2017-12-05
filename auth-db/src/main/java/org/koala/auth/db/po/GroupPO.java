package org.koala.auth.db.po;

import javax.persistence.*;
import java.util.Set;

/**
 * 实体类 - 用户组
 * 用户组可以被赋予角色,用户只要加入组就可以享有组上携带的角色.
 */
@Entity
@Table(name = "T_GROUP")
public class GroupPO extends BasePO {

    /**
     * 用户组代码
     */
    @Column(name = "GROUP_CODE")
    private String groupCode;

    /**
     * 用户组名称
     */
    @Column(name = "GROUP_NAME")
    private String groupName;

    /**
     * 用户组层级
     */
    @Column(name = "GROUP_LEVEL")
    private String groupLevel;

    /**
     * 用户组排序字段
     */
    @Column(name = "DISPLAY_ORDER")
    private Integer displayOrder;

    /**
     * 多个角色关联多个用户组
     */
    @JoinTable(
            name = "T_USER_GROUP_ROLE",
            joinColumns = @JoinColumn(name = "GROUP_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")
    )
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<RolePO> roles;

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupLevel() {
        return groupLevel;
    }

    public void setGroupLevel(String groupLevel) {
        this.groupLevel = groupLevel;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) { this.displayOrder = displayOrder; }

    public Set<RolePO> getRoles() { return roles; }

    public void setRoles(Set<RolePO> roles) {
        this.roles = roles;
    }
}
