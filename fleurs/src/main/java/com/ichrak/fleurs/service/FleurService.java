package com.ichrak.fleurs.service;
	import java.util.List;
	import com.ichrak.fleurs.entities.Fleur;
	public interface FleurService {
		Fleur saveFleur(Fleur f);
	Fleur updateFleur(Fleur f);
	void deleteFleur(Fleur f);
	 void deleteFleurById(Long id);
	 Fleur getFleur(Long id);
	List<Fleur> getAllFleurs();
	}