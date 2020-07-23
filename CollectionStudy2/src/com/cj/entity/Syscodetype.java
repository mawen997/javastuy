package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  syscodetype
 * author name: �ź�
 * create time: 2020-07-22 16:11:27
 */ 
public class Syscodetype extends EntityHelper{

	/*Ψһ���Guid*/
	private String Guid;
	/*�ֵ����͸���*/
	private String ParentGuid;
	/*���*/
	private int Layer;
	/*�ֵ���������*/
	private String Name;
	/*�ֵ���������*/
	private int Sort;
	private Date AddTime;
	/*���ʱ��*/
	private Date EditTime;
	/*������˾��վ��*/
	private String SiteGuid;

	public Syscodetype() {
		super();
	}
	public Syscodetype(String Guid,String ParentGuid,int Layer,String Name,int Sort,Date AddTime,Date EditTime,String SiteGuid) {
		this.Guid=Guid;
		this.ParentGuid=ParentGuid;
		this.Layer=Layer;
		this.Name=Name;
		this.Sort=Sort;
		this.AddTime=AddTime;
		this.EditTime=EditTime;
		this.SiteGuid=SiteGuid;
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
	public void setSort(int Sort){
		this.Sort=Sort;
	}
	public int getSort(){
		return Sort;
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
	public void setSiteGuid(String SiteGuid){
		this.SiteGuid=SiteGuid;
	}
	public String getSiteGuid(){
		return SiteGuid;
	}
	@Override
	public String toString() {
		return "syscodetype[" + 
			"Guid=" + Guid + 
			", ParentGuid=" + ParentGuid + 
			", Layer=" + Layer + 
			", Name=" + Name + 
			", Sort=" + Sort + 
			", AddTime=" + AddTime + 
			", EditTime=" + EditTime + 
			", SiteGuid=" + SiteGuid + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

