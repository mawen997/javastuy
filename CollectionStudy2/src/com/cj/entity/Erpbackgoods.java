package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpbackgoods
 * author name: �ź�
 * create time: 2020-07-23 11:47:19
 */ 
public class Erpbackgoods extends EntityHelper{

	/*Ψһ���*/
	private String Guid;
	/*������*/
	private String Number;
	/*�˻��漰�ĵ���*/
	private String ShopGuid;
	/*�˻��漰�Ķ�����*/
	private String OrderNumber;
	/*˭�ύ���˻�*/
	private String AdminGuid;
	/*�˻�����Ʒ*/
	private String GoodsGuid;
	/*�˻�����*/
	private int BackCount;
	/*�˻��Ľ��*/
	private BigDecimal BackMoney;
	/*�˻���״̬ 1=�ύ�˻� 2=���� 3=��� 4=����*/
	private byte Status;
	/*�˻�ԭ��*/
	private String Summary;
	/*�ύ�˻���ʱ��*/
	private Date AddDate;

	public Erpbackgoods() {
		super();
	}
	public Erpbackgoods(String Guid,String Number,String ShopGuid,String OrderNumber,String AdminGuid,String GoodsGuid,int BackCount,BigDecimal BackMoney,byte Status,String Summary,Date AddDate) {
		this.Guid=Guid;
		this.Number=Number;
		this.ShopGuid=ShopGuid;
		this.OrderNumber=OrderNumber;
		this.AdminGuid=AdminGuid;
		this.GoodsGuid=GoodsGuid;
		this.BackCount=BackCount;
		this.BackMoney=BackMoney;
		this.Status=Status;
		this.Summary=Summary;
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
	public void setOrderNumber(String OrderNumber){
		this.OrderNumber=OrderNumber;
	}
	public String getOrderNumber(){
		return OrderNumber;
	}
	public void setAdminGuid(String AdminGuid){
		this.AdminGuid=AdminGuid;
	}
	public String getAdminGuid(){
		return AdminGuid;
	}
	public void setGoodsGuid(String GoodsGuid){
		this.GoodsGuid=GoodsGuid;
	}
	public String getGoodsGuid(){
		return GoodsGuid;
	}
	public void setBackCount(int BackCount){
		this.BackCount=BackCount;
	}
	public int getBackCount(){
		return BackCount;
	}
	public void setBackMoney(BigDecimal BackMoney){
		this.BackMoney=BackMoney;
	}
	public BigDecimal getBackMoney(){
		return BackMoney;
	}
	public void setStatus(byte Status){
		this.Status=Status;
	}
	public byte getStatus(){
		return Status;
	}
	public void setSummary(String Summary){
		this.Summary=Summary;
	}
	public String getSummary(){
		return Summary;
	}
	public void setAddDate(Date AddDate){
		this.AddDate=AddDate;
	}
	public Date getAddDate(){
		return AddDate;
	}
	@Override
	public String toString() {
		return "erpbackgoods[" + 
			"Guid=" + Guid + 
			", Number=" + Number + 
			", ShopGuid=" + ShopGuid + 
			", OrderNumber=" + OrderNumber + 
			", AdminGuid=" + AdminGuid + 
			", GoodsGuid=" + GoodsGuid + 
			", BackCount=" + BackCount + 
			", BackMoney=" + BackMoney + 
			", Status=" + Status + 
			", Summary=" + Summary + 
			", AddDate=" + AddDate + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

