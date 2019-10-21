package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Skill;
import com.example.demo.repo.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService{

	@Autowired
	private SkillRepository skillRepository;
	
	@Override
	public List<Skill> getAllSkills() {
		// TODO Auto-generated method stub
		return skillRepository.findAll();
	}
	
	

}
