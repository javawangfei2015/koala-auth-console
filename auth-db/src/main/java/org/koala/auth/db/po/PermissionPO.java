package org.koala.auth.db.po;

import javax.persistence.*;
import java.util.Set;

/**
 * 实体类 - 权限
 * 权限类代表可以赋予角色的权限
 */
@Entity
@Table(name = "T_PERMISSION")
public class PermissionPO extends BasePO {

    /**
     * 权限名称
     */
    @Column(name = "PERMS_NAME")
    private String permsName;

    /**
     * 此权限是否启用（启用:true, 未启用:false）
     */
    @Column(name = "ENABLE")
    private Boolean enable;

    /**
     * 一个权限关联多个资源
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "PERMS_ID")
    private Set<ResourcePO> resources;

    public String getPermsName() {
        return permsName;
    }

    public void setPermsName(String permsName) {
        this.permsName = permsName;
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
