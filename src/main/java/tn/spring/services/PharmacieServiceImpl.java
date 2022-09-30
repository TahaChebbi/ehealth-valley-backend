package tn.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.spring.entities.Pharmacie;
import tn.spring.entities.Medicament;
import tn.spring.entities.Pharmacie;
import tn.spring.repository.PharmacieRepository;

@Service
public class PharmacieServiceImpl implements IPharmacieServiceImpl {
	
	@Autowired
	PharmacieRepository phR;

	@Override
	public void ajouPharmacie(List<Pharmacie> e) {
		phR.saveAll(e);
		
	}
	
	@Override
	public List<Pharmacie> afficherPharmacieByMedicament(String m) {
		List<Pharmacie> e = new ArrayList<Pharmacie>();
		List<Pharmacie> e1 = phR.findAll();
		for (Pharmacie Pharmacie : e1) {
			for(Medicament medicament : Pharmacie.getMedicaments() ) {
				if(medicament.getNomCom().equals(m)) {
					e.add(Pharmacie);
				}
			}
		}
		
		return e;
	}

	@Override
	public List<Pharmacie> getpharmaciePhByIDDepo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pharmacie> Allpharmacie() {
		return phR.findAll();
	}
	
	public List<Pharmacie> listPharmacieByIdEntropot(int ide) {
		List<Pharmacie> e = new ArrayList<Pharmacie>();
		List<Pharmacie> e1 = phR.findAll();	
		for (Pharmacie pharmacie : e1) {
			if(pharmacie.getEntropoid()==ide) {
				e.add(pharmacie);
			}
		}
		
		return e;
	}

}