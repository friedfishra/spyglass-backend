package com.skillstorm.spyglass.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.spyglass.models.Goal;
import com.skillstorm.spyglass.services.GoalService;

@RestController
@RequestMapping("/goals")
@CrossOrigin
public class GoalController {
	@Autowired
	private GoalService service;
	
	@GetMapping
	public List<Goal> getAll(){
		List<Goal> goals = service.findAll();
		return goals;
	}
	
	@GetMapping("/{id}")
	public Optional<Goal> getById(@PathVariable Integer id){
		return service.findById(id);
	}
	
	@PostMapping
	public Goal saveGoal(@RequestBody Goal goal) {
		return service.save(goal);
	}
	
	@PutMapping("/{id}")
	public Goal updateGoal(@RequestBody Goal goal) {
		return service.update(goal);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}
