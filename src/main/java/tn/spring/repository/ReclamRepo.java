package tn.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.spring.entities.Pharmacie;
import tn.spring.entities.ReclamationPh;


@Repository
public interface ReclamRepo extends JpaRepository<ReclamationPh, Long>{

}
