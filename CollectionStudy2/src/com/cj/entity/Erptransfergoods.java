package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erptransfergoods
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class Erptransfergoods extends EntityHelper{

	/*唯一编号*/
	private String Guid;
	/*调拨单编号*/
	private String TransferGuid;
	/*商品编号*/
	private String GoodsGuid;
	/*商品数量*/
	private int GoodsSum;

	public Erptransfergoods() {
		super();
	}
	public Erptransfergoods(String Guid,String TransferGuid,String GoodsGuid,int GoodsSum) {
		this.Guid=Guid;
		this.TransferGuid=TransferGuid;
		this.GoodsGuid=GoodsGuid;
		this.GoodsSum=GoodsSum;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setTransferGuid(String TransferGuid){
		this.TransferGuid=TransferGuid;
	}
	public String getTransferGuid(){
		return TransferGuid;
	}
	public void setGoodsGuid(String GoodsGuid){
		this.GoodsGuid=GoodsGuid;
	}
	public String getGoodsGuid(){
		return GoodsGuid;
	}
	public void setGoodsSum(int GoodsSum){
		this.GoodsSum=GoodsSum;
	}
	public int getGoodsSum(){
		return GoodsSum;
	}
	@Override
	public String toString() {
		return "erptransfergoods[" + 
			"Guid=" + Guid + 
			", TransferGuid=" + TransferGuid + 
			", GoodsGuid=" + GoodsGuid + 
			", GoodsSum=" + GoodsSum + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

