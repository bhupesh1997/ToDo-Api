package com.nt.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.ToDo;
import com.nt.repo.IToDoRepo;
@Service("empService")
public class ToDoMgmtServiceImpl implements IToDoMgmtService {
    
	@Autowired
	private IToDoRepo todoRepo;
	
	@Override
	public List<ToDo>getAllTask()
	 {
		return todoRepo.findAll();
	}
	
	public String registerTask(ToDo todo) {
		int idVal=todoRepo.save(todo).getTaskno();
		return "Employee is saved with the id value::"+idVal;
	}

	@Override
	public List<ToDo> getAllCurrentTask() {
		//List<ToDo> findAll = todoRepo.findAll();
		LocalDate currentDate = LocalDate.now();
		List<ToDo> recodes = todoRepo.findByStartdateLessThanEqualAndEnddateGreaterThanEqual(currentDate,currentDate);
		return recodes;
	}
	@Override
	public List<ToDo> getAllUpCommingTask() {
		//List<ToDo> findAll = todoRepo.findAll();
		LocalDate currentDate = LocalDate.now();
		List<ToDo> upcomming = todoRepo.findByStartdateGreaterThan(currentDate);
		return upcomming;
	}

	@Override
	public List<ToDo> getAllPreviousTask() {
		LocalDate currentDate = LocalDate.now();
		List<ToDo> previous = todoRepo.findByEnddateLessThan(currentDate);
		return previous;
	}
	 

}
