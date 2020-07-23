package com.cj.entity;

import java.util.Date;
/**
 * table name:  back_log
 * author name: �ź�
 * create time: 2020-07-22 16:11:27
 */ 
public class BackLog extends EntityHelper{

	private long Id;
	/*���ݵ��ļ���������*/
	private String FileName;
	/*������������*/
	private String BackTypeName;
	/*���ݵ��ļ���С*/
	private String FileSize;
	/*������IP*/
	private String ServerIP;
	/*����ʱ��*/
	private Date BackeTime;
	private Date CreateTime;

	public BackLog() {
		super();
	}
	public BackLog(long Id,String FileName,String BackTypeName,String FileSize,String ServerIP,Date BackeTime,Date CreateTime) {
		this.Id=Id;
		this.FileName=FileName;
		this.BackTypeName=BackTypeName;
		this.FileSize=FileSize;
		this.ServerIP=ServerIP;
		this.BackeTime=BackeTime;
		this.CreateTime=CreateTime;
	}
	public void setId(long Id){
		this.Id=Id;
	}
	public long getId(){
		return Id;
	}
	public void setFileName(String FileName){
		this.FileName=FileName;
	}
	public String getFileName(){
		return FileName;
	}
	public void setBackTypeName(String BackTypeName){
		this.BackTypeName=BackTypeName;
	}
	public String getBackTypeName(){
		return BackTypeName;
	}
	public void setFileSize(String FileSize){
		this.FileSize=FileSize;
	}
	public String getFileSize(){
		return FileSize;
	}
	public void setServerIP(String ServerIP){
		this.ServerIP=ServerIP;
	}
	public String getServerIP(){
		return ServerIP;
	}
	public void setBackeTime(Date BackeTime){
		this.BackeTime=BackeTime;
	}
	public Date getBackeTime(){
		return BackeTime;
	}
	public void setCreateTime(Date CreateTime){
		this.CreateTime=CreateTime;
	}
	public Date getCreateTime(){
		return CreateTime;
	}
	@Override
	public String toString() {
		return "back_log[" + 
			"Id=" + Id + 
			", FileName=" + FileName + 
			", BackTypeName=" + BackTypeName + 
			", FileSize=" + FileSize + 
			", ServerIP=" + ServerIP + 
			", BackeTime=" + BackeTime + 
			", CreateTime=" + CreateTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

