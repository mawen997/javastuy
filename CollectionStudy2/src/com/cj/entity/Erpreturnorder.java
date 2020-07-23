package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpreturnorder
 * author name: �ź�
 * create time: 2020-07-22 16:11:27
 */ 
public class Erpreturnorder extends EntityHelper{

	private String Guid;
	/*�����������*/
	private String Number;
	/*������������*/
	private String ShopGuid;
	/*��������*/
	private int GoodsSum;
	/*������״̬ 1=�ύ���� 2=���� 3=��� 4=����*/
	private byte Status;
	/*������-Ա�����*/
	private String StaffGuid;
	/*�Ƿ�ɾ�� 0=�� 1=��*/
	private boolean IsDel;
	/*��ӷ���ʱ��*/
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

