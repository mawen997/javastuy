package com.cj.entity;

import java.util.Date;
/**
 * table name:  bankcode
 * author name: �ź�
 * create time: 2020-07-22 16:11:27
 */ 
public class Bankcode extends EntityHelper{

	private int Id;
	/*����ֵ*/
	private String Code;
	/*���ı�ʶ*/
	private String Chinesecode;
	/*�Ƿ�ɾ��*/
	private int Isdelete;
	/*����ʱ��*/
	private null CreateTime;

	public Bankcode() {
		super();
	}
	public Bankcode(int Id,String Code,String Chinesecode,int Isdelete,null CreateTime) {
		this.Id=Id;
		this.Code=Code;
		this.Chinesecode=Chinesecode;
		this.Isdelete=Isdelete;
		this.CreateTime=CreateTime;
	}
	public void setId(int Id){
		this.Id=Id;
	}
	public int getId(){
		return Id;
	}
	public void setCode(String Code){
		this.Code=Code;
	}
	public String getCode(){
		return Code;
	}
	public void setChinesecode(String Chinesecode){
		this.Chinesecode=Chinesecode;
	}
	public String getChinesecode(){
		return Chinesecode;
	}
	public void setIsdelete(int Isdelete){
		this.Isdelete=Isdelete;
	}
	public int getIsdelete(){
		return Isdelete;
	}
	public void setCreateTime(null CreateTime){
		this.CreateTime=CreateTime;
	}
	public null getCreateTime(){
		return CreateTime;
	}
	@Override
	public String toString() {
		return "bankcode[" + 
			"Id=" + Id + 
			", Code=" + Code + 
			", Chinesecode=" + Chinesecode + 
			", Isdelete=" + Isdelete + 
			", CreateTime=" + CreateTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

