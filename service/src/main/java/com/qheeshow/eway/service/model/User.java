package com.qheeshow.eway.service.model;

import com.qheeshow.eway.common.bean.BaseBean;
import java.util.Date;

public class User extends BaseBean {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.id
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.nickname
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	private String nickname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.password
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.openid
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	private String openid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.mobile
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	private String mobile;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.email
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.name
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.roleid
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	private Integer roleid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.status
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	private Integer status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.companyid
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	private Integer companyid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.call_time
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	private Integer callTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.create_time
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.update_time
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	private Date updateTime;

	private String photo;

	private Integer sex;

	private String province;

	private String city;

	private String country;

	private String headimgurl;

	private String privilege;

	private String unionid;

	private String gzhOpenid;

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.id
	 * @return  the value of t_user.id
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.id
	 * @param id  the value for t_user.id
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.nickname
	 * @return  the value of t_user.nickname
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.nickname
	 * @param nickname  the value for t_user.nickname
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.password
	 * @return  the value of t_user.password
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.password
	 * @param password  the value for t_user.password
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.openid
	 * @return  the value of t_user.openid
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public String getOpenid() {
		return openid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.openid
	 * @param openid  the value for t_user.openid
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.mobile
	 * @return  the value of t_user.mobile
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.mobile
	 * @param mobile  the value for t_user.mobile
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.email
	 * @return  the value of t_user.email
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.email
	 * @param email  the value for t_user.email
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.name
	 * @return  the value of t_user.name
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.name
	 * @param name  the value for t_user.name
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.roleid
	 * @return  the value of t_user.roleid
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public Integer getRoleid() {
		return roleid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.roleid
	 * @param roleid  the value for t_user.roleid
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.status
	 * @return  the value of t_user.status
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.status
	 * @param status  the value for t_user.status
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.companyid
	 * @return  the value of t_user.companyid
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public Integer getCompanyid() {
		return companyid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.companyid
	 * @param companyid  the value for t_user.companyid
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.call_time
	 * @return  the value of t_user.call_time
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public Integer getCallTime() {
		return callTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.call_time
	 * @param callTime  the value for t_user.call_time
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public void setCallTime(Integer callTime) {
		this.callTime = callTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.create_time
	 * @return  the value of t_user.create_time
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.create_time
	 * @param createTime  the value for t_user.create_time
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.update_time
	 * @return  the value of t_user.update_time
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.update_time
	 * @param updateTime  the value for t_user.update_time
	 * @mbggenerated  Sun Mar 19 11:55:32 CST 2017
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getGzhOpenid() {
		return gzhOpenid;
	}

	public void setGzhOpenid(String gzhOpenid) {
		this.gzhOpenid = gzhOpenid;
	}
}