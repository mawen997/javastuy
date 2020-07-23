package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  msg_interactive_validation_history
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class MsgInteractiveValidationHistory extends EntityHelper{

	private long Id;
	/*客户端IP*/
	private String Ip;
	/*正确的验证码*/
	private String CorrectValidateCode;
	/*正确的验证码过期时间*/
	private null ExpiredTime;
	/*用户提交的验证码*/
	private String RequestValidateCode;
	/*是否通过验证*/
	private boolean IsAuthenticated;
	/*没有通过验证的原因*/
	private String FailReason;
	/*创建时间*/
	private null CreateTime;
	/*更新时间*/
	private null UpdateTime;

	public MsgInteractiveValidationHistory() {
		super();
	}
	public MsgInteractiveValidationHistory(long Id,String Ip,String CorrectValidateCode,null ExpiredTime,String RequestValidateCode,boolean IsAuthenticated,String FailReason,null CreateTime,null UpdateTime) {
		this.Id=Id;
		this.Ip=Ip;
		this.CorrectValidateCode=CorrectValidateCode;
		this.ExpiredTime=ExpiredTime;
		this.RequestValidateCode=RequestValidateCode;
		this.IsAuthenticated=IsAuthenticated;
		this.FailReason=FailReason;
		this.CreateTime=CreateTime;
		this.UpdateTime=UpdateTime;
	}
	public void setId(long Id){
		this.Id=Id;
	}
	public long getId(){
		return Id;
	}
	public void setIp(String Ip){
		this.Ip=Ip;
	}
	public String getIp(){
		return Ip;
	}
	public void setCorrectValidateCode(String CorrectValidateCode){
		this.CorrectValidateCode=CorrectValidateCode;
	}
	public String getCorrectValidateCode(){
		return CorrectValidateCode;
	}
	public void setExpiredTime(null ExpiredTime){
		this.ExpiredTime=ExpiredTime;
	}
	public null getExpiredTime(){
		return ExpiredTime;
	}
	public void setRequestValidateCode(String RequestValidateCode){
		this.RequestValidateCode=RequestValidateCode;
	}
	public String getRequestValidateCode(){
		return RequestValidateCode;
	}
	public void setIsAuthenticated(boolean IsAuthenticated){
		this.IsAuthenticated=IsAuthenticated;
	}
	public boolean getIsAuthenticated(){
		return IsAuthenticated;
	}
	public void setFailReason(String FailReason){
		this.FailReason=FailReason;
	}
	public String getFailReason(){
		return FailReason;
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
		return "msg_interactive_validation_history[" + 
			"Id=" + Id + 
			", Ip=" + Ip + 
			", CorrectValidateCode=" + CorrectValidateCode + 
			", ExpiredTime=" + ExpiredTime + 
			", RequestValidateCode=" + RequestValidateCode + 
			", IsAuthenticated=" + IsAuthenticated + 
			", FailReason=" + FailReason + 
			", CreateTime=" + CreateTime + 
			", UpdateTime=" + UpdateTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

