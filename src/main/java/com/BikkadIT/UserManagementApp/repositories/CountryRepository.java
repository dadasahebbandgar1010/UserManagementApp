package com.BikkadIT.UserManagementApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.UserManagementApp.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
