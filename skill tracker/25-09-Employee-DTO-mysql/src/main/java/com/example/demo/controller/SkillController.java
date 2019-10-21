package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Skill;
import com.example.demo.model.CreateEmployeeResponseModel;
import com.example.demo.model.CreateSkillResponseModel;
import com.example.demo.service.SkillService;

@RestController
@RequestMapping("/skill")
public class SkillController {
	
	@Autowired
	private SkillService skillService;
	
	
	public SkillController() {
		super();
	}

	@RequestMapping("/")
	public String home()
	{
		return "ok";
	}
	
	public SkillController(SkillService skillService) {
		super();
		this.skillService = skillService;
	}

	@GetMapping("/list")
	public List<ResponseEntity<CreateSkillResponseModel>> getUsers(Model model){
		List<Skill> users = skillService.getAllSkills();
		List<ResponseEntity<CreateSkillResponseModel>> list = new ArrayList<ResponseEntity<CreateSkillResponseModel>>();
		ModelMapper mapper = new ModelMapper();
		for(Skill u : users) {
			CreateSkillResponseModel res = mapper.map(u, CreateSkillResponseModel.class);
			list.add(ResponseEntity.status(HttpStatus.OK).body(res));
		}
		return list;
	}
	

}
