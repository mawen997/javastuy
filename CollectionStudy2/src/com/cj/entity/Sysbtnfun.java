package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  sysbtnfun
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class Sysbtnfun extends EntityHelper{

	private String Guid;
	private String MenuGuid;
	/*功能名称*/
	private String Name;
	/*功能标识名称*/
	private String FunType;
	/*备注*/
	private String Summary;

	public Sysbtnfun() {
		super();
	}
	public Sysbtnfun(String Guid,String MenuGuid,String Name,String FunType,String Summary) {
		this.Guid=Guid;
		this.MenuGuid=MenuGuid;
		this.Name=Name;
		this.FunType=FunType;
		this.Summary=Summary;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setMenuGuid(String MenuGuid){
		this.MenuGuid=MenuGuid;
	}
	public String getMenuGuid(){
		return MenuGuid;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setFunType(String FunType){
		this.FunType=FunType;
	}
	public String getFunType(){
		return FunType;
	}
	public void setSummary(String Summary){
		this.Summary=Summary;
	}
	public String getSummary(){
		return Summary;
	}
	@Override
	public String toString() {
		return "sysbtnfun[" + 
			"Guid=" + Guid + 
			", MenuGuid=" + MenuGuid + 
			", Name=" + Name + 
			", FunType=" + FunType + 
			", Summary=" + Summary + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

