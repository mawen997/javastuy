package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  syspersonwork
 * author name: �ź�
 * create time: 2020-07-23 11:47:19
 */ 
public class Syspersonwork extends EntityHelper{

	/*Ψһ��ʶ*/
	private String Guid;
	/*Ա��Guid*/
	private String PersonGuid;
	/*��ְʱ��*/
	private String EntryTime;
	/*��ְʱ��*/
	private String OutTime;
	/*��ְ�ص�*/
	private String Address;
	/*��˾����*/
	private String CompanyName;
	/*ְ��*/
	private String PostName;
	/*��������*/
	private String WorkContent;
	/*֤����*/
	private String Witness;
	/*֤������ϵ��ʽ*/
	private String WitnessTel;
	/*��ְԭ��*/
	private String OutSummary;
	/*н������*/
	private String SalarySummary;

	public Syspersonwork() {
		super();
	}
	public Syspersonwork(String Guid,String PersonGuid,String EntryTime,String OutTime,String Address,String CompanyName,String PostName,String WorkContent,String Witness,String WitnessTel,String OutSummary,String SalarySummary) {
		this.Guid=Guid;
		this.PersonGuid=PersonGuid;
		this.EntryTime=EntryTime;
		this.OutTime=OutTime;
		this.Address=Address;
		this.CompanyName=CompanyName;
		this.PostName=PostName;
		this.WorkContent=WorkContent;
		this.Witness=Witness;
		this.WitnessTel=WitnessTel;
		this.OutSummary=OutSummary;
		this.SalarySummary=SalarySummary;
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
	public void setEntryTime(String EntryTime){
		this.EntryTime=EntryTime;
	}
	public String getEntryTime(){
		return EntryTime;
	}
	public void setOutTime(String OutTime){
		this.OutTime=OutTime;
	}
	public String getOutTime(){
		return OutTime;
	}
	public void setAddress(String Address){
		this.Address=Address;
	}
	public String getAddress(){
		return Address;
	}
	public void setCompanyName(String CompanyName){
		this.CompanyName=CompanyName;
	}
	public String getCompanyName(){
		return CompanyName;
	}
	public void setPostName(String PostName){
		this.PostName=PostName;
	}
	public String getPostName(){
		return PostName;
	}
	public void setWorkContent(String WorkContent){
		this.WorkContent=WorkContent;
	}
	public String getWorkContent(){
		return WorkContent;
	}
	public void setWitness(String Witness){
		this.Witness=Witness;
	}
	public String getWitness(){
		return Witness;
	}
	public void setWitnessTel(String WitnessTel){
		this.WitnessTel=WitnessTel;
	}
	public String getWitnessTel(){
		return WitnessTel;
	}
	public void setOutSummary(String OutSummary){
		this.OutSummary=OutSummary;
	}
	public String getOutSummary(){
		return OutSummary;
	}
	public void setSalarySummary(String SalarySummary){
		this.SalarySummary=SalarySummary;
	}
	public String getSalarySummary(){
		return SalarySummary;
	}
	@Override
	public String toString() {
		return "syspersonwork[" + 
			"Guid=" + Guid + 
			", PersonGuid=" + PersonGuid + 
			", EntryTime=" + EntryTime + 
			", OutTime=" + OutTime + 
			", Address=" + Address + 
			", CompanyName=" + CompanyName + 
			", PostName=" + PostName + 
			", WorkContent=" + WorkContent + 
			", Witness=" + Witness + 
			", WitnessTel=" + WitnessTel + 
			", OutSummary=" + OutSummary + 
			", SalarySummary=" + SalarySummary + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

