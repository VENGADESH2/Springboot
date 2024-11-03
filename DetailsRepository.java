package com.Home.FirstProject;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Home.FirstProject.models.StudentDetails;

public interface DetailsRepository extends JpaRepository<StudentDetails,Integer>{
	
}