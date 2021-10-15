package com.ichrak.fleurs.entities;

	import java.util.Date;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	@Entity
	public class Fleur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFleur;
	private String nomFleur;
	private Double prixFleur;
	private Date dateCueilliration;
	public Fleur() {
	super();
	}
	public Fleur(String nomFleur, Double prixFleur, Date dateCueilliration) {
	super();
	this.nomFleur = nomFleur;
	this.prixFleur = prixFleur;
	this.dateCueilliration = dateCueilliration;
	}
	public Long getIdFleur() {
		return idFleur;
	}
	public void setIdFleur(Long idFleur) {
	this.idFleur = idFleur;
	}
	public String getNomFleur() {
	return nomFleur;
	}
	public void setNomFleur(String nomFleur) {
	this.nomFleur = nomFleur;
	}
	public Double getPrixFleur() {
	return prixFleur;
	}
	public void setPrixFleur(Double prixFleur) {
	this.prixFleur= prixFleur;
	}
	public Date getdateCueilliration() {
	return dateCueilliration;
	}
	public void setdateCueilliration(Date dateCueilliration) {
	this.dateCueilliration = dateCueilliration;
	}
	@Override
	public String toString() {
	return "Fleur [idFleur=" + idFleur + ", nomFleur=" +
	nomFleur + ", prixFleur=" + prixFleur
	+ ", dateCueilliration=" + dateCueilliration + "]";
	}
	}

	
