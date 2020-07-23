package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpinoutlog
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class Erpinoutlog extends EntityHelper{

	private String Guid;
	/*类型 1=入库 2=出库*/
	private byte Types;
	/*入库类型  1=入库单方式  2=调拨方式*/
	private byte InTypes;
	/*出入库打包日志的编号*/
	private String PackGuid;
	/*出库商品到店铺的编号*/
	private String ShopGuid;
	/*商品SKU的唯一编号*/
	private String GoodsGuid;
	private String GoodsSku;
	/*出入库商品的数量*/
	private int GoodsSum;
	/*后台管理人员的编号*/
	private String AdminGuid;
	/*出入库的时间*/
	private Date AddDate;

	public Erpinoutlog() {
		super();
	}
	public Erpinoutlog(String Guid,byte Types,byte InTypes,String PackGuid,String ShopGuid,String GoodsGuid,String GoodsSku,int GoodsSum,String AdminGuid,Date AddDate) {
		this.Guid=Guid;
		this.Types=Types;
		this.InTypes=InTypes;
		this.PackGuid=PackGuid;
		this.ShopGuid=ShopGuid;
		this.GoodsGuid=GoodsGuid;
		this.GoodsSku=GoodsSku;
		this.GoodsSum=GoodsSum;
		this.AdminGuid=AdminGuid;
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
	public void setInTypes(byte InTypes){
		this.InTypes=InTypes;
	}
	public byte getInTypes(){
		return InTypes;
	}
	public void setPackGuid(String PackGuid){
		this.PackGuid=PackGuid;
	}
	public String getPackGuid(){
		return PackGuid;
	}
	public void setShopGuid(String ShopGuid){
		this.ShopGuid=ShopGuid;
	}
	public String getShopGuid(){
		return ShopGuid;
	}
	public void setGoodsGuid(String GoodsGuid){
		this.GoodsGuid=GoodsGuid;
	}
	public String getGoodsGuid(){
		return GoodsGuid;
	}
	public void setGoodsSku(String GoodsSku){
		this.GoodsSku=GoodsSku;
	}
	public String getGoodsSku(){
		return GoodsSku;
	}
	public void setGoodsSum(int GoodsSum){
		this.GoodsSum=GoodsSum;
	}
	public int getGoodsSum(){
		return GoodsSum;
	}
	public void setAdminGuid(String AdminGuid){
		this.AdminGuid=AdminGuid;
	}
	public String getAdminGuid(){
		return AdminGuid;
	}
	public void setAddDate(Date AddDate){
		this.AddDate=AddDate;
	}
	public Date getAddDate(){
		return AddDate;
	}
	@Override
	public String toString() {
		return "erpinoutlog[" + 
			"Guid=" + Guid + 
			", Types=" + Types + 
			", InTypes=" + InTypes + 
			", PackGuid=" + PackGuid + 
			", ShopGuid=" + ShopGuid + 
			", GoodsGuid=" + GoodsGuid + 
			", GoodsSku=" + GoodsSku + 
			", GoodsSum=" + GoodsSum + 
			", AdminGuid=" + AdminGuid + 
			", AddDate=" + AddDate + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

