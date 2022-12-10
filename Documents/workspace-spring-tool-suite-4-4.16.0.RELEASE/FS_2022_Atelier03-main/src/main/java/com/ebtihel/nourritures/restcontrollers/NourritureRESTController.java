package com.ebtihel.nourritures.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ebtihel.nourritures.entities.Nourriture;
import com.ebtihel.nourritures.service.NourritureService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class NourritureRESTController {
	
	@Autowired
	NourritureService nourritureService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Nourriture> getAllNourritures()
	{
		return nourritureService.getAllNourritures();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Nourriture getNourritureById(@PathVariable("id") Long id) {
		return nourritureService.getNourriture(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Nourriture createNourriture(@RequestBody Nourriture nourriture) {
			return nourritureService.saveNourriture(nourriture);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Nourriture updateNourriture(@RequestBody Nourriture nourriture) {
		return nourritureService.updateNourriture(nourriture);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteNourriture(@PathVariable("id") Long id)
	{
			nourritureService.deleteNourritureById(id);
	}
	
	@RequestMapping(value="/norrscat/{idCat}",method = RequestMethod.GET)
	public List<Nourriture> getNourrituresByCatId(@PathVariable("idCat") Long idCat) {
		return nourritureService.findByCategorieIdCat(idCat);
	}
	
	

	
	


}
