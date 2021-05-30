package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Emp.pojo.EmpVo;


@RestController
@RequestMapping(path = "/emp")
public class EmpController {
private static final List<EmpVo> emplist=Arrays.asList(
		new EmpVo(1,"zafar","new Delhi","java Devloper",10000),
		new EmpVo(2,"Shobit","new Delhi","java Devloper",10000),
		new EmpVo(3,"Aviral","new Delhi","java Devloper",10000),
		new EmpVo(4,"Priyanka","new Delhi","java Devloper",10000)
		);
@GetMapping(path = "/all")
public List<EmpVo> display()
{
	return emplist;
}

	@GetMapping("/{empId}")
	public EmpVo display(@PathVariable("empId") int id)
	{	
		for(EmpVo emp:emplist)
		{
			if(emp.getEmpId()==id)
			{
				return emp;
			}
			
		}
		return null;
	}
	

}
