package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpsupplier
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class Erpsupplier extends EntityHelper{

	/*采购供应商唯一编号*/
	private String Guid;
	/*供应商名称*/
	private String Name;
	/*联系人*/
	private String Contacts;
	/*联系电话*/
	private String Mobile;
	/*联系邮箱*/
	private String Email;
	/*属性=自定义 Json对象*/
	private String Attribute;
	/*是否删除  0=否 1=是*/
	private boolean IsDel;
	/*备注*/
	private String Summary;
	/*添加时间*/
	private Date AddDate;

	public Erpsupplier() {
		super();
	}
	public Erpsupplier(String Guid,String Name,String Contacts,String Mobile,String Email,String Attribute,boolean IsDel,String Summary,Date AddDate) {
		this.Guid=Guid;
		this.Name=Name;
		this.Contacts=Contacts;
		this.Mobile=Mobile;
		this.Email=Email;
		this.Attribute=Attribute;
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
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
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
	public void setEmail(String Email){
		this.Email=Email;
	}
	public String getEmail(){
		return Email;
	}
	public void setAttribute(String Attribute){
		this.Attribute=Attribute;
	}
	public String getAttribute(){
		return Attribute;
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
		return "erpsupplier[" + 
			"Guid=" + Guid + 
			", Name=" + Name + 
			", Contacts=" + Contacts + 
			", Mobile=" + Mobile + 
			", Email=" + Email + 
			", Attribute=" + Attribute + 
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

