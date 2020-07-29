package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  sysrole
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class Sysrole extends EntityHelper{

	private String Guid;
	/*部门Guid*/
	private String DepartmentGuid;
	/*部门名称*/
	private String DepartmentName;
	/*归属于角色组*/
	private String DepartmentGroup;
	/*部门名称*/
	private String Name;
	/*部门编号*/
	private String Codes;
	/*是否为超级管理员*/
	private boolean IsSystem;
	/*部门描述*/
	private String Summary;
	/*添加时间*/
	private Date AddTime;
	/*修改时间*/
	private Date EditTime;

	public Sysrole() {
		super();
	}
	public Sysrole(String Guid,String DepartmentGuid,String DepartmentName,String DepartmentGroup,String Name,String Codes,boolean IsSystem,String Summary,Date AddTime,Date EditTime) {
		this.Guid=Guid;
		this.DepartmentGuid=DepartmentGuid;
		this.DepartmentName=DepartmentName;
		this.DepartmentGroup=DepartmentGroup;
		this.Name=Name;
		this.Codes=Codes;
		this.IsSystem=IsSystem;
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
	public void setDepartmentGuid(String DepartmentGuid){
		this.DepartmentGuid=DepartmentGuid;
	}
	public String getDepartmentGuid(){
		return DepartmentGuid;
	}
	public void setDepartmentName(String DepartmentName){
		this.DepartmentName=DepartmentName;
	}
	public String getDepartmentName(){
		return DepartmentName;
	}
	public void setDepartmentGroup(String DepartmentGroup){
		this.DepartmentGroup=DepartmentGroup;
	}
	public String getDepartmentGroup(){
		return DepartmentGroup;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setCodes(String Codes){
		this.Codes=Codes;
	}
	public String getCodes(){
		return Codes;
	}
	public void setIsSystem(boolean IsSystem){
		this.IsSystem=IsSystem;
	}
	public boolean getIsSystem(){
		return IsSystem;
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
		return "sysrole[" + 
			"Guid=" + Guid + 
			", DepartmentGuid=" + DepartmentGuid + 
			", DepartmentName=" + DepartmentName + 
			", DepartmentGroup=" + DepartmentGroup + 
			", Name=" + Name + 
			", Codes=" + Codes + 
			", IsSystem=" + IsSystem + 
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

