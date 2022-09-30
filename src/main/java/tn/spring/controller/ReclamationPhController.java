package tn.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.spring.entities.Medicament;
import tn.spring.entities.ReclamationPh;
import tn.spring.services.ServiceReclamationPh;
@CrossOrigin(origins = "*")
@RestController
public class ReclamationPhController {
	
	@Autowired
	ServiceReclamationPh rec;
	
	@PostMapping("/addReclam/{idPharm}")
	@ResponseBody
	void ajouterReclam(@RequestBody ReclamationPh r, @PathVariable("idPharm") int idPharm ) {	
		rec.AjouterReclamat(r,idPharm);
		
	}
	
	@PostMapping("/addReclame/{ide}")
	@ResponseBody
	void ajouterReclamEntrp(@RequestBody ReclamationPh r, @PathVariable("ide") int ide ) {	
		rec.AjouterReclamatEntropot(r,ide);
		
	}
	
	@GetMapping("/Reclamation/{identropot}")
	@ResponseBody
	List<ReclamationPh> AfficherReclamationDesPharmacieByEntropot(@PathVariable("identropot") int identropot ) {
		return rec.AfficherReclamationDesPharmacieByEntropot(identropot);
	}
	
	@GetMapping("/ReclamationbyIdPh/{idph}")
	@ResponseBody
	List<ReclamationPh> getReclamByIdPharmacie(@PathVariable("idph") int idph ) {
		return rec.listReclamationByIdPharmacie(idph);
	}
	
	@GetMapping("/Reclamationaprv/{idr}")
	@ResponseBody
	void reclamationapprouved(@PathVariable("idr") int idr ) {
		 rec.approuver(idr);
	}
	
	@GetMapping("/Reclamationrj/{idr}")
	@ResponseBody
	void reclamationrej(@PathVariable("idr") int idr ) {
		 rec.Rejeter(idr);
	}
	
	@GetMapping("/ReclamationbyIdEntroo/{ide}")
	@ResponseBody
	List<ReclamationPh> listReclamationByIdEntro(@PathVariable("ide") int ide ) {
		return rec.listReclamationByIdEntro(ide);
	}
	
	
	

}
