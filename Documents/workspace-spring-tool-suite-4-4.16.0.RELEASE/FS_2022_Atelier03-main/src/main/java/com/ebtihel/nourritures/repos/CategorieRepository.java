package com.ebtihel.nourritures.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ebtihel.nourritures.entities.Categorie;

@RepositoryRestResource(path = "cat")
@CrossOrigin("*") //pour autoriser angular 
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}