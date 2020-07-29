package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  sysadmin
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class Sysadmin extends EntityHelper{

	/*唯一标识*/
	private String Guid;
	/*角色标识*/
	private String RoleGuid;
	/*部门名称*/
	private String DepartmentName;
	/*部门标识*/
	private String DepartmentGuid;
	private String DepartmentGuidList;
	/*登录账号*/
	private String LoginName;
	/*登录密码*/
	private String LoginPwd;
	/*真是姓名*/
	private String TrueName;
	/*编号*/
	private String Number;
	/*头像*/
	private String HeadPic;
	/*性别*/
	private String Sex;
	/*手机号码*/
	private String Mobile;
	/*状态*/
	private boolean Status;
	/*邮箱*/
	private String Email;
	/*描述*/
	private String Summary;
	/*添加时间*/
	private Date AddDate;
	/*登录时间*/
	private Date LoginDate;
	/*上次登录时间*/
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

