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

import tn.spring.entities.Entropot;
import tn.spring.entities.Medicament;
import tn.spring.entities.Pharmacie;
import tn.spring.services.IEntropotService;
import tn.spring.services.IPharmacieServiceImpl;
@CrossOrigin(origins = "*")
@RestController
public class PharmacieController {
	
	@Autowired
	IPharmacieServiceImpl phS;
	
		
	@PostMapping("/add-pharmacies")
	@ResponseBody
	void ajouterPharmacie(@RequestBody List<Pharmacie> ph) {
		phS.ajouPharmacie(ph);
	}
	
	@GetMapping("/getallph")
	@ResponseBody
	List<Pharmacie> getallph() {
		return phS.Allpharmacie();
	}
	

@GetMapping("/pharmacieByIdDepo/{ide}")
	public List<Pharmacie> listPharmacieByIdEntropot(@PathVariable("ide") int ide ){
		return phS.listPharmacieByIdEntropot(ide);
	}

	

}
