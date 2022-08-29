package com.skillstorm.spyglass.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.spyglass.data.GoalsRepository;
import com.skillstorm.spyglass.models.Goal;

@Service
public class GoalService {
	
	@Autowired
	private GoalsRepository repository;
	
	public List<Goal> findAll() {
		return repository.findAll();
	}
	
	public Optional<Goal> findById(Integer id) {
		return repository.findById(id);
	}
	
	public Goal save(Goal goal) {
		return repository.save(goal);
	}
	
	public Goal update(Goal goal) {
		return repository.save(goal);
	}
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
