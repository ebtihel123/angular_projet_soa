package com.ebtihel.nourritures.service;

import java.util.List;

import com.ebtihel.nourritures.entities.Categorie;
import com.ebtihel.nourritures.entities.Nourriture;

public interface NourritureService {
	Nourriture saveNourriture(Nourriture p);
	Nourriture updateNourriture(Nourriture p);
	void deleteNourriture(Nourriture p);
	void deleteNourritureById(Long id);
	Nourriture getNourriture(Long id);
	List<Nourriture> getAllNourritures();
	List<Nourriture> findByNomNourriture(String nom);
	List<Nourriture> findByNomNourritureContains(String nom);
	List<Nourriture> findByNomPrix (String nom, Double prix);
	List<Nourriture> findByCategorie (Categorie categorie);
	List<Nourriture> findByCategorieIdCat(Long id);
	List<Nourriture> findByOrderByNomNourritureAsc();
	List<Nourriture> trierNourrituresNomsPrix();


}
