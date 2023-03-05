package com.nt.service;

import java.util.List;


import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;

import com.nt.model.ToDo;

public interface IToDoMgmtService {

	public List<ToDo>getAllTask();
	public String registerTask(ToDo todo);
	public List<ToDo> getAllCurrentTask();
	public List<ToDo> getAllUpCommingTask();
	public List<ToDo> getAllPreviousTask();
	
	
	
	
}
