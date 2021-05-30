package com.grwts.role;

import java.util.Set;

import com.google.common.collect.Sets;
import static com.grwts.role.RoleAccessPermission.*;

public enum RoleDefine {
	
	STUDENT(Sets.newHashSet(STUDENT_READ)) ,
	ADMIN(Sets.newHashSet(ADMIN_READ,ADMIN_WRITE));
	
	
	private Set<RoleAccessPermission> roleAccessPermissions;
	
	
	private RoleDefine(Set<RoleAccessPermission> roleAccessPermissions)
	{
		this.roleAccessPermissions=roleAccessPermissions;
	}


	public Set<RoleAccessPermission> getRoleAccessPermissions() {
		return roleAccessPermissions;
	}


	public void setRoleAccessPermissions(Set<RoleAccessPermission> roleAccessPermissions) {
		this.roleAccessPermissions = roleAccessPermissions;
	}
	
	

}
