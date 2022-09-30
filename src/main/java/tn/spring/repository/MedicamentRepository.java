package tn.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import tn.spring.entities.Medicament;

@Repository
public interface MedicamentRepository extends CrudRepository<Medicament,Long>{
	
	/*@Query("SELECT m FROM Medicament m WHERE m.status = 1")
	Collection<User> findAllActiveUsers();*/
	
	@Query(value = "SELECT * FROM medicament m WHERE m.nom_com= :nom_com" ,
			nativeQuery = true)
			List<Medicament> retrieveMedicamentByNom(@Param("nom_com") String nom_com);
	
	@Query(value = "SELECT * FROM medicament m WHERE m.categorie= :categorie" ,
			nativeQuery = true)
			List<Medicament> retrieveMedicamentsByCategory(@Param("categorie") String categorie);
	
	@Query(value = "SELECT * FROM medicament m WHERE m.dci= :dci" ,
			nativeQuery = true)
			List<Medicament> retrieveMedicamentsByDci(@Param("dci") String dci);

}
