package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erppush
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class Erppush extends EntityHelper{

	private String Guid;
	/*推送方式 1=全部  2=某个店铺  3=更新通知*/
	private byte Mode;
	/*1=普通消息  2=透传消息*/
	private byte Types;
	/*消息标题*/
	private String Title;
	/*消息内容*/
	private String Summary;
	/*添加时间*/
	private Date AddDate;

	public Erppush() {
		super();
	}
	public Erppush(String Guid,byte Mode,byte Types,String Title,String Summary,Date AddDate) {
		this.Guid=Guid;
		this.Mode=Mode;
		this.Types=Types;
		this.Title=Title;
		this.Summary=Summary;
		this.AddDate=AddDate;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setMode(byte Mode){
		this.Mode=Mode;
	}
	public byte getMode(){
		return Mode;
	}
	public void setTypes(byte Types){
		this.Types=Types;
	}
	public byte getTypes(){
		return Types;
	}
	public void setTitle(String Title){
		this.Title=Title;
	}
	public String getTitle(){
		return Title;
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
		return "erppush[" + 
			"Guid=" + Guid + 
			", Mode=" + Mode + 
			", Types=" + Types + 
			", Title=" + Title + 
			", Summary=" + Summary + 
			", AddDate=" + AddDate + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

