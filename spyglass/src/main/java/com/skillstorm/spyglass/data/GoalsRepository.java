package com.skillstorm.spyglass.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.spyglass.models.Goal;

@Repository
public interface GoalsRepository extends JpaRepository<Goal, Integer> {
	
}
