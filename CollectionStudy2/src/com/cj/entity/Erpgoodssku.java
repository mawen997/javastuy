package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpgoodssku
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class Erpgoodssku extends EntityHelper{

	private String Guid;
	/*商品编号*/
	private String GoodsGuid;
	/*条形码*/
	private String Code;
	/*销售价格*/
	private String SalePrice;
	/*折扣价格*/
	private String DisPrice;
	/*库存*/
	private int StockSum;
	/*销售数量*/
	private int SaleSum;
	/*状态 1=正常 2=异常*/
	private byte Status;
	/*品牌编号*/
	private String BrankGuid;
	/*季节编号*/
	private String SeasonGuid;
	/*款式编号*/
	private String StyleGuid;
	/*批次编号*/
	private String BatchGuid;
	/*尺码编号*/
	private String SizeGuid;
	/*是否删除  0=否 1=是*/
	private boolean IsDel;
	/*添加时间*/
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

