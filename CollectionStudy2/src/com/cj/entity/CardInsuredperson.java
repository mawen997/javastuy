package com.cj.entity;

import java.util.Date;
/**
 * table name:  card_insuredperson
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class CardInsuredperson extends EntityHelper{

	private long Id;
	/*GUID标识*/
	private String GuidCode;
	/*个人编号*/
	private String PersonNum;
	/*订单号*/
	private String CardOrderNo;
	/*制卡类型（0-默认，1-补卡，2-新制卡）*/
	private int MakeCardType;
	/*证件类别(证件类型 １：身份证   2：户口本   ３：护照 )*/
	private int CardType;
	/*个人公民身份号码*/
	private String CardId;
	/*姓名*/
	private String Name;
	/*国籍(0-大陆，1-港澳台及国外)*/
	private String Nationality;
	/*是否是异地补卡制卡，0是省内，1是省外*/
	private int IsRemote;
	/*就医备案地*/
	private String Medrecords;
	/*性别(1-男，2-女，9-未说明的性别)*/
	private String Sex;
	/*新卡银行标识码*/
	private String MBankCode;
	/*银行标识码*/
	private String BankCode;
	private String MBankName;
	/*银行名称*/
	private String BankName;
	/*出生日期*/
	private String Birthday;
	/*民族编号*/
	private String MinorityCode;
	/*民族名称*/
	private String MinorityName;
	/*邮政编号*/
	private String PostCode;
	/*文化程度编码*/
	private String Education;
	/*文化程度名称*/
	private String EducationName;
	/*户口类别编码*/
	private String AccountCode;
	/*户口类别名称*/
	private String AccountName;
	/*离退休状态编码*/
	private String RetireCode;
	/*离退休状态名称*/
	private String RetireName;
	/*单位编号*/
	private String CompanyNumber;
	/*单位名称*/
	private String CompanyName;
	/*参保机构代码*/
	private String InsuredAreaCode;
	/*参保机构名称*/
	private String InsuredArea;
	/*联系电话*/
	private String Phone;
	/*个人社保编号*/
	private String SSNumber;
	/*常住户口所在地*/
	private String FamilyRegisterAdress;
	/*通讯地址*/
	private String LiveAddress;
	/*经办人编号*/
	private String OperatorNumber;
	/*工作时间*/
	private String WorkDate;
	/*创建时间*/
	private Date CreateTime;
	/*状态:0:采集中，1：待审核，2：待发卡，3：已发卡，4：审核失败*/
	private int Status;
	/*1:未支付,2：支付中,3：支付成功,4：支付失败,*/
	private int PayStatus;
	/*发卡时间*/
	private Date GrantTime;
	/*更新时间*/
	private Date UpdateTime;
	/*集来源:微信appid*/
	private String Source;
	/*微信的openid*/
	private String OpenId;
	/*登陆者ID*/
	private int OperatorId;
	/*当前审批意见*/
	private String Opinion;
	/*审核失败原因*/
	private String FailReason;

	public CardInsuredperson() {
		super();
	}
	public CardInsuredperson(long Id,String GuidCode,String PersonNum,String CardOrderNo,int MakeCardType,int CardType,String CardId,String Name,String Nationality,int IsRemote,String Medrecords,String Sex,String MBankCode,String BankCode,String MBankName,String BankName,String Birthday,String MinorityCode,String MinorityName,String PostCode,String Education,String EducationName,String AccountCode,String AccountName,String RetireCode,String RetireName,String CompanyNumber,String CompanyName,String InsuredAreaCode,String InsuredArea,String Phone,String SSNumber,String FamilyRegisterAdress,String LiveAddress,String OperatorNumber,String WorkDate,Date CreateTime,int Status,int PayStatus,Date GrantTime,Date UpdateTime,String Source,String OpenId,int OperatorId,String Opinion,String FailReason) {
		this.Id=Id;
		this.GuidCode=GuidCode;
		this.PersonNum=PersonNum;
		this.CardOrderNo=CardOrderNo;
		this.MakeCardType=MakeCardType;
		this.CardType=CardType;
		this.CardId=CardId;
		this.Name=Name;
		this.Nationality=Nationality;
		this.IsRemote=IsRemote;
		this.Medrecords=Medrecords;
		this.Sex=Sex;
		this.MBankCode=MBankCode;
		this.BankCode=BankCode;
		this.MBankName=MBankName;
		this.BankName=BankName;
		this.Birthday=Birthday;
		this.MinorityCode=MinorityCode;
		this.MinorityName=MinorityName;
		this.PostCode=PostCode;
		this.Education=Education;
		this.EducationName=EducationName;
		this.AccountCode=AccountCode;
		this.AccountName=AccountName;
		this.RetireCode=RetireCode;
		this.RetireName=RetireName;
		this.CompanyNumber=CompanyNumber;
		this.CompanyName=CompanyName;
		this.InsuredAreaCode=InsuredAreaCode;
		this.InsuredArea=InsuredArea;
		this.Phone=Phone;
		this.SSNumber=SSNumber;
		this.FamilyRegisterAdress=FamilyRegisterAdress;
		this.LiveAddress=LiveAddress;
		this.OperatorNumber=OperatorNumber;
		this.WorkDate=WorkDate;
		this.CreateTime=CreateTime;
		this.Status=Status;
		this.PayStatus=PayStatus;
		this.GrantTime=GrantTime;
		this.UpdateTime=UpdateTime;
		this.Source=Source;
		this.OpenId=OpenId;
		this.OperatorId=OperatorId;
		this.Opinion=Opinion;
		this.FailReason=FailReason;
	}
	public void setId(long Id){
		this.Id=Id;
	}
	public long getId(){
		return Id;
	}
	public void setGuidCode(String GuidCode){
		this.GuidCode=GuidCode;
	}
	public String getGuidCode(){
		return GuidCode;
	}
	public void setPersonNum(String PersonNum){
		this.PersonNum=PersonNum;
	}
	public String getPersonNum(){
		return PersonNum;
	}
	public void setCardOrderNo(String CardOrderNo){
		this.CardOrderNo=CardOrderNo;
	}
	public String getCardOrderNo(){
		return CardOrderNo;
	}
	public void setMakeCardType(int MakeCardType){
		this.MakeCardType=MakeCardType;
	}
	public int getMakeCardType(){
		return MakeCardType;
	}
	public void setCardType(int CardType){
		this.CardType=CardType;
	}
	public int getCardType(){
		return CardType;
	}
	public void setCardId(String CardId){
		this.CardId=CardId;
	}
	public String getCardId(){
		return CardId;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setNationality(String Nationality){
		this.Nationality=Nationality;
	}
	public String getNationality(){
		return Nationality;
	}
	public void setIsRemote(int IsRemote){
		this.IsRemote=IsRemote;
	}
	public int getIsRemote(){
		return IsRemote;
	}
	public void setMedrecords(String Medrecords){
		this.Medrecords=Medrecords;
	}
	public String getMedrecords(){
		return Medrecords;
	}
	public void setSex(String Sex){
		this.Sex=Sex;
	}
	public String getSex(){
		return Sex;
	}
	public void setMBankCode(String MBankCode){
		this.MBankCode=MBankCode;
	}
	public String getMBankCode(){
		return MBankCode;
	}
	public void setBankCode(String BankCode){
		this.BankCode=BankCode;
	}
	public String getBankCode(){
		return BankCode;
	}
	public void setMBankName(String MBankName){
		this.MBankName=MBankName;
	}
	public String getMBankName(){
		return MBankName;
	}
	public void setBankName(String BankName){
		this.BankName=BankName;
	}
	public String getBankName(){
		return BankName;
	}
	public void setBirthday(String Birthday){
		this.Birthday=Birthday;
	}
	public String getBirthday(){
		return Birthday;
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
	public void setPostCode(String PostCode){
		this.PostCode=PostCode;
	}
	public String getPostCode(){
		return PostCode;
	}
	public void setEducation(String Education){
		this.Education=Education;
	}
	public String getEducation(){
		return Education;
	}
	public void setEducationName(String EducationName){
		this.EducationName=EducationName;
	}
	public String getEducationName(){
		return EducationName;
	}
	public void setAccountCode(String AccountCode){
		this.AccountCode=AccountCode;
	}
	public String getAccountCode(){
		return AccountCode;
	}
	public void setAccountName(String AccountName){
		this.AccountName=AccountName;
	}
	public String getAccountName(){
		return AccountName;
	}
	public void setRetireCode(String RetireCode){
		this.RetireCode=RetireCode;
	}
	public String getRetireCode(){
		return RetireCode;
	}
	public void setRetireName(String RetireName){
		this.RetireName=RetireName;
	}
	public String getRetireName(){
		return RetireName;
	}
	public void setCompanyNumber(String CompanyNumber){
		this.CompanyNumber=CompanyNumber;
	}
	public String getCompanyNumber(){
		return CompanyNumber;
	}
	public void setCompanyName(String CompanyName){
		this.CompanyName=CompanyName;
	}
	public String getCompanyName(){
		return CompanyName;
	}
	public void setInsuredAreaCode(String InsuredAreaCode){
		this.InsuredAreaCode=InsuredAreaCode;
	}
	public String getInsuredAreaCode(){
		return InsuredAreaCode;
	}
	public void setInsuredArea(String InsuredArea){
		this.InsuredArea=InsuredArea;
	}
	public String getInsuredArea(){
		return InsuredArea;
	}
	public void setPhone(String Phone){
		this.Phone=Phone;
	}
	public String getPhone(){
		return Phone;
	}
	public void setSSNumber(String SSNumber){
		this.SSNumber=SSNumber;
	}
	public String getSSNumber(){
		return SSNumber;
	}
	public void setFamilyRegisterAdress(String FamilyRegisterAdress){
		this.FamilyRegisterAdress=FamilyRegisterAdress;
	}
	public String getFamilyRegisterAdress(){
		return FamilyRegisterAdress;
	}
	public void setLiveAddress(String LiveAddress){
		this.LiveAddress=LiveAddress;
	}
	public String getLiveAddress(){
		return LiveAddress;
	}
	public void setOperatorNumber(String OperatorNumber){
		this.OperatorNumber=OperatorNumber;
	}
	public String getOperatorNumber(){
		return OperatorNumber;
	}
	public void setWorkDate(String WorkDate){
		this.WorkDate=WorkDate;
	}
	public String getWorkDate(){
		return WorkDate;
	}
	public void setCreateTime(Date CreateTime){
		this.CreateTime=CreateTime;
	}
	public Date getCreateTime(){
		return CreateTime;
	}
	public void setStatus(int Status){
		this.Status=Status;
	}
	public int getStatus(){
		return Status;
	}
	public void setPayStatus(int PayStatus){
		this.PayStatus=PayStatus;
	}
	public int getPayStatus(){
		return PayStatus;
	}
	public void setGrantTime(Date GrantTime){
		this.GrantTime=GrantTime;
	}
	public Date getGrantTime(){
		return GrantTime;
	}
	public void setUpdateTime(Date UpdateTime){
		this.UpdateTime=UpdateTime;
	}
	public Date getUpdateTime(){
		return UpdateTime;
	}
	public void setSource(String Source){
		this.Source=Source;
	}
	public String getSource(){
		return Source;
	}
	public void setOpenId(String OpenId){
		this.OpenId=OpenId;
	}
	public String getOpenId(){
		return OpenId;
	}
	public void setOperatorId(int OperatorId){
		this.OperatorId=OperatorId;
	}
	public int getOperatorId(){
		return OperatorId;
	}
	public void setOpinion(String Opinion){
		this.Opinion=Opinion;
	}
	public String getOpinion(){
		return Opinion;
	}
	public void setFailReason(String FailReason){
		this.FailReason=FailReason;
	}
	public String getFailReason(){
		return FailReason;
	}
	@Override
	public String toString() {
		return "card_insuredperson[" + 
			"Id=" + Id + 
			", GuidCode=" + GuidCode + 
			", PersonNum=" + PersonNum + 
			", CardOrderNo=" + CardOrderNo + 
			", MakeCardType=" + MakeCardType + 
			", CardType=" + CardType + 
			", CardId=" + CardId + 
			", Name=" + Name + 
			", Nationality=" + Nationality + 
			", IsRemote=" + IsRemote + 
			", Medrecords=" + Medrecords + 
			", Sex=" + Sex + 
			", MBankCode=" + MBankCode + 
			", BankCode=" + BankCode + 
			", MBankName=" + MBankName + 
			", BankName=" + BankName + 
			", Birthday=" + Birthday + 
			", MinorityCode=" + MinorityCode + 
			", MinorityName=" + MinorityName + 
			", PostCode=" + PostCode + 
			", Education=" + Education + 
			", EducationName=" + EducationName + 
			", AccountCode=" + AccountCode + 
			", AccountName=" + AccountName + 
			", RetireCode=" + RetireCode + 
			", RetireName=" + RetireName + 
			", CompanyNumber=" + CompanyNumber + 
			", CompanyName=" + CompanyName + 
			", InsuredAreaCode=" + InsuredAreaCode + 
			", InsuredArea=" + InsuredArea + 
			", Phone=" + Phone + 
			", SSNumber=" + SSNumber + 
			", FamilyRegisterAdress=" + FamilyRegisterAdress + 
			", LiveAddress=" + LiveAddress + 
			", OperatorNumber=" + OperatorNumber + 
			", WorkDate=" + WorkDate + 
			", CreateTime=" + CreateTime + 
			", Status=" + Status + 
			", PayStatus=" + PayStatus + 
			", GrantTime=" + GrantTime + 
			", UpdateTime=" + UpdateTime + 
			", Source=" + Source + 
			", OpenId=" + OpenId + 
			", OperatorId=" + OperatorId + 
			", Opinion=" + Opinion + 
			", FailReason=" + FailReason + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

