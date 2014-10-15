package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reclamation
 *
 */


@Entity
@NamedQuery(name="reclamations",query="select c from Reclamation c")
@Table(name="tab_reclamation")
public class Reclamation implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer IdReclamation;
	@ManyToOne
	private BasicUser User;
	@ManyToOne
	private Amator amateur;
	private String Content;
	private static final long serialVersionUID = 1L;

	public Amator getAmateur() {
		return amateur;
	}
	public void setAmateur(Amator amateur) {
		this.amateur = amateur;
	}
	public Reclamation() {
		super();
	}   
	public Integer getIdReclamation() {
		return this.IdReclamation;
	}

	public void setIdReclamation(Integer IdReclamation) {
		this.IdReclamation = IdReclamation;
	}   
	public BasicUser getUser() {
		return this.User;
	}

	public void setUser(BasicUser User) {
		this.User = User;
	}   
	public String getContent() {
		return this.Content;
	}

	public void setContent(String Content) {
		this.Content = Content;
	}
   
}
