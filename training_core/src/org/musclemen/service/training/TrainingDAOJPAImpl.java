package org.musclemen.service.training;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;
import org.musclemen.model.training.Exercise;
import org.musclemen.model.training.Set;
import org.musclemen.model.training.Workout;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Data access layer for the training model objects. It is responsible for
 * all CRUD operations with entities.
 * 
 * @author Andrei Yerameyeu
 * 
 */
@Transactional
@Path("/trainingDAO")
@Produces("application/xml")
public class TrainingDAOJPAImpl implements TrainingDAO {
	
	private static final Logger  LOG = Logger.getLogger(TrainingDAO.class);

	@PersistenceContext
	private EntityManager em;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.musclemen.service.training.TrainingDAO#getAllExercises()
	 */
	@Override
	@GET
	@Path("/exercises")
	public List<Exercise> getAllExercises() {		
		TypedQuery<Exercise> exQuery = em.createNamedQuery("Exercise.all", Exercise.class);
		List<Exercise> resultList = exQuery.getResultList();
		LOG.debug("getAllExercises found "+resultList.size()+"exercises");
		return resultList;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.musclemen.service.training.TrainingDAO#getAllExercises()
	 */
	@GET
	@Path("/exercises/{id}")
	public Exercise getExercise(@PathParam("id") Integer id) {		
		return em.find(Exercise.class, id);
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.musclemen.service.training.TrainingDAO#addNewExercise(org.musclemen
	 * .model.training.Exercise)
	 */
	@Override
	public Exercise persist(Exercise exercise) {
		Exercise ex = null;
		if (exercise.getId() != null) {
			ex = em.find(Exercise.class, exercise.getId());
			if (ex!=null)
				exercise = em.merge(ex);
		}
		if (ex == null)
			em.persist(exercise);
		return exercise;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.musclemen.service.training.TrainingDAO#deleteExercise(java.lang.String
	 * )
	 */
	@Override
	public void deleteExercise(Integer id) {
		Exercise ex = em.find(Exercise.class, id);
		if (ex == null)
			throw new IllegalArgumentException("Exercise with given id does not exist");
	}

	@Override
	public void generateData() {
		Exercise e1 = new Exercise();
		e1.setName("e1");
		Exercise e2 = new Exercise();
		e2.setName("e2");
		Exercise e3 = new Exercise();
		e3.setName("e3");
		Set set1 = new Set();
		set1.setExercise(e1);
		set1.setCount(1);
		set1.setWeigh(BigDecimal.valueOf(11));
		Set set2 = new Set();
		set2.setExercise(e1);
		set2.setCount(223);
		set2.setWeigh(BigDecimal.valueOf(14));
		Set set3 = new Set();
		set3.setExercise(e2);
		set3.setCount(13);
		set3.setWeigh(BigDecimal.valueOf(44));
		Set set4 = new Set();
		set4.setExercise(e2);
		set4.setCount(14);
		set4.setWeigh(BigDecimal.valueOf(33));
		Set set5 = new Set();
		set5.setExercise(e3);
		set5.setCount(16);
		set5.setWeigh(BigDecimal.valueOf(22));
		Set set6 = new Set();
		set6.setExercise(e3);
		set6.setCount(61);
		set6.setWeigh(BigDecimal.valueOf(44));
		Set set7 = new Set();
		set7.setExercise(e3);
		set7.setCount(51);
		set7.setWeigh(BigDecimal.valueOf(55));
		List<Set> l = new ArrayList<>();
		l.add(set1);
		l.add(set2);
		l.add(set3);
		l.add(set4);
		l.add(set5);
		l.add(set6);
		l.add(set7);
		Workout workout = new Workout();
		workout.setDate(new Date());
		workout.setSets(l);
		em.persist(workout);
		

	}

}
