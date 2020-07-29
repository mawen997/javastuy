package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  sysdepartment
 * author name: �ź�
 * create time: 2020-07-23 11:47:19
 */ 
public class Sysdepartment extends EntityHelper{

	/*Ψһ��ʶ*/
	private String Guid;
	/*���ű��*/
	private String Codes;
	/*�ϼ�����*/
	private String ParentGuid;
	/*����ϼ����ŵļ���*/
	private String ParentGuidList;
	/*������˾Guid*/
	private String CompanyGuid;
	/*���Ų㼶*/
	private int Layer;
	/*��������*/
	private String Name;
	/*���ű�ע*/
	private String Summary;
	/*���Ű칫��ַ*/
	private String Address;
	/*���ŵ绰*/
	private String DepartmentTel;
	/*�����ֶ�*/
	private int Sort;
	/*ɾ��״̬*/
	private boolean DelStatus;
	/*��Ӳ���*/
	private Date AddTime;
	/*�޸�ʱ��*/
	private Date EditTime;

	public Sysdepartment() {
		super();
	}
	public Sysdepartment(String Guid,String Codes,String ParentGuid,String ParentGuidList,String CompanyGuid,int Layer,String Name,String Summary,String Address,String DepartmentTel,int Sort,boolean DelStatus,Date AddTime,Date EditTime) {
		this.Guid=Guid;
		this.Codes=Codes;
		this.ParentGuid=ParentGuid;
		this.ParentGuidList=ParentGuidList;
		this.CompanyGuid=CompanyGuid;
		this.Layer=Layer;
		this.Name=Name;
		this.Summary=Summary;
		this.Address=Address;
		this.DepartmentTel=DepartmentTel;
		this.Sort=Sort;
		this.DelStatus=DelStatus;
		this.AddTime=AddTime;
		this.EditTime=EditTime;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setCodes(String Codes){
		this.Codes=Codes;
	}
	public String getCodes(){
		return Codes;
	}
	public void setParentGuid(String ParentGuid){
		this.ParentGuid=ParentGuid;
	}
	public String getParentGuid(){
		return ParentGuid;
	}
	public void setParentGuidList(String ParentGuidList){
		this.ParentGuidList=ParentGuidList;
	}
	public String getParentGuidList(){
		return ParentGuidList;
	}
	public void setCompanyGuid(String CompanyGuid){
		this.CompanyGuid=CompanyGuid;
	}
	public String getCompanyGuid(){
		return CompanyGuid;
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
	public void setSummary(String Summary){
		this.Summary=Summary;
	}
	public String getSummary(){
		return Summary;
	}
	public void setAddress(String Address){
		this.Address=Address;
	}
	public String getAddress(){
		return Address;
	}
	public void setDepartmentTel(String DepartmentTel){
		this.DepartmentTel=DepartmentTel;
	}
	public String getDepartmentTel(){
		return DepartmentTel;
	}
	public void setSort(int Sort){
		this.Sort=Sort;
	}
	public int getSort(){
		return Sort;
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
	public void setEditTime(Date EditTime){
		this.EditTime=EditTime;
	}
	public Date getEditTime(){
		return EditTime;
	}
	@Override
	public String toString() {
		return "sysdepartment[" + 
			"Guid=" + Guid + 
			", Codes=" + Codes + 
			", ParentGuid=" + ParentGuid + 
			", ParentGuidList=" + ParentGuidList + 
			", CompanyGuid=" + CompanyGuid + 
			", Layer=" + Layer + 
			", Name=" + Name + 
			", Summary=" + Summary + 
			", Address=" + Address + 
			", DepartmentTel=" + DepartmentTel + 
			", Sort=" + Sort + 
			", DelStatus=" + DelStatus + 
			", AddTime=" + AddTime + 
			", EditTime=" + EditTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

