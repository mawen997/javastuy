package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpshopactivity
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class Erpshopactivity extends EntityHelper{

	private String Guid;
	/*店铺编号*/
	private String ShopGuid;
	/*品牌ID*/
	private String BrandGuid;
	/*类型(0=全部店铺/1=按商铺/2=按品牌/3=按地区)*/
	private byte Types;
	/*方式(1=打折/2=满减)*/
	private byte Method;
	/*折扣数*/
	private int CountNum;
	/*满减Json*/
	private String FullBack;
	/*开始时间*/
	private Date BeginDate;
	/*结束时间*/
	private Date EndDate;
	/*是否启用  1=启用  0=不启用*/
	private boolean Enable;
	/*是否删除  0=不删除  1=删除*/
	private boolean IsDel;
	/*活动添加时间*/
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

