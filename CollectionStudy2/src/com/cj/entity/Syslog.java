package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  syslog
 * author name: �ź�
 * create time: 2020-07-22 16:11:27
 */ 
public class Syslog extends EntityHelper{

	/*Ψһ��ʶ����Guid*/
	private String Guid;
	/*��־����ID*/
	private String LoginName;
	/*��־��������������Guid*/
	private String DepartName;
	/*��������*/
	private String OptionTable;
	/*��־��������*/
	private String Summary;
	/*��־����IP��ַ*/
	private String IP;
	/*��־����Mac��ַ*/
	private String MacUrl;
	/*��־��������*/
	private int LogType;
	/*��־����Url*/
	private String Urls;
	/*��־���ʱ��*/
	private Date AddTime;

	public Syslog() {
		super();
	}
	public Syslog(String Guid,String LoginName,String DepartName,String OptionTable,String Summary,String IP,String MacUrl,int LogType,String Urls,Date AddTime) {
		this.Guid=Guid;
		this.LoginName=LoginName;
		this.DepartName=DepartName;
		this.OptionTable=OptionTable;
		this.Summary=Summary;
		this.IP=IP;
		this.MacUrl=MacUrl;
		this.LogType=LogType;
		this.Urls=Urls;
		this.AddTime=AddTime;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setLoginName(String LoginName){
		this.LoginName=LoginName;
	}
	public String getLoginName(){
		return LoginName;
	}
	public void setDepartName(String DepartName){
		this.DepartName=DepartName;
	}
	public String getDepartName(){
		return DepartName;
	}
	public void setOptionTable(String OptionTable){
		this.OptionTable=OptionTable;
	}
	public String getOptionTable(){
		return OptionTable;
	}
	public void setSummary(String Summary){
		this.Summary=Summary;
	}
	public String getSummary(){
		return Summary;
	}
	public void setIP(String IP){
		this.IP=IP;
	}
	public String getIP(){
		return IP;
	}
	public void setMacUrl(String MacUrl){
		this.MacUrl=MacUrl;
	}
	public String getMacUrl(){
		return MacUrl;
	}
	public void setLogType(int LogType){
		this.LogType=LogType;
	}
	public int getLogType(){
		return LogType;
	}
	public void setUrls(String Urls){
		this.Urls=Urls;
	}
	public String getUrls(){
		return Urls;
	}
	public void setAddTime(Date AddTime){
		this.AddTime=AddTime;
	}
	public Date getAddTime(){
		return AddTime;
	}
	@Override
	public String toString() {
		return "syslog[" + 
			"Guid=" + Guid + 
			", LoginName=" + LoginName + 
			", DepartName=" + DepartName + 
			", OptionTable=" + OptionTable + 
			", Summary=" + Summary + 
			", IP=" + IP + 
			", MacUrl=" + MacUrl + 
			", LogType=" + LogType + 
			", Urls=" + Urls + 
			", AddTime=" + AddTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

