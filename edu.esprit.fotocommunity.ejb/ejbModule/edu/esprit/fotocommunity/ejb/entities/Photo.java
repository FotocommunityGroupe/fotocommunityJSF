package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Photo
 *
 */
@Entity
@NamedQuery(name="ListOfPhotos", query="select a from Photo a")
@Table(name="tab_photos")
public class Photo implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	// Clé etrangère
	
	private String DESCRIPTION;
	private Double PRICE;
	private String image;
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	// clé etrangère
	@ManyToOne
	private Category Category;
	@ManyToOne
	private Amator amateur;
	@OneToMany(mappedBy="photo")
	private List<Vente> ventes1=new ArrayList<Vente>();
	public List<Vente> getVentes1() {
		return ventes1;
	}
	public void setVentes1(List<Vente> ventes1) {
		this.ventes1 = ventes1;
	}

	private int note ; 
	public Amator getAmateur() {
		return amateur;
	}
	public void setAmateur(Amator amateur) {
		this.amateur = amateur;
	}

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
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
   
}
