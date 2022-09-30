package tn.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import tn.spring.entities.Pharmacie;

@Repository
public interface PharmacieRepository extends JpaRepository<Pharmacie, Long> {

}
