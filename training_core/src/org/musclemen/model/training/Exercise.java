package org.musclemen.model.training;

/**
 * The <code>Exercise</code> is responsible for holding description of specific
 * exercise like "Bench press".
 * 
 * 
 * @author Andrei_Yerameyeu
 *
 */
public class Exercise {
	
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

}
