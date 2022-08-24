package com.check1.batch.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.check1.batch.Repo.DepartmentServiceRepo;
import com.check1.batch.bean.Department;

@Service
public class DepartmentServImpl implements DepartmentService {
	@Autowired
	DepartmentServiceRepo deptrep;
	@Override
	public ArrayList<Department> addepmt(Department dept) {
		// TODO Auto-generated method stub
		deptrep.save(dept);
		
		return (ArrayList<Department>) deptrep.findAll();
	}
	@Override
	public Department getDeptById(Long id) {
		// TODO Auto-generated method stub
		return deptrep.findById(id).orElse(null);
	}
	@Override
	public void getDelDeptById(Long id) {
		// TODO Auto-generated method stub
		deptrep.deleteById(id);
	}
	@Override
	public Department getUpdateDeptById(Long id, Department dept) {
		// TODO Auto-generated method stub
		
		Department dep= deptrep.findById(id).get();
		if(dep!=null) {
			dep.setDepartmentAdress(dept.getDepartmentAdress());
			dep.setDepartmentName(dept.getDepartmentName());
			dep.setDepartmentCode(dept.getDepartmentCode());
		}
		deptrep.save(dep);
		return dep;
	}
	@Override
	public List<Department> getDeptByName(String name) {
		// TODO Auto-generated method stub
		return deptrep.findDepartmentBydepartmentName(name);
	}

}
