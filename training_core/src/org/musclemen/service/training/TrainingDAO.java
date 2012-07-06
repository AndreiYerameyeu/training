package org.musclemen.service.training;

import java.util.List;

import org.musclemen.model.training.Exercise;

public interface TrainingDAO {

	public abstract List<Exercise> getAllExercises();

	public abstract Exercise persist(Exercise exercise);

	public abstract void deleteExercise(Integer id);
	
	void generateData();

}