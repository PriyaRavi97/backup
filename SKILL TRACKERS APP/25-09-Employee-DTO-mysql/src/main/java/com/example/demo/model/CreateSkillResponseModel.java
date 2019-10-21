package com.example.demo.model;

import java.util.Set;

import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Skill;
import com.example.demo.Entity.SubSkill;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class CreateSkillResponseModel {
	
	private int associateId;
	private int skillId;
	private String skillName;
	private int subSkillId;
	
	
	public CreateSkillResponseModel() {
		super();
	}

	public CreateSkillResponseModel(String skillName, int skillId, int emp) {
		super();
		this.skillName = skillName;
		this.subSkillId = skillId;
		this.associateId = emp;
	}
	
	
}