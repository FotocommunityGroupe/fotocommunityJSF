package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Photo
 *
 */
@Entity(name="tab_photos")

public class Photo implements Serializable {

	   
	@Id
	private Integer ID;
	// Clé etrangère
	
	private String DESCRIPTION;
	private Double PRICE;
	// clé etrangère
	@ManyToOne
	private Category Category;
	@ManyToOne
	private Amator amateur;
	private Double SIZE;
	private static final long serialVersionUID = 1L;

	public Photo() {
		super();
	}   
	public Integer getID() {
		return this.ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}   
//	public Integer getIdOwner() {
//		return this.IdOwner;
//	}

//	public void setIdOwner(Integer IdOwner) {
//		this.IdOwner = IdOwner;
//	}   
	public String getDESCRIPTION() {
		return this.DESCRIPTION;
	}

	public void setDESCRIPTION(String DESCRIPTION) {
		this.DESCRIPTION = DESCRIPTION;
	}   
	public Double getPRICE() {
		return this.PRICE;
	}

	public void setPRICE(Double PRICE) {
		this.PRICE = PRICE;
	}   
	public Category getCategory() {
		return this.Category;
	}

	public void setCategory(Category Category) {
		this.Category = Category;
	}   
	public Double getSIZE() {
		return this.SIZE;
	}

	public void setSIZE(Double SIZE) {
		this.SIZE = SIZE;
	}
   
}
