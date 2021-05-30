package com.grwts.role;

public enum RoleAccessPermission {
	ADMIN_READ("admin:read"),
	ADMIN_WRITE("admin:write"),
	STUDENT_READ("student:read"),
	STUDENT_WRITE("student:write");
	
	private String permission;
	
	private RoleAccessPermission(String permission)
	{
		this.permission=permission;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	

}
