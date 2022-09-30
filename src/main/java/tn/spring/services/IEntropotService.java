package tn.spring.services;

import java.util.List;

import tn.spring.entities.Entropot;
import tn.spring.entities.Medicament;

public interface IEntropotService {
	
	public void ajouEntropot(List<Entropot> e);
	public List<Entropot> afficherEntropotByMedicament(String m);
	public List<Entropot> alle();

}
