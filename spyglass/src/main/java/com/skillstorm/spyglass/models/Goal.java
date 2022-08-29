package com.skillstorm.spyglass.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Goal {
	
	private Integer id;
	
	private String name;
	
	private String description;
	
	private String imagePath;
	
	private LocalDate targetDate;
	
	private Integer targerAmount;
	
	private Integer currentAmount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public Integer getTargerAmount() {
		return targerAmount;
	}

	public void setTargerAmount(Integer targerAmount) {
		this.targerAmount = targerAmount;
	}

	public Integer getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(Integer currentAmount) {
		this.currentAmount = currentAmount;
	}

	public Goal() {
		super();
	}

	public Goal(String name, String description, String imagePath, LocalDate targetDate, Integer targerAmount,
			Integer currentAmount) {
		super();
		this.name = name;
		this.description = description;
		this.imagePath = imagePath;
		this.targetDate = targetDate;
		this.targerAmount = targerAmount;
		this.currentAmount = currentAmount;
	}

	@Override
	public String toString() {
		return "Goals [id=" + id + ", name=" + name + ", description=" + description + ", imagePath=" + imagePath
				+ ", targetDate=" + targetDate + ", targerAmount=" + targerAmount + ", currentAmount=" + currentAmount
				+ "]";
	}
	
	
}
