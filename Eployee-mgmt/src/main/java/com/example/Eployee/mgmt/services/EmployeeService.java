package com.example.Eployee.mgmt.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Eployee.mgmt.entity.EmployeeData;
import com.example.Eployee.mgmt.repository.EmpReposetryInterface;

@Service
public class EmployeeService {
	@Autowired
	EmpReposetryInterface empReposetryInterface;
	
	public EmployeeData addData(EmployeeData emp) {
		return 	empReposetryInterface.save(emp); 
		
	}
	
	public List<EmployeeData> getAllEmp()   
	{  
	List<EmployeeData> empdata = new ArrayList<EmployeeData>();  
	empReposetryInterface.findAll().forEach(books1 -> empdata.add(books1));  
//	return empReposetryInterface.findAll(); 
//	for (int i = 0; i < books.size(); i++) {
//	System.out.println(books.get(i));	
//
//	}
	return empdata;
	}
	
	
	public EmployeeData getEmpById(Long id)   
	{  
	return empReposetryInterface.findById(id).get();
	}
	
	public void deleteEmpData(Long id) {
		 empReposetryInterface.deleteById(id);
	}
	
	
	public EmployeeData updateEmp(EmployeeData empData,Long id) {
		
		Optional<EmployeeData> optionalEmp = empReposetryInterface.findById(id);
		
		EmployeeData existingEmp = optionalEmp.get();
		existingEmp.setEmail(empData.getEmail());
		existingEmp.setFirstName(empData.getFirstName());
		existingEmp.setLastName(empData.getLastName());
		
           
		
		
		return empReposetryInterface.save(existingEmp);
		
	}
	
	
	
	
	
	
	

}
