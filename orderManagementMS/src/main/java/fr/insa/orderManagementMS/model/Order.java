package fr.insa.orderManagementMS.model;

import java.time.LocalDate;

public class Order {
	
	private int id;
	private int clientId;
	private LocalDate date;
	private float prix;
	
	public Order() {
		super();
	}
	
	public Order(int id, int clientId, LocalDate date, float prix) {
		super();
		this.id = id;
		this.clientId = clientId;
		this.date = date;
		this.prix = prix;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}

	
}


