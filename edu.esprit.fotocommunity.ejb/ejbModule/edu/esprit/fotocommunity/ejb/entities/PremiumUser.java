package edu.esprit.fotocommunity.ejb.entities;

import edu.esprit.fotocommunity.ejb.entities.BasicUser;

import java.io.Serializable;
import java.lang.Integer;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PremiumUser
 *
 */
@Entity
@NamedQuery(name="test1",query="select a from PremiumUser a")
public class PremiumUser extends BasicUser implements Serializable {

	
	private Integer NbPurshace;
	private String CardNumber;
	@OneToMany(mappedBy="premiumUser")
	private List<Vente> ventes=new ArrayList<Vente>();
	public List<Vente> getVentes() {
		return ventes;
	}
	public void setVentes(List<Vente> ventes) {
		this.ventes = ventes;
	}
	private static final long serialVersionUID = 1L;

	public PremiumUser() {
		super();
	}   
	public Integer getNbPurshace() {
		return this.NbPurshace;
	}

	public void setNbPurshace(Integer NbPurshace) {
		this.NbPurshace = NbPurshace;
	}
	public String getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
   
}
