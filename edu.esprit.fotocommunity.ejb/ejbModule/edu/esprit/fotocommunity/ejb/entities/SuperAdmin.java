package edu.esprit.fotocommunity.ejb.entities;

import edu.esprit.fotocommunity.ejb.entities.AdminManager;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: AdminManager
 *
 */
@Entity
@DiscriminatorValue(value="SA")
public class SuperAdmin extends AdminManager implements Serializable {

	
	private String EMAILADMIN;
	private static final long serialVersionUID = 1L;

	public SuperAdmin() {
		super();
	}   
	public String getEMAILADMIN() {
		return this.EMAILADMIN;
	}

	public void setEMAILADMIN(String EMAILADMIN) {
		this.EMAILADMIN = EMAILADMIN;
	}
   
}
