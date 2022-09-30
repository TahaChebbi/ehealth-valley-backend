package tn.spring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import tn.spring.entities.Entropot;
import tn.spring.entities.Medicament;
import tn.spring.entities.Pharmacie;
import tn.spring.repository.EntroopotRepository;
import tn.spring.repository.MedicamentRepository;
import tn.spring.repository.PharmacieRepository;

@Service
public  class MedicamentServiceImpl implements IMedicamentService {
	
	@Autowired
	EntroopotRepository entropoRepo;
	@Autowired
	MedicamentRepository medrepo;
	
	@Autowired
	PharmacieRepository phR;



	@Override
	public List<Medicament> afficherMedicamentByEntropot(int ide) {
		List<Medicament> lm = new ArrayList<Medicament>();
		List<Medicament> lmedi = (List<Medicament>) medrepo.findAll();
		for (Medicament medicament : lmedi) {
			if((medicament.getEntropot()!=null)&&(medicament.getEntropot().getIdEntropot()==ide)) {
				lm.add(medicament);
			}
		}
		return (List<Medicament>) lm;

	}

	@Override
	public List<Medicament> afficherAllMedicament() {
		return (List<Medicament>) medrepo.findAll();
	}


	@Override
	public List<Medicament> retrieveMedicamentByNom(String nom_com) {
		return (List<Medicament>) medrepo.retrieveMedicamentByNom(nom_com);
	}

	@Override
	public List<Medicament> retrieveMedicamentsByCategory(String categorie) {
		return (List<Medicament>) medrepo.retrieveMedicamentsByCategory(categorie);
	}

	@Override
	public List<Medicament> retrieveMedicamentsByDci(String dci) {
		return (List<Medicament>) medrepo.retrieveMedicamentsByDci(dci);
	}
	
	/*@Override
	public List<Medicament> afficherMedicamentByNom() {
		return (List<Medicament>) medrepo.retrieveClientsByProfession("anas");
	}
	*/
	
	
	
	@Override
	public List<Medicament> retrieveMedicamentByNomAndEntropot(String nom_com,int ide) {
		List<Medicament> lm1 = new ArrayList<Medicament>();
		List<Medicament> lm2 = this.afficherMedicamentByEntropot(ide);
		for (Medicament medicament : lm2) {
			
			System.out.print("//"+medicament);
			
			if(medicament.getNomCom().equals(nom_com)) {
				System.out.print("++"+medicament);
				lm1.add(medicament);
				
			}
		}
		
		return (List<Medicament>) lm1;

	}
	
	

	@Override
	public List<Medicament> retrieveMedicamentsByCategoryAndEntropot(String categorie,int ide) {
		List<Medicament> lm1 = new ArrayList<Medicament>();
		List<Medicament> lm2 = this.afficherMedicamentByEntropot(ide);
		for (Medicament medicament : lm2) {
			if(medicament.getCategorie().equals(categorie)) {
				lm1.add(medicament);
				
			}
		}
		
		return lm1;
		
	}

	@Override
	public List<Medicament> retrieveMedicamentsByDciAndEntropot(String dci,int ide) {
		
		List<Medicament> lm1 = new ArrayList<Medicament>();
		List<Medicament> lm2 = this.afficherMedicamentByEntropot(ide);
		for (Medicament medicament : lm2) {
			if(medicament.getDci().equals(dci)) {
				lm1.add(medicament);
				
			}
		}
		
		return lm1;
		
	}

	@Override
	public List<Medicament> afficherMedicamentByPharmacie(int ide) {
		
		List<Medicament> lm = new ArrayList<Medicament>();
		List<Medicament> lmedi = (List<Medicament>) medrepo.findAll();
		for (Medicament medicament : lmedi) {
			if((medicament.getPharmacie()!=null)&&(medicament.getPharmacie().getIdPharmacie()==ide)) {
				lm.add(medicament);
				
			}
		}
		return (List<Medicament>) lm;
	}

	@Override
	public List<Medicament> retrieveMedicamentsByCategoryAndPharmacie(String categorie, int ide) {
		
		List<Medicament> lm1 = new ArrayList<Medicament>();
		List<Medicament> lm2 = this.afficherMedicamentByPharmacie(ide);
		for (Medicament medicament : lm2) {
			if(medicament.getCategorie().equals(categorie)) {
				lm1.add(medicament);
				
			}
		}
		
		return lm1;
		
		
	}

	@Override
	public List<Medicament> retrieveMedicamentByNomAndPharmacie(String nom_com, int ide) {
		List<Medicament> lm1 = new ArrayList<Medicament>();
		List<Medicament> lm2 = this.afficherMedicamentByPharmacie(ide);
		for (Medicament medicament : lm2) {
			
			System.out.print("//"+medicament);
			
			if(medicament.getNomCom().equals(nom_com)) {
				System.out.print("++"+medicament);
				lm1.add(medicament);
				
			}
		}
		
		return (List<Medicament>) lm1;
	}

	@Override
	public List<Medicament> retrieveMedicamentsByDciAndPharmacie(String dci, int ide) {
		
		
		List<Medicament> lm1 = new ArrayList<Medicament>();
		List<Medicament> lm2 = this.afficherMedicamentByPharmacie(ide);
		for (Medicament medicament : lm2) {
			if(medicament.getDci().equals(dci)) {
				lm1.add(medicament);
				
			}
		}
		
		return lm1;
		
		
	}

	@Override
	public void ajouterMedicamentPharmacie(List<Medicament> lm, Long idPharmacie) {
		
		//medrepo.saveAll(lm);
		Pharmacie pharm = phR.findById(idPharmacie).orElse(null);
		for (Medicament medicament : lm) {
			medicament.setPharmacie(pharm);
		}
		medrepo.saveAll(lm);
		
	}
	
	
	@Override
	public void ajouterMedicamentEntropot(List<Medicament> lm, Long idEntropot) {
		
		//medrepo.saveAll(lm);
		Entropot entrp = entropoRepo.findById(idEntropot).orElse(null);
		for (Medicament medicament : lm) {
			medicament.setEntropot(entrp);
		}
		medrepo.saveAll(lm);
	}
	
	
	
	
	
	




}
