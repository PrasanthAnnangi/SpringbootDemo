package com.check1.batch.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.check1.batch.bean.Department;
@Repository
public interface DepartmentServiceRepo extends JpaRepository<Department, Long>{

	List<Department> findDepartmentBydepartmentName(String name);

}
