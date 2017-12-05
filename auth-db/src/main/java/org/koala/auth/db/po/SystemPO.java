package org.koala.auth.db.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 实体类 - 系统
 * 系统代表一个Rest服务
 */
@Entity
@Table(name = "T_SYSTEM")
public class SystemPO extends BasePO {

    /**
     * 系统代码
     */
    @Column(name = "SYS_CODE")
    private String sysCode;

    /**
     * 系统名称
     */
    @Column(name = "SYS_NAME")
    private String sysName;

    /**
     * 此系统中Session存活时间（单位:分钟）
     */
    @Column(name = "SESSION_ACTIVE_TIME")
    private Integer sessionActiveTime;

    /**
     * 此系统中允许密码错误重试次数
     */
    @Column(name = "PWD_RETRY_COUNT")
    private Integer pwdRetryCount;

    /**
     * 此系统中强制用户更新密码的天数
     */
    @Column(name = "FORCE_UPDATE_PWD_DAYS")
    private Integer forceUpdatePwdDays;

    /**
     * 此系统中的Rsa公钥
     */
    @Column(name = "RSA_PUB_KEY")
    private String rsaPubKey;

    /**
     * 此系统中的Aes私钥
     */
    @Column(name = "AES_KEY")
    private String aesKey;

    /**
     * 此系统是否启用（启用:true, 未启用:false）
     */
    @Column(name = "ENABLE")
    private Boolean enable;

    public String getSysCode() { return sysCode; }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public Integer getSessionActiveTime() {
        return sessionActiveTime;
    }

    public void setSessionActiveTime(Integer sessionActiveTime) {
        this.sessionActiveTime = sessionActiveTime;
    }

    public Integer getPwdRetryCount() {
        return pwdRetryCount;
    }

    public void setPwdRetryCount(Integer pwdRetryCount) {
        this.pwdRetryCount = pwdRetryCount;
    }

    public Integer getForceUpdatePwdDays() {
        return forceUpdatePwdDays;
    }

    public void setForceUpdatePwdDays(Integer forceUpdatePwdDays) {
        this.forceUpdatePwdDays = forceUpdatePwdDays;
    }

    public String getRsaPubKey() {
        return rsaPubKey;
    }

    public void setRsaPubKey(String rsaPubKey) {
        this.rsaPubKey = rsaPubKey;
    }

    public String getAesKey() {
        return aesKey;
    }

    public void setAesKey(String aesKey) {
        this.aesKey = aesKey;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}
