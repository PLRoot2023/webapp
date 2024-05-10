package com.pg.mybatis.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * null
 *
 * @author Your Name
 * @date   2024/05/10
 */
public class BRole implements Serializable {
    /**
     * null
     */
    private Integer id;

    /**
     * ユーザー名
     */
    private String name;

    /**
     * null
     */
    private String createUserId;

    /**
     * null
     */
    private LocalDateTime createTime;

    /**
     * null
     */
    private String updateUserId;

    /**
     * null
     */
    private LocalDateTime updateTime;

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
     * getCreateUserId
     */
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
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
    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
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
}