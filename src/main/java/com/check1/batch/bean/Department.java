package com.check1.batch.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long department_id;
	@Column
	private String departmentName;
	@Column
	private String departmentAdress;
	@Column
	private String departmentCode;
	
	public Long getDepartment_id() {
		return department_id;
	}
	/*
	 * public Department(String departmentName, String departmentAdress, String
	 * departmentCode) { super(); this.departmentName = departmentName;
	 * this.departmentAdress = departmentAdress; this.departmentCode =
	 * departmentCode; }
	 */
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAdress() {
		return departmentAdress;
	}
	public void setDepartmentAdress(String departmentAdress) {
		this.departmentAdress = departmentAdress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", departmentName=" + departmentName
				+ ", departmentAdress=" + departmentAdress + ", departmentCode=" + departmentCode + "]";
	}
	
}
