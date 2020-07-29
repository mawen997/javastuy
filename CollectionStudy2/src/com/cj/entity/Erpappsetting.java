package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  erpappsetting
 * author name: �ź�
 * create time: 2020-07-23 11:47:19
 */ 
public class Erpappsetting extends EntityHelper{

	private String Guid;
	/*��׿�汾��*/
	private BigDecimal AndroidVersion;
	/*�����ļ�*/
	private String AndroidFile;
	/*Ios�汾��*/
	private BigDecimal IosVersion;
	/*Ios�����ļ���ַ*/
	private String IosFile;
	/*Ios��˿���  0=��/1=��*/
	private byte IosAudit;
	/*ɾ�� 0=��ɾ��/1=ɾ��*/
	private boolean IsDel;
	/*����ʱ��*/
	private Date UpdateDate;

	public Erpappsetting() {
		super();
	}
	public Erpappsetting(String Guid,BigDecimal AndroidVersion,String AndroidFile,BigDecimal IosVersion,String IosFile,byte IosAudit,boolean IsDel,Date UpdateDate) {
		this.Guid=Guid;
		this.AndroidVersion=AndroidVersion;
		this.AndroidFile=AndroidFile;
		this.IosVersion=IosVersion;
		this.IosFile=IosFile;
		this.IosAudit=IosAudit;
		this.IsDel=IsDel;
		this.UpdateDate=UpdateDate;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setAndroidVersion(BigDecimal AndroidVersion){
		this.AndroidVersion=AndroidVersion;
	}
	public BigDecimal getAndroidVersion(){
		return AndroidVersion;
	}
	public void setAndroidFile(String AndroidFile){
		this.AndroidFile=AndroidFile;
	}
	public String getAndroidFile(){
		return AndroidFile;
	}
	public void setIosVersion(BigDecimal IosVersion){
		this.IosVersion=IosVersion;
	}
	public BigDecimal getIosVersion(){
		return IosVersion;
	}
	public void setIosFile(String IosFile){
		this.IosFile=IosFile;
	}
	public String getIosFile(){
		return IosFile;
	}
	public void setIosAudit(byte IosAudit){
		this.IosAudit=IosAudit;
	}
	public byte getIosAudit(){
		return IosAudit;
	}
	public void setIsDel(boolean IsDel){
		this.IsDel=IsDel;
	}
	public boolean getIsDel(){
		return IsDel;
	}
	public void setUpdateDate(Date UpdateDate){
		this.UpdateDate=UpdateDate;
	}
	public Date getUpdateDate(){
		return UpdateDate;
	}
	@Override
	public String toString() {
		return "erpappsetting[" + 
			"Guid=" + Guid + 
			", AndroidVersion=" + AndroidVersion + 
			", AndroidFile=" + AndroidFile + 
			", IosVersion=" + IosVersion + 
			", IosFile=" + IosFile + 
			", IosAudit=" + IosAudit + 
			", IsDel=" + IsDel + 
			", UpdateDate=" + UpdateDate + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

