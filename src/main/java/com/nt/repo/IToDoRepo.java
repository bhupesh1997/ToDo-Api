package com.nt.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nt.model.ToDo;

public interface IToDoRepo extends JpaRepository<ToDo, Integer> 
{
	
	List<ToDo> findByStartdateLessThanEqualAndEnddateGreaterThanEqual(LocalDate currentDate,LocalDate endDate);
	List<ToDo> findByStartdateGreaterThan(LocalDate currentDate);
	List<ToDo> findByEnddateLessThan(LocalDate currentDate);
 
}
