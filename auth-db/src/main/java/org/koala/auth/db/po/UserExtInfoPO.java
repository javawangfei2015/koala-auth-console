package org.koala.auth.db.po;

import javax.persistence.*;

/**
 * 实体类 - 用户扩展信息对象
 */
@Entity
@Table(name = "T_USER_EXT_INFO")
public class UserExtInfoPO extends BasePO {

    /**
     * 用户主键
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 用户扩展信息值
     */
    @Column(name = "EXT_VAL")
    private String extVal;

    /**
     * 一个用户扩展信息对象关联到一个用户扩展对象
     */
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "EXT_ID")
    private UserExtPO userExt;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExtVal() {
        return extVal;
    }

    public void setExtVal(String extVal) {
        this.extVal = extVal;
    }

    public UserExtPO getUserExt() { return userExt; }

    public void setUserExt(UserExtPO userExt) {
        this.userExt = userExt;
    }
}
