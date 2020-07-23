package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpsaleordergoods
 * author name: ÄÅº°
 * create time: 2020-07-22 16:11:27
 */ 
public class Erpsaleordergoods extends EntityHelper{

	private String Guid;
	/*¶©µ¥±àºÅ*/
	private String OrderNumber;
	/*¶©µ¥ÉÌÆ·±àºÅ*/
	private String GoodsGuid;
	/*¹ºÂòÊýÁ¿*/
	private int Counts;

	public Erpsaleordergoods() {
		super();
	}
	public Erpsaleordergoods(String Guid,String OrderNumber,String GoodsGuid,int Counts) {
		this.Guid=Guid;
		this.OrderNumber=OrderNumber;
		this.GoodsGuid=GoodsGuid;
		this.Counts=Counts;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setOrderNumber(String OrderNumber){
		this.OrderNumber=OrderNumber;
	}
	public String getOrderNumber(){
		return OrderNumber;
	}
	public void setGoodsGuid(String GoodsGuid){
		this.GoodsGuid=GoodsGuid;
	}
	public String getGoodsGuid(){
		return GoodsGuid;
	}
	public void setCounts(int Counts){
		this.Counts=Counts;
	}
	public int getCounts(){
		return Counts;
	}
	@Override
	public String toString() {
		return "erpsaleordergoods[" + 
			"Guid=" + Guid + 
			", OrderNumber=" + OrderNumber + 
			", GoodsGuid=" + GoodsGuid + 
			", Counts=" + Counts + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

