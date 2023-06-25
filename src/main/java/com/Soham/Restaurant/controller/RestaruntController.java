package com.Soham.Restaurant.controller;

import com.Soham.Restaurant.model.Restraunt;
import com.Soham.Restaurant.model.Specility;
import com.Soham.Restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaruntController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping("restraunt/{id}")
    public String getRestraunt(@PathVariable Integer id){
        return restaurantService.getRestraunt(id);
    }

    @GetMapping("restraunts")
    public List<Restraunt> getRestraunts(){
        return restaurantService.getRestraunts();
    }

    @PostMapping("addrestraunts")
    public String addRestraunts(@RequestBody  List<Restraunt> restraunts){
        return restaurantService.addRestraunts(restraunts);
    }

    @PutMapping("restraunts/updateSpeciality/{id}/{speciality}")
    public String updateSpecility(@PathVariable  Integer id,@PathVariable Specility speciality){
        return restaurantService.updateSpeciality(id,speciality);
    }

    @DeleteMapping("restraunt/{id}")
    public String removeRestraunt(@PathVariable  Integer id){
        return restaurantService.deleteRestraunt(id);
    }





}
