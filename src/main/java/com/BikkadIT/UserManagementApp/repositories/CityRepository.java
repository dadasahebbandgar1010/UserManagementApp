package com.BikkadIT.UserManagementApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.UserManagementApp.entities.City;

public interface CityRepository extends JpaRepository<City, Integer>{

}
