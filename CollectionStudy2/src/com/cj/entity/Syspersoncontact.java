package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  syspersoncontact
 * author name: �ź�
 * create time: 2020-07-23 11:47:19
 */ 
public class Syspersoncontact extends EntityHelper{

	/*Ψһ��ʶ*/
	private String Guid;
	/*Ա��Guid*/
	private String PersonGuid;
	/*��ϵ������*/
	private String Name;
	/*��ϵ�˹�ϵ*/
	private String Relation;
	/*��ϵ��ʽ*/
	private String Mobile;
	/*��ϵ��ַ*/
	private String Address;
	/*�Ƿ�Ϊ������ϵ��*/
	private boolean IsUrgent;
	/*���ʱ��*/
	private Date AddTime;
	/*�޸�ʱ��*/
	private Date EditTime;

	public Syspersoncontact() {
		super();
	}
	public Syspersoncontact(String Guid,String PersonGuid,String Name,String Relation,String Mobile,String Address,boolean IsUrgent,Date AddTime,Date EditTime) {
		this.Guid=Guid;
		this.PersonGuid=PersonGuid;
		this.Name=Name;
		this.Relation=Relation;
		this.Mobile=Mobile;
		this.Address=Address;
		this.IsUrgent=IsUrgent;
		this.AddTime=AddTime;
		this.EditTime=EditTime;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setPersonGuid(String PersonGuid){
		this.PersonGuid=PersonGuid;
	}
	public String getPersonGuid(){
		return PersonGuid;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setRelation(String Relation){
		this.Relation=Relation;
	}
	public String getRelation(){
		return Relation;
	}
	public void setMobile(String Mobile){
		this.Mobile=Mobile;
	}
	public String getMobile(){
		return Mobile;
	}
	public void setAddress(String Address){
		this.Address=Address;
	}
	public String getAddress(){
		return Address;
	}
	public void setIsUrgent(boolean IsUrgent){
		this.IsUrgent=IsUrgent;
	}
	public boolean getIsUrgent(){
		return IsUrgent;
	}
	public void setAddTime(Date AddTime){
		this.AddTime=AddTime;
	}
	public Date getAddTime(){
		return AddTime;
	}
	public void setEditTime(Date EditTime){
		this.EditTime=EditTime;
	}
	public Date getEditTime(){
		return EditTime;
	}
	@Override
	public String toString() {
		return "syspersoncontact[" + 
			"Guid=" + Guid + 
			", PersonGuid=" + PersonGuid + 
			", Name=" + Name + 
			", Relation=" + Relation + 
			", Mobile=" + Mobile + 
			", Address=" + Address + 
			", IsUrgent=" + IsUrgent + 
			", AddTime=" + AddTime + 
			", EditTime=" + EditTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

