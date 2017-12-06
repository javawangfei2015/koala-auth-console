package org.koala.auth.db.po;

import javax.persistence.*;
import java.util.Set;

/**
 * 实体类 - 资源
 * 资源代表系统中一个可访问的资源
 */
@Entity
@Table(name = "T_RESOURCE")
public class ResourcePO extends BasePO {

    /**
     * 资源代码
     */
    @Column(name = "RES_CODE")
    private String resCode;

    /**
     * 资源名称
     */
    @Column(name = "RES_NAME")
    private String resName;

    /**
     * 此权限可访问的api路径
     */
    @Column(name = "API_PATH")
    private String apiPath;

    /**
     * 一个资源关联多个权限
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "RES_ID")
    private Set<PermissionPO> permissions;

    public String getResCode() { return resCode; }

    public void setResCode(String resCode) { this.resCode = resCode; }

    public String getResName() { return resName; }

    public void setResName(String resName) { this.resName = resName; }

    public String getApiPath() { return apiPath; }

    public void setApiPath(String apiPath) { this.apiPath = apiPath; }

    public Set<PermissionPO> getPermissions() { return permissions; }

    public void setPermissions(Set<PermissionPO> permissions) { this.permissions = permissions; }
}
