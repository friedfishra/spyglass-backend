package com.skillstorm.spyglass.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Goal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column(name = "image_path")
	private String imagePath;
	
	@Column(name = "target_date")
	private LocalDate targetDate;
	
	@Column(name = "targetAmount")
	private Integer targetAmount;
	
	@Column(name = "current_amount")
	private Integer currentAmount;
	
	@Column(name = "status")
	private String status;

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

	public Integer getTargetAmount() {
		return targetAmount;
	}

	public void setTargetAmount(Integer targetAmount) {
		this.targetAmount = targetAmount;
	}

	public Integer getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(Integer currentAmount) {
		this.currentAmount = currentAmount;
	}
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Goal() {
		super();
	}

	public Goal(String name, String description, String imagePath, LocalDate targetDate, Integer targetAmount,
			Integer currentAmount, String status) {
		super();
		this.name = name;
		this.description = description;
		this.imagePath = imagePath;
		this.targetDate = targetDate;
		this.targetAmount = targetAmount;
		this.currentAmount = currentAmount;
		this.status = status;
	}
	
	

	public Goal(Integer id, String name, String description, String imagePath, LocalDate targetDate,
			Integer targetAmount, Integer currentAmount, String status) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imagePath = imagePath;
		this.targetDate = targetDate;
		this.targetAmount = targetAmount;
		this.currentAmount = currentAmount;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Goal [id=" + id + ", name=" + name + ", description=" + description + ", imagePath=" + imagePath
				+ ", targetDate=" + targetDate + ", targetAmount=" + targetAmount + ", currentAmount=" + currentAmount
				+ ", status=" + status + "]";
	}

	
	
	
}
