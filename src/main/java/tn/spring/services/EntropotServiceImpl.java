package tn.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.spring.entities.Entropot;
import tn.spring.entities.Medicament;
import tn.spring.repository.EntroopotRepository;


@Service
public class EntropotServiceImpl implements IEntropotService {
	
	@Autowired
	EntroopotRepository er;

	@Override
	public void ajouEntropot(List<Entropot> e) {
		er.saveAll(e);
	}

	@Override
	public List<Entropot> afficherEntropotByMedicament(String m) {
		List<Entropot> e = new ArrayList<Entropot>();
		List<Entropot> e1 = er.findAll();
		for (Entropot entropot : e1) {
			for(Medicament medicament : entropot.getMedicaments() ) {
				if(medicament.getNomCom().equals(m)) {
					e.add(entropot);
				}
			}
		}
		
		return e;
	}

	@Override
	public List<Entropot> alle() {
		return er.findAll();
	}
	
	

	

	
}
