package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  syscompany
 * author name: �ź�
 * create time: 2020-07-22 16:11:27
 */ 
public class Syscompany extends EntityHelper{

	private String Guid;
	/*�����ڼ���Guid*/
	private String ParentGuid;
	/*��˾���*/
	private String Codes;
	/*�㼶*/
	private int Layer;
	/*��˾����*/
	private String Name;
	/*��˾Logo*/
	private String Logo;
	/*��˾����*/
	private String Corporate;
	/*��������*/
	private Date FoundTIme;
	/*��˾�Ļ�*/
	private String Summary;
	/*��˾�ܻ��绰*/
	private String Tel;
	/*����*/
	private String Fax;
	/*��˾��ַ*/
	private String Address;
	/*ɾ��״̬*/
	private boolean DelStatus;
	/*���ʱ��*/
	private Date AddTime;
	/*�޸�ʱ��*/
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

