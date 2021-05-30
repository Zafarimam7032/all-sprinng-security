package com.grwts.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grwts.student.vo.StudentVo;

public interface StudentRepository extends JpaRepository<StudentVo, Integer> {

	public StudentVo findByName(String name);
}
