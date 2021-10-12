package it.prova.test;

import java.util.*;
import java.util.Set;

import it.prova.model.Persona;

public class SetTest {
	public static void main(String[] args) {

		System.out.println("Inizio...");
		Set<Persona> setPersona1 = new HashSet<Persona>();

		Persona p1 = new Persona("Silvano", "Paloni");
		Persona p2 = new Persona("Jessica", "Petrungaro");
		Persona p3 = new Persona("Leonardo", "NonRicordo");

//		aggiungo persone alla lista

		setPersona1.add(p3);
		setPersona1.add(p2);
		setPersona1.add(p2);
		setPersona1.add(p2);
		setPersona1.add(p2);
		setPersona1.add(p1);
		setPersona1.add(p1);
		setPersona1.add(p1);

//		stampo lista persone, mi aspetto di non trovare duplicati

		for (Persona personaItem : setPersona1) {
			System.out.println(personaItem);
		}

//		void clear esempio ==================================================================================
		
		System.out.println();
		System.out.println(
				"+++++++++++++++++++++++++Provo qualche metodo (Void clear)++++++++++++++++++++++++++++++++++");

		Set<Persona> setPersona2 = new HashSet<Persona>();
		Persona c1 = new Persona("Silvano", "Paloni");
		Persona c2 = new Persona("Jessica", "Petrungaro");
		Persona c3 = new Persona("Leonardo", "NonRicordo");

		setPersona2.add(c3);
		setPersona2.add(c2);
		setPersona2.add(c1);
		setPersona2.add(c1);

		System.out.println("prima void clear");
		for (Persona personaItem : setPersona2) {
			System.out.println(personaItem);
		}
		System.out.println();
		System.out.println("post void clear");
		setPersona2.clear();
		for (Persona personaItem : setPersona2) {
			System.out.println(personaItem);
		}

		System.out.println();
//		========================================================================
		
	}
}
