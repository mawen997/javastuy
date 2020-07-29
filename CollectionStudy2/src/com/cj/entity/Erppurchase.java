package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erppurchase
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class Erppurchase extends EntityHelper{

	/*采购单唯一编号*/
	private String Guid;
	/*采购编号*/
	private String Number;
	/*供应商*/
	private String SupplierGuid;
	/*联系人*/
	private String Contacts;
	/*联系电话*/
	private String Mobile;
	/*采购金额*/
	private BigDecimal Money;
	/*交付区域*/
	private String DeliverCity;
	/*交付日期*/
	private Date DeliverDate;
	/*操作人*/
	private String AdminGuid;
	/*属性=自定义 Json对象*/
	private String Attribute;
	/*状态 1=未完成入库  2=未完成付款  3=未完成到票  4=完成*/
	private byte Status;
	/*是否删除 0=否  1=是*/
	private boolean IsDel;
	/*备注*/
	private String Summary;
	/*采购日期*/
	private Date AddDate;

	public Erppurchase() {
		super();
	}
	public Erppurchase(String Guid,String Number,String SupplierGuid,String Contacts,String Mobile,BigDecimal Money,String DeliverCity,Date DeliverDate,String AdminGuid,String Attribute,byte Status,boolean IsDel,String Summary,Date AddDate) {
		this.Guid=Guid;
		this.Number=Number;
		this.SupplierGuid=SupplierGuid;
		this.Contacts=Contacts;
		this.Mobile=Mobile;
		this.Money=Money;
		this.DeliverCity=DeliverCity;
		this.DeliverDate=DeliverDate;
		this.AdminGuid=AdminGuid;
		this.Attribute=Attribute;
		this.Status=Status;
		this.IsDel=IsDel;
		this.Summary=Summary;
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
	public void setSupplierGuid(String SupplierGuid){
		this.SupplierGuid=SupplierGuid;
	}
	public String getSupplierGuid(){
		return SupplierGuid;
	}
	public void setContacts(String Contacts){
		this.Contacts=Contacts;
	}
	public String getContacts(){
		return Contacts;
	}
	public void setMobile(String Mobile){
		this.Mobile=Mobile;
	}
	public String getMobile(){
		return Mobile;
	}
	public void setMoney(BigDecimal Money){
		this.Money=Money;
	}
	public BigDecimal getMoney(){
		return Money;
	}
	public void setDeliverCity(String DeliverCity){
		this.DeliverCity=DeliverCity;
	}
	public String getDeliverCity(){
		return DeliverCity;
	}
	public void setDeliverDate(Date DeliverDate){
		this.DeliverDate=DeliverDate;
	}
	public Date getDeliverDate(){
		return DeliverDate;
	}
	public void setAdminGuid(String AdminGuid){
		this.AdminGuid=AdminGuid;
	}
	public String getAdminGuid(){
		return AdminGuid;
	}
	public void setAttribute(String Attribute){
		this.Attribute=Attribute;
	}
	public String getAttribute(){
		return Attribute;
	}
	public void setStatus(byte Status){
		this.Status=Status;
	}
	public byte getStatus(){
		return Status;
	}
	public void setIsDel(boolean IsDel){
		this.IsDel=IsDel;
	}
	public boolean getIsDel(){
		return IsDel;
	}
	public void setSummary(String Summary){
		this.Summary=Summary;
	}
	public String getSummary(){
		return Summary;
	}
	public void setAddDate(Date AddDate){
		this.AddDate=AddDate;
	}
	public Date getAddDate(){
		return AddDate;
	}
	@Override
	public String toString() {
		return "erppurchase[" + 
			"Guid=" + Guid + 
			", Number=" + Number + 
			", SupplierGuid=" + SupplierGuid + 
			", Contacts=" + Contacts + 
			", Mobile=" + Mobile + 
			", Money=" + Money + 
			", DeliverCity=" + DeliverCity + 
			", DeliverDate=" + DeliverDate + 
			", AdminGuid=" + AdminGuid + 
			", Attribute=" + Attribute + 
			", Status=" + Status + 
			", IsDel=" + IsDel + 
			", Summary=" + Summary + 
			", AddDate=" + AddDate + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

