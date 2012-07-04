package org.musclemen.model.training;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * The <code>Set</code> is responsible for keeping information abou one training set. 
 * It should include the exercise, weight(optional), count (mandatory).
 * 
 * @author Andrei_Yerameyeu
 *
 */
@Entity
public class Set {
	
	@Column(name="ID")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name="EXERCISE_ID")
	private Exercise exercise;
	
	/*
	 * BigDecimal should be enough to store it :)
	 */
	@Column(name="WEIGHT")
	private BigDecimal weigh;
	
	@Column(name="COUNT")
	private Integer count;


	public Integer getId() {
		return id;
	}


	public Exercise getExercise() {
		return exercise;
	}


	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}


	public BigDecimal getWeigh() {
		return weigh;
	}


	public void setWeigh(BigDecimal weigh) {
		this.weigh = weigh;
	}


	public Integer getCount() {
		return count;
	}


	public void setCount(Integer count) {
		this.count = count;
	}
	

}
