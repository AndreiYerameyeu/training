package org.musclemen.service.training;

import java.util.List;

import org.musclemen.model.training.Exercise;

public interface TrainingDAO {

	public abstract List<Exercise> getAllExercises();

	public abstract void addNewExercise(Exercise exercise);

	public abstract void deleteExercise(String name);

}