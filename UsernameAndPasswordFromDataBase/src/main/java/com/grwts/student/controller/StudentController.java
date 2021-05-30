package com.grwts.student.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.student.service.StudentService;
import com.grwts.student.vo.StudentVo;

@RestController
@RequestMapping(path = "/home/student/")
public class StudentController {

	@Autowired
	@Qualifier("student")
	private Logger logger;

	@Autowired
	private StudentService studentService;

	@GetMapping(path = "get/all")
	public ResponseEntity<List<StudentVo>> getAllStudent() {
		try {
			List<StudentVo> getallStudent = studentService.getallStudent();
			return ResponseEntity.of(Optional.of(getallStudent));
		} catch (NullPointerException e) {
			logger.error(e.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} catch (Exception e) {
			logger.error(e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@GetMapping(path = "get/{name}")
	public ResponseEntity<StudentVo> getStudent(@PathVariable("name") String name) {
		try {
			StudentVo student = studentService.getStudent(name);
			return ResponseEntity.of(Optional.of(student));
		} catch (NullPointerException e) {
			logger.error(e.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} catch (Exception e) {
			logger.error(e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PostMapping(path = "add")
	public ResponseEntity<StudentVo> addStudent(@RequestBody StudentVo studentVo) {
		try {
			StudentVo student = studentService.addStudent(studentVo);
			return ResponseEntity.of(Optional.of(student));
		} catch (NullPointerException e) {
			logger.error(e.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
		} catch (Exception e) {
			logger.error(e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PutMapping(path = "update/{name}")
	public ResponseEntity<StudentVo> updateStudent(@RequestBody StudentVo studentVo,
			@PathVariable("name") String name) {
		try {
			StudentVo student = studentService.updateStudentVo(studentVo, name);
			return ResponseEntity.of(Optional.of(student));
		} catch (NullPointerException e) {
			logger.error(e.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
		} catch (Exception e) {
			logger.error(e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DeleteMapping(path = "delete/{id}")
	public ResponseEntity<String> getStudent(@PathVariable("id") int id) {
		try {
			String message = studentService.deleteStudent(id);
			return ResponseEntity.of(Optional.of(message));
		} catch (NullPointerException e) {
			logger.error(e.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

		catch (Exception e) {
			logger.error(e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
