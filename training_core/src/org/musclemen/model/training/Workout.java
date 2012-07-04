package org.musclemen.model.training;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Several Sets that should be/ were executed on a particular day.
 * 
 * @author Andrei_Yerameyeu
 *
 */
@Entity
public class Workout {
	
	@Column(name="ID")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	
	@OneToMany
	@JoinTable(	name ="WORKOUT_SETS", 
				joinColumns = @JoinColumn(name="WRKT_ID"),
				inverseJoinColumns =  @JoinColumn(name="SET_ID"))
	private List<Set> sets = new ArrayList<Set>();
	
	@Column(name="DATE")
	@Temporal(TemporalType.TIMESTAMP)
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
