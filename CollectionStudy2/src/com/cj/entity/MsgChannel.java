package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  msg_channel
 * author name: �ź�
 * create time: 2020-07-22 16:11:27
 */ 
public class MsgChannel extends EntityHelper{

	private long Id;
	/*��Ϣͨ������*/
	private int MessageType;
	/*��������Ϣƽ̨����*/
	private String Name;
	/*�˻���*/
	private String Account;
	/*����*/
	private String Password;
	/*��չ�ֶ�(ҵ������)*/
	private String BusinessData;
	/*ÿ���ն�ÿ����෢������*/
	private int PerTerminalPerDayLimit;
	/*ÿ���ն˷��Ͷ������ʱ���������ӣ�*/
	private int PerTerminalMinInterval;
	/*ͨ���ṩ����*/
	private String ServiceProvider;
	/*�Ƿ�����*/
	private int Status;
	/*����ʱ��*/
	private null CreateTime;
	/*����ʱ��*/
	private null UpdateTime;

	public MsgChannel() {
		super();
	}
	public MsgChannel(long Id,int MessageType,String Name,String Account,String Password,String BusinessData,int PerTerminalPerDayLimit,int PerTerminalMinInterval,String ServiceProvider,int Status,null CreateTime,null UpdateTime) {
		this.Id=Id;
		this.MessageType=MessageType;
		this.Name=Name;
		this.Account=Account;
		this.Password=Password;
		this.BusinessData=BusinessData;
		this.PerTerminalPerDayLimit=PerTerminalPerDayLimit;
		this.PerTerminalMinInterval=PerTerminalMinInterval;
		this.ServiceProvider=ServiceProvider;
		this.Status=Status;
		this.CreateTime=CreateTime;
		this.UpdateTime=UpdateTime;
	}
	public void setId(long Id){
		this.Id=Id;
	}
	public long getId(){
		return Id;
	}
	public void setMessageType(int MessageType){
		this.MessageType=MessageType;
	}
	public int getMessageType(){
		return MessageType;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setAccount(String Account){
		this.Account=Account;
	}
	public String getAccount(){
		return Account;
	}
	public void setPassword(String Password){
		this.Password=Password;
	}
	public String getPassword(){
		return Password;
	}
	public void setBusinessData(String BusinessData){
		this.BusinessData=BusinessData;
	}
	public String getBusinessData(){
		return BusinessData;
	}
	public void setPerTerminalPerDayLimit(int PerTerminalPerDayLimit){
		this.PerTerminalPerDayLimit=PerTerminalPerDayLimit;
	}
	public int getPerTerminalPerDayLimit(){
		return PerTerminalPerDayLimit;
	}
	public void setPerTerminalMinInterval(int PerTerminalMinInterval){
		this.PerTerminalMinInterval=PerTerminalMinInterval;
	}
	public int getPerTerminalMinInterval(){
		return PerTerminalMinInterval;
	}
	public void setServiceProvider(String ServiceProvider){
		this.ServiceProvider=ServiceProvider;
	}
	public String getServiceProvider(){
		return ServiceProvider;
	}
	public void setStatus(int Status){
		this.Status=Status;
	}
	public int getStatus(){
		return Status;
	}
	public void setCreateTime(null CreateTime){
		this.CreateTime=CreateTime;
	}
	public null getCreateTime(){
		return CreateTime;
	}
	public void setUpdateTime(null UpdateTime){
		this.UpdateTime=UpdateTime;
	}
	public null getUpdateTime(){
		return UpdateTime;
	}
	@Override
	public String toString() {
		return "msg_channel[" + 
			"Id=" + Id + 
			", MessageType=" + MessageType + 
			", Name=" + Name + 
			", Account=" + Account + 
			", Password=" + Password + 
			", BusinessData=" + BusinessData + 
			", PerTerminalPerDayLimit=" + PerTerminalPerDayLimit + 
			", PerTerminalMinInterval=" + PerTerminalMinInterval + 
			", ServiceProvider=" + ServiceProvider + 
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

