package com.example.demo.interfce;

import java.util.List;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Admin;

@FeignClient(name="admin-ws")
public interface AdminInterface {

	@LoadBalanced
	@GetMapping("/skills")
	public List<Admin> getAdmin();
	
}

