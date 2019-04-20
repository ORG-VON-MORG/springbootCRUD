package de.htwsaar.springbootCRUD.springbootCRUD.dao;

import de.htwsaar.springbootCRUD.springbootCRUD.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
