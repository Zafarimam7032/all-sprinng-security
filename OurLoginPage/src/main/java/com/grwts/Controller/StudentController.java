package com.grwts.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.vo.StudentVo;

@RestController
@RequestMapping(path = "/home/student")
public class StudentController {

	private List<StudentVo> studentVos = new ArrayList<>();
	{
		studentVos.add(new StudentVo(1, "Zafar", "new Delhi"));
	}

	@GetMapping(path = "/get/all")
	public List<StudentVo> getStudentVos() {
		return studentVos;
	}

	@GetMapping(path = "/get/{id}")
	public StudentVo getStudent(@PathVariable("id") int id) {
		return studentVos.stream().filter(studentVo -> studentVo.getId() == id).findFirst().orElse(null);
	}
	@PostMapping(path = "/add/details")
	public void addStudent(@RequestBody StudentVo studentVo )
	{
		studentVos.add(studentVo);
	
	}
	
}
