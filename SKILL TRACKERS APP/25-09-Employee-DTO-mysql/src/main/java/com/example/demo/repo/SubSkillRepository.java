package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Employee;
import com.example.demo.Entity.SubSkill;

public interface SubSkillRepository extends CrudRepository<SubSkill, Integer>{

}
