package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erppush
 * author name: �ź�
 * create time: 2020-07-23 11:47:19
 */ 
public class Erppush extends EntityHelper{

	private String Guid;
	/*���ͷ�ʽ 1=ȫ��  2=ĳ������  3=����֪ͨ*/
	private byte Mode;
	/*1=��ͨ��Ϣ  2=͸����Ϣ*/
	private byte Types;
	/*��Ϣ����*/
	private String Title;
	/*��Ϣ����*/
	private String Summary;
	/*���ʱ��*/
	private Date AddDate;

	public Erppush() {
		super();
	}
	public Erppush(String Guid,byte Mode,byte Types,String Title,String Summary,Date AddDate) {
		this.Guid=Guid;
		this.Mode=Mode;
		this.Types=Types;
		this.Title=Title;
		this.Summary=Summary;
		this.AddDate=AddDate;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setMode(byte Mode){
		this.Mode=Mode;
	}
	public byte getMode(){
		return Mode;
	}
	public void setTypes(byte Types){
		this.Types=Types;
	}
	public byte getTypes(){
		return Types;
	}
	public void setTitle(String Title){
		this.Title=Title;
	}
	public String getTitle(){
		return Title;
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
		return "erppush[" + 
			"Guid=" + Guid + 
			", Mode=" + Mode + 
			", Types=" + Types + 
			", Title=" + Title + 
			", Summary=" + Summary + 
			", AddDate=" + AddDate + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

