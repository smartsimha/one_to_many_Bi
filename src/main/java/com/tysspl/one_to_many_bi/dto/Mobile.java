package com.tysspl.one_to_many_bi.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int cost;
	@OneToMany(mappedBy = "mobile")
	List<SIM> sims;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public List<SIM> getSims() {
		return sims;
	}

	public void setSims(List<SIM> sims) {
		this.sims = sims;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", cost=" + cost + ", sims=" + sims + "]";
	}

}
