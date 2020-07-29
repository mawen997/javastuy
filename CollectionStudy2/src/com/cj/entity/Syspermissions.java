package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  syspermissions
 * author name: �ź�
 * create time: 2020-07-23 11:47:19
 */ 
public class Syspermissions extends EntityHelper{

	/*��ɫGuid*/
	private String RoleGuid;
	private String AdminGuid;
	/*�˵�Guid*/
	private String MenuGuid;
	private String BtnFunGuid;
	/*��Ȩ����1=��ɫ-�˵� 2=�û�-��ɫ 3=��ɫ-�˵�-��ť����*/
	private byte Types;

	public Syspermissions() {
		super();
	}
	public Syspermissions(String RoleGuid,String AdminGuid,String MenuGuid,String BtnFunGuid,byte Types) {
		this.RoleGuid=RoleGuid;
		this.AdminGuid=AdminGuid;
		this.MenuGuid=MenuGuid;
		this.BtnFunGuid=BtnFunGuid;
		this.Types=Types;
	}
	public void setRoleGuid(String RoleGuid){
		this.RoleGuid=RoleGuid;
	}
	public String getRoleGuid(){
		return RoleGuid;
	}
	public void setAdminGuid(String AdminGuid){
		this.AdminGuid=AdminGuid;
	}
	public String getAdminGuid(){
		return AdminGuid;
	}
	public void setMenuGuid(String MenuGuid){
		this.MenuGuid=MenuGuid;
	}
	public String getMenuGuid(){
		return MenuGuid;
	}
	public void setBtnFunGuid(String BtnFunGuid){
		this.BtnFunGuid=BtnFunGuid;
	}
	public String getBtnFunGuid(){
		return BtnFunGuid;
	}
	public void setTypes(byte Types){
		this.Types=Types;
	}
	public byte getTypes(){
		return Types;
	}
	@Override
	public String toString() {
		return "syspermissions[" + 
			"RoleGuid=" + RoleGuid + 
			", AdminGuid=" + AdminGuid + 
			", MenuGuid=" + MenuGuid + 
			", BtnFunGuid=" + BtnFunGuid + 
			", Types=" + Types + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Guid";
	}
}

