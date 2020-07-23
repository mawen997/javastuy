package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  ssc_post_consignee
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class SscPostConsignee extends EntityHelper{

	private long Id;
	/*姓名*/
	private String Name;
	/*订单号*/
	private String OrderNo;
	/*身份证号*/
	private String IdentityCard;
	/*手机号*/
	private String Phone;
	/*省编码*/
	private String ProvinceCode;
	/*省*/
	private String Province;
	/*市编码*/
	private String CityCode;
	/*市*/
	private String City;
	/*区域编码*/
	private String AreaCode;
	/*区域*/
	private String Area;
	/*街道编码*/
	private String StreetCode;
	/*街道*/
	private String Street;
	/*地址*/
	private String Address;
	/*邮政编码*/
	private String PostCode;
	/*创建时间*/
	private null CreateTime;
	/*更新时间*/
	private null UpdateTime;

	public SscPostConsignee() {
		super();
	}
	public SscPostConsignee(long Id,String Name,String OrderNo,String IdentityCard,String Phone,String ProvinceCode,String Province,String CityCode,String City,String AreaCode,String Area,String StreetCode,String Street,String Address,String PostCode,null CreateTime,null UpdateTime) {
		this.Id=Id;
		this.Name=Name;
		this.OrderNo=OrderNo;
		this.IdentityCard=IdentityCard;
		this.Phone=Phone;
		this.ProvinceCode=ProvinceCode;
		this.Province=Province;
		this.CityCode=CityCode;
		this.City=City;
		this.AreaCode=AreaCode;
		this.Area=Area;
		this.StreetCode=StreetCode;
		this.Street=Street;
		this.Address=Address;
		this.PostCode=PostCode;
		this.CreateTime=CreateTime;
		this.UpdateTime=UpdateTime;
	}
	public void setId(long Id){
		this.Id=Id;
	}
	public long getId(){
		return Id;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setOrderNo(String OrderNo){
		this.OrderNo=OrderNo;
	}
	public String getOrderNo(){
		return OrderNo;
	}
	public void setIdentityCard(String IdentityCard){
		this.IdentityCard=IdentityCard;
	}
	public String getIdentityCard(){
		return IdentityCard;
	}
	public void setPhone(String Phone){
		this.Phone=Phone;
	}
	public String getPhone(){
		return Phone;
	}
	public void setProvinceCode(String ProvinceCode){
		this.ProvinceCode=ProvinceCode;
	}
	public String getProvinceCode(){
		return ProvinceCode;
	}
	public void setProvince(String Province){
		this.Province=Province;
	}
	public String getProvince(){
		return Province;
	}
	public void setCityCode(String CityCode){
		this.CityCode=CityCode;
	}
	public String getCityCode(){
		return CityCode;
	}
	public void setCity(String City){
		this.City=City;
	}
	public String getCity(){
		return City;
	}
	public void setAreaCode(String AreaCode){
		this.AreaCode=AreaCode;
	}
	public String getAreaCode(){
		return AreaCode;
	}
	public void setArea(String Area){
		this.Area=Area;
	}
	public String getArea(){
		return Area;
	}
	public void setStreetCode(String StreetCode){
		this.StreetCode=StreetCode;
	}
	public String getStreetCode(){
		return StreetCode;
	}
	public void setStreet(String Street){
		this.Street=Street;
	}
	public String getStreet(){
		return Street;
	}
	public void setAddress(String Address){
		this.Address=Address;
	}
	public String getAddress(){
		return Address;
	}
	public void setPostCode(String PostCode){
		this.PostCode=PostCode;
	}
	public String getPostCode(){
		return PostCode;
	}
	public void setCreateTime(null CreateTime){
		this.CreateTime=CreateTime;
	}
	public null getCreateTime(){
		return CreateTime;
	}
	public void setUpdateTime(null UpdateTime){
		this.UpdateTime=UpdateTime;
	}
	public null getUpdateTime(){
		return UpdateTime;
	}
	@Override
	public String toString() {
		return "ssc_post_consignee[" + 
			"Id=" + Id + 
			", Name=" + Name + 
			", OrderNo=" + OrderNo + 
			", IdentityCard=" + IdentityCard + 
			", Phone=" + Phone + 
			", ProvinceCode=" + ProvinceCode + 
			", Province=" + Province + 
			", CityCode=" + CityCode + 
			", City=" + City + 
			", AreaCode=" + AreaCode + 
			", Area=" + Area + 
			", StreetCode=" + StreetCode + 
			", Street=" + Street + 
			", Address=" + Address + 
			", PostCode=" + PostCode + 
			", CreateTime=" + CreateTime + 
			", UpdateTime=" + UpdateTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

