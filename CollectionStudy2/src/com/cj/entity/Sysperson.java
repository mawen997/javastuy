package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  sysperson
 * author name: �ź�
 * create time: 2020-07-22 16:11:28
 */ 
public class Sysperson extends EntityHelper{

	/*Ψһ��ʶ*/
	private String Guid;
	/*��ɫGuid*/
	private String RoleGuid;
	/*����Guid*/
	private String DepartmentGuid;
	/*��˾Guid*/
	private String CompayGuid;
	/*��¼�˺�*/
	private String LoginName;
	/*��¼����*/
	private String LoginPwd;
	/*��������*/
	private String TrueName;
	/*����ĸ*/
	private String Letter;
	/*Ա�����*/
	private String Codes;
	/*ͷ��*/
	private String HeadPic;
	/*�Ա�*/
	private String Sex;
	/*�ֻ�����*/
	private String Mobile;
	/*�����ַ*/
	private String Email;
	/*QQ����*/
	private String QQ;
	/*΢�ź���*/
	private String WebXin;
	/*�칫�ҵ绰*/
	private String WorkTel;
	/*״̬ 0=����1=����*/
	private boolean LoginStatus;
	/*ɾ��״̬*/
	private boolean DelStatus;
	/*��ְ״̬  0=��ְ1=��ְ*/
	private boolean PostStatus;
	/*���״̬*/
	private boolean AuditStatus;
	/*����*/
	private Date Birthday;
	/*���֤����*/
	private String IDCard;
	/*���֤ͼƬ*/
	private String IDCardImg;
	/*����*/
	private String NativePlaceCity;
	/*�������ڵ�*/
	private String AccountCity;
	/*��ס��ַ*/
	private String LiveCity;
	/*������ò*/
	private String PoliticalStatus;
	/*����*/
	private String Ethnic;
	/*����*/
	private String Faith;
	/*����*/
	private String Marriage;
	/*ѧ��*/
	private String Education;
	/*���˰���*/
	private String Hobbies;
	/*��������*/
	private String LanguageSkills;
	/*�س�*/
	private String Specialty;
	/*����¼ʱ��*/
	private Date LastLoginTime;
	/*��¼����*/
	private int LoginSum;
	/*ƻ���豸��Ψһ��ʶ*/
	private String IosToken;
	/*��׿�豸��Ψһ��ʶ*/
	private String AndRoidToken;
	/*�Ƿ���������֪ͨ*/
	private boolean IsPush;
	/*�豸����*/
	private String DeviceName;
	/*���ʱ��*/
	private Date AddTime;
	/*�޸�ʱ��*/
	private Date EditTime;

	public Sysperson() {
		super();
	}
	public Sysperson(String Guid,String RoleGuid,String DepartmentGuid,String CompayGuid,String LoginName,String LoginPwd,String TrueName,String Letter,String Codes,String HeadPic,String Sex,String Mobile,String Email,String QQ,String WebXin,String WorkTel,boolean LoginStatus,boolean DelStatus,boolean PostStatus,boolean AuditStatus,Date Birthday,String IDCard,String IDCardImg,String NativePlaceCity,String AccountCity,String LiveCity,String PoliticalStatus,String Ethnic,String Faith,String Marriage,String Education,String Hobbies,String LanguageSkills,String Specialty,Date LastLoginTime,int LoginSum,String IosToken,String AndRoidToken,boolean IsPush,String DeviceName,Date AddTime,Date EditTime) {
		this.Guid=Guid;
		this.RoleGuid=RoleGuid;
		this.DepartmentGuid=DepartmentGuid;
		this.CompayGuid=CompayGuid;
		this.LoginName=LoginName;
		this.LoginPwd=LoginPwd;
		this.TrueName=TrueName;
		this.Letter=Letter;
		this.Codes=Codes;
		this.HeadPic=HeadPic;
		this.Sex=Sex;
		this.Mobile=Mobile;
		this.Email=Email;
		this.QQ=QQ;
		this.WebXin=WebXin;
		this.WorkTel=WorkTel;
		this.LoginStatus=LoginStatus;
		this.DelStatus=DelStatus;
		this.PostStatus=PostStatus;
		this.AuditStatus=AuditStatus;
		this.Birthday=Birthday;
		this.IDCard=IDCard;
		this.IDCardImg=IDCardImg;
		this.NativePlaceCity=NativePlaceCity;
		this.AccountCity=AccountCity;
		this.LiveCity=LiveCity;
		this.PoliticalStatus=PoliticalStatus;
		this.Ethnic=Ethnic;
		this.Faith=Faith;
		this.Marriage=Marriage;
		this.Education=Education;
		this.Hobbies=Hobbies;
		this.LanguageSkills=LanguageSkills;
		this.Specialty=Specialty;
		this.LastLoginTime=LastLoginTime;
		this.LoginSum=LoginSum;
		this.IosToken=IosToken;
		this.AndRoidToken=AndRoidToken;
		this.IsPush=IsPush;
		this.DeviceName=DeviceName;
		this.AddTime=AddTime;
		this.EditTime=EditTime;
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
	public void setDepartmentGuid(String DepartmentGuid){
		this.DepartmentGuid=DepartmentGuid;
	}
	public String getDepartmentGuid(){
		return DepartmentGuid;
	}
	public void setCompayGuid(String CompayGuid){
		this.CompayGuid=CompayGuid;
	}
	public String getCompayGuid(){
		return CompayGuid;
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
	public void setLetter(String Letter){
		this.Letter=Letter;
	}
	public String getLetter(){
		return Letter;
	}
	public void setCodes(String Codes){
		this.Codes=Codes;
	}
	public String getCodes(){
		return Codes;
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
	public void setEmail(String Email){
		this.Email=Email;
	}
	public String getEmail(){
		return Email;
	}
	public void setQQ(String QQ){
		this.QQ=QQ;
	}
	public String getQQ(){
		return QQ;
	}
	public void setWebXin(String WebXin){
		this.WebXin=WebXin;
	}
	public String getWebXin(){
		return WebXin;
	}
	public void setWorkTel(String WorkTel){
		this.WorkTel=WorkTel;
	}
	public String getWorkTel(){
		return WorkTel;
	}
	public void setLoginStatus(boolean LoginStatus){
		this.LoginStatus=LoginStatus;
	}
	public boolean getLoginStatus(){
		return LoginStatus;
	}
	public void setDelStatus(boolean DelStatus){
		this.DelStatus=DelStatus;
	}
	public boolean getDelStatus(){
		return DelStatus;
	}
	public void setPostStatus(boolean PostStatus){
		this.PostStatus=PostStatus;
	}
	public boolean getPostStatus(){
		return PostStatus;
	}
	public void setAuditStatus(boolean AuditStatus){
		this.AuditStatus=AuditStatus;
	}
	public boolean getAuditStatus(){
		return AuditStatus;
	}
	public void setBirthday(Date Birthday){
		this.Birthday=Birthday;
	}
	public Date getBirthday(){
		return Birthday;
	}
	public void setIDCard(String IDCard){
		this.IDCard=IDCard;
	}
	public String getIDCard(){
		return IDCard;
	}
	public void setIDCardImg(String IDCardImg){
		this.IDCardImg=IDCardImg;
	}
	public String getIDCardImg(){
		return IDCardImg;
	}
	public void setNativePlaceCity(String NativePlaceCity){
		this.NativePlaceCity=NativePlaceCity;
	}
	public String getNativePlaceCity(){
		return NativePlaceCity;
	}
	public void setAccountCity(String AccountCity){
		this.AccountCity=AccountCity;
	}
	public String getAccountCity(){
		return AccountCity;
	}
	public void setLiveCity(String LiveCity){
		this.LiveCity=LiveCity;
	}
	public String getLiveCity(){
		return LiveCity;
	}
	public void setPoliticalStatus(String PoliticalStatus){
		this.PoliticalStatus=PoliticalStatus;
	}
	public String getPoliticalStatus(){
		return PoliticalStatus;
	}
	public void setEthnic(String Ethnic){
		this.Ethnic=Ethnic;
	}
	public String getEthnic(){
		return Ethnic;
	}
	public void setFaith(String Faith){
		this.Faith=Faith;
	}
	public String getFaith(){
		return Faith;
	}
	public void setMarriage(String Marriage){
		this.Marriage=Marriage;
	}
	public String getMarriage(){
		return Marriage;
	}
	public void setEducation(String Education){
		this.Education=Education;
	}
	public String getEducation(){
		return Education;
	}
	public void setHobbies(String Hobbies){
		this.Hobbies=Hobbies;
	}
	public String getHobbies(){
		return Hobbies;
	}
	public void setLanguageSkills(String LanguageSkills){
		this.LanguageSkills=LanguageSkills;
	}
	public String getLanguageSkills(){
		return LanguageSkills;
	}
	public void setSpecialty(String Specialty){
		this.Specialty=Specialty;
	}
	public String getSpecialty(){
		return Specialty;
	}
	public void setLastLoginTime(Date LastLoginTime){
		this.LastLoginTime=LastLoginTime;
	}
	public Date getLastLoginTime(){
		return LastLoginTime;
	}
	public void setLoginSum(int LoginSum){
		this.LoginSum=LoginSum;
	}
	public int getLoginSum(){
		return LoginSum;
	}
	public void setIosToken(String IosToken){
		this.IosToken=IosToken;
	}
	public String getIosToken(){
		return IosToken;
	}
	public void setAndRoidToken(String AndRoidToken){
		this.AndRoidToken=AndRoidToken;
	}
	public String getAndRoidToken(){
		return AndRoidToken;
	}
	public void setIsPush(boolean IsPush){
		this.IsPush=IsPush;
	}
	public boolean getIsPush(){
		return IsPush;
	}
	public void setDeviceName(String DeviceName){
		this.DeviceName=DeviceName;
	}
	public String getDeviceName(){
		return DeviceName;
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
		return "sysperson[" + 
			"Guid=" + Guid + 
			", RoleGuid=" + RoleGuid + 
			", DepartmentGuid=" + DepartmentGuid + 
			", CompayGuid=" + CompayGuid + 
			", LoginName=" + LoginName + 
			", LoginPwd=" + LoginPwd + 
			", TrueName=" + TrueName + 
			", Letter=" + Letter + 
			", Codes=" + Codes + 
			", HeadPic=" + HeadPic + 
			", Sex=" + Sex + 
			", Mobile=" + Mobile + 
			", Email=" + Email + 
			", QQ=" + QQ + 
			", WebXin=" + WebXin + 
			", WorkTel=" + WorkTel + 
			", LoginStatus=" + LoginStatus + 
			", DelStatus=" + DelStatus + 
			", PostStatus=" + PostStatus + 
			", AuditStatus=" + AuditStatus + 
			", Birthday=" + Birthday + 
			", IDCard=" + IDCard + 
			", IDCardImg=" + IDCardImg + 
			", NativePlaceCity=" + NativePlaceCity + 
			", AccountCity=" + AccountCity + 
			", LiveCity=" + LiveCity + 
			", PoliticalStatus=" + PoliticalStatus + 
			", Ethnic=" + Ethnic + 
			", Faith=" + Faith + 
			", Marriage=" + Marriage + 
			", Education=" + Education + 
			", Hobbies=" + Hobbies + 
			", LanguageSkills=" + LanguageSkills + 
			", Specialty=" + Specialty + 
			", LastLoginTime=" + LastLoginTime + 
			", LoginSum=" + LoginSum + 
			", IosToken=" + IosToken + 
			", AndRoidToken=" + AndRoidToken + 
			", IsPush=" + IsPush + 
			", DeviceName=" + DeviceName + 
			", AddTime=" + AddTime + 
			", EditTime=" + EditTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

