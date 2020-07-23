package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpshopuser
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class Erpshopuser extends EntityHelper{

	private String Guid;
	/*归属于某个店铺*/
	private String ShopGuid;
	/*会员姓名*/
	private String UserName;
	/*手机号码*/
	private String Mobile;
	/*登录密码*/
	private String LoginPwd;
	/*积分数*/
	private int Points;
	/*性别*/
	private String Sex;
	/*生日*/
	private Date Birthday;
	/*状态 0=正常 1=账号冻结*/
	private byte Status;
	/*注册时间*/
	private Date RegDate;
	/*登录次数*/
	private int LoginCount;
	/*最后登录日期*/
	private Date LastLoginDate;
	/*上次登录日期*/
	private Date UpLoginDate;

	public Erpshopuser() {
		super();
	}
	public Erpshopuser(String Guid,String ShopGuid,String UserName,String Mobile,String LoginPwd,int Points,String Sex,Date Birthday,byte Status,Date RegDate,int LoginCount,Date LastLoginDate,Date UpLoginDate) {
		this.Guid=Guid;
		this.ShopGuid=ShopGuid;
		this.UserName=UserName;
		this.Mobile=Mobile;
		this.LoginPwd=LoginPwd;
		this.Points=Points;
		this.Sex=Sex;
		this.Birthday=Birthday;
		this.Status=Status;
		this.RegDate=RegDate;
		this.LoginCount=LoginCount;
		this.LastLoginDate=LastLoginDate;
		this.UpLoginDate=UpLoginDate;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setShopGuid(String ShopGuid){
		this.ShopGuid=ShopGuid;
	}
	public String getShopGuid(){
		return ShopGuid;
	}
	public void setUserName(String UserName){
		this.UserName=UserName;
	}
	public String getUserName(){
		return UserName;
	}
	public void setMobile(String Mobile){
		this.Mobile=Mobile;
	}
	public String getMobile(){
		return Mobile;
	}
	public void setLoginPwd(String LoginPwd){
		this.LoginPwd=LoginPwd;
	}
	public String getLoginPwd(){
		return LoginPwd;
	}
	public void setPoints(int Points){
		this.Points=Points;
	}
	public int getPoints(){
		return Points;
	}
	public void setSex(String Sex){
		this.Sex=Sex;
	}
	public String getSex(){
		return Sex;
	}
	public void setBirthday(Date Birthday){
		this.Birthday=Birthday;
	}
	public Date getBirthday(){
		return Birthday;
	}
	public void setStatus(byte Status){
		this.Status=Status;
	}
	public byte getStatus(){
		return Status;
	}
	public void setRegDate(Date RegDate){
		this.RegDate=RegDate;
	}
	public Date getRegDate(){
		return RegDate;
	}
	public void setLoginCount(int LoginCount){
		this.LoginCount=LoginCount;
	}
	public int getLoginCount(){
		return LoginCount;
	}
	public void setLastLoginDate(Date LastLoginDate){
		this.LastLoginDate=LastLoginDate;
	}
	public Date getLastLoginDate(){
		return LastLoginDate;
	}
	public void setUpLoginDate(Date UpLoginDate){
		this.UpLoginDate=UpLoginDate;
	}
	public Date getUpLoginDate(){
		return UpLoginDate;
	}
	@Override
	public String toString() {
		return "erpshopuser[" + 
			"Guid=" + Guid + 
			", ShopGuid=" + ShopGuid + 
			", UserName=" + UserName + 
			", Mobile=" + Mobile + 
			", LoginPwd=" + LoginPwd + 
			", Points=" + Points + 
			", Sex=" + Sex + 
			", Birthday=" + Birthday + 
			", Status=" + Status + 
			", RegDate=" + RegDate + 
			", LoginCount=" + LoginCount + 
			", LastLoginDate=" + LastLoginDate + 
			", UpLoginDate=" + UpLoginDate + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

