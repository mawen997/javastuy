package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpstaff
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class Erpstaff extends EntityHelper{

	/*唯一编号*/
	private String Guid;
	/*所属店铺（可以是总店）*/
	private String ShopGuid;
	/*员工登录账号*/
	private String LoginName;
	/*登录密码*/
	private String LoginPwd;
	/*真实姓名*/
	private String TrueName;
	/*手机号码*/
	private String Mobile;
	/*性别*/
	private String Sex;
	/*状态 0=正常 1=账号冻结 2=离职*/
	private byte Status;
	/* 0=苹果 1=安卓*/
	private byte IsDevice;
	/*设备类型名称，是苹果还是安卓*/
	private String DeviceName;
	/*设备发送通知用的Token*/
	private String Token;
	/*添加时间*/
	private Date AddDate;
	/*登录次数*/
	private int LoginCount;
	/*最后一次登录时间*/
	private Date LastLoginDate;
	/*上次登录时间*/
	private Date UpLoginDate;

	public Erpstaff() {
		super();
	}
	public Erpstaff(String Guid,String ShopGuid,String LoginName,String LoginPwd,String TrueName,String Mobile,String Sex,byte Status,byte IsDevice,String DeviceName,String Token,Date AddDate,int LoginCount,Date LastLoginDate,Date UpLoginDate) {
		this.Guid=Guid;
		this.ShopGuid=ShopGuid;
		this.LoginName=LoginName;
		this.LoginPwd=LoginPwd;
		this.TrueName=TrueName;
		this.Mobile=Mobile;
		this.Sex=Sex;
		this.Status=Status;
		this.IsDevice=IsDevice;
		this.DeviceName=DeviceName;
		this.Token=Token;
		this.AddDate=AddDate;
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
	public void setLoginName(String LoginName){
		this.LoginName=LoginName;
	}
	public String getLoginName(){
		return LoginName;
	}
	public void setLoginPwd(String LoginPwd){
		this.LoginPwd=LoginPwd;
	}
	public String getLoginPwd(){
		return LoginPwd;
	}
	public void setTrueName(String TrueName){
		this.TrueName=TrueName;
	}
	public String getTrueName(){
		return TrueName;
	}
	public void setMobile(String Mobile){
		this.Mobile=Mobile;
	}
	public String getMobile(){
		return Mobile;
	}
	public void setSex(String Sex){
		this.Sex=Sex;
	}
	public String getSex(){
		return Sex;
	}
	public void setStatus(byte Status){
		this.Status=Status;
	}
	public byte getStatus(){
		return Status;
	}
	public void setIsDevice(byte IsDevice){
		this.IsDevice=IsDevice;
	}
	public byte getIsDevice(){
		return IsDevice;
	}
	public void setDeviceName(String DeviceName){
		this.DeviceName=DeviceName;
	}
	public String getDeviceName(){
		return DeviceName;
	}
	public void setToken(String Token){
		this.Token=Token;
	}
	public String getToken(){
		return Token;
	}
	public void setAddDate(Date AddDate){
		this.AddDate=AddDate;
	}
	public Date getAddDate(){
		return AddDate;
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
		return "erpstaff[" + 
			"Guid=" + Guid + 
			", ShopGuid=" + ShopGuid + 
			", LoginName=" + LoginName + 
			", LoginPwd=" + LoginPwd + 
			", TrueName=" + TrueName + 
			", Mobile=" + Mobile + 
			", Sex=" + Sex + 
			", Status=" + Status + 
			", IsDevice=" + IsDevice + 
			", DeviceName=" + DeviceName + 
			", Token=" + Token + 
			", AddDate=" + AddDate + 
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

