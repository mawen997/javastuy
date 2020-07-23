package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  taskmanage
 * author name: 呐喊
 * create time: 2020-07-22 16:11:28
 */ 
public class Taskmanage extends EntityHelper{

	private long TaskMngID;
	/*任务开始时间*/
	private Date StartDate;
	/*任务名称*/
	private String TaskName;
	/*绑定的服务器主机IP*/
	private String IP;
	/*是否已经启动*/
	private boolean IsStart;
	/*更新时间*/
	private Date Update;

	public Taskmanage() {
		super();
	}
	public Taskmanage(long TaskMngID,Date StartDate,String TaskName,String IP,boolean IsStart,Date Update) {
		this.TaskMngID=TaskMngID;
		this.StartDate=StartDate;
		this.TaskName=TaskName;
		this.IP=IP;
		this.IsStart=IsStart;
		this.Update=Update;
	}
	public void setTaskMngID(long TaskMngID){
		this.TaskMngID=TaskMngID;
	}
	public long getTaskMngID(){
		return TaskMngID;
	}
	public void setStartDate(Date StartDate){
		this.StartDate=StartDate;
	}
	public Date getStartDate(){
		return StartDate;
	}
	public void setTaskName(String TaskName){
		this.TaskName=TaskName;
	}
	public String getTaskName(){
		return TaskName;
	}
	public void setIP(String IP){
		this.IP=IP;
	}
	public String getIP(){
		return IP;
	}
	public void setIsStart(boolean IsStart){
		this.IsStart=IsStart;
	}
	public boolean getIsStart(){
		return IsStart;
	}
	public void setUpdate(Date Update){
		this.Update=Update;
	}
	public Date getUpdate(){
		return Update;
	}
	@Override
	public String toString() {
		return "taskmanage[" + 
			"TaskMngID=" + TaskMngID + 
			", StartDate=" + StartDate + 
			", TaskName=" + TaskName + 
			", IP=" + IP + 
			", IsStart=" + IsStart + 
			", Update=" + Update + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "TaskMngID";
	}
}

