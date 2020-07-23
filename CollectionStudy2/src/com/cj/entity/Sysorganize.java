package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  sysorganize
 * author name: �ź�
 * create time: 2020-07-22 16:11:28
 */ 
public class Sysorganize extends EntityHelper{

	private String Guid;
	/*����վ��*/
	private String SiteGuid;
	/*���ڵ�*/
	private String ParentGuid;
	/*��֯����*/
	private String Name;
	private String ParentName;
	/*���ڵ㼯��*/
	private String ParentGuidList;
	/*�㼶*/
	private int Layer;
	/*����*/
	private int Sort;
	/*״̬*/
	private boolean Status;
	/*�޸�ʱ��*/
	private Date EditTime;

	public Sysorganize() {
		super();
	}
	public Sysorganize(String Guid,String SiteGuid,String ParentGuid,String Name,String ParentName,String ParentGuidList,int Layer,int Sort,boolean Status,Date EditTime) {
		this.Guid=Guid;
		this.SiteGuid=SiteGuid;
		this.ParentGuid=ParentGuid;
		this.Name=Name;
		this.ParentName=ParentName;
		this.ParentGuidList=ParentGuidList;
		this.Layer=Layer;
		this.Sort=Sort;
		this.Status=Status;
		this.EditTime=EditTime;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setSiteGuid(String SiteGuid){
		this.SiteGuid=SiteGuid;
	}
	public String getSiteGuid(){
		return SiteGuid;
	}
	public void setParentGuid(String ParentGuid){
		this.ParentGuid=ParentGuid;
	}
	public String getParentGuid(){
		return ParentGuid;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setParentName(String ParentName){
		this.ParentName=ParentName;
	}
	public String getParentName(){
		return ParentName;
	}
	public void setParentGuidList(String ParentGuidList){
		this.ParentGuidList=ParentGuidList;
	}
	public String getParentGuidList(){
		return ParentGuidList;
	}
	public void setLayer(int Layer){
		this.Layer=Layer;
	}
	public int getLayer(){
		return Layer;
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
	public void setEditTime(Date EditTime){
		this.EditTime=EditTime;
	}
	public Date getEditTime(){
		return EditTime;
	}
	@Override
	public String toString() {
		return "sysorganize[" + 
			"Guid=" + Guid + 
			", SiteGuid=" + SiteGuid + 
			", ParentGuid=" + ParentGuid + 
			", Name=" + Name + 
			", ParentName=" + ParentName + 
			", ParentGuidList=" + ParentGuidList + 
			", Layer=" + Layer + 
			", Sort=" + Sort + 
			", Status=" + Status + 
			", EditTime=" + EditTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

