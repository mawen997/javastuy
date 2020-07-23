package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpsupplier
 * author name: �ź�
 * create time: 2020-07-22 16:11:27
 */ 
public class Erpsupplier extends EntityHelper{

	/*�ɹ���Ӧ��Ψһ���*/
	private String Guid;
	/*��Ӧ������*/
	private String Name;
	/*��ϵ��*/
	private String Contacts;
	/*��ϵ�绰*/
	private String Mobile;
	/*��ϵ����*/
	private String Email;
	/*����=�Զ��� Json����*/
	private String Attribute;
	/*�Ƿ�ɾ��  0=�� 1=��*/
	private boolean IsDel;
	/*��ע*/
	private String Summary;
	/*���ʱ��*/
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

