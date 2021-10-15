package com.ichrak.fleurs.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ichrak.fleurs.entities.Fleur;
import com.ichrak.fleurs.repos.FleurRepository;
@Service
public class FleurServiceImpl implements FleurService {
@Autowired
FleurRepository fleurRepository;

@Override
public Fleur saveFleur(Fleur f) {
	return fleurRepository.save(f);
}
@Override
public Fleur updateFleur(Fleur f) {
	return fleurRepository.save(f);	
}
@Override
public void deleteFleur(Fleur f) {
	fleurRepository.delete(f);

	
}
@Override
public void deleteFleurById(Long id) {
	fleurRepository.deleteById(id);

	
}
@Override
public Fleur getFleur(Long id) {
	return fleurRepository.findById(id).get();
	
}
@Override
public List<Fleur> getAllFleurs() {
	return fleurRepository.findAll();

}
}