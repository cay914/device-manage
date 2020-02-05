package com.codebattery.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "member")
@ApiModel(description = "成员")
public class Member {
	
	@ApiModelProperty(value = "ID", required = true)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
	@ApiModelProperty(value = "用户登陆账号", required = false)
    @Column(name = "account", nullable = false)
    private String account;	//用户登陆账号
    
	@ApiModelProperty(value = "登陆密码", required = false)
    @Column(name = "password", nullable = false)
    private String password;	//登陆密码，32位加密串	utf8
	
	@ApiModelProperty(value = "用户昵称")
    @Column(name = "name")
    private String  name;	//用户昵称
    
	@ApiModelProperty(value = "手机号码")
    @Column(name = "mobile")
    private String  mobile;	//手机号码
    
	@ApiModelProperty(value = "真实姓名")
    @Column(name = "realname")
    private String  realname;	//真实姓名
    
	@ApiModelProperty(value = "创建时间")
    @Column(name = "create_time")
    private Date  createTime;	//创建时间
    
	@ApiModelProperty(value = "状态")
    @Column(name = "status")
    private Integer  status;	//状态
    
	@ApiModelProperty(value = "上次登录时间")
    @Column(name = "last_login_time")
    private Date  lastLoginTime;	//上次登录时间
    
	@ApiModelProperty(value = "性别")
    @Column(name = "sex")
    private String sex;	//性别
    
	@ApiModelProperty(value = "头像")
    @Column(name = "avatar")
    private String avatar;	//头像
    
	@ApiModelProperty(value = "身份证")
    @Column(name = "idcard")
    private String idcard;	//身份证
    
	@ApiModelProperty(value = "省")
    @Column(name = "province")
    private Long province;	//省
    
	@ApiModelProperty(value = "市")
    @Column(name = "city")
    private Long city;	//市
    
	@ApiModelProperty(value = "区")
    @Column(name = "area")
    private Long area;	//区
    
	@ApiModelProperty(value = "所在地址")
    @Column(name = "address")
    private String address;	//所在地址
    
	@ApiModelProperty(value = "备注")
    @Column(name = "description")
    private String description;	//备注
    
	@ApiModelProperty(value = "邮箱")
    @Column(name = "email")
    private String email;	//邮箱
    
	@ApiModelProperty(value = "编号")
    @Column(name = "code")
    private String code;	//编号
    
	@ApiModelProperty(value = "钉钉openid")
    @Column(name = "dingtalk_openid")
    private String dingtalkOpenid;	//钉钉openid
    
	@ApiModelProperty(value = "钉钉unionid")
    @Column(name = "dingtalk_unionid")
    private String dingtalkUnionid;	//钉钉unionid
    
	@ApiModelProperty(value = "钉钉用户id")
    @Column(name = "dingtalk_userid")
    private String dingtalkUserid;	//钉钉用户id

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public Long getProvince() {
		return province;
	}

	public void setProvince(Long province) {
		this.province = province;
	}

	public Long getCity() {
		return city;
	}

	public void setCity(Long city) {
		this.city = city;
	}

	public Long getArea() {
		return area;
	}

	public void setArea(Long area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDingtalkOpenid() {
		return dingtalkOpenid;
	}

	public void setDingtalkOpenid(String dingtalkOpenid) {
		this.dingtalkOpenid = dingtalkOpenid;
	}

	public String getDingtalkUnionid() {
		return dingtalkUnionid;
	}

	public void setDingtalkUnionid(String dingtalkUnionid) {
		this.dingtalkUnionid = dingtalkUnionid;
	}

	public String getDingtalkUserid() {
		return dingtalkUserid;
	}

	public void setDingtalkUserid(String dingtalkUserid) {
		this.dingtalkUserid = dingtalkUserid;
	}
}
