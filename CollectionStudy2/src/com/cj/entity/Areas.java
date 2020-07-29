package com.cj.entity;

/**
 * table name:  areas
 * author name: �ź�
 * create time: 2020-07-23 11:47:19
 */ 
public class Areas extends EntityHelper{

	/*������ʶ*/
	private long ID;
	/*����ID*/
	private String ParentId;
	/*��������*/
	private String Name;
	/*�������ƺϲ�*/
	private String MergerName;
	/*�������Ƽ�д*/
	private String ShortName;
	/*�������Ƽ�д�ϲ�*/
	private String MergerShortName;
	/*���򼶱� 1-ʡ��2-�У�3-����*/
	private int LevelType;
	/*���б��*/
	private String CityCode;
	/*��������*/
	private String ZipCode;
	/*ƴ��*/
	private String Pinyin;
	/*ƴ�����*/
	private String Jianpin;
	/*���ƿ�ͷ����ĸ*/
	private String FirstChar;
	/*������γ��*/
	private String lng;
	/*������γ��*/
	private String Lat;
	/*��ע*/
	private String Remarks;

	public Areas() {
		super();
	}
	public Areas(long ID,String ParentId,String Name,String MergerName,String ShortName,String MergerShortName,int LevelType,String CityCode,String ZipCode,String Pinyin,String Jianpin,String FirstChar,String lng,String Lat,String Remarks) {
		this.ID=ID;
		this.ParentId=ParentId;
		this.Name=Name;
		this.MergerName=MergerName;
		this.ShortName=ShortName;
		this.MergerShortName=MergerShortName;
		this.LevelType=LevelType;
		this.CityCode=CityCode;
		this.ZipCode=ZipCode;
		this.Pinyin=Pinyin;
		this.Jianpin=Jianpin;
		this.FirstChar=FirstChar;
		this.lng=lng;
		this.Lat=Lat;
		this.Remarks=Remarks;
	}
	public void setID(long ID){
		this.ID=ID;
	}
	public long getID(){
		return ID;
	}
	public void setParentId(String ParentId){
		this.ParentId=ParentId;
	}
	public String getParentId(){
		return ParentId;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return Name;
	}
	public void setMergerName(String MergerName){
		this.MergerName=MergerName;
	}
	public String getMergerName(){
		return MergerName;
	}
	public void setShortName(String ShortName){
		this.ShortName=ShortName;
	}
	public String getShortName(){
		return ShortName;
	}
	public void setMergerShortName(String MergerShortName){
		this.MergerShortName=MergerShortName;
	}
	public String getMergerShortName(){
		return MergerShortName;
	}
	public void setLevelType(int LevelType){
		this.LevelType=LevelType;
	}
	public int getLevelType(){
		return LevelType;
	}
	public void setCityCode(String CityCode){
		this.CityCode=CityCode;
	}
	public String getCityCode(){
		return CityCode;
	}
	public void setZipCode(String ZipCode){
		this.ZipCode=ZipCode;
	}
	public String getZipCode(){
		return ZipCode;
	}
	public void setPinyin(String Pinyin){
		this.Pinyin=Pinyin;
	}
	public String getPinyin(){
		return Pinyin;
	}
	public void setJianpin(String Jianpin){
		this.Jianpin=Jianpin;
	}
	public String getJianpin(){
		return Jianpin;
	}
	public void setFirstChar(String FirstChar){
		this.FirstChar=FirstChar;
	}
	public String getFirstChar(){
		return FirstChar;
	}
	public void setLng(String lng){
		this.lng=lng;
	}
	public String getLng(){
		return lng;
	}
	public void setLat(String Lat){
		this.Lat=Lat;
	}
	public String getLat(){
		return Lat;
	}
	public void setRemarks(String Remarks){
		this.Remarks=Remarks;
	}
	public String getRemarks(){
		return Remarks;
	}
	@Override
	public String toString() {
		return "areas[" + 
			"ID=" + ID + 
			", ParentId=" + ParentId + 
			", Name=" + Name + 
			", MergerName=" + MergerName + 
			", ShortName=" + ShortName + 
			", MergerShortName=" + MergerShortName + 
			", LevelType=" + LevelType + 
			", CityCode=" + CityCode + 
			", ZipCode=" + ZipCode + 
			", Pinyin=" + Pinyin + 
			", Jianpin=" + Jianpin + 
			", FirstChar=" + FirstChar + 
			", lng=" + lng + 
			", Lat=" + Lat + 
			", Remarks=" + Remarks + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "ID";
	}
}

