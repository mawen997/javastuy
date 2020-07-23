package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  systinfo
 * author name: 呐喊
 * create time: 2020-07-22 16:11:28
 */ 
public class Systinfo extends EntityHelper{

	private long Id;
	private String TypeName;
	private String ServerName;
	private String IP;
	/*总内存*/
	private String MemTotal;
	/*已经使用内存*/
	private String MemFree;
	/*cpu型号*/
	private String CpuInfo;
	/*CPU核数*/
	private String Cpucore;
	/*已经使用空间*/
	private String FreeSpace;
	/*总空间*/
	private String TotalSpace;
	private String OS_version;
	private Date CreateTime;

	public Systinfo() {
		super();
	}
	public Systinfo(long Id,String TypeName,String ServerName,String IP,String MemTotal,String MemFree,String CpuInfo,String Cpucore,String FreeSpace,String TotalSpace,String OS_version,Date CreateTime) {
		this.Id=Id;
		this.TypeName=TypeName;
		this.ServerName=ServerName;
		this.IP=IP;
		this.MemTotal=MemTotal;
		this.MemFree=MemFree;
		this.CpuInfo=CpuInfo;
		this.Cpucore=Cpucore;
		this.FreeSpace=FreeSpace;
		this.TotalSpace=TotalSpace;
		this.OS_version=OS_version;
		this.CreateTime=CreateTime;
	}
	public void setId(long Id){
		this.Id=Id;
	}
	public long getId(){
		return Id;
	}
	public void setTypeName(String TypeName){
		this.TypeName=TypeName;
	}
	public String getTypeName(){
		return TypeName;
	}
	public void setServerName(String ServerName){
		this.ServerName=ServerName;
	}
	public String getServerName(){
		return ServerName;
	}
	public void setIP(String IP){
		this.IP=IP;
	}
	public String getIP(){
		return IP;
	}
	public void setMemTotal(String MemTotal){
		this.MemTotal=MemTotal;
	}
	public String getMemTotal(){
		return MemTotal;
	}
	public void setMemFree(String MemFree){
		this.MemFree=MemFree;
	}
	public String getMemFree(){
		return MemFree;
	}
	public void setCpuInfo(String CpuInfo){
		this.CpuInfo=CpuInfo;
	}
	public String getCpuInfo(){
		return CpuInfo;
	}
	public void setCpucore(String Cpucore){
		this.Cpucore=Cpucore;
	}
	public String getCpucore(){
		return Cpucore;
	}
	public void setFreeSpace(String FreeSpace){
		this.FreeSpace=FreeSpace;
	}
	public String getFreeSpace(){
		return FreeSpace;
	}
	public void setTotalSpace(String TotalSpace){
		this.TotalSpace=TotalSpace;
	}
	public String getTotalSpace(){
		return TotalSpace;
	}
	public void setOS_version(String OS_version){
		this.OS_version=OS_version;
	}
	public String getOS_version(){
		return OS_version;
	}
	public void setCreateTime(Date CreateTime){
		this.CreateTime=CreateTime;
	}
	public Date getCreateTime(){
		return CreateTime;
	}
	@Override
	public String toString() {
		return "systinfo[" + 
			"Id=" + Id + 
			", TypeName=" + TypeName + 
			", ServerName=" + ServerName + 
			", IP=" + IP + 
			", MemTotal=" + MemTotal + 
			", MemFree=" + MemFree + 
			", CpuInfo=" + CpuInfo + 
			", Cpucore=" + Cpucore + 
			", FreeSpace=" + FreeSpace + 
			", TotalSpace=" + TotalSpace + 
			", OS_version=" + OS_version + 
			", CreateTime=" + CreateTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

