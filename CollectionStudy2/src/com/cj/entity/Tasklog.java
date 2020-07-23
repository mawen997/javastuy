package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  tasklog
 * author name: �ź�
 * create time: 2020-07-22 16:11:28
 */ 
public class Tasklog extends EntityHelper{

	private long TaskID;
	/*����ʱ��*/
	private Date Update;
	/*���µ����ݣ����紦���������*/
	private String Context;
	/*�������쳣*/
	private String ErrorMsg;

	public Tasklog() {
		super();
	}
	public Tasklog(long TaskID,Date Update,String Context,String ErrorMsg) {
		this.TaskID=TaskID;
		this.Update=Update;
		this.Context=Context;
		this.ErrorMsg=ErrorMsg;
	}
	public void setTaskID(long TaskID){
		this.TaskID=TaskID;
	}
	public long getTaskID(){
		return TaskID;
	}
	public void setUpdate(Date Update){
		this.Update=Update;
	}
	public Date getUpdate(){
		return Update;
	}
	public void setContext(String Context){
		this.Context=Context;
	}
	public String getContext(){
		return Context;
	}
	public void setErrorMsg(String ErrorMsg){
		this.ErrorMsg=ErrorMsg;
	}
	public String getErrorMsg(){
		return ErrorMsg;
	}
	@Override
	public String toString() {
		return "tasklog[" + 
			"TaskID=" + TaskID + 
			", Update=" + Update + 
			", Context=" + Context + 
			", ErrorMsg=" + ErrorMsg + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "TaskID";
	}
}

