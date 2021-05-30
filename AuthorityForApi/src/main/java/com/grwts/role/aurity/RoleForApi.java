package com.grwts.role.aurity;

import static com.grwts.role.aurity.AuthorityForApi.ADMIN_READ;
import static com.grwts.role.aurity.AuthorityForApi.ADMIN_WRITE;
import static com.grwts.role.aurity.AuthorityForApi.STUDENT_READ;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.google.common.collect.Sets;

public enum RoleForApi {
	STUDENT(Sets.newHashSet(STUDENT_READ))

	, ADMIN(Sets.newHashSet(ADMIN_READ, ADMIN_WRITE));

	private Set<AuthorityForApi> authority;

	private RoleForApi(Set<AuthorityForApi> authority) {
		this.authority = authority;
	}

	public Set<AuthorityForApi> getAuthority() {
		return authority;
	}

	public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
		Set<SimpleGrantedAuthority> authority = getAuthority().stream()
				.map(permission -> new SimpleGrantedAuthority(permission.getPermission())).collect(Collectors.toSet());
		authority.add(new SimpleGrantedAuthority("ROLE_" + this.name()));

		return authority;
	}

}
