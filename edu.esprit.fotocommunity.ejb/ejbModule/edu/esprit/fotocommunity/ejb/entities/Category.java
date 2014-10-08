package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity(name="tab_category")

public class Category implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	private String NameCategory;
	@OneToMany (mappedBy = "Category")
	private List<Photo> listPhotos=new ArrayList<Photo>();
	private static final long serialVersionUID = 1L;

	public Category() {
		super();
	}   
	public Integer getID() {
		return this.ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}   
	public String getNameCategory() {
		return this.NameCategory;
	}

	public void setNameCategory(String NameCategory) {
		this.NameCategory = NameCategory;
	}
   
}
