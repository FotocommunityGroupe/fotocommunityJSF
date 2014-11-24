package edu.esprit.fotocommunity.ejb.entities;

import edu.esprit.fotocommunity.ejb.entities.BasicUser;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: DemandePwd
 *
 */
@Entity
@NamedQuery(name="findDemande", query="select a from DemandePwd a")
@Table(name="tab_demandes")
public class DemandePwd implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDemande;
	@ManyToOne(cascade=CascadeType.MERGE)
	private BasicUser BUser;
	private String Message;
	private static final long serialVersionUID = 1L;

	public DemandePwd() {
		Message="Dear Admin,\n I forget my password "
				+ "\n May I have your help to change it?!"
				+ " \n Thank You";
	}   
	public int getIdDemande() {
		return this.idDemande;
	}

	public void setIdDemande(int idDemande) {
		this.idDemande = idDemande;
	}   
	public BasicUser getUser() {
		return this.BUser;
	}

	public void setUser(BasicUser BUser) {
		this.BUser = BUser;
	}   
	public String getMessage() {
		return this.Message;
	}

	public void setMessage(String Message) {
		this.Message = Message;
	}
   
}
