package tn.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.spring.entities.Entropot;
import tn.spring.entities.Medicament;
import tn.spring.services.IEntropotService;
import tn.spring.services.IMedicamentService;
@CrossOrigin(origins = "*")
@RestController
public class MedicamentController {
	
	@Autowired
	IMedicamentService medicament;
	
	@PostMapping("/addMedicamentPh/{idPharm}")
	@ResponseBody
	void ajouterMedicamentToPharmacie(@RequestBody List<Medicament> lm,@PathVariable("idPharm") Long idPharm ) {
		medicament.ajouterMedicamentPharmacie(lm, idPharm);
	}
		
	@PostMapping("/addMedicament/{identropot}")
	@ResponseBody
	void ajouterMedicamentEntropot(@RequestBody List<Medicament> lm,@PathVariable("identropot") Long identropot ) {
		medicament.ajouterMedicamentEntropot(lm, identropot);
	}
	
	
	@GetMapping("/get-Medicament/{identropot}")
	@ResponseBody
	List<Medicament> listMedicamentByIdEntropot(@PathVariable("identropot") int identropot ) {
		return medicament.afficherMedicamentByEntropot(identropot);
	}
	
	@GetMapping("/getMedicamenPht/{idPharmacie}")
	@ResponseBody
	List<Medicament> listMedicamentByIdPharmacie(@PathVariable("idPharmacie") int idPharmacie ) {
		return medicament.afficherMedicamentByPharmacie(idPharmacie);
	}
	
	@GetMapping("/all-Medicament")
	@ResponseBody
	List<Medicament> listAllMedicament() {
		return medicament.afficherAllMedicament();
	}
	
	@GetMapping("/Medicament-By-Nom")
	@ResponseBody
	List<Medicament> MedicamentByNom(String nom) {
		return medicament.retrieveMedicamentByNom(nom);
	}
	
	@GetMapping("/Medicament-By-Category")
	@ResponseBody
	List<Medicament> MedicamentByCategory(String cat) {
		return medicament.retrieveMedicamentsByCategory(cat);
	}
	
	@GetMapping("/Medicament-By-dci")
	@ResponseBody
	List<Medicament> MedicamentByDci(String dci) {
		return medicament.retrieveMedicamentsByDci(dci);
	}
	
	@GetMapping("/get-Medicament-By-EntropotIDAndNom/{identropot}/{nom}")
	@ResponseBody
	List<Medicament> listMedicamentByIdEntropotAndNom(@PathVariable("identropot") int identropot,@PathVariable("nom") String nom) {
		return medicament.retrieveMedicamentByNomAndEntropot(nom, identropot);
	}
	
	@GetMapping("/get-Medicament-By-EntropotIDAndCat/{identropot}/{cat}")
	@ResponseBody
	List<Medicament> listMedicamentByIdEntropotAndCategorie(@PathVariable("identropot") int identropot,@PathVariable("cat") String cat) {
		return medicament.retrieveMedicamentsByCategoryAndEntropot(cat, identropot);
	}
	
	@GetMapping("/get-Medicament-By-EntropotIDAndDci/{identropot}/{dci}")
	@ResponseBody
	List<Medicament> listMedicamentByIdEntropotAndDci(@PathVariable("identropot") int identropot,@PathVariable("dci") String dci) {
		return medicament.retrieveMedicamentsByDciAndEntropot(dci, identropot);
	}
	
	
	
	

}
