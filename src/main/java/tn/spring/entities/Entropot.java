package tn.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Entropot implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idEntropot; 
	
	private String nom;
	private String region;
	private String adresse;
	private String phoneNumber;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="entropot")
	@JsonIgnore
	private Set<Medicament> medicaments;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="entropot")
	@JsonIgnore
	private Set<ReclamationPh> reclamations;


	public Long getIdEntropot() {
		return idEntropot;
	}

	public void setIdEntropot(Long idEntropot) {
		this.idEntropot = idEntropot;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}                                                               

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Set<Medicament> getMedicaments() {
		return medicaments;
	}

	public void setMedicaments(Set<Medicament> medicaments) {
		this.medicaments = medicaments;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
