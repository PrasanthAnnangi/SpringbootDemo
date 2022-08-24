package com.check1.batch.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.check1.batch.bean.Department;

@Component
public interface DepartmentService {


	public ArrayList<Department> addepmt(Department dept);

	public Department getDeptById(Long id);

	public void getDelDeptById(Long id);

	public Department getUpdateDeptById(Long id, Department dept);

	public List<Department> getDeptByName(String name);

}
