import java.util.Set;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.grwts.role.aurity.AuthorityForApi;
import com.grwts.role.aurity.RoleForApi;

public class mainCl {
	public static void main(String [] args) {
		AuthorityForApi api = AuthorityForApi.ADMIN_READ;
		String permission = api.getPermission();
		System.out.println(permission);
		RoleForApi admin = RoleForApi.ADMIN;
		Set<AuthorityForApi> authority = admin.getAuthority();
		authority.forEach(System.out::println);
		System.out.println("===================");
		Set<SimpleGrantedAuthority> grantedAuthorities = admin.getGrantedAuthorities();
		grantedAuthorities.forEach(System.out::println);
	}
}
