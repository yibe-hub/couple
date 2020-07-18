package com.tontron.common.model;

import java.util.Date;

public class CpPhoto {
    private Long photoId;

    private String photoName;

    private Long relationId;

    private Long annId;

    private Date createDate;

    private Date updateDate;

    private String photoDescribe;

    private Long albumId;

    private Long createUser;

    private Byte statusCd;

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName == null ? null : photoName.trim();
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

    public String getPhotoDescribe() {
        return photoDescribe;
    }

    public void setPhotoDescribe(String photoDescribe) {
        this.photoDescribe = photoDescribe == null ? null : photoDescribe.trim();
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
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
}