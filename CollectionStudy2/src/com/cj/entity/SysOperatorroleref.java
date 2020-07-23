package com.cj.entity;

import java.util.Date;
import java.math.BigDecimal;
/**
 * table name:  sys_operatorroleref
 * author name: 呐喊
 * create time: 2020-07-22 16:11:27
 */ 
public class SysOperatorroleref extends EntityHelper{

	/*角色编号*/
	private long RoleId;
	/*人员编号*/
	private long OperatorId;
	/*是否删除*/
	private boolean IsDelete;
	/*创建时间*/
	private null CreateDate;

	public SysOperatorroleref() {
		super();
	}
	public SysOperatorroleref(long RoleId,long OperatorId,boolean IsDelete,null CreateDate) {
		this.RoleId=RoleId;
		this.OperatorId=OperatorId;
		this.IsDelete=IsDelete;
		this.CreateDate=CreateDate;
	}
	public void setRoleId(long RoleId){
		this.RoleId=RoleId;
	}
	public long getRoleId(){
		return RoleId;
	}
	public void setOperatorId(long OperatorId){
		this.OperatorId=OperatorId;
	}
	public long getOperatorId(){
		return OperatorId;
	}
	public void setIsDelete(boolean IsDelete){
		this.IsDelete=IsDelete;
	}
	public boolean getIsDelete(){
		return IsDelete;
	}
	public void setCreateDate(null CreateDate){
		this.CreateDate=CreateDate;
	}
	public null getCreateDate(){
		return CreateDate;
	}
	@Override
	public String toString() {
		return "sys_operatorroleref[" + 
			"RoleId=" + RoleId + 
			", OperatorId=" + OperatorId + 
			", IsDelete=" + IsDelete + 
			", CreateDate=" + CreateDate + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "Id";
	}
}

