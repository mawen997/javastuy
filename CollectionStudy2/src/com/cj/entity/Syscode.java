package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  syscode
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class Syscode extends EntityHelper{

	/*唯一标号Guid*/
	private String Guid;
	/*字典类型标识*/
	private String ParentGuid;
	/*字典值——类型*/
	private String CodeType;
	/*字典值——名称*/
	private String Name;
	/*字典值——英文名称*/
	private String EnName;
	/*字典值——排序*/
	private int Sort;
	/*字典值——状态*/
	private boolean Status;
	/*字典值——描述*/
	private String Summary;
	/*字典值——添加时间*/
	private Date AddTime;
	/*字典值——修改时间*/
	private Date EditTime;

	public Syscode() {
		super();
	}
	public Syscode(String Guid,String ParentGuid,String CodeType,String Name,String EnName,int Sort,boolean Status,String Summary,Date AddTime,Date EditTime) {
		this.Guid=Guid;
		this.ParentGuid=ParentGuid;
		this.CodeType=CodeType;
		this.Name=Name;
		this.EnName=EnName;
		this.Sort=Sort;
		this.Status=Status;
		this.Summary=Summary;
		this.AddTime=AddTime;
		this.EditTime=EditTime;
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
	public void setCodeType(String CodeType){
		this.CodeType=CodeType;
	}
	public String getCodeType(){
		return CodeType;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setEnName(String EnName){
		this.EnName=EnName;
	}
	public String getEnName(){
		return EnName;
	}
	public void setSort(int Sort){
		this.Sort=Sort;
	}
	public int getSort(){
		return Sort;
	}
	public void setStatus(boolean Status){
		this.Status=Status;
	}
	public boolean getStatus(){
		return Status;
	}
	public void setSummary(String Summary){
		this.Summary=Summary;
	}
	public String getSummary(){
		return Summary;
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
		return "syscode[" + 
			"Guid=" + Guid + 
			", ParentGuid=" + ParentGuid + 
			", CodeType=" + CodeType + 
			", Name=" + Name + 
			", EnName=" + EnName + 
			", Sort=" + Sort + 
			", Status=" + Status + 
			", Summary=" + Summary + 
			", AddTime=" + AddTime + 
			", EditTime=" + EditTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

