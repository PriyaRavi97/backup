package com.example.demo.model;

import java.util.Set;

import com.example.demo.Entity.Skill;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class CreateEmployeeResponseModel {
	private String associateId;
	private String associateName;
	private String mailId;
	private String mobileNumber;
	
	public CreateEmployeeResponseModel() {
		super();
	}

	public CreateEmployeeResponseModel(String associateId,String associateName, String mailId, String mobileNumber) {
		super();
		this.associateId = associateId;
		this.associateName = associateName;
		this.mailId = mailId;
		this.mobileNumber = mobileNumber;
	}

	
}