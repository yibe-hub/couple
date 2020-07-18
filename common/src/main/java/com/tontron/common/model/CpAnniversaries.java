package com.tontron.common.model;

import java.util.Date;

public class CpAnniversaries {
    private Long annId;

    private String annName;

    private Date createDate;

    private Date updateDate;

    private Byte statusCd;

    private Long relationId;

    public Long getAnnId() {
        return annId;
    }

    public void setAnnId(Long annId) {
        this.annId = annId;
    }

    public String getAnnName() {
        return annName;
    }

    public void setAnnName(String annName) {
        this.annName = annName == null ? null : annName.trim();
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

    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }
}