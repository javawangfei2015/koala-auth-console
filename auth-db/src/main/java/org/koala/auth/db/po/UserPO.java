package org.koala.auth.db.po;

import javax.persistence.*;
import java.util.Set;

/**
 * 实体类 - 用户
 * 用户类表示一个具有对系统操作权限的人员
 */
@Entity
@Table(name = "T_USER")
public class UserPO extends BasePO {

    /**
     * 用户账号
     */
    @Column(name = "ACCOUNT")
    private String account;

    /**
     * 用户密码
     */
    @Column(name = "PASSWD")
    private String passwd;

    /**
     * 用户昵称
     */
    @Column(name = "NICK_NAME")
    private String nickName;

    /**
     * 用户真实姓名
     */
    @Column(name = "REAL_NAME")
    private String realName;

    /**
     * 用户移动电话号码
     */
    @Column(name = "MOBILE_PHONE")
    private String mobilePhone;

    /**
     * 用户邮箱地址
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 用户是否首次登陆系统（首次:true, 非首次:false）
     */
    @Column(name = "FIRST_LOGIN")
    private Boolean firstLogin;

    /**
     * 用户账号是否被锁定（锁定:true, 未锁定:false）
     */
    @Column(name = "LOCKED")
    private Boolean locked;

    /**
     * 用户连续输入错误密码的次数（默认为0,当用户连续输错密码时增长,当用户输入正确密码后归零）
     */
    @Column(name = "BAD_PWD_COUNT")
    private Integer badPwdCount;

    /**
     * 用户账号是否被启用（启用:true, 未启用:false）
     */
    @Column(name = "ENABLED")
    private Boolean enabled;

    /**
     * 一个用户关联一个用户组
     */
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "GROUP_ID")
    private GroupPO group;

    /**
     * 一个用户关联多个扩展对象
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private Set<UserExtInfoPO> userExtInfos;

    /**
     * 多个用户关联到多个角色
     */
    @JoinTable(
            name = "T_USER_GROUP_ROLE",
            joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")
    )
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<RolePO> roles;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(Boolean firstLogin) {
        this.firstLogin = firstLogin;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Integer getBadPwdCount() {
        return badPwdCount;
    }

    public void setBadPwdCount(Integer badPwdCount) {
        this.badPwdCount = badPwdCount;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public GroupPO getGroup() {
        return group;
    }

    public void setGroup(GroupPO group) {
        this.group = group;
    }

    public Set<UserExtInfoPO> getUserExtInfos() {
        return userExtInfos;
    }

    public void setUserExtInfos(Set<UserExtInfoPO> userExtInfos) {
        this.userExtInfos = userExtInfos;
    }

    public Set<RolePO> getRoles() {
        return roles;
    }

    public void setRoles(Set<RolePO> roles) {
        this.roles = roles;
    }
}
