package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.fotocommunity.ejb.entities.Amator;

@Remote
public interface TeamWorkRemote {
public void addMember(Amator a);
public void deleteMember(Amator a);
public void updateMember(Amator a);
public Amator findById(int id);
public List<Amator> findall();
}
