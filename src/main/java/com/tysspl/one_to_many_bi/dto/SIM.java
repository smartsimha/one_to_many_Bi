package com.tysspl.one_to_many_bi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class SIM {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String provider;
	private String imrc;
	@ManyToOne
	@JoinColumn
	private Mobile mobile;

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getImrc() {
		return imrc;
	}

	public void setImrc(String imrc) {
		this.imrc = imrc;
	}

	@Override
	public String toString() {
		return "SIM [id=" + id + ", provider=" + provider + ", imrc=" + imrc + "]";
	}

}
