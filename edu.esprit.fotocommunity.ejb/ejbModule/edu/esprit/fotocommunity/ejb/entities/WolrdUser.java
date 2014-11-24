package edu.esprit.fotocommunity.ejb.entities;

import edu.esprit.fotocommunity.ejb.entities.BasicUser;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: WolrdUser
 *
 */
@Entity

public class WolrdUser extends BasicUser implements Serializable {

	
	private String VisaCardNumber;
	
	private static final long serialVersionUID = 1L;

	public WolrdUser() {
		super();
	}   
	public String getVisaCardNumber() {
		return this.VisaCardNumber;
	}

	public void setVisaCardNumber(String VisaCardNumber) {
		this.VisaCardNumber = VisaCardNumber;
	}
   
}
