package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  syscompany
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class Syscompany extends EntityHelper{

	private String Guid;
	/*归属于集团Guid*/
	private String ParentGuid;
	/*公司编号*/
	private String Codes;
	/*层级*/
	private int Layer;
	/*公司名称*/
	private String Name;
	/*公司Logo*/
	private String Logo;
	/*公司法人*/
	private String Corporate;
	/*创建日期*/
	private Date FoundTIme;
	/*公司文化*/
	private String Summary;
	/*公司总机电话*/
	private String Tel;
	/*传真*/
	private String Fax;
	/*公司地址*/
	private String Address;
	/*删除状态*/
	private boolean DelStatus;
	/*添加时间*/
	private Date AddTime;
	/*修改时间*/
	private Date EditTIme;

	public Syscompany() {
		super();
	}
	public Syscompany(String Guid,String ParentGuid,String Codes,int Layer,String Name,String Logo,String Corporate,Date FoundTIme,String Summary,String Tel,String Fax,String Address,boolean DelStatus,Date AddTime,Date EditTIme) {
		this.Guid=Guid;
		this.ParentGuid=ParentGuid;
		this.Codes=Codes;
		this.Layer=Layer;
		this.Name=Name;
		this.Logo=Logo;
		this.Corporate=Corporate;
		this.FoundTIme=FoundTIme;
		this.Summary=Summary;
		this.Tel=Tel;
		this.Fax=Fax;
		this.Address=Address;
		this.DelStatus=DelStatus;
		this.AddTime=AddTime;
		this.EditTIme=EditTIme;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setParentGuid(String ParentGuid){
		this.ParentGuid=ParentGuid;
	}
	public String getParentGuid(){
		return ParentGuid;
	}
	public void setCodes(String Codes){
		this.Codes=Codes;
	}
	public String getCodes(){
		return Codes;
	}
	public void setLayer(int Layer){
		this.Layer=Layer;
	}
	public int getLayer(){
		return Layer;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setLogo(String Logo){
		this.Logo=Logo;
	}
	public String getLogo(){
		return Logo;
	}
	public void setCorporate(String Corporate){
		this.Corporate=Corporate;
	}
	public String getCorporate(){
		return Corporate;
	}
	public void setFoundTIme(Date FoundTIme){
		this.FoundTIme=FoundTIme;
	}
	public Date getFoundTIme(){
		return FoundTIme;
	}
	public void setSummary(String Summary){
		this.Summary=Summary;
	}
	public String getSummary(){
		return Summary;
	}
	public void setTel(String Tel){
		this.Tel=Tel;
	}
	public String getTel(){
		return Tel;
	}
	public void setFax(String Fax){
		this.Fax=Fax;
	}
	public String getFax(){
		return Fax;
	}
	public void setAddress(String Address){
		this.Address=Address;
	}
	public String getAddress(){
		return Address;
	}
	public void setDelStatus(boolean DelStatus){
		this.DelStatus=DelStatus;
	}
	public boolean getDelStatus(){
		return DelStatus;
	}
	public void setAddTime(Date AddTime){
		this.AddTime=AddTime;
	}
	public Date getAddTime(){
		return AddTime;
	}
	public void setEditTIme(Date EditTIme){
		this.EditTIme=EditTIme;
	}
	public Date getEditTIme(){
		return EditTIme;
	}
	@Override
	public String toString() {
		return "syscompany[" + 
			"Guid=" + Guid + 
			", ParentGuid=" + ParentGuid + 
			", Codes=" + Codes + 
			", Layer=" + Layer + 
			", Name=" + Name + 
			", Logo=" + Logo + 
			", Corporate=" + Corporate + 
			", FoundTIme=" + FoundTIme + 
			", Summary=" + Summary + 
			", Tel=" + Tel + 
			", Fax=" + Fax + 
			", Address=" + Address + 
			", DelStatus=" + DelStatus + 
			", AddTime=" + AddTime + 
			", EditTIme=" + EditTIme + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

