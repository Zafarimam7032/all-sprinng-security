package com.zafar.main;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DbConnection extends JpaRepository<Userdetails, Integer> {
	public Userdetails findByUsername(String username);

}
