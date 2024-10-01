package com.example.Eployee.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Eployee.mgmt.entity.EmployeeData;

@Repository
public interface EmpReposetryInterface extends JpaRepository<EmployeeData, Long>{
	

}
