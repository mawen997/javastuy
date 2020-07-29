package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpshopactivity
 * author name: �ź�
 * create time: 2020-07-23 11:47:19
 */ 
public class Erpshopactivity extends EntityHelper{

	private String Guid;
	/*���̱��*/
	private String ShopGuid;
	/*Ʒ��ID*/
	private String BrandGuid;
	/*����(0=ȫ������/1=������/2=��Ʒ��/3=������)*/
	private byte Types;
	/*��ʽ(1=����/2=����)*/
	private byte Method;
	/*�ۿ���*/
	private int CountNum;
	/*����Json*/
	private String FullBack;
	/*��ʼʱ��*/
	private Date BeginDate;
	/*����ʱ��*/
	private Date EndDate;
	/*�Ƿ�����  1=����  0=������*/
	private boolean Enable;
	/*�Ƿ�ɾ��  0=��ɾ��  1=ɾ��*/
	private boolean IsDel;
	/*����ʱ��*/
	private Date AddDate;

	public Erpshopactivity() {
		super();
	}
	public Erpshopactivity(String Guid,String ShopGuid,String BrandGuid,byte Types,byte Method,int CountNum,String FullBack,Date BeginDate,Date EndDate,boolean Enable,boolean IsDel,Date AddDate) {
		this.Guid=Guid;
		this.ShopGuid=ShopGuid;
		this.BrandGuid=BrandGuid;
		this.Types=Types;
		this.Method=Method;
		this.CountNum=CountNum;
		this.FullBack=FullBack;
		this.BeginDate=BeginDate;
		this.EndDate=EndDate;
		this.Enable=Enable;
		this.IsDel=IsDel;
		this.AddDate=AddDate;
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
	public void setBrandGuid(String BrandGuid){
		this.BrandGuid=BrandGuid;
	}
	public String getBrandGuid(){
		return BrandGuid;
	}
	public void setTypes(byte Types){
		this.Types=Types;
	}
	public byte getTypes(){
		return Types;
	}
	public void setMethod(byte Method){
		this.Method=Method;
	}
	public byte getMethod(){
		return Method;
	}
	public void setCountNum(int CountNum){
		this.CountNum=CountNum;
	}
	public int getCountNum(){
		return CountNum;
	}
	public void setFullBack(String FullBack){
		this.FullBack=FullBack;
	}
	public String getFullBack(){
		return FullBack;
	}
	public void setBeginDate(Date BeginDate){
		this.BeginDate=BeginDate;
	}
	public Date getBeginDate(){
		return BeginDate;
	}
	public void setEndDate(Date EndDate){
		this.EndDate=EndDate;
	}
	public Date getEndDate(){
		return EndDate;
	}
	public void setEnable(boolean Enable){
		this.Enable=Enable;
	}
	public boolean getEnable(){
		return Enable;
	}
	public void setIsDel(boolean IsDel){
		this.IsDel=IsDel;
	}
	public boolean getIsDel(){
		return IsDel;
	}
	public void setAddDate(Date AddDate){
		this.AddDate=AddDate;
	}
	public Date getAddDate(){
		return AddDate;
	}
	@Override
	public String toString() {
		return "erpshopactivity[" + 
			"Guid=" + Guid + 
			", ShopGuid=" + ShopGuid + 
			", BrandGuid=" + BrandGuid + 
			", Types=" + Types + 
			", Method=" + Method + 
			", CountNum=" + CountNum + 
			", FullBack=" + FullBack + 
			", BeginDate=" + BeginDate + 
			", EndDate=" + EndDate + 
			", Enable=" + Enable + 
			", IsDel=" + IsDel + 
			", AddDate=" + AddDate + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

