package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erptransfer
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class Erptransfer extends EntityHelper{

	private String Guid;
	/*编号*/
	private String Number;
	/*入库加盟商*/
	private String InShopGuid;
	/*出库加盟商*/
	private String OutShopGuid;
	/*商品数量*/
	private int GoodsSum;
	/*操作人*/
	private String AdminGuid;
	/*是否删除*/
	private boolean IsDel;
	/*添加时间*/
	private Date AddDate;

	public Erptransfer() {
		super();
	}
	public Erptransfer(String Guid,String Number,String InShopGuid,String OutShopGuid,int GoodsSum,String AdminGuid,boolean IsDel,Date AddDate) {
		this.Guid=Guid;
		this.Number=Number;
		this.InShopGuid=InShopGuid;
		this.OutShopGuid=OutShopGuid;
		this.GoodsSum=GoodsSum;
		this.AdminGuid=AdminGuid;
		this.IsDel=IsDel;
		this.AddDate=AddDate;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setNumber(String Number){
		this.Number=Number;
	}
	public String getNumber(){
		return Number;
	}
	public void setInShopGuid(String InShopGuid){
		this.InShopGuid=InShopGuid;
	}
	public String getInShopGuid(){
		return InShopGuid;
	}
	public void setOutShopGuid(String OutShopGuid){
		this.OutShopGuid=OutShopGuid;
	}
	public String getOutShopGuid(){
		return OutShopGuid;
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
		return "erptransfer[" + 
			"Guid=" + Guid + 
			", Number=" + Number + 
			", InShopGuid=" + InShopGuid + 
			", OutShopGuid=" + OutShopGuid + 
			", GoodsSum=" + GoodsSum + 
			", AdminGuid=" + AdminGuid + 
			", IsDel=" + IsDel + 
			", AddDate=" + AddDate + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

