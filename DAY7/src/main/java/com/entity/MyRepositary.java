package com.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepositary extends JpaRepository<Restaurant, Integer> {
	
	    List<Restaurant> findByLocality(String locality);

}
