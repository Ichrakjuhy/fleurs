package com.ichrak.fleurs;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ichrak.fleurs.entities.Fleur;
import com.ichrak.fleurs.repos.FleurRepository;
@SpringBootTest
class FleurssApplicationTests {
@Autowired
private FleurRepository fleurRepository;
@Test
public void testCreateFleur() {
	Fleur fle = new Fleur("Achillee",2200.500,new Date());
	fleurRepository.save(fle);
}
@Test
public void testFindFleur()
{
	Fleur f = fleurRepository.findById(1L).get();
System.out.println(f);
}
@Test
public void testUpdateFleur()
{
Fleur f = fleurRepository.findById(1L).get();
f.setPrixFleur(1000.0);
fleurRepository.save(f);
}
@Test
public void testDeleteFleur()
{
	fleurRepository.deleteById(1L);;
}

@Test
public void testListerTousFleurs()
{
List<Fleur> fles = fleurRepository.findAll();
for (Fleur f : fles)
{
System.out.println(f);
}
}
}

