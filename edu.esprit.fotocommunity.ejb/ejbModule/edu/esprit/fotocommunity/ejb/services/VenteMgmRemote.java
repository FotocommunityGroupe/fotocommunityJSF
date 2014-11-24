package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.fotocommunity.ejb.entities.Vente;

@Remote
public interface VenteMgmRemote {
public void addVente(Vente v);
public void deleteVente(Vente v);
public Vente findVente(int id);
public List<Vente> findAll();
public List<Object[]> StatisticVente();
}
