package com.ebtihel.nourritures.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebtihel.nourritures.entities.Categorie;
import com.ebtihel.nourritures.entities.Nourriture;
import com.ebtihel.nourritures.repos.NourritureRepository;


@Service
public class NourritureServiceImpl implements NourritureService{

	@Autowired
	NourritureRepository nourritureRepository;
	
	@Override
	public Nourriture saveNourriture(Nourriture p) {
		return nourritureRepository.save(p);
	}

	@Override
	public Nourriture updateNourriture(Nourriture p) {
		return nourritureRepository.save(p);
	}

	@Override
	public void deleteNourriture(Nourriture p) {
		nourritureRepository.delete(p);
		
	}

	@Override
	public void deleteNourritureById(Long id) {
		nourritureRepository.deleteById(id);
		
	}

	@Override
	public Nourriture getNourriture(Long id) {
		return nourritureRepository.findById(id).get();
	}

	@Override
	public List<Nourriture> getAllNourritures() {
		
		return nourritureRepository.findAll();
	}

	@Override
	public List<Nourriture> findByNomNourriture(String nom) {
		
		return nourritureRepository.findByNomNourriture(nom);
	}

	@Override
	public List<Nourriture> findByNomNourritureContains(String nom) {
		
		return nourritureRepository.findByNomNourritureContains(nom);
	}

	@Override
	public List<Nourriture> findByNomPrix(String nom, Double prix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Nourriture> findByCategorie(Categorie categorie) {
		
		return nourritureRepository.findByCategorie(categorie);
	}

	@Override
	public List<Nourriture> findByCategorieIdCat(Long id) {
	
		return nourritureRepository.findByCategorieIdCat(id);
	}

	@Override
	public List<Nourriture> findByOrderByNomNourritureAsc() {
		
		return nourritureRepository.findByOrderByNomNourritureAsc();
	}

	@Override
	public List<Nourriture> trierNourrituresNomsPrix() {
	
		return nourritureRepository.trierNourrituresNomsPrix();
	}
	
	

}
