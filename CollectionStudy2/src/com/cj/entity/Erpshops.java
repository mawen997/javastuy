package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpshops
 * author name: �ź�
 * create time: 2020-07-22 16:11:27
 */ 
public class Erpshops extends EntityHelper{

	/*Ψһ���*/
	private String Guid;
	/*���̵�¼�˺�*/
	private String LoginName;
	/*���̵�¼����*/
	private String LoginPwd;
	/*����������*/
	private String AdminName;
	/*�Ա�*/
	private String Sex;
	/*���̷���ͼ*/
	private String ShopCover;
	/*���״̬ 0=���� 1=�˺Ŷ���  2=ͣҵ*/
	private byte Status;
	/*��������*/
	private String ShopName;
	/*��������ϵ�绰*/
	private String Mobile;
	/*��������*/
	private String Tel;
	/*������������*/
	private String ShopCity;
	/*������ϸ��ַ*/
	private String ShopAddress;
	/*����Logo*/
	private String ShopLogo;
	/*��ע*/
	private String Summary;
	/*ע��ʱ��*/
	private Date RegDate;
	/*��¼����*/
	private int LoginCount;
	/*����¼ʱ��*/
	private Date LastLoginDate;
	/*�ϴε�¼ʱ��*/
	private Date UpLoginDate;

	public Erpshops() {
		super();
	}
	public Erpshops(String Guid,String LoginName,String LoginPwd,String AdminName,String Sex,String ShopCover,byte Status,String ShopName,String Mobile,String Tel,String ShopCity,String ShopAddress,String ShopLogo,String Summary,Date RegDate,int LoginCount,Date LastLoginDate,Date UpLoginDate) {
		this.Guid=Guid;
		this.LoginName=LoginName;
		this.LoginPwd=LoginPwd;
		this.AdminName=AdminName;
		this.Sex=Sex;
		this.ShopCover=ShopCover;
		this.Status=Status;
		this.ShopName=ShopName;
		this.Mobile=Mobile;
		this.Tel=Tel;
		this.ShopCity=ShopCity;
		this.ShopAddress=ShopAddress;
		this.ShopLogo=ShopLogo;
		this.Summary=Summary;
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
	public void setAdminName(String AdminName){
		this.AdminName=AdminName;
	}
	public String getAdminName(){
		return AdminName;
	}
	public void setSex(String Sex){
		this.Sex=Sex;
	}
	public String getSex(){
		return Sex;
	}
	public void setShopCover(String ShopCover){
		this.ShopCover=ShopCover;
	}
	public String getShopCover(){
		return ShopCover;
	}
	public void setStatus(byte Status){
		this.Status=Status;
	}
	public byte getStatus(){
		return Status;
	}
	public void setShopName(String ShopName){
		this.ShopName=ShopName;
	}
	public String getShopName(){
		return ShopName;
	}
	public void setMobile(String Mobile){
		this.Mobile=Mobile;
	}
	public String getMobile(){
		return Mobile;
	}
	public void setTel(String Tel){
		this.Tel=Tel;
	}
	public String getTel(){
		return Tel;
	}
	public void setShopCity(String ShopCity){
		this.ShopCity=ShopCity;
	}
	public String getShopCity(){
		return ShopCity;
	}
	public void setShopAddress(String ShopAddress){
		this.ShopAddress=ShopAddress;
	}
	public String getShopAddress(){
		return ShopAddress;
	}
	public void setShopLogo(String ShopLogo){
		this.ShopLogo=ShopLogo;
	}
	public String getShopLogo(){
		return ShopLogo;
	}
	public void setSummary(String Summary){
		this.Summary=Summary;
	}
	public String getSummary(){
		return Summary;
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
		return "erpshops[" + 
			"Guid=" + Guid + 
			", LoginName=" + LoginName + 
			", LoginPwd=" + LoginPwd + 
			", AdminName=" + AdminName + 
			", Sex=" + Sex + 
			", ShopCover=" + ShopCover + 
			", Status=" + Status + 
			", ShopName=" + ShopName + 
			", Mobile=" + Mobile + 
			", Tel=" + Tel + 
			", ShopCity=" + ShopCity + 
			", ShopAddress=" + ShopAddress + 
			", ShopLogo=" + ShopLogo + 
			", Summary=" + Summary + 
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

