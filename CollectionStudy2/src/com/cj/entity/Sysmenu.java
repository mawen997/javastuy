package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  sysmenu
 * author name: �ź�
 * create time: 2020-07-23 11:47:19
 */ 
public class Sysmenu extends EntityHelper{

	/*Ψһ��ʶGuid*/
	private String Guid;
	/*����վ���˾�˵�*/
	private String SiteGuid;
	/*�˵�����Guid*/
	private String ParentGuid;
	/*�����˵�����*/
	private String ParentName;
	/*�˵�����*/
	private String Name;
	/*�˵����Ʊ�ʶ*/
	private String NameCode;
	/*���������ļ���*/
	private String ParentGuidList;
	/*�˵����*/
	private int Layer;
	/*�˵�Url*/
	private String Urls;
	/*�˵�ͼ��Class*/
	private String Icon;
	/*�˵�����*/
	private int Sort;
	/*�˵�״̬ true=���� false=����ʾ*/
	private boolean Status;
	/*�޸�ʱ��*/
	private Date EditTime;
	/*���ʱ��*/
	private Date AddTIme;

	public Sysmenu() {
		super();
	}
	public Sysmenu(String Guid,String SiteGuid,String ParentGuid,String ParentName,String Name,String NameCode,String ParentGuidList,int Layer,String Urls,String Icon,int Sort,boolean Status,Date EditTime,Date AddTIme) {
		this.Guid=Guid;
		this.SiteGuid=SiteGuid;
		this.ParentGuid=ParentGuid;
		this.ParentName=ParentName;
		this.Name=Name;
		this.NameCode=NameCode;
		this.ParentGuidList=ParentGuidList;
		this.Layer=Layer;
		this.Urls=Urls;
		this.Icon=Icon;
		this.Sort=Sort;
		this.Status=Status;
		this.EditTime=EditTime;
		this.AddTIme=AddTIme;
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
	public void setParentName(String ParentName){
		this.ParentName=ParentName;
	}
	public String getParentName(){
		return ParentName;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setNameCode(String NameCode){
		this.NameCode=NameCode;
	}
	public String getNameCode(){
		return NameCode;
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
	public void setUrls(String Urls){
		this.Urls=Urls;
	}
	public String getUrls(){
		return Urls;
	}
	public void setIcon(String Icon){
		this.Icon=Icon;
	}
	public String getIcon(){
		return Icon;
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
	public void setAddTIme(Date AddTIme){
		this.AddTIme=AddTIme;
	}
	public Date getAddTIme(){
		return AddTIme;
	}
	@Override
	public String toString() {
		return "sysmenu[" + 
			"Guid=" + Guid + 
			", SiteGuid=" + SiteGuid + 
			", ParentGuid=" + ParentGuid + 
			", ParentName=" + ParentName + 
			", Name=" + Name + 
			", NameCode=" + NameCode + 
			", ParentGuidList=" + ParentGuidList + 
			", Layer=" + Layer + 
			", Urls=" + Urls + 
			", Icon=" + Icon + 
			", Sort=" + Sort + 
			", Status=" + Status + 
			", EditTime=" + EditTime + 
			", AddTIme=" + AddTIme + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

