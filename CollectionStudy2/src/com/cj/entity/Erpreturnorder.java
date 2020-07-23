package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpreturnorder
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class Erpreturnorder extends EntityHelper{

	private String Guid;
	/*返货订单编号*/
	private String Number;
	/*所属返货店铺*/
	private String ShopGuid;
	/*返货数量*/
	private int GoodsSum;
	/*返货的状态 1=提交返货 2=受理 3=完成 4=其他*/
	private byte Status;
	/*操作人-员工编号*/
	private String StaffGuid;
	/*是否删除 0=否 1=是*/
	private boolean IsDel;
	/*添加返货时间*/
	private Date AddDate;

	public Erpreturnorder() {
		super();
	}
	public Erpreturnorder(String Guid,String Number,String ShopGuid,int GoodsSum,byte Status,String StaffGuid,boolean IsDel,Date AddDate) {
		this.Guid=Guid;
		this.Number=Number;
		this.ShopGuid=ShopGuid;
		this.GoodsSum=GoodsSum;
		this.Status=Status;
		this.StaffGuid=StaffGuid;
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
	public void setShopGuid(String ShopGuid){
		this.ShopGuid=ShopGuid;
	}
	public String getShopGuid(){
		return ShopGuid;
	}
	public void setGoodsSum(int GoodsSum){
		this.GoodsSum=GoodsSum;
	}
	public int getGoodsSum(){
		return GoodsSum;
	}
	public void setStatus(byte Status){
		this.Status=Status;
	}
	public byte getStatus(){
		return Status;
	}
	public void setStaffGuid(String StaffGuid){
		this.StaffGuid=StaffGuid;
	}
	public String getStaffGuid(){
		return StaffGuid;
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
		return "erpreturnorder[" + 
			"Guid=" + Guid + 
			", Number=" + Number + 
			", ShopGuid=" + ShopGuid + 
			", GoodsSum=" + GoodsSum + 
			", Status=" + Status + 
			", StaffGuid=" + StaffGuid + 
			", IsDel=" + IsDel + 
			", AddDate=" + AddDate + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

