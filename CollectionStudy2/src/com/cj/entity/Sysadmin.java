package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  sysadmin
 * author name: �ź�
 * create time: 2020-07-23 11:47:19
 */ 
public class Sysadmin extends EntityHelper{

	/*Ψһ��ʶ*/
	private String Guid;
	/*��ɫ��ʶ*/
	private String RoleGuid;
	/*��������*/
	private String DepartmentName;
	/*���ű�ʶ*/
	private String DepartmentGuid;
	private String DepartmentGuidList;
	/*��¼�˺�*/
	private String LoginName;
	/*��¼����*/
	private String LoginPwd;
	/*��������*/
	private String TrueName;
	/*���*/
	private String Number;
	/*ͷ��*/
	private String HeadPic;
	/*�Ա�*/
	private String Sex;
	/*�ֻ�����*/
	private String Mobile;
	/*״̬*/
	private boolean Status;
	/*����*/
	private String Email;
	/*����*/
	private String Summary;
	/*���ʱ��*/
	private Date AddDate;
	/*��¼ʱ��*/
	private Date LoginDate;
	/*�ϴε�¼ʱ��*/
	private Date UpLoginDate;

	public Sysadmin() {
		super();
	}
	public Sysadmin(String Guid,String RoleGuid,String DepartmentName,String DepartmentGuid,String DepartmentGuidList,String LoginName,String LoginPwd,String TrueName,String Number,String HeadPic,String Sex,String Mobile,boolean Status,String Email,String Summary,Date AddDate,Date LoginDate,Date UpLoginDate) {
		this.Guid=Guid;
		this.RoleGuid=RoleGuid;
		this.DepartmentName=DepartmentName;
		this.DepartmentGuid=DepartmentGuid;
		this.DepartmentGuidList=DepartmentGuidList;
		this.LoginName=LoginName;
		this.LoginPwd=LoginPwd;
		this.TrueName=TrueName;
		this.Number=Number;
		this.HeadPic=HeadPic;
		this.Sex=Sex;
		this.Mobile=Mobile;
		this.Status=Status;
		this.Email=Email;
		this.Summary=Summary;
		this.AddDate=AddDate;
		this.LoginDate=LoginDate;
		this.UpLoginDate=UpLoginDate;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setRoleGuid(String RoleGuid){
		this.RoleGuid=RoleGuid;
	}
	public String getRoleGuid(){
		return RoleGuid;
	}
	public void setDepartmentName(String DepartmentName){
		this.DepartmentName=DepartmentName;
	}
	public String getDepartmentName(){
		return DepartmentName;
	}
	public void setDepartmentGuid(String DepartmentGuid){
		this.DepartmentGuid=DepartmentGuid;
	}
	public String getDepartmentGuid(){
		return DepartmentGuid;
	}
	public void setDepartmentGuidList(String DepartmentGuidList){
		this.DepartmentGuidList=DepartmentGuidList;
	}
	public String getDepartmentGuidList(){
		return DepartmentGuidList;
	}
	public void setLoginName(String LoginName){
		this.LoginName=LoginName;
	}
	public String getLoginName(){
		return LoginName;
	}
	public void setLoginPwd(String LoginPwd){
		this.LoginPwd=LoginPwd;
	}
	public String getLoginPwd(){
		return LoginPwd;
	}
	public void setTrueName(String TrueName){
		this.TrueName=TrueName;
	}
	public String getTrueName(){
		return TrueName;
	}
	public void setNumber(String Number){
		this.Number=Number;
	}
	public String getNumber(){
		return Number;
	}
	public void setHeadPic(String HeadPic){
		this.HeadPic=HeadPic;
	}
	public String getHeadPic(){
		return HeadPic;
	}
	public void setSex(String Sex){
		this.Sex=Sex;
	}
	public String getSex(){
		return Sex;
	}
	public void setMobile(String Mobile){
		this.Mobile=Mobile;
	}
	public String getMobile(){
		return Mobile;
	}
	public void setStatus(boolean Status){
		this.Status=Status;
	}
	public boolean getStatus(){
		return Status;
	}
	public void setEmail(String Email){
		this.Email=Email;
	}
	public String getEmail(){
		return Email;
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
	public void setLoginDate(Date LoginDate){
		this.LoginDate=LoginDate;
	}
	public Date getLoginDate(){
		return LoginDate;
	}
	public void setUpLoginDate(Date UpLoginDate){
		this.UpLoginDate=UpLoginDate;
	}
	public Date getUpLoginDate(){
		return UpLoginDate;
	}
	@Override
	public String toString() {
		return "sysadmin[" + 
			"Guid=" + Guid + 
			", RoleGuid=" + RoleGuid + 
			", DepartmentName=" + DepartmentName + 
			", DepartmentGuid=" + DepartmentGuid + 
			", DepartmentGuidList=" + DepartmentGuidList + 
			", LoginName=" + LoginName + 
			", LoginPwd=" + LoginPwd + 
			", TrueName=" + TrueName + 
			", Number=" + Number + 
			", HeadPic=" + HeadPic + 
			", Sex=" + Sex + 
			", Mobile=" + Mobile + 
			", Status=" + Status + 
			", Email=" + Email + 
			", Summary=" + Summary + 
			", AddDate=" + AddDate + 
			", LoginDate=" + LoginDate + 
			", UpLoginDate=" + UpLoginDate + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

