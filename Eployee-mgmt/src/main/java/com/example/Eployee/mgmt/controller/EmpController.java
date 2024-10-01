package com.example.Eployee.mgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Eployee.mgmt.EployeeMgmtApplication;
import com.example.Eployee.mgmt.entity.EmployeeData;
import com.example.Eployee.mgmt.repository.EmpReposetryInterface;
import com.example.Eployee.mgmt.services.EmployeeService;

@RestController
public class EmpController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/getAllEmp")
	public List<EmployeeData> getAllEmp() {

		return employeeService.getAllEmp();
	}

	@PostMapping("/addData")
	public EmployeeData addData(@RequestBody EmployeeData emp) {
		// employeeService.addData(emp);

		return employeeService.addData(emp);

	}

	@GetMapping("/emp/{id}")
	public EmployeeData getBooks(@PathVariable("id") Long id) {
		return employeeService.getEmpById(id);
	}

	@DeleteMapping("/DeleteEmp/{id}")
	public void deleteEmpData(@PathVariable("id") Long id) {
		employeeService.deleteEmpData(id);

	}
	
	@PutMapping("updateEmp/{id}")
	public EmployeeData updateEmp(@RequestBody EmployeeData emp,@PathVariable Long id) {
		return employeeService.updateEmp(emp,id);
		
	}
}
