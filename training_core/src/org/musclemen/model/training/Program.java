package org.musclemen.model.training;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * @author Andrei_Yerameyeu
 *
 */
public class Program {
	
	private Integer id;
	
	private List<Workout> workouts= new ArrayList<>();
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Workout> getWorkouts() {
		return workouts;
	}

	public void setWorkouts(List<Workout> workouts) {
		this.workouts = workouts;
	}
	

}
