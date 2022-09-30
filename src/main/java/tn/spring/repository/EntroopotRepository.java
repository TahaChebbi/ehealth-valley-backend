package tn.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import tn.spring.entities.Entropot;

@Repository
public interface EntroopotRepository extends JpaRepository<Entropot, Long> {
}
