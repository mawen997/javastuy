package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  ssc_post_transaction
 * author name: �ź�
 * create time: 2020-07-22 16:11:27
 */ 
public class SscPostTransaction extends EntityHelper{

	private int Id;
	/*��ˮ��*/
	private String TransactionNo;
	/*������*/
	private String OrderNo;
	/*֧��ͨ��*/
	private String PayChannel;
	/*֧����ʽ��1��΢�ţ�*/
	private String PayWay;
	private BigDecimal RealAmount;
	private BigDecimal Amount;
	/*0:�������ף�1:֧���ɹ���2:֧��ʧ�ܣ�3:�˿�ɹ�;4:�˿�ʧ��;*/
	private int PayStatus;
	private Date CreateTime;
	private Date UpdateTime;

	public SscPostTransaction() {
		super();
	}
	public SscPostTransaction(int Id,String TransactionNo,String OrderNo,String PayChannel,String PayWay,BigDecimal RealAmount,BigDecimal Amount,int PayStatus,Date CreateTime,Date UpdateTime) {
		this.Id=Id;
		this.TransactionNo=TransactionNo;
		this.OrderNo=OrderNo;
		this.PayChannel=PayChannel;
		this.PayWay=PayWay;
		this.RealAmount=RealAmount;
		this.Amount=Amount;
		this.PayStatus=PayStatus;
		this.CreateTime=CreateTime;
		this.UpdateTime=UpdateTime;
	}
	public void setId(int Id){
		this.Id=Id;
	}
	public int getId(){
		return Id;
	}
	public void setTransactionNo(String TransactionNo){
		this.TransactionNo=TransactionNo;
	}
	public String getTransactionNo(){
		return TransactionNo;
	}
	public void setOrderNo(String OrderNo){
		this.OrderNo=OrderNo;
	}
	public String getOrderNo(){
		return OrderNo;
	}
	public void setPayChannel(String PayChannel){
		this.PayChannel=PayChannel;
	}
	public String getPayChannel(){
		return PayChannel;
	}
	public void setPayWay(String PayWay){
		this.PayWay=PayWay;
	}
	public String getPayWay(){
		return PayWay;
	}
	public void setRealAmount(BigDecimal RealAmount){
		this.RealAmount=RealAmount;
	}
	public BigDecimal getRealAmount(){
		return RealAmount;
	}
	public void setAmount(BigDecimal Amount){
		this.Amount=Amount;
	}
	public BigDecimal getAmount(){
		return Amount;
	}
	public void setPayStatus(int PayStatus){
		this.PayStatus=PayStatus;
	}
	public int getPayStatus(){
		return PayStatus;
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
		return "ssc_post_transaction[" + 
			"Id=" + Id + 
			", TransactionNo=" + TransactionNo + 
			", OrderNo=" + OrderNo + 
			", PayChannel=" + PayChannel + 
			", PayWay=" + PayWay + 
			", RealAmount=" + RealAmount + 
			", Amount=" + Amount + 
			", PayStatus=" + PayStatus + 
			", CreateTime=" + CreateTime + 
			", UpdateTime=" + UpdateTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

