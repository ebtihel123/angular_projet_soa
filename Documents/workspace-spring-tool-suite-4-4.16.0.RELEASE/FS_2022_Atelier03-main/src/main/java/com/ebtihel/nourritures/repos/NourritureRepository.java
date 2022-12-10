package com.ebtihel.nourritures.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ebtihel.nourritures.entities.Categorie;
import com.ebtihel.nourritures.entities.Nourriture;

@RepositoryRestResource(path = "rest")
public interface NourritureRepository extends JpaRepository<Nourriture, Long> {
	
	List<Nourriture> findByNomNourriture(String nom);
	List<Nourriture> findByNomNourritureContains(String nom);
	
	/*@Query("select p from Nourriture p where p.nomNourriture like %?1 and p.prixNourriture > ?2")
	List<Nourriture> findByNomPrix (String nom, Double prix);*/
	
	@Query("select p from Nourriture p where p.nomNourriture like %:nom and p.prixNourriture > :prix")
	List<Nourriture> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);

	@Query("select p from Nourriture p where p.categorie = ?1")
	List<Nourriture> findByCategorie (Categorie categorie);
	
	List<Nourriture> findByCategorieIdCat(Long id);
	
	List<Nourriture> findByOrderByNomNourritureAsc();
	
	@Query("select p from Nourriture p order by p.nomNourriture ASC, p.prixNourriture DESC")
	List<Nourriture> trierNourrituresNomsPrix ();

}
