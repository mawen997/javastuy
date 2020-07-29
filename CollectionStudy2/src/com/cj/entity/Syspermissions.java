package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  syspermissions
 * author name: 呐喊
 * create time: 2020-07-23 11:47:19
 */ 
public class Syspermissions extends EntityHelper{

	/*角色Guid*/
	private String RoleGuid;
	private String AdminGuid;
	/*菜单Guid*/
	private String MenuGuid;
	private String BtnFunGuid;
	/*授权类型1=角色-菜单 2=用户-角色 3=角色-菜单-按钮功能*/
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

