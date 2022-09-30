package tn.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.spring.entities.ReclamationPh;
import tn.spring.repository.EntroopotRepository;
import tn.spring.repository.PharmacieRepository;
import tn.spring.repository.ReclamRepo;
import tn.spring.entities.*;

@Service
public class ServiceReclamationPh {
	
	@Autowired
	ReclamRepo reclamph;
	
	@Autowired
	PharmacieRepository phr;
	
	@Autowired
	EntroopotRepository er;
	
	public void AjouterReclamat(ReclamationPh r, long idph ){
		Pharmacie ph = phr.findById(idph).orElse(null);
		r.setPharmacie(ph);
		reclamph.save(r);	
	}
	
	public void AjouterReclamatEntropot(ReclamationPh r, long ide ){
		Entropot e = er.findById(ide).orElse(null);
		r.setEntropot(e);
		reclamph.save(r);
		
	}
	
	/*public void AjouterReclamat(ReclamationPh r, long idph ){
		Pharmacie ph = phr.findById(idph).orElse(null);
		r.setPharmacie(ph);
		reclamph.save(r);
		
	}*/
	
	public List<ReclamationPh> AfficherReclamationDesPharmacieByEntropot(int ide) {
		List<ReclamationPh> lr = reclamph.findAll();
		List<ReclamationPh> lr1 = new ArrayList<ReclamationPh>();
		
		for(ReclamationPh r : lr) {
			if((r.getEntropotid()!=0)&&(r.getEntropotid()==ide)) {
				lr1.add(r);
			}
		}
		
		return lr1;

	}
	
	public List<ReclamationPh> listReclamationByIdPharmacie(long idph){
		List<ReclamationPh> lr = reclamph.findAll();
		List<ReclamationPh> lr1 = new ArrayList<ReclamationPh>();

		for(ReclamationPh r : lr) {
			if((r.getPharmacie()!=null)&&(r.getPharmacie().getIdPharmacie().equals(idph)))
			{
				lr1.add(r);
			}
		}
		
		return lr1;
	}
	
    public void approuver(int idph) {
    	
    	ReclamationPh r = reclamph.findById((long) idph).orElse(null);
    	r.setReponse("Disponible");
    	reclamph.save(r);
    	
    }
    
    public void Rejeter(int idph) {
    	
    	ReclamationPh r = reclamph.findById((long) idph).orElse(null);
    	r.setReponse("Indisponible");
    	reclamph.save(r);
    	
    }
    
	public List<ReclamationPh> listReclamationByIdEntro(long ide){
		List<ReclamationPh> lr = reclamph.findAll();
		List<ReclamationPh> lr1 = new ArrayList<ReclamationPh>();

		for(ReclamationPh r : lr) {
			if((r.getEntropot()!=null)&&(r.getEntropot().getIdEntropot().equals(ide))) {
				lr1.add(r);
			}
		}
		
		return lr1;
	}
    
    

}
