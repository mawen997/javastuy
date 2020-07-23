package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpgoodssku
 * author name: �ź�
 * create time: 2020-07-22 16:11:27
 */ 
public class Erpgoodssku extends EntityHelper{

	private String Guid;
	/*��Ʒ���*/
	private String GoodsGuid;
	/*������*/
	private String Code;
	/*���ۼ۸�*/
	private String SalePrice;
	/*�ۿۼ۸�*/
	private String DisPrice;
	/*���*/
	private int StockSum;
	/*��������*/
	private int SaleSum;
	/*״̬ 1=���� 2=�쳣*/
	private byte Status;
	/*Ʒ�Ʊ��*/
	private String BrankGuid;
	/*���ڱ��*/
	private String SeasonGuid;
	/*��ʽ���*/
	private String StyleGuid;
	/*���α��*/
	private String BatchGuid;
	/*������*/
	private String SizeGuid;
	/*�Ƿ�ɾ��  0=�� 1=��*/
	private boolean IsDel;
	/*���ʱ��*/
	private Date AddDate;

	public Erpgoodssku() {
		super();
	}
	public Erpgoodssku(String Guid,String GoodsGuid,String Code,String SalePrice,String DisPrice,int StockSum,int SaleSum,byte Status,String BrankGuid,String SeasonGuid,String StyleGuid,String BatchGuid,String SizeGuid,boolean IsDel,Date AddDate) {
		this.Guid=Guid;
		this.GoodsGuid=GoodsGuid;
		this.Code=Code;
		this.SalePrice=SalePrice;
		this.DisPrice=DisPrice;
		this.StockSum=StockSum;
		this.SaleSum=SaleSum;
		this.Status=Status;
		this.BrankGuid=BrankGuid;
		this.SeasonGuid=SeasonGuid;
		this.StyleGuid=StyleGuid;
		this.BatchGuid=BatchGuid;
		this.SizeGuid=SizeGuid;
		this.IsDel=IsDel;
		this.AddDate=AddDate;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setGoodsGuid(String GoodsGuid){
		this.GoodsGuid=GoodsGuid;
	}
	public String getGoodsGuid(){
		return GoodsGuid;
	}
	public void setCode(String Code){
		this.Code=Code;
	}
	public String getCode(){
		return Code;
	}
	public void setSalePrice(String SalePrice){
		this.SalePrice=SalePrice;
	}
	public String getSalePrice(){
		return SalePrice;
	}
	public void setDisPrice(String DisPrice){
		this.DisPrice=DisPrice;
	}
	public String getDisPrice(){
		return DisPrice;
	}
	public void setStockSum(int StockSum){
		this.StockSum=StockSum;
	}
	public int getStockSum(){
		return StockSum;
	}
	public void setSaleSum(int SaleSum){
		this.SaleSum=SaleSum;
	}
	public int getSaleSum(){
		return SaleSum;
	}
	public void setStatus(byte Status){
		this.Status=Status;
	}
	public byte getStatus(){
		return Status;
	}
	public void setBrankGuid(String BrankGuid){
		this.BrankGuid=BrankGuid;
	}
	public String getBrankGuid(){
		return BrankGuid;
	}
	public void setSeasonGuid(String SeasonGuid){
		this.SeasonGuid=SeasonGuid;
	}
	public String getSeasonGuid(){
		return SeasonGuid;
	}
	public void setStyleGuid(String StyleGuid){
		this.StyleGuid=StyleGuid;
	}
	public String getStyleGuid(){
		return StyleGuid;
	}
	public void setBatchGuid(String BatchGuid){
		this.BatchGuid=BatchGuid;
	}
	public String getBatchGuid(){
		return BatchGuid;
	}
	public void setSizeGuid(String SizeGuid){
		this.SizeGuid=SizeGuid;
	}
	public String getSizeGuid(){
		return SizeGuid;
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
		return "erpgoodssku[" + 
			"Guid=" + Guid + 
			", GoodsGuid=" + GoodsGuid + 
			", Code=" + Code + 
			", SalePrice=" + SalePrice + 
			", DisPrice=" + DisPrice + 
			", StockSum=" + StockSum + 
			", SaleSum=" + SaleSum + 
			", Status=" + Status + 
			", BrankGuid=" + BrankGuid + 
			", SeasonGuid=" + SeasonGuid + 
			", StyleGuid=" + StyleGuid + 
			", BatchGuid=" + BatchGuid + 
			", SizeGuid=" + SizeGuid + 
			", IsDel=" + IsDel + 
			", AddDate=" + AddDate + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

