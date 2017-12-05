package org.koala.auth.db.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 实体类 - 用户扩展对象
 */
@Entity
@Table(name = "T_USER_EXT")
public class UserExtPO extends BasePO {

    /**
     * 用户扩展对象代码
     */
    @Column
    private String extCode;

    /**
     * 用户扩展对象名称
     */
    @Column
    private String extName;

    public String getExtCode() { return extCode; }

    public void setExtCode(String extCode) {
        this.extCode = extCode;
    }

    public String getExtName() {
        return extName;
    }

    public void setExtName(String extName) {
        this.extName = extName;
    }
}
