package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erppurchasegoods
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class Erppurchasegoods extends EntityHelper{

	/*采购商品表唯一编号*/
	private String Guid;
	/*物品属于哪个采购单*/
	private String PurchaseGuid;
	/*物品编号*/
	private String Number;
	/*物品名称*/
	private String Name;
	/*规格型号*/
	private String Specification;
	/*单位*/
	private String Unit;
	/*采购数量*/
	private int Quantity;
	/*单价*/
	private BigDecimal Price;
	/*是否删除 0=否 1=是*/
	private boolean IsDel;
	/*备注*/
	private String Summary;

	public Erppurchasegoods() {
		super();
	}
	public Erppurchasegoods(String Guid,String PurchaseGuid,String Number,String Name,String Specification,String Unit,int Quantity,BigDecimal Price,boolean IsDel,String Summary) {
		this.Guid=Guid;
		this.PurchaseGuid=PurchaseGuid;
		this.Number=Number;
		this.Name=Name;
		this.Specification=Specification;
		this.Unit=Unit;
		this.Quantity=Quantity;
		this.Price=Price;
		this.IsDel=IsDel;
		this.Summary=Summary;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setPurchaseGuid(String PurchaseGuid){
		this.PurchaseGuid=PurchaseGuid;
	}
	public String getPurchaseGuid(){
		return PurchaseGuid;
	}
	public void setNumber(String Number){
		this.Number=Number;
	}
	public String getNumber(){
		return Number;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setSpecification(String Specification){
		this.Specification=Specification;
	}
	public String getSpecification(){
		return Specification;
	}
	public void setUnit(String Unit){
		this.Unit=Unit;
	}
	public String getUnit(){
		return Unit;
	}
	public void setQuantity(int Quantity){
		this.Quantity=Quantity;
	}
	public int getQuantity(){
		return Quantity;
	}
	public void setPrice(BigDecimal Price){
		this.Price=Price;
	}
	public BigDecimal getPrice(){
		return Price;
	}
	public void setIsDel(boolean IsDel){
		this.IsDel=IsDel;
	}
	public boolean getIsDel(){
		return IsDel;
	}
	public void setSummary(String Summary){
		this.Summary=Summary;
	}
	public String getSummary(){
		return Summary;
	}
	@Override
	public String toString() {
		return "erppurchasegoods[" + 
			"Guid=" + Guid + 
			", PurchaseGuid=" + PurchaseGuid + 
			", Number=" + Number + 
			", Name=" + Name + 
			", Specification=" + Specification + 
			", Unit=" + Unit + 
			", Quantity=" + Quantity + 
			", Price=" + Price + 
			", IsDel=" + IsDel + 
			", Summary=" + Summary + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

