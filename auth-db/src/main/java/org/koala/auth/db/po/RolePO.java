package org.koala.auth.db.po;

import javax.persistence.*;
import java.util.Set;

/**
 * 实体类 - 角色
 * 角色可以被赋予多个权限代表一组权限的集合
 */
@Entity
@Table(name = "T_ROLE")
public class RolePO extends BasePO {

    /**
     * 权限代码
     */
    @Column(name = "ROLE_CODE")
    private String roleCode;

    /**
     * 角色名称
     */
    @Column(name = "ROLE_NAME")
    private String roleName;

    /**
     * 角色是否启用（启用:true, 未启用:false）
     */
    @Column(name = "ENABLE")
    private Boolean enable;

    /**
     * 多个角色关联多个资源
     */
    @JoinTable(
            name = "T_ROLE_RESOURCE",
            joinColumns = @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "RES_ID", referencedColumnName = "ID")
    )
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ResourcePO> resources;

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Set<ResourcePO> getResources() { return resources; }

    public void setResources(Set<ResourcePO> resources) { this.resources = resources; }
}
