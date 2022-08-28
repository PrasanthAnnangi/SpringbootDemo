package com.check1.batch.Controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.check1.batch.bean.Department;
import com.check1.batch.service.DepartmentService;

@RestController
public class DepartmentController {
	private final Logger Logger=org.slf4j.LoggerFactory.getLogger(DepartmentController.class);
	@Autowired
	private DepartmentService dps;
	

	public  Department dept;
	
	
	@GetMapping("/departments/")
	public ArrayList<Department> addDepartment() {
		Logger.info("adding department");
		//without builder pattern
		//dept=new Department("CSE", "hfdkj", "aws");
		//With Builder pattern
		dept=Department.builder()
			.departmentName("CSE")
			.departmentAdress("hfdkj")
			.departmentCode("aws")
			.build();
			
		return dps.addepmt(dept);
	}
	
	@GetMapping("/departments/{id}")
	public Department getDepartmentbyid(@PathVariable("id") Long id) {
		
		return dps.getDeptById(id);
	}
	
	@GetMapping("/departments/delete/{id}")
	public String getDeleteDepartmentbyid(@PathVariable("id") Long id) {
		 dps.getDelDeptById(id);
		return "department deleted";
			
	}
	@GetMapping("/departments/update/{id}")
	public Department getUpdateDepartmentbyid(@PathVariable("id") Long id) {
		//without builder pattern
				//dept=new Department("ECE", "hfdkj", "aws");
				//With Builder pattern
				dept=Department.builder()
					.departmentName("ECE")
					.departmentAdress("hfdkj")
					.departmentCode("aws")
					.build();
	return	dps.getUpdateDeptById(id,dept);
		
	}
	
	@GetMapping("/departments/name/{name}")
		public List<Department> getDepartmentbyname(@PathVariable("name") String name) {
		
		return	dps.getDeptByName(name);
	}


}
