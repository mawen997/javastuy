package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  sys_operator
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class SysOperator extends EntityHelper{

	private int Id;
	/*GuidCode用户唯一标识码*/
	private String GuidCode;
	/*登录名*/
	private String Name;
	/*密码*/
	private String Password;
	/*真实姓名*/
	private String RealName;
	/*身份证号*/
	private String IdentityCard;
	/*年龄*/
	private int Age;
	/*性别*/
	private String Sex;
	/*民族编号*/
	private String MinorityCode;
	/*民族名称*/
	private String MinorityName;
	/*0-默认，1-待审核，2-审核成功，3-审核失败*/
	private int Status;
	/*0-未实名认证，1-已实名认证*/
	private int IsCertificate;
	/*登陆时间*/
	private Date LoginTime;
	/*登陆IP*/
	private String LoginIP;
	/*是否删除*/
	private int IsDelete;
	/*创建时间*/
	private Date CreateTime;
	/*更新时间*/
	private Date UpdateTime;
	/*其他意见*/
	private String Remark;
	/*下拉选择意见*/
	private String O_Remark;

	public SysOperator() {
		super();
	}
	public SysOperator(int Id,String GuidCode,String Name,String Password,String RealName,String IdentityCard,int Age,String Sex,String MinorityCode,String MinorityName,int Status,int IsCertificate,Date LoginTime,String LoginIP,int IsDelete,Date CreateTime,Date UpdateTime,String Remark,String O_Remark) {
		this.Id=Id;
		this.GuidCode=GuidCode;
		this.Name=Name;
		this.Password=Password;
		this.RealName=RealName;
		this.IdentityCard=IdentityCard;
		this.Age=Age;
		this.Sex=Sex;
		this.MinorityCode=MinorityCode;
		this.MinorityName=MinorityName;
		this.Status=Status;
		this.IsCertificate=IsCertificate;
		this.LoginTime=LoginTime;
		this.LoginIP=LoginIP;
		this.IsDelete=IsDelete;
		this.CreateTime=CreateTime;
		this.UpdateTime=UpdateTime;
		this.Remark=Remark;
		this.O_Remark=O_Remark;
	}
	public void setId(int Id){
		this.Id=Id;
	}
	public int getId(){
		return Id;
	}
	public void setGuidCode(String GuidCode){
		this.GuidCode=GuidCode;
	}
	public String getGuidCode(){
		return GuidCode;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setPassword(String Password){
		this.Password=Password;
	}
	public String getPassword(){
		return Password;
	}
	public void setRealName(String RealName){
		this.RealName=RealName;
	}
	public String getRealName(){
		return RealName;
	}
	public void setIdentityCard(String IdentityCard){
		this.IdentityCard=IdentityCard;
	}
	public String getIdentityCard(){
		return IdentityCard;
	}
	public void setAge(int Age){
		this.Age=Age;
	}
	public int getAge(){
		return Age;
	}
	public void setSex(String Sex){
		this.Sex=Sex;
	}
	public String getSex(){
		return Sex;
	}
	public void setMinorityCode(String MinorityCode){
		this.MinorityCode=MinorityCode;
	}
	public String getMinorityCode(){
		return MinorityCode;
	}
	public void setMinorityName(String MinorityName){
		this.MinorityName=MinorityName;
	}
	public String getMinorityName(){
		return MinorityName;
	}
	public void setStatus(int Status){
		this.Status=Status;
	}
	public int getStatus(){
		return Status;
	}
	public void setIsCertificate(int IsCertificate){
		this.IsCertificate=IsCertificate;
	}
	public int getIsCertificate(){
		return IsCertificate;
	}
	public void setLoginTime(Date LoginTime){
		this.LoginTime=LoginTime;
	}
	public Date getLoginTime(){
		return LoginTime;
	}
	public void setLoginIP(String LoginIP){
		this.LoginIP=LoginIP;
	}
	public String getLoginIP(){
		return LoginIP;
	}
	public void setIsDelete(int IsDelete){
		this.IsDelete=IsDelete;
	}
	public int getIsDelete(){
		return IsDelete;
	}
	public void setCreateTime(Date CreateTime){
		this.CreateTime=CreateTime;
	}
	public Date getCreateTime(){
		return CreateTime;
	}
	public void setUpdateTime(Date UpdateTime){
		this.UpdateTime=UpdateTime;
	}
	public Date getUpdateTime(){
		return UpdateTime;
	}
	public void setRemark(String Remark){
		this.Remark=Remark;
	}
	public String getRemark(){
		return Remark;
	}
	public void setO_Remark(String O_Remark){
		this.O_Remark=O_Remark;
	}
	public String getO_Remark(){
		return O_Remark;
	}
	@Override
	public String toString() {
		return "sys_operator[" + 
			"Id=" + Id + 
			", GuidCode=" + GuidCode + 
			", Name=" + Name + 
			", Password=" + Password + 
			", RealName=" + RealName + 
			", IdentityCard=" + IdentityCard + 
			", Age=" + Age + 
			", Sex=" + Sex + 
			", MinorityCode=" + MinorityCode + 
			", MinorityName=" + MinorityName + 
			", Status=" + Status + 
			", IsCertificate=" + IsCertificate + 
			", LoginTime=" + LoginTime + 
			", LoginIP=" + LoginIP + 
			", IsDelete=" + IsDelete + 
			", CreateTime=" + CreateTime + 
			", UpdateTime=" + UpdateTime + 
			", Remark=" + Remark + 
			", O_Remark=" + O_Remark + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

