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
public class Pharmacie implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idPharmacie; 
	
	private String nom;
	private String region;
	private String adresse;
	private String phoneNumber;
	private int entropoid;
	
	

	public int getEntropoid() {
		return entropoid;
	}
	public void setEntropoid(int entropoid) {
		this.entropoid = entropoid;
	}
	@OneToMany(cascade = CascadeType.ALL, mappedBy="pharmacie")
	@JsonIgnore
	private Set<Medicament> medicaments;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="pharmacie")
	@JsonIgnore
	private Set<ReclamationPh> reclamations;
	
	public Set<Medicament> getMedicaments() {
		return medicaments;
	}
	public void setMedicaments(Set<Medicament> medicaments) {
		this.medicaments = medicaments;
	}
	public Long getIdPharmacie() {
		return idPharmacie;
	}
	public void setIdPharmacie(Long idPharmacie) {
		this.idPharmacie = idPharmacie;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Set<ReclamationPh> getReclamations() {
		return reclamations;
	}
	public void setReclamations(Set<ReclamationPh> reclamations) {
		this.reclamations = reclamations;
	}
	
	
	
	
}
