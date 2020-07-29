package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  insurancearea
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class Insurancearea extends EntityHelper{

	private int Id;
	/*代码值*/
	private String Code;
	/*区域*/
	private String Area;
	/*上级编码*/
	private String Upcode;
	/*区域级别*/
	private String Regionallevel;
	/*是否删除*/
	private int Isdelete;
	/*创建时间*/
	private Date CreateTime;

	public Insurancearea() {
		super();
	}
	public Insurancearea(int Id,String Code,String Area,String Upcode,String Regionallevel,int Isdelete,Date CreateTime) {
		this.Id=Id;
		this.Code=Code;
		this.Area=Area;
		this.Upcode=Upcode;
		this.Regionallevel=Regionallevel;
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
	public void setArea(String Area){
		this.Area=Area;
	}
	public String getArea(){
		return Area;
	}
	public void setUpcode(String Upcode){
		this.Upcode=Upcode;
	}
	public String getUpcode(){
		return Upcode;
	}
	public void setRegionallevel(String Regionallevel){
		this.Regionallevel=Regionallevel;
	}
	public String getRegionallevel(){
		return Regionallevel;
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
		return "insurancearea[" + 
			"Id=" + Id + 
			", Code=" + Code + 
			", Area=" + Area + 
			", Upcode=" + Upcode + 
			", Regionallevel=" + Regionallevel + 
			", Isdelete=" + Isdelete + 
			", CreateTime=" + CreateTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

