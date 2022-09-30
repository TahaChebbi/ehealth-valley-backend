package tn.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Medicament implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdMedicament;
	private String code_pct;
	private String nomCom;
	private double prixPublic;
	private String Categorie;
	private String dci;
	private String ap;
	private int QTE;
	
	@ManyToOne
	@JsonIgnore
	Entropot entropot;
	
	@ManyToOne
	@JsonIgnore
	Pharmacie pharmacie;
	
	
	

	public Entropot getEntropot() {
		return entropot;
	}
	public void setEntropot(Entropot entropot) {
		this.entropot = entropot;
	}
	public Pharmacie getPharmacie() {
		return pharmacie;
	}
	public void setPharmacie(Pharmacie pharmacie) {
		this.pharmacie = pharmacie;
	}
	public Long getIdMedicament() {
		return IdMedicament;
	}
	public void setIdMedicament(Long idMedicament) {
		IdMedicament = idMedicament;
	}
	public String getCode_pct() {
		return code_pct;
	}
	public void setCode_pct(String code_pct) {
		this.code_pct = code_pct;
	}
	public String getNomCom() {
		return nomCom;
	}
	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
	}
	public double getPrixPublic() {
		return prixPublic;
	}
	public void setPrixPublic(double prixPublic) {
		this.prixPublic = prixPublic;
	}
	public String getCategorie() {
		return Categorie;
	}
	public void setCategorie(String categorie) {
		Categorie = categorie;
	}
	public String getDci() {
		return dci;
	}
	public void setDci(String dci) {
		this.dci = dci;
	}
	public String getAp() {
		return ap;
	}
	public void setAp(String ap) {
		this.ap = ap;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getQTE() {
		return QTE;
	}
	public void setQTE(int qTE) {
		QTE = qTE;
	}
	
	

}
