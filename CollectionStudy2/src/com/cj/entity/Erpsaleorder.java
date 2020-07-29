package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpsaleorder
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class Erpsaleorder extends EntityHelper{

	private String Guid;
	/*销售订单编号*/
	private String Number;
	/*店铺编号*/
	private String ShopGuid;
	/*操作员编号*/
	private String AdminGuid;
	/*会员编号*/
	private String UserGuid;
	/*活动名称*/
	private String ActivityName;
	/*订单类型 1=普通销售/2=打折销售/3=满减销售*/
	private byte ActivityTypes;
	/*销售类型 1=正常销售/2=残次品销售*/
	private byte SaleType;
	/*订单总件数*/
	private int Counts;
	/*订单金额*/
	private BigDecimal Money;
	/*实收金额-如果有活动会比订单金额要低*/
	private BigDecimal RealMoney;
	/*下单日期*/
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

