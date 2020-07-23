package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpreturngoods
 * author name: �ź�
 * create time: 2020-07-22 16:11:27
 */ 
public class Erpreturngoods extends EntityHelper{

	private String Guid;
	/*�����������*/
	private String OrderGuid;
	/*���������ļ��·�*/
	private String GoodsGuid;
	/*����������*/
	private int ReturnCount;
	/*��������*/
	private String Summary;

	public Erpreturngoods() {
		super();
	}
	public Erpreturngoods(String Guid,String OrderGuid,String GoodsGuid,int ReturnCount,String Summary) {
		this.Guid=Guid;
		this.OrderGuid=OrderGuid;
		this.GoodsGuid=GoodsGuid;
		this.ReturnCount=ReturnCount;
		this.Summary=Summary;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setOrderGuid(String OrderGuid){
		this.OrderGuid=OrderGuid;
	}
	public String getOrderGuid(){
		return OrderGuid;
	}
	public void setGoodsGuid(String GoodsGuid){
		this.GoodsGuid=GoodsGuid;
	}
	public String getGoodsGuid(){
		return GoodsGuid;
	}
	public void setReturnCount(int ReturnCount){
		this.ReturnCount=ReturnCount;
	}
	public int getReturnCount(){
		return ReturnCount;
	}
	public void setSummary(String Summary){
		this.Summary=Summary;
	}
	public String getSummary(){
		return Summary;
	}
	@Override
	public String toString() {
		return "erpreturngoods[" + 
			"Guid=" + Guid + 
			", OrderGuid=" + OrderGuid + 
			", GoodsGuid=" + GoodsGuid + 
			", ReturnCount=" + ReturnCount + 
			", Summary=" + Summary + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

