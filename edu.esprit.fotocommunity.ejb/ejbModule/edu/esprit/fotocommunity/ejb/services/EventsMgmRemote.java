package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.fotocommunity.ejb.entities.Event;

@Remote
public interface EventsMgmRemote {
public void addEvent(Event e);
public void deleteEvent(Event e);
public Event findEvent(int IdEvent);
public void updateEvent(Event e);
public List<Event> findAllEvent();

}
