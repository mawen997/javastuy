package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  sysrolemenu
 * author name: ÄÅº°
 * create time: 2020-07-22 16:11:28
 */ 
public class Sysrolemenu extends EntityHelper{

	/*½ÇÉ«Guid*/
	private String RoleGuid;
	/*²Ëµ¥Guid*/
	private String MenuGuid;

	public Sysrolemenu() {
		super();
	}
	public Sysrolemenu(String RoleGuid,String MenuGuid) {
		this.RoleGuid=RoleGuid;
		this.MenuGuid=MenuGuid;
	}
	public void setRoleGuid(String RoleGuid){
		this.RoleGuid=RoleGuid;
	}
	public String getRoleGuid(){
		return RoleGuid;
	}
	public void setMenuGuid(String MenuGuid){
		this.MenuGuid=MenuGuid;
	}
	public String getMenuGuid(){
		return MenuGuid;
	}
	@Override
	public String toString() {
		return "sysrolemenu[" + 
			"RoleGuid=" + RoleGuid + 
			", MenuGuid=" + MenuGuid + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "RoleGuid";
	}
}

