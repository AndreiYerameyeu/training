package org.musclemen.model.training;

import java.math.BigDecimal;

/**
 * The <code>Set</code> is responsible for keeping information abou one training set. 
 * It should include the exercise, weight(optional), count (mandatory).
 * 
 * @author Andrei_Yerameyeu
 *
 */
public class Set {
	
	private Integer id;
	
	
	private Exercise exercise;
	
	/*
	 * BigDecimal should be enough to store it :)
	 */
	private BigDecimal weigh;
	
	
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
