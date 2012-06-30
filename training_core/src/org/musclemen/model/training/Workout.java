package org.musclemen.model.training;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Several Sets that should be/ were executed on a particular day.
 * 
 * @author Andrei_Yerameyeu
 *
 */
public class Workout {
	
	private Integer id;
	
	private List<Set> sets = new ArrayList<Set>();
	
	private Date date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Set> getSets() {
		return sets;
	}

	public void setSets(List<Set> sets) {
		this.sets = sets;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
