package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  msg_interactive_validation_history
 * author name: �ź�
 * create time: 2020-07-23 11:47:19
 */ 
public class MsgInteractiveValidationHistory extends EntityHelper{

	private long Id;
	/*�ͻ���IP*/
	private String Ip;
	/*��ȷ����֤��*/
	private String CorrectValidateCode;
	/*��ȷ����֤�����ʱ��*/
	private Date ExpiredTime;
	/*�û��ύ����֤��*/
	private String RequestValidateCode;
	/*�Ƿ�ͨ����֤*/
	private boolean IsAuthenticated;
	/*û��ͨ����֤��ԭ��*/
	private String FailReason;
	/*����ʱ��*/
	private Date CreateTime;
	/*����ʱ��*/
	private Date UpdateTime;

	public MsgInteractiveValidationHistory() {
		super();
	}
	public MsgInteractiveValidationHistory(long Id,String Ip,String CorrectValidateCode,Date ExpiredTime,String RequestValidateCode,boolean IsAuthenticated,String FailReason,Date CreateTime,Date UpdateTime) {
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
	public void setExpiredTime(Date ExpiredTime){
		this.ExpiredTime=ExpiredTime;
	}
	public Date getExpiredTime(){
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

