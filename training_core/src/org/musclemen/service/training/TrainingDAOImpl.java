package org.musclemen.service.training;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.musclemen.model.training.Exercise;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Data access layer for the training model objects. It is responsible
 * for all CRUD operations with entities.
 * 
 * @author Andrei Yerameyeu
 *
 */
@Transactional
public class TrainingDAOImpl implements TrainingDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	
	/* (non-Javadoc)
	 * @see org.musclemen.service.training.TrainingDAO#getAllExercises()
	 */
	@Override
	public List<Exercise> getAllExercises()
	{
		return em.createQuery("SELECT x FROM Exercise x").getResultList();
	}
	
	/* (non-Javadoc)
	 * @see org.musclemen.service.training.TrainingDAO#addNewExercise(org.musclemen.model.training.Exercise)
	 */
	@Override
	public void addNewExercise(Exercise exercise)
	{
//		try
//		{			
			em.persist(exercise);			
			
//		}catch(NotSupportedException | SystemException | SecurityException | IllegalStateException | RollbackException | HeuristicMixedException | HeuristicRollbackException nse)
//		{
//			
//		}
	}
	
	/* (non-Javadoc)
	 * @see org.musclemen.service.training.TrainingDAO#deleteExercise(java.lang.String)
	 */
	@Override
	public void deleteExercise(String name)
	{
		
	}

}
