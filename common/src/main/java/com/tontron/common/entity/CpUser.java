package com.tontron.common.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/****
 * @Author:shenkunlin
 * @Description:CpUser构建
 * @Date 2019/6/14 19:13
 *****/
@Table(name="cp_user")
public class CpUser implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
	private Long userId;//主键，用户id

    @Column(name = "user_name")
	private String userName;//用户名

    @Column(name = "nick_name")
	private String nickName;//昵称

    @Column(name = "phone_number")
	private String phoneNumber;//电话号码

    @Column(name = "create_date")
	private Date createDate;//创建时间

    @Column(name = "update_date")
	private Date updateDate;//更新日期

    @Column(name = "wx_id")
	private String wxId;//关联的微信用户id

    @Column(name = "status_cd")
	private Integer statusCd;//用户状态

    @Column(name = "user_gender")
	private Integer userGender;//用户性别

    @Column(name = "user_birthday")
	private Date userBirthday;//用户生日



	//get方法
	public Long getUserId() {
		return userId;
	}

	//set方法
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	//get方法
	public String getUserName() {
		return userName;
	}

	//set方法
	public void setUserName(String userName) {
		this.userName = userName;
	}
	//get方法
	public String getNickName() {
		return nickName;
	}

	//set方法
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	//get方法
	public String getPhoneNumber() {
		return phoneNumber;
	}

	//set方法
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	//get方法
	public Date getCreateDate() {
		return createDate;
	}

	//set方法
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	//get方法
	public Date getUpdateDate() {
		return updateDate;
	}

	//set方法
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	//get方法
	public String getWxId() {
		return wxId;
	}

	//set方法
	public void setWxId(String wxId) {
		this.wxId = wxId;
	}
	//get方法
	public Integer getStatusCd() {
		return statusCd;
	}

	//set方法
	public void setStatusCd(Integer statusCd) {
		this.statusCd = statusCd;
	}
	//get方法
	public Integer getUserGender() {
		return userGender;
	}

	//set方法
	public void setUserGender(Integer userGender) {
		this.userGender = userGender;
	}
	//get方法
	public Date getUserBirthday() {
		return userBirthday;
	}

	//set方法
	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}


}
