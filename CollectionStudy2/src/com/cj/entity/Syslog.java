package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  syslog
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class Syslog extends EntityHelper{

	/*唯一标识——Guid*/
	private String Guid;
	/*日志操作ID*/
	private String LoginName;
	/*日志操作人所属部门Guid*/
	private String DepartName;
	/*操作表名*/
	private String OptionTable;
	/*日志操作内容*/
	private String Summary;
	/*日志操作IP地址*/
	private String IP;
	/*日志操作Mac地址*/
	private String MacUrl;
	/*日志操作类型*/
	private int LogType;
	/*日志操作Url*/
	private String Urls;
	/*日志添加时间*/
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

