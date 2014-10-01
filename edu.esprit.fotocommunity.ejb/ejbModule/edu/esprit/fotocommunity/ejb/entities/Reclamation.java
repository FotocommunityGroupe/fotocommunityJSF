package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reclamation
 *
 */
@Entity(name="tab_reclation")

public class Reclamation implements Serializable {

	   
	@Id
	private Integer IdReclamation;
	private Integer IdUser;
	private String Content;
	private static final long serialVersionUID = 1L;

	public Reclamation() {
		super();
	}   
	public Integer getIdReclamation() {
		return this.IdReclamation;
	}

	public void setIdReclamation(Integer IdReclamation) {
		this.IdReclamation = IdReclamation;
	}   
	public Integer getIdUser() {
		return this.IdUser;
	}

	public void setIdUser(Integer IdUser) {
		this.IdUser = IdUser;
	}   
	public String getContent() {
		return this.Content;
	}

	public void setContent(String Content) {
		this.Content = Content;
	}
   
}
