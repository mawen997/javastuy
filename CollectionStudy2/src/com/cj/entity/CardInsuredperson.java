package com.cj.entity;

import java.util.Date;
/**
 * table name:  card_insuredperson
 * author name: �ź�
 * create time: 2020-07-22 16:11:27
 */ 
public class CardInsuredperson extends EntityHelper{

	private long Id;
	/*GUID��ʶ*/
	private String GuidCode;
	/*���˱��*/
	private String PersonNum;
	/*������*/
	private String CardOrderNo;
	/*�ƿ����ͣ�0-Ĭ�ϣ�1-������2-���ƿ���*/
	private int MakeCardType;
	/*֤�����(֤������ �������֤   2�����ڱ�   �������� )*/
	private int CardType;
	/*���˹�����ݺ���*/
	private String CardId;
	/*����*/
	private String Name;
	/*����(0-��½��1-�۰�̨������)*/
	private String Nationality;
	/*�Ƿ�����ز����ƿ���0��ʡ�ڣ�1��ʡ��*/
	private int IsRemote;
	/*��ҽ������*/
	private String Medrecords;
	/*�Ա�(1-�У�2-Ů��9-δ˵�����Ա�)*/
	private String Sex;
	/*�¿����б�ʶ��*/
	private String MBankCode;
	/*���б�ʶ��*/
	private String BankCode;
	private String MBankName;
	/*��������*/
	private String BankName;
	/*��������*/
	private String Birthday;
	/*������*/
	private String MinorityCode;
	/*��������*/
	private String MinorityName;
	/*�������*/
	private String PostCode;
	/*�Ļ��̶ȱ���*/
	private String Education;
	/*�Ļ��̶�����*/
	private String EducationName;
	/*����������*/
	private String AccountCode;
	/*�����������*/
	private String AccountName;
	/*������״̬����*/
	private String RetireCode;
	/*������״̬����*/
	private String RetireName;
	/*��λ���*/
	private String CompanyNumber;
	/*��λ����*/
	private String CompanyName;
	/*�α���������*/
	private String InsuredAreaCode;
	/*�α���������*/
	private String InsuredArea;
	/*��ϵ�绰*/
	private String Phone;
	/*�����籣���*/
	private String SSNumber;
	/*��ס�������ڵ�*/
	private String FamilyRegisterAdress;
	/*ͨѶ��ַ*/
	private String LiveAddress;
	/*�����˱��*/
	private String OperatorNumber;
	/*����ʱ��*/
	private String WorkDate;
	/*����ʱ��*/
	private Date CreateTime;
	/*״̬:0:�ɼ��У�1������ˣ�2����������3���ѷ�����4�����ʧ��*/
	private int Status;
	/*1:δ֧��,2��֧����,3��֧���ɹ�,4��֧��ʧ��,*/
	private int PayStatus;
	/*����ʱ��*/
	private Date GrantTime;
	/*����ʱ��*/
	private Date UpdateTime;
	/*����Դ:΢��appid*/
	private String Source;
	/*΢�ŵ�openid*/
	private String OpenId;
	/*��½��ID*/
	private int OperatorId;
	/*��ǰ�������*/
	private String Opinion;
	/*���ʧ��ԭ��*/
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

