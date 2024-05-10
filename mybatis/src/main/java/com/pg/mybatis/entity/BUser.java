package com.pg.mybatis.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * null
 *
 * @author Your Name
 * @date   2024/05/10
 */
public class BUser implements Serializable {
    /**
     * null
     */
    private Integer id;

    /**
     * null
     */
    private String name;

    /**
     * null
     */
    private String password;

    /**
     * null
     */
    private Integer createUserId;

    /**
     * null
     */
    private LocalDateTime createTime;

    /**
     * null
     */
    private Integer updateUserId;

    /**
     * null
     */
    private LocalDateTime updateTime;

    /**
     * null
     */
    private Integer roleId;

    private static final long serialVersionUID = 1L;

    /**
     * getId
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * getName
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * getPassword
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * getCreateUserId
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * getCreateTime
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * getUpdateUserId
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * getUpdateTime
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * getRoleId
     */
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}