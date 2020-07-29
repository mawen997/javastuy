package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  register
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class Register extends EntityHelper{

	private int Id;
	/*代码值*/
	private String Code;
	/*中文标识*/
	private String Chinesecode;
	/*是否删除*/
	private int Isdelete;
	/*创建时间*/
	private Date CreateTime;

	public Register() {
		super();
	}
	public Register(int Id,String Code,String Chinesecode,int Isdelete,Date CreateTime) {
		this.Id=Id;
		this.Code=Code;
		this.Chinesecode=Chinesecode;
		this.Isdelete=Isdelete;
		this.CreateTime=CreateTime;
	}
	public void setId(int Id){
		this.Id=Id;
	}
	public int getId(){
		return Id;
	}
	public void setCode(String Code){
		this.Code=Code;
	}
	public String getCode(){
		return Code;
	}
	public void setChinesecode(String Chinesecode){
		this.Chinesecode=Chinesecode;
	}
	public String getChinesecode(){
		return Chinesecode;
	}
	public void setIsdelete(int Isdelete){
		this.Isdelete=Isdelete;
	}
	public int getIsdelete(){
		return Isdelete;
	}
	public void setCreateTime(Date CreateTime){
		this.CreateTime=CreateTime;
	}
	public Date getCreateTime(){
		return CreateTime;
	}
	@Override
	public String toString() {
		return "register[" + 
			"Id=" + Id + 
			", Code=" + Code + 
			", Chinesecode=" + Chinesecode + 
			", Isdelete=" + Isdelete + 
			", CreateTime=" + CreateTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

