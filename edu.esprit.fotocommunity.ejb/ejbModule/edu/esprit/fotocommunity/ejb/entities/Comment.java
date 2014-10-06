package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Comment
 *
 */
@Entity(name="tab_comments")

public class Comment implements Serializable {

	   
	@Id
	private Integer ID;
	private String CONTENT;
	@ManyToOne
	private BasicUser user;
	private static final long serialVersionUID = 1L;

	public Comment() {
		super();
	}   
	public Integer getID() {
		return this.ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}   
	public String getCONTENT() {
		return this.CONTENT;
	}

	public void setCONTENT(String CONTENT) {
		this.CONTENT = CONTENT;
	}   
	public BasicUser getIdUser() {
		return this.user;
	}

	public void setIdUser(BasicUser user) {
		this.user = user;
	}
   
}
