package com.cj.entity;

import java.util.Date;
/**
 * table name:  card_historyolaction
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class CardHistoryolaction extends EntityHelper{

	private long Id;
	/*身份证*/
	private String CardId;
	/*社保卡号*/
	private String SSNumber;
	/*1，是成功，0失败*/
	private int Status;
	/*参保人*/
	private String Name;
	private String StatusContent;
	/*银行标识码*/
	private String BankCode;
	/*经办人*/
	private String AgName;
	/*申请人姓名*/
	private String SqName;
	/*流水号*/
	private String CardOrderNo;
	/*申请人ID*/
	private String SqPasGuidCode;
	private Date CreateDate;
	/*经办人ID，ems审核人ID*/
	private long AgID;

	public CardHistoryolaction() {
		super();
	}
	public CardHistoryolaction(long Id,String CardId,String SSNumber,int Status,String Name,String StatusContent,String BankCode,String AgName,String SqName,String CardOrderNo,String SqPasGuidCode,Date CreateDate,long AgID) {
		this.Id=Id;
		this.CardId=CardId;
		this.SSNumber=SSNumber;
		this.Status=Status;
		this.Name=Name;
		this.StatusContent=StatusContent;
		this.BankCode=BankCode;
		this.AgName=AgName;
		this.SqName=SqName;
		this.CardOrderNo=CardOrderNo;
		this.SqPasGuidCode=SqPasGuidCode;
		this.CreateDate=CreateDate;
		this.AgID=AgID;
	}
	public void setId(long Id){
		this.Id=Id;
	}
	public long getId(){
		return Id;
	}
	public void setCardId(String CardId){
		this.CardId=CardId;
	}
	public String getCardId(){
		return CardId;
	}
	public void setSSNumber(String SSNumber){
		this.SSNumber=SSNumber;
	}
	public String getSSNumber(){
		return SSNumber;
	}
	public void setStatus(int Status){
		this.Status=Status;
	}
	public int getStatus(){
		return Status;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setStatusContent(String StatusContent){
		this.StatusContent=StatusContent;
	}
	public String getStatusContent(){
		return StatusContent;
	}
	public void setBankCode(String BankCode){
		this.BankCode=BankCode;
	}
	public String getBankCode(){
		return BankCode;
	}
	public void setAgName(String AgName){
		this.AgName=AgName;
	}
	public String getAgName(){
		return AgName;
	}
	public void setSqName(String SqName){
		this.SqName=SqName;
	}
	public String getSqName(){
		return SqName;
	}
	public void setCardOrderNo(String CardOrderNo){
		this.CardOrderNo=CardOrderNo;
	}
	public String getCardOrderNo(){
		return CardOrderNo;
	}
	public void setSqPasGuidCode(String SqPasGuidCode){
		this.SqPasGuidCode=SqPasGuidCode;
	}
	public String getSqPasGuidCode(){
		return SqPasGuidCode;
	}
	public void setCreateDate(Date CreateDate){
		this.CreateDate=CreateDate;
	}
	public Date getCreateDate(){
		return CreateDate;
	}
	public void setAgID(long AgID){
		this.AgID=AgID;
	}
	public long getAgID(){
		return AgID;
	}
	@Override
	public String toString() {
		return "card_historyolaction[" + 
			"Id=" + Id + 
			", CardId=" + CardId + 
			", SSNumber=" + SSNumber + 
			", Status=" + Status + 
			", Name=" + Name + 
			", StatusContent=" + StatusContent + 
			", BankCode=" + BankCode + 
			", AgName=" + AgName + 
			", SqName=" + SqName + 
			", CardOrderNo=" + CardOrderNo + 
			", SqPasGuidCode=" + SqPasGuidCode + 
			", CreateDate=" + CreateDate + 
			", AgID=" + AgID + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

