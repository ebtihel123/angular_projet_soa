package com.ebtihel.nourritures;



import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ebtihel.nourritures.entities.Nourriture;
import com.ebtihel.nourritures.repos.NourritureRepository;


@SpringBootTest
class NourrituresApplicationTests {

	@Autowired
	private NourritureRepository nourritureRepository;
	
	@Test
	public void testCreateNourriture() {
	Nourriture norr = new Nourriture("jus",8.500,new Date());
	nourritureRepository.save(norr);
	}
	
	@Test
	public void testFindNourriture()
	{
	Nourriture p = nourritureRepository.findById(5L).get();
	System.out.println(p);
	}
	
	@Test
	public void testUpdateNourriture()
	{
	Nourriture p = nourritureRepository.findById(1L).get();
	p.setPrixNourriture(200.0);
	nourritureRepository.save(p);
	
	System.out.println(p);
	}
	
	@Test
	public void testDeleteNourriture()
	{
		nourritureRepository.deleteById(1L);
	}
	
	@Test
	public void testFindAllNourritures()
	{
		List<Nourriture> norrs = nourritureRepository.findAll();
		
		for (Nourriture p:norrs)
			 System.out.println(p);
		
	}
	
	
	@Test
	public void testFindNourritureByNom()
	{
	List<Nourriture> norrs = nourritureRepository.findByNomNourriture("yaourt");
	
	for (Nourriture p:norrs)
		 System.out.println(p);
	
	}
	
	@Test
	public void testFindNourritureByNomContains()
	{
	List<Nourriture> norrs = nourritureRepository.findByNomNourritureContains("P");
	
	for (Nourriture p:norrs)
		 System.out.println(p);
	
	}
	
	@Test
	public void testfindByNomPrix()
	{
	List<Nourriture> norrs = nourritureRepository.findByNomPrix("yaourt", 1000.0);
		for (Nourriture p : norrs)
			{
				System.out.println(p);
			}
	}
	
	

	@Test
	public void findByCategorieIdCat()
	{
	List<Nourriture> norrs = nourritureRepository.findByCategorieIdCat(1L);
	for (Nourriture p : norrs)
	{
		System.out.println(p);
	}
	}
	
	
	@Test
	public void testfindByOrderByNomNourritureAsc()
	{
	List<Nourriture> norrs =  nourritureRepository.findByOrderByNomNourritureAsc();
	for (Nourriture p : norrs)
		{
			System.out.println(p);
		}
	}
	
	@Test
	public void testTrierNourrituresNomsPrix()
	{
	List<Nourriture> norrs = nourritureRepository.trierNourrituresNomsPrix();
	for (Nourriture p : norrs)
	{
	System.out.println(p);
	}
	}
	
	
}
