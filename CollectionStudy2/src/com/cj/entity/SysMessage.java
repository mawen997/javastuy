package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  sys_message
 * author name: �ź�
 * create time: 2020-07-23 11:47:19
 */ 
public class SysMessage extends EntityHelper{

	/*����ID*/
	private int Id;
	/*��Ϣ���ͣ�1-ʵ����֤���֪ͨ��2-���������֤���֪ͨ��*/
	private int MsgType;
	/*����*/
	private String Title;
	/*����*/
	private String Content;
	/*��Ϣ��0-δ����1-�Ѷ���*/
	private int IsRead;
	/*������*/
	private String GuidCode;
	private Date CreateTime;
	private Date UpdateTime;

	public SysMessage() {
		super();
	}
	public SysMessage(int Id,int MsgType,String Title,String Content,int IsRead,String GuidCode,Date CreateTime,Date UpdateTime) {
		this.Id=Id;
		this.MsgType=MsgType;
		this.Title=Title;
		this.Content=Content;
		this.IsRead=IsRead;
		this.GuidCode=GuidCode;
		this.CreateTime=CreateTime;
		this.UpdateTime=UpdateTime;
	}
	public void setId(int Id){
		this.Id=Id;
	}
	public int getId(){
		return Id;
	}
	public void setMsgType(int MsgType){
		this.MsgType=MsgType;
	}
	public int getMsgType(){
		return MsgType;
	}
	public void setTitle(String Title){
		this.Title=Title;
	}
	public String getTitle(){
		return Title;
	}
	public void setContent(String Content){
		this.Content=Content;
	}
	public String getContent(){
		return Content;
	}
	public void setIsRead(int IsRead){
		this.IsRead=IsRead;
	}
	public int getIsRead(){
		return IsRead;
	}
	public void setGuidCode(String GuidCode){
		this.GuidCode=GuidCode;
	}
	public String getGuidCode(){
		return GuidCode;
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
		return "sys_message[" + 
			"Id=" + Id + 
			", MsgType=" + MsgType + 
			", Title=" + Title + 
			", Content=" + Content + 
			", IsRead=" + IsRead + 
			", GuidCode=" + GuidCode + 
			", CreateTime=" + CreateTime + 
			", UpdateTime=" + UpdateTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

