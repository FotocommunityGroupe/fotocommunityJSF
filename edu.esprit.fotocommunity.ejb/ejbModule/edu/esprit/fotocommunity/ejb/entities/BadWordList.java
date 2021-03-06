package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: BadWordList
 *
 */
@Entity
@NamedQuery(name="badwordTest",query="select a from BadWordList a")
@Table(name="tab_badwordslist")
public class BadWordList implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	private String WORD;
	private static final long serialVersionUID = 1L;

	public BadWordList() {
		super();
	}   
	public Integer getID() {
		return this.ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}   
	public String getWORD() {
		return this.WORD;
	}

	public void setWORD(String WORD) {
		this.WORD = WORD;
	}
   
}
