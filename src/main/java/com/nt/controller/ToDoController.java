package com.nt.controller;

import java.util.List;


import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.ToDo;
import com.nt.service.IToDoMgmtService;

@Controller
public class ToDoController {
	@Autowired
	private IToDoMgmtService service;
	
	@GetMapping("/")
	public String showHome()
	{
		return "dash_board";
	}
	
	@GetMapping("/taskrecord")
	public String showTaskReport(Map<String,Object>map)
	{
	   //List<ToDo>list=service.getAllTask();
		//put the result in model attributes
		//map.put("createtask",list);
		return "task_record";
	}
	
	@GetMapping("/allrecord")
	public String AllTaskReport(Map<String,Object>map)
	{
		List<ToDo>list=service.getAllTask();
		//put the result in model attributes
		map.put("createtask",list);
		return "allrecords";
	}
	
	
	    @GetMapping("/createtask")
	    public String AddTask(@ModelAttribute("todo")ToDo todo) {
		return"task_register";
	}
	
     	@PostMapping("/createtask")
	    public String addEmployee(Map<String,Object>map,@ModelAttribute("todo") ToDo todo) {
		String result=service.registerTask(todo);//in this line we save the emp details
		List<ToDo>list=service.getAllTask();
		map.put("resultMsg",result);
		map.put("createtask",list);
		return "task_record";
		}
     	
     	@GetMapping("/currenttask")
     	public String currentTask(Map<String, Object> map) {
     		List<ToDo> allCurrentTask = service.getAllCurrentTask();
     		System.out.println("No of currentRecords"+allCurrentTask.size());
     		map.put("current",allCurrentTask);
     		
     		return "currenttask";
     	}

     	@GetMapping("/upcomingtask")
     	public String upCommingTask(Map<String, Object> map) {
     		List<ToDo> allupcomming = service.getAllUpCommingTask();
     		System.out.println("No of upcomingRecords"+allupcomming.size());
     		map.put("comming",allupcomming);
     		return "upcomingtask";
     	}
     	
     	@GetMapping("/previoustask")
     	public String previous(Map<String, Object> map) {
     		List<ToDo> allprevious= service.getAllPreviousTask();
     		System.out.println("No of previousRecords"+allprevious.size());
     		map.put("previous",allprevious);
     		return "previoustask";
     	}
     	
     	
	

}
