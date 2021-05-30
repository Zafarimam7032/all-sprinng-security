package com.zafar.main;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface UserRepository extends JpaRepository<UserDetails,String > {
	public UserDetails findByUsername(String username);

}
