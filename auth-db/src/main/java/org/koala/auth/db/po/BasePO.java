package org.koala.auth.db.po;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * 实体类 - 基础类
 * 基础类封装了一些实体类中通用的属性
 */
@MappedSuperclass
public class BasePO implements Serializable {

    // 主键
    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "ID")
    private String id;

    // 记录实体类写入表时的时间
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    // 记录将实体类写入表中的操作人
    @Column(name = "CREATED_BY")
    private String createdBy;

    // 记录实体类在表中被修改的时间
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;

    // 记录修改表中实体类的操作人
    @Column(name = "UPDATED_BY")
    private String updatedBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

}
