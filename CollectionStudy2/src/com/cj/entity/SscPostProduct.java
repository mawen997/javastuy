package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  ssc_post_product
 * author name: ÄÅº°
 * create time: 2020-07-23 11:47:19
 */ 
public class SscPostProduct extends EntityHelper{

	private int Id;
	/*ÉÌÆ·Ãû³Æ*/
	private String Name;
	private BigDecimal Price;
	private BigDecimal SpecificPrice;
	private Date CreateTime;
	private Date UpdateTime;

	public SscPostProduct() {
		super();
	}
	public SscPostProduct(int Id,String Name,BigDecimal Price,BigDecimal SpecificPrice,Date CreateTime,Date UpdateTime) {
		this.Id=Id;
		this.Name=Name;
		this.Price=Price;
		this.SpecificPrice=SpecificPrice;
		this.CreateTime=CreateTime;
		this.UpdateTime=UpdateTime;
	}
	public void setId(int Id){
		this.Id=Id;
	}
	public int getId(){
		return Id;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setPrice(BigDecimal Price){
		this.Price=Price;
	}
	public BigDecimal getPrice(){
		return Price;
	}
	public void setSpecificPrice(BigDecimal SpecificPrice){
		this.SpecificPrice=SpecificPrice;
	}
	public BigDecimal getSpecificPrice(){
		return SpecificPrice;
	}
	public void setCreateTime(Date CreateTime){
		this.CreateTime=CreateTime;
	}
	public Date getCreateTime(){
		return CreateTime;
	}
	public void setUpdateTime(Date UpdateTime){
		this.UpdateTime=UpdateTime;
	}
	public Date getUpdateTime(){
		return UpdateTime;
	}
	@Override
	public String toString() {
		return "ssc_post_product[" + 
			"Id=" + Id + 
			", Name=" + Name + 
			", Price=" + Price + 
			", SpecificPrice=" + SpecificPrice + 
			", CreateTime=" + CreateTime + 
			", UpdateTime=" + UpdateTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

