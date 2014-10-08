package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ForumSubject
 *
 */
@Entity(name="tab_forum_subjects")

public class ForumSubject implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	private String DESCRIPTION;
	@ManyToOne
	private Forum forum;
	private String CONTENT;
	private static final long serialVersionUID = 1L;

	public ForumSubject() {
		super();
	}   
	public Integer getID() {
		return this.ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}   
	public String getDESCRIPTION() {
		return this.DESCRIPTION;
	}

	public void setDESCRIPTION(String DESCRIPTION) {
		this.DESCRIPTION = DESCRIPTION;
	}   
	public Forum getForum() {
		return this.forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}   
	public String getCONTENT() {
		return this.CONTENT;
	}

	public void setCONTENT(String CONTENT) {
		this.CONTENT = CONTENT;
	}
   
}
