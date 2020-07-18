package com.tontron.common.model;

import java.util.Date;

public class CpAlbum {
    private Long albumId;

    private String albumName;

    private Date createDate;

    private Date updateDate;

    private String albumDescribe;

    private Long createUser;

    private Byte statusCd;

    private Long relationId;

    private Long annId;

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName == null ? null : albumName.trim();
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

    public String getAlbumDescribe() {
        return albumDescribe;
    }

    public void setAlbumDescribe(String albumDescribe) {
        this.albumDescribe = albumDescribe == null ? null : albumDescribe.trim();
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
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

    public Long getAnnId() {
        return annId;
    }

    public void setAnnId(Long annId) {
        this.annId = annId;
    }
}