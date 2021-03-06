package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Forum
 *
 */
@Entity(name="tab_forums")

public class Forum implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	private String SUBJECT;
	private String TITLE;
	@OneToMany(mappedBy ="forum")
	private List<ForumSubject> listSujet= new ArrayList<ForumSubject>();
	private static final long serialVersionUID = 1L;

	public Forum() {
		super();
	}   
	public Integer getID() {
		return this.ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}   
	public String getSUBJECT() {
		return this.SUBJECT;
	}

	public void setSUBJECT(String SUBJECT) {
		this.SUBJECT = SUBJECT;
	}   
	public String getTITLE() {
		return this.TITLE;
	}

	public void setTITLE(String TITLE) {
		this.TITLE = TITLE;
	}
   
}
