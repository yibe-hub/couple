package com.tontron.common.model;

import java.util.Date;

public class CpRelation {
    private Long relationId;

    private String relationName;

    private Date createDate;

    private Date updateDate;

    private Byte statusCd;

    private Long maleUserId;

    private Long femaleUserId;

    private Long relationDays;

    private Long createUser;

    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName == null ? null : relationName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Byte getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Byte statusCd) {
        this.statusCd = statusCd;
    }

    public Long getMaleUserId() {
        return maleUserId;
    }

    public void setMaleUserId(Long maleUserId) {
        this.maleUserId = maleUserId;
    }

    public Long getFemaleUserId() {
        return femaleUserId;
    }

    public void setFemaleUserId(Long femaleUserId) {
        this.femaleUserId = femaleUserId;
    }

    public Long getRelationDays() {
        return relationDays;
    }

    public void setRelationDays(Long relationDays) {
        this.relationDays = relationDays;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }
}