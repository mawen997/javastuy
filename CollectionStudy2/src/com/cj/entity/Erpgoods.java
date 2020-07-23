package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpgoods
 * author name: �ź�
 * create time: 2020-07-22 16:11:27
 */ 
public class Erpgoods extends EntityHelper{

	private String Guid;
	/*��Ʒ����*/
	private String Title;
	/*Ʒ��*/
	private String Brank;
	/*���*/
	private String Style;
	/*��Ʒ����ͼ*/
	private String Cover;
	/*״̬ 1=�ϼ�  2=�¼�  3=����*/
	private byte Status;
	/*�������*/
	private String Attribute;
	/*�Ƿ�ɾ��  0=�� 1=��*/
	private boolean IsDel;
	/*���ʱ��*/
	private Date AddDate;

	public Erpgoods() {
		super();
	}
	public Erpgoods(String Guid,String Title,String Brank,String Style,String Cover,byte Status,String Attribute,boolean IsDel,Date AddDate) {
		this.Guid=Guid;
		this.Title=Title;
		this.Brank=Brank;
		this.Style=Style;
		this.Cover=Cover;
		this.Status=Status;
		this.Attribute=Attribute;
		this.IsDel=IsDel;
		this.AddDate=AddDate;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setTitle(String Title){
		this.Title=Title;
	}
	public String getTitle(){
		return Title;
	}
	public void setBrank(String Brank){
		this.Brank=Brank;
	}
	public String getBrank(){
		return Brank;
	}
	public void setStyle(String Style){
		this.Style=Style;
	}
	public String getStyle(){
		return Style;
	}
	public void setCover(String Cover){
		this.Cover=Cover;
	}
	public String getCover(){
		return Cover;
	}
	public void setStatus(byte Status){
		this.Status=Status;
	}
	public byte getStatus(){
		return Status;
	}
	public void setAttribute(String Attribute){
		this.Attribute=Attribute;
	}
	public String getAttribute(){
		return Attribute;
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
		return "erpgoods[" + 
			"Guid=" + Guid + 
			", Title=" + Title + 
			", Brank=" + Brank + 
			", Style=" + Style + 
			", Cover=" + Cover + 
			", Status=" + Status + 
			", Attribute=" + Attribute + 
			", IsDel=" + IsDel + 
			", AddDate=" + AddDate + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

