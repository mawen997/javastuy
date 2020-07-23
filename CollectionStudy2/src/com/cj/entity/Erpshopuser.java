package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpshopuser
 * author name: �ź�
 * create time: 2020-07-22 16:11:27
 */ 
public class Erpshopuser extends EntityHelper{

	private String Guid;
	/*������ĳ������*/
	private String ShopGuid;
	/*��Ա����*/
	private String UserName;
	/*�ֻ�����*/
	private String Mobile;
	/*��¼����*/
	private String LoginPwd;
	/*������*/
	private int Points;
	/*�Ա�*/
	private String Sex;
	/*����*/
	private Date Birthday;
	/*״̬ 0=���� 1=�˺Ŷ���*/
	private byte Status;
	/*ע��ʱ��*/
	private Date RegDate;
	/*��¼����*/
	private int LoginCount;
	/*����¼����*/
	private Date LastLoginDate;
	/*�ϴε�¼����*/
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

