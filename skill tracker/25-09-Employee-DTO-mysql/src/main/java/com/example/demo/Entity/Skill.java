package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int skillId;
	private String skillName;
	
	@ManyToOne
	@JoinColumn(name="associateId")
	private Employee employee;
	
	@OneToOne
	private SubSkill subskill;

	
	public Skill(String skillName, SubSkill subskill) {
		super();
		this.skillName = skillName;
		//this.employee = employee;
		this.subskill = subskill;
	}
	
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public Skill(String skillName, Employee employee, SubSkill subskill) {
		super();
		this.skillName = skillName;
		this.employee = employee;
		this.subskill = subskill;
	}
	
}