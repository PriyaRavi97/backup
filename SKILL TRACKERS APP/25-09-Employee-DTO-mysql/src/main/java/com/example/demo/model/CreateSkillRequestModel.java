package com.example.demo.model;


import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Skill;
import com.example.demo.Entity.SubSkill;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateSkillRequestModel {
	
	private Employee employee;
	private int skillId;
	private String skillName;
	private SubSkill skill;
		
}