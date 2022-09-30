package tn.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.spring.entities.Entropot;
import tn.spring.entities.Pharmacie;
import tn.spring.repository.EntroopotRepository;
import tn.spring.services.IEntropotService;
@CrossOrigin(origins = "*")
@RestController
public class EntropotController {
	@Autowired
	IEntropotService er;
	
		
	@PostMapping("/add-Entropos")
	@ResponseBody
	void ajouterEntropots(@RequestBody List<Entropot> le) {
		er.ajouEntropot(le); 
	}
	
	@GetMapping("/allgro")
	@ResponseBody
	List<Entropot> allgro() {
		return er.alle();
	}
	
}
