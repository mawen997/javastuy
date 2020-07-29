package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  syspersoneducate
 * author name: �ź�
 * create time: 2020-07-23 11:47:19
 */ 
public class Syspersoneducate extends EntityHelper{

	/*Ψһ��ʶ*/
	private String Guid;
	/*Ա��Gudi*/
	private String PersonGuid;
	/*�����������˽����ְҵ��ѵ*/
	private String EducateType;
	/*��ѧʱ��*/
	private Date AdmissionTime;
	/*��ҵʱ��*/
	private Date GraduateTime;
	/*ԺУ����*/
	private String SchoolName;
	/*רҵ*/
	private String Specialty;

	public Syspersoneducate() {
		super();
	}
	public Syspersoneducate(String Guid,String PersonGuid,String EducateType,Date AdmissionTime,Date GraduateTime,String SchoolName,String Specialty) {
		this.Guid=Guid;
		this.PersonGuid=PersonGuid;
		this.EducateType=EducateType;
		this.AdmissionTime=AdmissionTime;
		this.GraduateTime=GraduateTime;
		this.SchoolName=SchoolName;
		this.Specialty=Specialty;
	}
	public void setGuid(String Guid){
		this.Guid=Guid;
	}
	public String getGuid(){
		return Guid;
	}
	public void setPersonGuid(String PersonGuid){
		this.PersonGuid=PersonGuid;
	}
	public String getPersonGuid(){
		return PersonGuid;
	}
	public void setEducateType(String EducateType){
		this.EducateType=EducateType;
	}
	public String getEducateType(){
		return EducateType;
	}
	public void setAdmissionTime(Date AdmissionTime){
		this.AdmissionTime=AdmissionTime;
	}
	public Date getAdmissionTime(){
		return AdmissionTime;
	}
	public void setGraduateTime(Date GraduateTime){
		this.GraduateTime=GraduateTime;
	}
	public Date getGraduateTime(){
		return GraduateTime;
	}
	public void setSchoolName(String SchoolName){
		this.SchoolName=SchoolName;
	}
	public String getSchoolName(){
		return SchoolName;
	}
	public void setSpecialty(String Specialty){
		this.Specialty=Specialty;
	}
	public String getSpecialty(){
		return Specialty;
	}
	@Override
	public String toString() {
		return "syspersoneducate[" + 
			"Guid=" + Guid + 
			", PersonGuid=" + PersonGuid + 
			", EducateType=" + EducateType + 
			", AdmissionTime=" + AdmissionTime + 
			", GraduateTime=" + GraduateTime + 
			", SchoolName=" + SchoolName + 
			", Specialty=" + Specialty + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

