package tn.spring.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.spring.entities.Medicament;

public interface IMedicamentService {
	
	public void ajouterMedicamentEntropot (List<Medicament> le, Long idEntropot);
	
	public List<Medicament>  afficherMedicamentByEntropot(int ide);
	public List<Medicament> afficherAllMedicament();
	
	public void ajouterMedicamentPharmacie (List<Medicament> le, Long idPharmacie);


			public List<Medicament> retrieveMedicamentByNom(String nom_com);
			public List<Medicament> retrieveMedicamentsByCategory(String categorie);
			public List<Medicament> retrieveMedicamentsByCategoryAndEntropot(String categorie,int ide);
			public List<Medicament> retrieveMedicamentByNomAndEntropot(String nom_com,int ide);
			public List<Medicament> retrieveMedicamentsByDciAndEntropot(String dci,int ide);

			public List<Medicament> retrieveMedicamentsByDci(String dci);
			
			// medicmanet et pharmacie
			public List<Medicament>  afficherMedicamentByPharmacie(int ide);
			public List<Medicament> retrieveMedicamentsByCategoryAndPharmacie(String categorie,int ide);
			public List<Medicament> retrieveMedicamentByNomAndPharmacie(String nom_com,int ide);
			public List<Medicament> retrieveMedicamentsByDciAndPharmacie(String dci,int ide);
			
			
			

	
}
