package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveState {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sachin");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		State state=new State();
		state.setName("KARNATAKA");
		state.setCm("BOMMAI");
		state.setCapital("BANGALORE");
		state.setLanguage("KANNADA");
		
		State state1=new State();
		state1.setName("MAHARASHTRA");
		state1.setCm("EKNATH SHINDE");
		state1.setCapital("MUMBAI");
		state1.setLanguage("HINDI");
		
		State state2=new State();
		state2.setName("NEW YORK");
		state2.setCm("SARA TANCREDE");
		state2.setCapital("YORK");
		state2.setLanguage("ENGLISH");
		
		State state3=new State();
		state3.setName("CALIFORNIA");
		state3.setCm("KALIA");
		state3.setCapital("FORNIA");
		state3.setLanguage("ENGLISH");
		
		Country country=new Country();
		country.setName("INDIA");
		country.setPm("NARENDRA MODI");
		country.setCapital("delhi");
		
		Country country1=new Country();
		country1.setName("USA");
		country1.setPm("JOE BIDEN");
		country1.setCapital("WASHINGTON DC");
		
		state.setCountries(country);
		state1.setCountries(country);
		state2.setCountries(country1);
		state3.setCountries(country1);
		
		entityTransaction.begin();
		entityManager.persist(state);
		entityManager.persist(state1);
		entityManager.persist(state2);
		entityManager.persist(state3);
		entityManager.persist(country);
		entityManager.persist(country1);
		entityTransaction.commit();
		
		
		
		
	}

}
