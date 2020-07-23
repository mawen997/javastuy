package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  msg_interactive_validation
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class MsgInteractiveValidation extends EntityHelper{

	/*Id*/
	private long Id;
	/*交互类型(1-手机)*/
	private int MessageType;
	/*手机号*/
	private String Phone;
	/*验证码*/
	private String ValidateCode;
	/*过期时间*/
	private null ExpiredTime;
	/*状态*/
	private int Status;
	/*创建时间*/
	private null CreateTime;
	/*修改时间*/
	private null UpdateTime;

	public MsgInteractiveValidation() {
		super();
	}
	public MsgInteractiveValidation(long Id,int MessageType,String Phone,String ValidateCode,null ExpiredTime,int Status,null CreateTime,null UpdateTime) {
		this.Id=Id;
		this.MessageType=MessageType;
		this.Phone=Phone;
		this.ValidateCode=ValidateCode;
		this.ExpiredTime=ExpiredTime;
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
	public void setPhone(String Phone){
		this.Phone=Phone;
	}
	public String getPhone(){
		return Phone;
	}
	public void setValidateCode(String ValidateCode){
		this.ValidateCode=ValidateCode;
	}
	public String getValidateCode(){
		return ValidateCode;
	}
	public void setExpiredTime(null ExpiredTime){
		this.ExpiredTime=ExpiredTime;
	}
	public null getExpiredTime(){
		return ExpiredTime;
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
		return "msg_interactive_validation[" + 
			"Id=" + Id + 
			", MessageType=" + MessageType + 
			", Phone=" + Phone + 
			", ValidateCode=" + ValidateCode + 
			", ExpiredTime=" + ExpiredTime + 
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

