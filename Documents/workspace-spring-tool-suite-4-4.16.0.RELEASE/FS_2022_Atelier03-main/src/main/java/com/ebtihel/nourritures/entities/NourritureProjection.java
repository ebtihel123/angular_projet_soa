package com.ebtihel.nourritures.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProd", types = { Nourriture.class })
public interface NourritureProjection {
	public String getNomNourriture();

}
