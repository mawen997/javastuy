package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  nation
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class Nation extends EntityHelper{

	private int Id;
	/*代码值*/
	private String Code;
	/*中文标识*/
	private String Name;
	/*是否删除*/
	private int Isdelete;
	/*创建时间*/
	private null CreateTime;

	public Nation() {
		super();
	}
	public Nation(int Id,String Code,String Name,int Isdelete,null CreateTime) {
		this.Id=Id;
		this.Code=Code;
		this.Name=Name;
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
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setIsdelete(int Isdelete){
		this.Isdelete=Isdelete;
	}
	public int getIsdelete(){
		return Isdelete;
	}
	public void setCreateTime(null CreateTime){
		this.CreateTime=CreateTime;
	}
	public null getCreateTime(){
		return CreateTime;
	}
	@Override
	public String toString() {
		return "nation[" + 
			"Id=" + Id + 
			", Code=" + Code + 
			", Name=" + Name + 
			", Isdelete=" + Isdelete + 
			", CreateTime=" + CreateTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

