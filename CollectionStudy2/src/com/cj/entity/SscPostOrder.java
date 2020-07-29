package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  ssc_post_order
 * author name: �ź�
 * create time: 2020-07-23 11:47:19
 */ 
public class SscPostOrder extends EntityHelper{

	private long Id;
	/*������*/
	private String OrderNo;
	/*�������ţ������ظ�*/
	private String CardOrderNo;
	/*1:δ֧��,2��֧����,3��֧���ɹ�,4��֧��ʧ��,5������,6��������,7���������,8������ȡ��,9������ʧ��,10�����˿�,11���˿�ɹ�,12���˿�ʧ�ܣ�*/
	private int OrderStatus;
	/*1�����ͨ����2�����ʧ��*/
	private int OrderCheckStatus;
	/*�����۸�*/
	private BigDecimal OrderPrice;
	/*��ƷID*/
	private int ProductId;
	/*�ʼĶ���ID*/
	private long ConsigneeId;
	/*�������*/
	private String LogisticsName;
	/*��ݹ�˾����*/
	private String LogisticsCode;
	/*����˵���*/
	private String LogisticsNo;
	/*΢��OpenID*/
	private String OpenId;
	/*�ռ���*/
	private String Name;
	/*���֤��*/
	private String IdentityCard;
	/*0-������ 1-������ 2-������*/
	private int OrderState;
	/*�α���*/
	private String InsuredName;
	/*�˿�˵��*/
	private String Remark;
	/*�˿�ʱ��*/
	private Date TuiKuanTime;
	/*�˿������*/
	private int OperatorId;
	/*IP��ַ*/
	private String IP;
	/*���ʱ��*/
	private Date AuditTime;
	/*֧����ʽ(0-Ĭ�ϣ�1-����֧��)*/
	private int PayWay;
	/*��ȡ��ʽ(0-ûѡ����ȡ��ʽ��1-�����쿨��2-EMS)*/
	private int GetWay;
	/*����ʱ��*/
	private Date CreateTime;
	/*����ʱ��*/
	private Date UpdateTime;

	public SscPostOrder() {
		super();
	}
	public SscPostOrder(long Id,String OrderNo,String CardOrderNo,int OrderStatus,int OrderCheckStatus,BigDecimal OrderPrice,int ProductId,long ConsigneeId,String LogisticsName,String LogisticsCode,String LogisticsNo,String OpenId,String Name,String IdentityCard,int OrderState,String InsuredName,String Remark,Date TuiKuanTime,int OperatorId,String IP,Date AuditTime,int PayWay,int GetWay,Date CreateTime,Date UpdateTime) {
		this.Id=Id;
		this.OrderNo=OrderNo;
		this.CardOrderNo=CardOrderNo;
		this.OrderStatus=OrderStatus;
		this.OrderCheckStatus=OrderCheckStatus;
		this.OrderPrice=OrderPrice;
		this.ProductId=ProductId;
		this.ConsigneeId=ConsigneeId;
		this.LogisticsName=LogisticsName;
		this.LogisticsCode=LogisticsCode;
		this.LogisticsNo=LogisticsNo;
		this.OpenId=OpenId;
		this.Name=Name;
		this.IdentityCard=IdentityCard;
		this.OrderState=OrderState;
		this.InsuredName=InsuredName;
		this.Remark=Remark;
		this.TuiKuanTime=TuiKuanTime;
		this.OperatorId=OperatorId;
		this.IP=IP;
		this.AuditTime=AuditTime;
		this.PayWay=PayWay;
		this.GetWay=GetWay;
		this.CreateTime=CreateTime;
		this.UpdateTime=UpdateTime;
	}
	public void setId(long Id){
		this.Id=Id;
	}
	public long getId(){
		return Id;
	}
	public void setOrderNo(String OrderNo){
		this.OrderNo=OrderNo;
	}
	public String getOrderNo(){
		return OrderNo;
	}
	public void setCardOrderNo(String CardOrderNo){
		this.CardOrderNo=CardOrderNo;
	}
	public String getCardOrderNo(){
		return CardOrderNo;
	}
	public void setOrderStatus(int OrderStatus){
		this.OrderStatus=OrderStatus;
	}
	public int getOrderStatus(){
		return OrderStatus;
	}
	public void setOrderCheckStatus(int OrderCheckStatus){
		this.OrderCheckStatus=OrderCheckStatus;
	}
	public int getOrderCheckStatus(){
		return OrderCheckStatus;
	}
	public void setOrderPrice(BigDecimal OrderPrice){
		this.OrderPrice=OrderPrice;
	}
	public BigDecimal getOrderPrice(){
		return OrderPrice;
	}
	public void setProductId(int ProductId){
		this.ProductId=ProductId;
	}
	public int getProductId(){
		return ProductId;
	}
	public void setConsigneeId(long ConsigneeId){
		this.ConsigneeId=ConsigneeId;
	}
	public long getConsigneeId(){
		return ConsigneeId;
	}
	public void setLogisticsName(String LogisticsName){
		this.LogisticsName=LogisticsName;
	}
	public String getLogisticsName(){
		return LogisticsName;
	}
	public void setLogisticsCode(String LogisticsCode){
		this.LogisticsCode=LogisticsCode;
	}
	public String getLogisticsCode(){
		return LogisticsCode;
	}
	public void setLogisticsNo(String LogisticsNo){
		this.LogisticsNo=LogisticsNo;
	}
	public String getLogisticsNo(){
		return LogisticsNo;
	}
	public void setOpenId(String OpenId){
		this.OpenId=OpenId;
	}
	public String getOpenId(){
		return OpenId;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setIdentityCard(String IdentityCard){
		this.IdentityCard=IdentityCard;
	}
	public String getIdentityCard(){
		return IdentityCard;
	}
	public void setOrderState(int OrderState){
		this.OrderState=OrderState;
	}
	public int getOrderState(){
		return OrderState;
	}
	public void setInsuredName(String InsuredName){
		this.InsuredName=InsuredName;
	}
	public String getInsuredName(){
		return InsuredName;
	}
	public void setRemark(String Remark){
		this.Remark=Remark;
	}
	public String getRemark(){
		return Remark;
	}
	public void setTuiKuanTime(Date TuiKuanTime){
		this.TuiKuanTime=TuiKuanTime;
	}
	public Date getTuiKuanTime(){
		return TuiKuanTime;
	}
	public void setOperatorId(int OperatorId){
		this.OperatorId=OperatorId;
	}
	public int getOperatorId(){
		return OperatorId;
	}
	public void setIP(String IP){
		this.IP=IP;
	}
	public String getIP(){
		return IP;
	}
	public void setAuditTime(Date AuditTime){
		this.AuditTime=AuditTime;
	}
	public Date getAuditTime(){
		return AuditTime;
	}
	public void setPayWay(int PayWay){
		this.PayWay=PayWay;
	}
	public int getPayWay(){
		return PayWay;
	}
	public void setGetWay(int GetWay){
		this.GetWay=GetWay;
	}
	public int getGetWay(){
		return GetWay;
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
		return "ssc_post_order[" + 
			"Id=" + Id + 
			", OrderNo=" + OrderNo + 
			", CardOrderNo=" + CardOrderNo + 
			", OrderStatus=" + OrderStatus + 
			", OrderCheckStatus=" + OrderCheckStatus + 
			", OrderPrice=" + OrderPrice + 
			", ProductId=" + ProductId + 
			", ConsigneeId=" + ConsigneeId + 
			", LogisticsName=" + LogisticsName + 
			", LogisticsCode=" + LogisticsCode + 
			", LogisticsNo=" + LogisticsNo + 
			", OpenId=" + OpenId + 
			", Name=" + Name + 
			", IdentityCard=" + IdentityCard + 
			", OrderState=" + OrderState + 
			", InsuredName=" + InsuredName + 
			", Remark=" + Remark + 
			", TuiKuanTime=" + TuiKuanTime + 
			", OperatorId=" + OperatorId + 
			", IP=" + IP + 
			", AuditTime=" + AuditTime + 
			", PayWay=" + PayWay + 
			", GetWay=" + GetWay + 
			", CreateTime=" + CreateTime + 
			", UpdateTime=" + UpdateTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

