package org.musclemen.service.usermgmt;

import java.util.List;

import org.musclemen.model.usermgmt.Participant;


public interface ParticipantDAO {
	
	public abstract List<Participant> getAllParticipants();

	public abstract Participant persist(Participant participant);

	public abstract void deleteParticipant(Integer id);

}
