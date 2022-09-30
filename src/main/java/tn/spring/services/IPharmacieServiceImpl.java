package tn.spring.services;

import java.util.List;

import tn.spring.entities.Entropot;
import tn.spring.entities.Pharmacie;

public interface IPharmacieServiceImpl {
	
	public void ajouPharmacie(List<Pharmacie> e);
	public List<Pharmacie> afficherPharmacieByMedicament(String m);
	public List<Pharmacie> getpharmaciePhByIDDepo(int id);
	public List<Pharmacie> Allpharmacie();
	public List<Pharmacie> listPharmacieByIdEntropot(int ide);
	


}
