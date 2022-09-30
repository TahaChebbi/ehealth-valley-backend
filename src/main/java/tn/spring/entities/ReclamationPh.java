package tn.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ReclamationPh implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idReclamation; 
	private String Nommed;
	private int qte;
	private String reponse;
	private String code_pct; 
	private int Entropotid;
	private String nomPharmacie;

	
	
	


	public String getNomPharmacie() {
		return nomPharmacie;
	}

	public void setNomPharmacie(String nomPharmacie) {
		this.nomPharmacie = nomPharmacie;
	}

	public int getEntropotid() {
		return Entropotid;
	}

	public void setEntropotid(int entropotid) {
		Entropotid = entropotid;
	}

	@ManyToOne
	@JsonIgnore
	private Pharmacie pharmacie;
	
	@ManyToOne
	@JsonIgnore
	private Entropot entropot;
	
	
	
	

	public Entropot getEntropot() {
		return entropot;
	}

	public void setEntropot(Entropot entropot) {
		this.entropot = entropot;
	}

	public String getNommed() {
		return Nommed;
	}

	public void setNommed(String nommed) {
		Nommed = nommed;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	public String getCode_pct() {
		return code_pct;
	}

	public void setCode_pct(String code_pct) {
		this.code_pct = code_pct;
	}

	public Pharmacie getPharmacie() {
		return pharmacie;
	}

	public void setPharmacie(Pharmacie pharmacie) {
		this.pharmacie = pharmacie;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getIdReclamation() {
		return idReclamation;
	}

	public void setIdReclamation(Long idReclamation) {
		this.idReclamation = idReclamation;
	}
	
	
	
	
	
	

	

}
