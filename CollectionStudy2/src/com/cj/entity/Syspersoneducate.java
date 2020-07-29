package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  syspersoneducate
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class Syspersoneducate extends EntityHelper{

	/*唯一标识*/
	private String Guid;
	/*员工Gudi*/
	private String PersonGuid;
	/*类型如国立，私立，职业培训*/
	private String EducateType;
	/*入学时间*/
	private Date AdmissionTime;
	/*毕业时间*/
	private Date GraduateTime;
	/*院校名称*/
	private String SchoolName;
	/*专业*/
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

