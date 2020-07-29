package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpsaleorder
 * author name: �ź�
 * create time: 2020-07-23 11:47:19
 */ 
public class Erpsaleorder extends EntityHelper{

	private String Guid;
	/*���۶������*/
	private String Number;
	/*���̱��*/
	private String ShopGuid;
	/*����Ա���*/
	private String AdminGuid;
	/*��Ա���*/
	private String UserGuid;
	/*�����*/
	private String ActivityName;
	/*�������� 1=��ͨ����/2=��������/3=��������*/
	private byte ActivityTypes;
	/*�������� 1=��������/2=�д�Ʒ����*/
	private byte SaleType;
	/*�����ܼ���*/
	private int Counts;
	/*�������*/
	private BigDecimal Money;
	/*ʵ�ս��-����л��ȶ������Ҫ��*/
	private BigDecimal RealMoney;
	/*�µ�����*/
	private Date AddDate;

	public Erpsaleorder() {
		super();
	}
	public Erpsaleorder(String Guid,String Number,String ShopGuid,String AdminGuid,String UserGuid,String ActivityName,byte ActivityTypes,byte SaleType,int Counts,BigDecimal Money,BigDecimal RealMoney,Date AddDate) {
		this.Guid=Guid;
		this.Number=Number;
		this.ShopGuid=ShopGuid;
		this.AdminGuid=AdminGuid;
		this.UserGuid=UserGuid;
		this.ActivityName=ActivityName;
		this.ActivityTypes=ActivityTypes;
		this.SaleType=SaleType;
		this.Counts=Counts;
		this.Money=Money;
		this.RealMoney=RealMoney;
		this.AddDate=AddDate;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setNumber(String Number){
		this.Number=Number;
	}
	public String getNumber(){
		return Number;
	}
	public void setShopGuid(String ShopGuid){
		this.ShopGuid=ShopGuid;
	}
	public String getShopGuid(){
		return ShopGuid;
	}
	public void setAdminGuid(String AdminGuid){
		this.AdminGuid=AdminGuid;
	}
	public String getAdminGuid(){
		return AdminGuid;
	}
	public void setUserGuid(String UserGuid){
		this.UserGuid=UserGuid;
	}
	public String getUserGuid(){
		return UserGuid;
	}
	public void setActivityName(String ActivityName){
		this.ActivityName=ActivityName;
	}
	public String getActivityName(){
		return ActivityName;
	}
	public void setActivityTypes(byte ActivityTypes){
		this.ActivityTypes=ActivityTypes;
	}
	public byte getActivityTypes(){
		return ActivityTypes;
	}
	public void setSaleType(byte SaleType){
		this.SaleType=SaleType;
	}
	public byte getSaleType(){
		return SaleType;
	}
	public void setCounts(int Counts){
		this.Counts=Counts;
	}
	public int getCounts(){
		return Counts;
	}
	public void setMoney(BigDecimal Money){
		this.Money=Money;
	}
	public BigDecimal getMoney(){
		return Money;
	}
	public void setRealMoney(BigDecimal RealMoney){
		this.RealMoney=RealMoney;
	}
	public BigDecimal getRealMoney(){
		return RealMoney;
	}
	public void setAddDate(Date AddDate){
		this.AddDate=AddDate;
	}
	public Date getAddDate(){
		return AddDate;
	}
	@Override
	public String toString() {
		return "erpsaleorder[" + 
			"Guid=" + Guid + 
			", Number=" + Number + 
			", ShopGuid=" + ShopGuid + 
			", AdminGuid=" + AdminGuid + 
			", UserGuid=" + UserGuid + 
			", ActivityName=" + ActivityName + 
			", ActivityTypes=" + ActivityTypes + 
			", SaleType=" + SaleType + 
			", Counts=" + Counts + 
			", Money=" + Money + 
			", RealMoney=" + RealMoney + 
			", AddDate=" + AddDate + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

