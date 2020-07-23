package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erppacklog
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class Erppacklog extends EntityHelper{

	/*唯一编号*/
	private String Guid;
	/*类型：2=出库打包日志  1=入库打包日志*/
	private byte Types;
	/*打包订单号*/
	private String Number;
	/*打包名称（可以是时间）*/
	private String PackName;
	/*当前打包商品总数量*/
	private int GoodsSum;
	/*打包的商品归属商铺编号*/
	private String ShopGuid;
	/*是否删除 0=不未删除 1=已删除*/
	private boolean IsDel;
	/*打包时间*/
	private Date AddDate;

	public Erppacklog() {
		super();
	}
	public Erppacklog(String Guid,byte Types,String Number,String PackName,int GoodsSum,String ShopGuid,boolean IsDel,Date AddDate) {
		this.Guid=Guid;
		this.Types=Types;
		this.Number=Number;
		this.PackName=PackName;
		this.GoodsSum=GoodsSum;
		this.ShopGuid=ShopGuid;
		this.IsDel=IsDel;
		this.AddDate=AddDate;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setTypes(byte Types){
		this.Types=Types;
	}
	public byte getTypes(){
		return Types;
	}
	public void setNumber(String Number){
		this.Number=Number;
	}
	public String getNumber(){
		return Number;
	}
	public void setPackName(String PackName){
		this.PackName=PackName;
	}
	public String getPackName(){
		return PackName;
	}
	public void setGoodsSum(int GoodsSum){
		this.GoodsSum=GoodsSum;
	}
	public int getGoodsSum(){
		return GoodsSum;
	}
	public void setShopGuid(String ShopGuid){
		this.ShopGuid=ShopGuid;
	}
	public String getShopGuid(){
		return ShopGuid;
	}
	public void setIsDel(boolean IsDel){
		this.IsDel=IsDel;
	}
	public boolean getIsDel(){
		return IsDel;
	}
	public void setAddDate(Date AddDate){
		this.AddDate=AddDate;
	}
	public Date getAddDate(){
		return AddDate;
	}
	@Override
	public String toString() {
		return "erppacklog[" + 
			"Guid=" + Guid + 
			", Types=" + Types + 
			", Number=" + Number + 
			", PackName=" + PackName + 
			", GoodsSum=" + GoodsSum + 
			", ShopGuid=" + ShopGuid + 
			", IsDel=" + IsDel + 
			", AddDate=" + AddDate + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

