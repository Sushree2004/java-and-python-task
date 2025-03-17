package com.example.restaurant.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restaurant.model.Restaurant_Model;


public interface RestaurantRepository extends JpaRepository<Restaurant_Model, Long> {
  List<Restaurant_Model> findByPublished(boolean published);
  List<Restaurant_Model> findByTitleContainingIgnoreCase(String title);
}



