package com.grwts.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grwts.student.repository.StudentRepository;
import com.grwts.student.vo.StudentVo;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public List<StudentVo> getallStudent() {
		return studentRepository.findAll();

	}

	public StudentVo getStudent(String name) {
		return studentRepository.findByName(name);
	}

	public StudentVo addStudent(StudentVo studentVo) {
		return studentRepository.save(studentVo);
	}

	public StudentVo updateStudentVo(StudentVo studentVo, String name) {
		StudentVo dbstudentVo = studentRepository.findByName(name);
		if (studentVo.getName() != null) {
			dbstudentVo.setName(studentVo.getName());
		}
		if (studentVo.getCity() != null) {
			dbstudentVo.setCity(studentVo.getCity());
		}
		if (studentVo.getCollegeName() != null) {
			dbstudentVo.setCollegeName(studentVo.getCollegeName());
		}
		return studentRepository.save(dbstudentVo);
	}

	public String deleteStudent(int id) {
		studentRepository.deleteById(id);
		return "student deleted :" + id;
	}

}
