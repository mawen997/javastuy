package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  o_orderlog
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class OOrderlog extends EntityHelper{

	private long OrderLogID;
	/*操作类型，更新，删除，保存*/
	private String DataType;
	/*操作的数据表*/
	private String DataTableName;
	/*原来的数据*/
	private String OdData;
	/*操作的用户ID*/
	private long UserID;
	/*操作的用户名称*/
	private String UserName;
	/*操作的者的IP地址*/
	private String IP;
	/*操作时间*/
	private Date CreateTime;
	private byte[] test;
	/*操作说明*/
	private String OperationContent;

	public OOrderlog() {
		super();
	}
	public OOrderlog(long OrderLogID,String DataType,String DataTableName,String OdData,long UserID,String UserName,String IP,Date CreateTime,byte[] test,String OperationContent) {
		this.OrderLogID=OrderLogID;
		this.DataType=DataType;
		this.DataTableName=DataTableName;
		this.OdData=OdData;
		this.UserID=UserID;
		this.UserName=UserName;
		this.IP=IP;
		this.CreateTime=CreateTime;
		this.test=test;
		this.OperationContent=OperationContent;
	}
	public void setOrderLogID(long OrderLogID){
		this.OrderLogID=OrderLogID;
	}
	public long getOrderLogID(){
		return OrderLogID;
	}
	public void setDataType(String DataType){
		this.DataType=DataType;
	}
	public String getDataType(){
		return DataType;
	}
	public void setDataTableName(String DataTableName){
		this.DataTableName=DataTableName;
	}
	public String getDataTableName(){
		return DataTableName;
	}
	public void setOdData(String OdData){
		this.OdData=OdData;
	}
	public String getOdData(){
		return OdData;
	}
	public void setUserID(long UserID){
		this.UserID=UserID;
	}
	public long getUserID(){
		return UserID;
	}
	public void setUserName(String UserName){
		this.UserName=UserName;
	}
	public String getUserName(){
		return UserName;
	}
	public void setIP(String IP){
		this.IP=IP;
	}
	public String getIP(){
		return IP;
	}
	public void setCreateTime(Date CreateTime){
		this.CreateTime=CreateTime;
	}
	public Date getCreateTime(){
		return CreateTime;
	}
	public void setTest(byte[] test){
		this.test=test;
	}
	public byte[] getTest(){
		return test;
	}
	public void setOperationContent(String OperationContent){
		this.OperationContent=OperationContent;
	}
	public String getOperationContent(){
		return OperationContent;
	}
	@Override
	public String toString() {
		return "o_orderlog[" + 
			"OrderLogID=" + OrderLogID + 
			", DataType=" + DataType + 
			", DataTableName=" + DataTableName + 
			", OdData=" + OdData + 
			", UserID=" + UserID + 
			", UserName=" + UserName + 
			", IP=" + IP + 
			", CreateTime=" + CreateTime + 
			", test=" + test + 
			", OperationContent=" + OperationContent + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "OrderLogID";
	}
}

