package com.grwts.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.Vo.StudentVo;

@RestController
@RequestMapping(path = "/home/student")
public class StudentController {
	List<StudentVo> studentVos = new ArrayList<>();
	{
		studentVos.add(new StudentVo(1, "Zafar", "New Delhi", "Jntuh", "Java Developer"));
		studentVos.add(new StudentVo(2, "Ateef", "New Delhi", "Jntuh", "Java Developer"));
	}
	@GetMapping(path = "/get/all")
	@PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_STUDENT')")
	public List<StudentVo> getAllStudentVo() {
		return studentVos;
	}

	@GetMapping(path = "/get/{id}")
	@PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_STUDENT')")
	public StudentVo getStudentVo(@PathVariable("id") int id) {
		return studentVos.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
	}
	@PostMapping(path = "/add/details")
	@PreAuthorize("hasAuthority('admin:write')")
	public void addStudentDetails(@RequestBody StudentVo studentVo) {
		int id = studentVos.size();
		studentVo.setId(++id);
		studentVos.add(studentVo);
	}
	@DeleteMapping(path = "/delete/{id}")
	@PreAuthorize("hasAuthority('admin:write')")
	public void deleteStudent(@PathVariable("id") int id) {
		
		StudentVo studentVo = studentVos.stream().filter(student->student.getId()==id).findFirst().orElse(null);
		studentVos.remove(studentVo);
	}
	@PutMapping(path = "/update/{id}/{name}")
	@PreAuthorize("hasAuthority('admin:write')")
	public StudentVo updateStudetDetails(@PathVariable("id") int id, @PathVariable("name") String name) {
		 StudentVo studentVo = studentVos.stream().filter(studentVo1-> studentVo1.getId() == id).findFirst().orElse(null);
		 studentVo.setName(name);
			
			return studentVo;
		
	

	}

	
}
