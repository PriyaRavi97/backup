package com.example.demo.shared;

import java.util.Set;
import java.util.UUID;

import com.example.demo.Entity.Skill;


public class EmployeeDto {
	private String uId;
	private String associateName;
	private String mailId;
	private String mobileNumber;
	private Set<Skill> skill;
	
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeDto(String uId,String associateName, String mailId, String mobileNumber,
			Set<Skill> skill) {
		super();
		this.uId = UUID.randomUUID().toString();
		this.associateName = associateName;
		this.mailId = mailId;
		this.mobileNumber = mobileNumber;
		this.skill = skill;
	}

	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Set<Skill> getSkill() {
		return skill;
	}
	public void setSkill(Set<Skill> skill) {
		this.skill = skill;
	}
	
}