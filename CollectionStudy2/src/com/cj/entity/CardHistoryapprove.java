package com.cj.entity;

import java.util.Date;
/**
 * table name:  card_historyapprove
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class CardHistoryapprove extends EntityHelper{

	private long Id;
	/*补卡或者用户id*/
	private String CardOperator_Id;
	/*卡申请订单号*/
	private String CardOrderNo;
	/*审批时间*/
	private Date Approve_DateTime;
	/*审批状态*/
	private int Approve_Status;
	/*审批人*/
	private String Approve_Users;
	/*审批说明*/
	private String Approve_Opinion;
	/*审批类型 */
	private String ApproveStatus;
	private String Reserve1;
	private String Reserve2;

	public CardHistoryapprove() {
		super();
	}
	public CardHistoryapprove(long Id,String CardOperator_Id,String CardOrderNo,Date Approve_DateTime,int Approve_Status,String Approve_Users,String Approve_Opinion,String ApproveStatus,String Reserve1,String Reserve2) {
		this.Id=Id;
		this.CardOperator_Id=CardOperator_Id;
		this.CardOrderNo=CardOrderNo;
		this.Approve_DateTime=Approve_DateTime;
		this.Approve_Status=Approve_Status;
		this.Approve_Users=Approve_Users;
		this.Approve_Opinion=Approve_Opinion;
		this.ApproveStatus=ApproveStatus;
		this.Reserve1=Reserve1;
		this.Reserve2=Reserve2;
	}
	public void setId(long Id){
		this.Id=Id;
	}
	public long getId(){
		return Id;
	}
	public void setCardOperator_Id(String CardOperator_Id){
		this.CardOperator_Id=CardOperator_Id;
	}
	public String getCardOperator_Id(){
		return CardOperator_Id;
	}
	public void setCardOrderNo(String CardOrderNo){
		this.CardOrderNo=CardOrderNo;
	}
	public String getCardOrderNo(){
		return CardOrderNo;
	}
	public void setApprove_DateTime(Date Approve_DateTime){
		this.Approve_DateTime=Approve_DateTime;
	}
	public Date getApprove_DateTime(){
		return Approve_DateTime;
	}
	public void setApprove_Status(int Approve_Status){
		this.Approve_Status=Approve_Status;
	}
	public int getApprove_Status(){
		return Approve_Status;
	}
	public void setApprove_Users(String Approve_Users){
		this.Approve_Users=Approve_Users;
	}
	public String getApprove_Users(){
		return Approve_Users;
	}
	public void setApprove_Opinion(String Approve_Opinion){
		this.Approve_Opinion=Approve_Opinion;
	}
	public String getApprove_Opinion(){
		return Approve_Opinion;
	}
	public void setApproveStatus(String ApproveStatus){
		this.ApproveStatus=ApproveStatus;
	}
	public String getApproveStatus(){
		return ApproveStatus;
	}
	public void setReserve1(String Reserve1){
		this.Reserve1=Reserve1;
	}
	public String getReserve1(){
		return Reserve1;
	}
	public void setReserve2(String Reserve2){
		this.Reserve2=Reserve2;
	}
	public String getReserve2(){
		return Reserve2;
	}
	@Override
	public String toString() {
		return "card_historyapprove[" + 
			"Id=" + Id + 
			", CardOperator_Id=" + CardOperator_Id + 
			", CardOrderNo=" + CardOrderNo + 
			", Approve_DateTime=" + Approve_DateTime + 
			", Approve_Status=" + Approve_Status + 
			", Approve_Users=" + Approve_Users + 
			", Approve_Opinion=" + Approve_Opinion + 
			", ApproveStatus=" + ApproveStatus + 
			", Reserve1=" + Reserve1 + 
			", Reserve2=" + Reserve2 + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

