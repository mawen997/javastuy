package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  syspersonwork
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class Syspersonwork extends EntityHelper{

	/*唯一标识*/
	private String Guid;
	/*员工Guid*/
	private String PersonGuid;
	/*入职时间*/
	private String EntryTime;
	/*离职时间*/
	private String OutTime;
	/*在职地点*/
	private String Address;
	/*公司名称*/
	private String CompanyName;
	/*职务*/
	private String PostName;
	/*工作内容*/
	private String WorkContent;
	/*证明人*/
	private String Witness;
	/*证明人联系方式*/
	private String WitnessTel;
	/*离职原因*/
	private String OutSummary;
	/*薪资描述*/
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

