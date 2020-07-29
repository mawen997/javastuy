package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  msg_template
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class MsgTemplate extends EntityHelper{

	private int Id;
	/*模板编号*/
	private String Code;
	/*消息签名*/
	private String Signature;
	/*消息服务商模板ID*/
	private String ReferenceTemplateFlag;
	/*消息通道ID*/
	private long ChannelId;
	/*消息类型*/
	private int MessageType;
	/*模板名称*/
	private String TemplateName;
	/*标题*/
	private String Subject;
	/*内容*/
	private String Body;
	/*排序*/
	private int Sort;
	/*状态*/
	private int Status;
	/*创建时间*/
	private Date CreateTime;
	/*修改时间*/
	private Date UpdateTime;

	public MsgTemplate() {
		super();
	}
	public MsgTemplate(int Id,String Code,String Signature,String ReferenceTemplateFlag,long ChannelId,int MessageType,String TemplateName,String Subject,String Body,int Sort,int Status,Date CreateTime,Date UpdateTime) {
		this.Id=Id;
		this.Code=Code;
		this.Signature=Signature;
		this.ReferenceTemplateFlag=ReferenceTemplateFlag;
		this.ChannelId=ChannelId;
		this.MessageType=MessageType;
		this.TemplateName=TemplateName;
		this.Subject=Subject;
		this.Body=Body;
		this.Sort=Sort;
		this.Status=Status;
		this.CreateTime=CreateTime;
		this.UpdateTime=UpdateTime;
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
	public void setSignature(String Signature){
		this.Signature=Signature;
	}
	public String getSignature(){
		return Signature;
	}
	public void setReferenceTemplateFlag(String ReferenceTemplateFlag){
		this.ReferenceTemplateFlag=ReferenceTemplateFlag;
	}
	public String getReferenceTemplateFlag(){
		return ReferenceTemplateFlag;
	}
	public void setChannelId(long ChannelId){
		this.ChannelId=ChannelId;
	}
	public long getChannelId(){
		return ChannelId;
	}
	public void setMessageType(int MessageType){
		this.MessageType=MessageType;
	}
	public int getMessageType(){
		return MessageType;
	}
	public void setTemplateName(String TemplateName){
		this.TemplateName=TemplateName;
	}
	public String getTemplateName(){
		return TemplateName;
	}
	public void setSubject(String Subject){
		this.Subject=Subject;
	}
	public String getSubject(){
		return Subject;
	}
	public void setBody(String Body){
		this.Body=Body;
	}
	public String getBody(){
		return Body;
	}
	public void setSort(int Sort){
		this.Sort=Sort;
	}
	public int getSort(){
		return Sort;
	}
	public void setStatus(int Status){
		this.Status=Status;
	}
	public int getStatus(){
		return Status;
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
		return "msg_template[" + 
			"Id=" + Id + 
			", Code=" + Code + 
			", Signature=" + Signature + 
			", ReferenceTemplateFlag=" + ReferenceTemplateFlag + 
			", ChannelId=" + ChannelId + 
			", MessageType=" + MessageType + 
			", TemplateName=" + TemplateName + 
			", Subject=" + Subject + 
			", Body=" + Body + 
			", Sort=" + Sort + 
			", Status=" + Status + 
			", CreateTime=" + CreateTime + 
			", UpdateTime=" + UpdateTime + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

