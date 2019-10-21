package com.example.demo.shared;

public class SkillDto {
	
	private int skillId;
	private String skillName;
	private int subSkillId;
	
	
	public int getSubSkillId() {
		return subSkillId;
	}
	public void setSubSkillId(int subSkillId) {
		this.subSkillId = subSkillId;
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
	public SkillDto(int skillId, String skillName, int subSkillId) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
		this.subSkillId = subSkillId;
	}
	public SkillDto() {
		super();
	}
}
