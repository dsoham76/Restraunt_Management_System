package com.Soham.Restaurant.repository;

import com.Soham.Restaurant.model.Restraunt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantRepo {

    @Autowired
    private List<Restraunt> restaurantList;

    public List<Restraunt> getRestaurantList(){
        return restaurantList;
    }

    public String addRestaurants(List<Restraunt> newList){
        restaurantList.addAll(newList);
        return "List of Restaurant has been added.";
    }




}
