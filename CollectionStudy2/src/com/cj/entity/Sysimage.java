package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  sysimage
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class Sysimage extends EntityHelper{

	private String Guid;
	/*所属栏目Guid*/
	private String TheGuid;
	/*图片类型，一个栏目可有多个图片类型*/
	private int Types;
	/*图片名称*/
	private String Title;
	/*图片原图*/
	private String ImgBig;
	/*图片缩略图*/
	private String ImgSmall;
	/*是否为封面*/
	private boolean IsCover;
	/*排序字段*/
	private int Sort;

	public Sysimage() {
		super();
	}
	public Sysimage(String Guid,String TheGuid,int Types,String Title,String ImgBig,String ImgSmall,boolean IsCover,int Sort) {
		this.Guid=Guid;
		this.TheGuid=TheGuid;
		this.Types=Types;
		this.Title=Title;
		this.ImgBig=ImgBig;
		this.ImgSmall=ImgSmall;
		this.IsCover=IsCover;
		this.Sort=Sort;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setTheGuid(String TheGuid){
		this.TheGuid=TheGuid;
	}
	public String getTheGuid(){
		return TheGuid;
	}
	public void setTypes(int Types){
		this.Types=Types;
	}
	public int getTypes(){
		return Types;
	}
	public void setTitle(String Title){
		this.Title=Title;
	}
	public String getTitle(){
		return Title;
	}
	public void setImgBig(String ImgBig){
		this.ImgBig=ImgBig;
	}
	public String getImgBig(){
		return ImgBig;
	}
	public void setImgSmall(String ImgSmall){
		this.ImgSmall=ImgSmall;
	}
	public String getImgSmall(){
		return ImgSmall;
	}
	public void setIsCover(boolean IsCover){
		this.IsCover=IsCover;
	}
	public boolean getIsCover(){
		return IsCover;
	}
	public void setSort(int Sort){
		this.Sort=Sort;
	}
	public int getSort(){
		return Sort;
	}
	@Override
	public String toString() {
		return "sysimage[" + 
			"Guid=" + Guid + 
			", TheGuid=" + TheGuid + 
			", Types=" + Types + 
			", Title=" + Title + 
			", ImgBig=" + ImgBig + 
			", ImgSmall=" + ImgSmall + 
			", IsCover=" + IsCover + 
			", Sort=" + Sort + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

