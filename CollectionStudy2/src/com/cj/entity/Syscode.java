package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  syscode
 * author name: �ź�
 * create time: 2020-07-22 16:11:27
 */ 
public class Syscode extends EntityHelper{

	/*Ψһ���Guid*/
	private String Guid;
	/*�ֵ����ͱ�ʶ*/
	private String ParentGuid;
	/*�ֵ�ֵ��������*/
	private String CodeType;
	/*�ֵ�ֵ��������*/
	private String Name;
	/*�ֵ�ֵ����Ӣ������*/
	private String EnName;
	/*�ֵ�ֵ��������*/
	private int Sort;
	/*�ֵ�ֵ����״̬*/
	private boolean Status;
	/*�ֵ�ֵ��������*/
	private String Summary;
	/*�ֵ�ֵ�������ʱ��*/
	private Date AddTime;
	/*�ֵ�ֵ�����޸�ʱ��*/
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

