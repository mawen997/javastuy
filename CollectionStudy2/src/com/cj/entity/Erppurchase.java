package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erppurchase
 * author name: �ź�
 * create time: 2020-07-23 11:47:19
 */ 
public class Erppurchase extends EntityHelper{

	/*�ɹ���Ψһ���*/
	private String Guid;
	/*�ɹ����*/
	private String Number;
	/*��Ӧ��*/
	private String SupplierGuid;
	/*��ϵ��*/
	private String Contacts;
	/*��ϵ�绰*/
	private String Mobile;
	/*�ɹ����*/
	private BigDecimal Money;
	/*��������*/
	private String DeliverCity;
	/*��������*/
	private Date DeliverDate;
	/*������*/
	private String AdminGuid;
	/*����=�Զ��� Json����*/
	private String Attribute;
	/*״̬ 1=δ������  2=δ��ɸ���  3=δ��ɵ�Ʊ  4=���*/
	private byte Status;
	/*�Ƿ�ɾ�� 0=��  1=��*/
	private boolean IsDel;
	/*��ע*/
	private String Summary;
	/*�ɹ�����*/
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

