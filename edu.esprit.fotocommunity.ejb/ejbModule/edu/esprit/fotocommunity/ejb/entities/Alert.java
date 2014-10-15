package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Alert
 *
 */
@Entity

public class Alert implements Serializable {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAlert;
	
	
	
	public BasicUser getUser() {
		return user;
	}

	public void setUser(BasicUser user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@ManyToOne
	private BasicUser user;
	private String Notification;

	
	private static final long serialVersionUID = 1L;

	public Alert() {
		super();
	}

	public int getIdAlert() {
		return idAlert;
	}

	public void setIdAlert(int idAlert) {
		this.idAlert = idAlert;
	}

	
	public String getNotification() {
		return Notification;
	}

	public void setNotification(String notification) {
		Notification = notification;
	}
   
}
