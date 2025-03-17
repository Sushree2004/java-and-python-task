package com.example.restaurant.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurant.model.Restaurant_Model;
import com.example.restaurant.repository.RestaurantRepository;

@RequestMapping("/api")
@RestController
public class RestaurantController {

     //creating a new resource
     @Autowired
    RestaurantRepository restaurantRepository;

     public RestaurantController(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @PostMapping("/restaurants")
     public ResponseEntity<Restaurant_Model> createItem(@RequestBody Restaurant_Model restModel) {
       try {
         Restaurant_Model _restModel = restaurantRepository.save(new Restaurant_Model(restModel.getName(), restModel.getCuisine(), restModel.getPrice()));
         return new ResponseEntity<>(_restModel, HttpStatus.CREATED);
       } catch (Exception e) {
         return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
       }
     }
@GetMapping("/restaurants")
  public ResponseEntity<List<Restaurant_Model>> getAllTutorials() {
    try {
      List<Restaurant_Model> rests = restaurantRepository.findAll();

      
      if (rests.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }

      return new ResponseEntity<>(rests, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }



    // delete from tutorials where id=?
    @DeleteMapping("/restaurants/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
      try {
        restaurantRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }


 @DeleteMapping("/tutorials")
  public ResponseEntity<HttpStatus> deleteAllTutorials() {
    try {
      restaurantRepository.deleteAll();
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }

  @GetMapping("/tutorials/published")
  public ResponseEntity<List<Restaurant_Model>> findByPublished() {
    try {
      List<Restaurant_Model> tutorials = restaurantRepository.findByPublished(true);

      if (tutorials.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(tutorials, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }


  } 
 

