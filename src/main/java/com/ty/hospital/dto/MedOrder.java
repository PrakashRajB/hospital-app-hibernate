package com.ty.hospital.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class MedOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@CreationTimestamp
	private LocalDate prsecribedDate;

	public LocalDate getPrsecribedDate() {
		return prsecribedDate;
	}

	public void setPrsecribedDate(LocalDate prsecribedDate) {
		this.prsecribedDate = prsecribedDate;
	}

	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Item> items;

	@ManyToOne
	private Encounter encounter;

	public Encounter getEncounter() {
		return encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "MedOrder [id=" + id + ", prsecribedDate=" + prsecribedDate + ", items=" + items + "]";
	}

}
