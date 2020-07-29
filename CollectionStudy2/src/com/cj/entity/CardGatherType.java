package com.cj.entity;

import java.util.Date;
/**
 * table name:  card_gather_type
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class CardGatherType extends EntityHelper{

	private int Id;
	/*名称*/
	private String Name;
	/*证件号*/
	private String CredNo;
	/*订单号*/
	private String CardOrderNo;
	/*采集信息模块，1：个人信息；2：参保信息；3：证件信息；*/
	private int Type;
	/*采集信息模块状态，1：未采集；2：已采集*/
	private int Status;
	/*创建时间*/
	private Date CreateTime;
	/*更新时间*/
	private Date UpdateTime;

	public CardGatherType() {
		super();
	}
	public CardGatherType(int Id,String Name,String CredNo,String CardOrderNo,int Type,int Status,Date CreateTime,Date UpdateTime) {
		this.Id=Id;
		this.Name=Name;
		this.CredNo=CredNo;
		this.CardOrderNo=CardOrderNo;
		this.Type=Type;
		this.Status=Status;
		this.CreateTime=CreateTime;
		this.UpdateTime=UpdateTime;
	}
	public void setId(int Id){
		this.Id=Id;
	}
	public int getId(){
		return Id;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setCredNo(String CredNo){
		this.CredNo=CredNo;
	}
	public String getCredNo(){
		return CredNo;
	}
	public void setCardOrderNo(String CardOrderNo){
		this.CardOrderNo=CardOrderNo;
	}
	public String getCardOrderNo(){
		return CardOrderNo;
	}
	public void setType(int Type){
		this.Type=Type;
	}
	public int getType(){
		return Type;
	}
	public void setStatus(int Status){
		this.Status=Status;
	}
	public int getStatus(){
		return Status;
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
	@Override
	public String toString() {
		return "card_gather_type[" + 
			"Id=" + Id + 
			", Name=" + Name + 
			", CredNo=" + CredNo + 
			", CardOrderNo=" + CardOrderNo + 
			", Type=" + Type + 
			", Status=" + Status + 
			", CreateTime=" + CreateTime + 
			", UpdateTime=" + UpdateTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

