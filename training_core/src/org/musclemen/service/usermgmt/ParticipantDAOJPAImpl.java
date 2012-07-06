package org.musclemen.service.usermgmt;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.musclemen.model.training.Exercise;
import org.musclemen.model.usermgmt.Participant;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ParticipantDAOJPAImpl implements ParticipantDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Participant> getAllParticipants() {
		TypedQuery<Participant> exQuery = em.createNamedQuery("Participant.all", Participant.class);
		return exQuery.getResultList();

	}

	@Override
	public Participant persist(Participant participant) {
		Participant pt = null;
		if (participant.getId() != null) {
			pt = em.find(Participant.class, participant.getId());
			if (pt!=null)
				participant = em.merge(pt);
		}
		if (pt == null)
			em.persist(participant);
		return participant;
	}

	@Override
	public void deleteParticipant(Integer id) {
		Participant pt = em.find(Participant.class, id);
		if (pt == null)
			throw new IllegalArgumentException("Participant with given id does not exist");
		
	}

}
