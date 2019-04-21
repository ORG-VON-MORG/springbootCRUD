package de.htwsaar.springbootCRUD.springbootCRUD;

import de.htwsaar.springbootCRUD.springbootCRUD.dao.CountryRepository;
import de.htwsaar.springbootCRUD.springbootCRUD.entities.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootCrudApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {


		SpringApplication.run(SpringbootCrudApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception{



		countryRepository.save(new Country("Deutschland", "Berlin"));
		countryRepository.save(new Country("Frankreich", "Paris"));
	}

}
