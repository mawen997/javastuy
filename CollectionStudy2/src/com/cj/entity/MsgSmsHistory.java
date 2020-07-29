package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  msg_sms_history
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class MsgSmsHistory extends EntityHelper{

	private long Id;
	/*应用ID*/
	private long ApplicationId;
	/*通道ID*/
	private long ChannelId;
	/*模板ID*/
	private long TemplateId;
	/*接收者*/
	private String Phone;
	/*发送body*/
	private String Content;
	/*发送状态*/
	private int SendStatus;
	/*第三方流水号*/
	private String SerialNumber;
	/*第三方错误编号*/
	private String ResultCode;
	/*第三方错误信息*/
	private String ResultMessage;
	/*发送时间*/
	private Date CreateTime;
	/*更新时间*/
	private Date UpdateTime;
	/*运营商异常码*/
	private String OperatorErrorCode;
	/*运营商交易码*/
	private String OperatorTansCode;
	/*运营商返回消息*/
	private String OperatorMsg;
	/*运营商返回状态*/
	private int OperatorState;

	public MsgSmsHistory() {
		super();
	}
	public MsgSmsHistory(long Id,long ApplicationId,long ChannelId,long TemplateId,String Phone,String Content,int SendStatus,String SerialNumber,String ResultCode,String ResultMessage,Date CreateTime,Date UpdateTime,String OperatorErrorCode,String OperatorTansCode,String OperatorMsg,int OperatorState) {
		this.Id=Id;
		this.ApplicationId=ApplicationId;
		this.ChannelId=ChannelId;
		this.TemplateId=TemplateId;
		this.Phone=Phone;
		this.Content=Content;
		this.SendStatus=SendStatus;
		this.SerialNumber=SerialNumber;
		this.ResultCode=ResultCode;
		this.ResultMessage=ResultMessage;
		this.CreateTime=CreateTime;
		this.UpdateTime=UpdateTime;
		this.OperatorErrorCode=OperatorErrorCode;
		this.OperatorTansCode=OperatorTansCode;
		this.OperatorMsg=OperatorMsg;
		this.OperatorState=OperatorState;
	}
	public void setId(long Id){
		this.Id=Id;
	}
	public long getId(){
		return Id;
	}
	public void setApplicationId(long ApplicationId){
		this.ApplicationId=ApplicationId;
	}
	public long getApplicationId(){
		return ApplicationId;
	}
	public void setChannelId(long ChannelId){
		this.ChannelId=ChannelId;
	}
	public long getChannelId(){
		return ChannelId;
	}
	public void setTemplateId(long TemplateId){
		this.TemplateId=TemplateId;
	}
	public long getTemplateId(){
		return TemplateId;
	}
	public void setPhone(String Phone){
		this.Phone=Phone;
	}
	public String getPhone(){
		return Phone;
	}
	public void setContent(String Content){
		this.Content=Content;
	}
	public String getContent(){
		return Content;
	}
	public void setSendStatus(int SendStatus){
		this.SendStatus=SendStatus;
	}
	public int getSendStatus(){
		return SendStatus;
	}
	public void setSerialNumber(String SerialNumber){
		this.SerialNumber=SerialNumber;
	}
	public String getSerialNumber(){
		return SerialNumber;
	}
	public void setResultCode(String ResultCode){
		this.ResultCode=ResultCode;
	}
	public String getResultCode(){
		return ResultCode;
	}
	public void setResultMessage(String ResultMessage){
		this.ResultMessage=ResultMessage;
	}
	public String getResultMessage(){
		return ResultMessage;
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
	public void setOperatorErrorCode(String OperatorErrorCode){
		this.OperatorErrorCode=OperatorErrorCode;
	}
	public String getOperatorErrorCode(){
		return OperatorErrorCode;
	}
	public void setOperatorTansCode(String OperatorTansCode){
		this.OperatorTansCode=OperatorTansCode;
	}
	public String getOperatorTansCode(){
		return OperatorTansCode;
	}
	public void setOperatorMsg(String OperatorMsg){
		this.OperatorMsg=OperatorMsg;
	}
	public String getOperatorMsg(){
		return OperatorMsg;
	}
	public void setOperatorState(int OperatorState){
		this.OperatorState=OperatorState;
	}
	public int getOperatorState(){
		return OperatorState;
	}
	@Override
	public String toString() {
		return "msg_sms_history[" + 
			"Id=" + Id + 
			", ApplicationId=" + ApplicationId + 
			", ChannelId=" + ChannelId + 
			", TemplateId=" + TemplateId + 
			", Phone=" + Phone + 
			", Content=" + Content + 
			", SendStatus=" + SendStatus + 
			", SerialNumber=" + SerialNumber + 
			", ResultCode=" + ResultCode + 
			", ResultMessage=" + ResultMessage + 
			", CreateTime=" + CreateTime + 
			", UpdateTime=" + UpdateTime + 
			", OperatorErrorCode=" + OperatorErrorCode + 
			", OperatorTansCode=" + OperatorTansCode + 
			", OperatorMsg=" + OperatorMsg + 
			", OperatorState=" + OperatorState + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

