package edu.esprit.fotocommunity.ejb.entities;

import edu.esprit.fotocommunity.ejb.entities.BasicUser;

import java.io.Serializable;
import java.lang.Integer;



import javax.persistence.*;

/**
 * Entity implementation class for Entity: PremiumUser
 *
 */
@Entity

public class PremiumUser extends BasicUser implements Serializable {

	
	private Integer NbPurshace;
	private String CardNumber;
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
