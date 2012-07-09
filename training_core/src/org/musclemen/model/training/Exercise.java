package org.musclemen.model.training;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The <code>Exercise</code> is responsible for holding description of specific
 * exercise like "Bench press".
 * 
 * 
 * @author Andrei_Yerameyeu
 *
 */
@Entity
@NamedQuery(name="Exercise.all",query="SELECT x FROM Exercise x")
@XmlRootElement()
@XmlType(name = "", propOrder={"id", "name"})
public class Exercise {
	
	
	
	@Column(name="ID")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	

	@Column(name="NAME")
	/* Keeps the name of exercise */
	private String name;

	/**
	 * Gets a name. 
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets a name.
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * Gets ID of the entiry.
	 * 
	 * @return
	 */
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}


}
