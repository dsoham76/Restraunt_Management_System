package com.Soham.Restaurant.service;

import com.Soham.Restaurant.model.Restraunt;
import com.Soham.Restaurant.model.Specility;
import com.Soham.Restaurant.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    public String getRestraunt(Integer id){
        for(Restraunt restraunt: restaurantRepo.getRestaurantList()) {
            if (restraunt.getRestrauntId() == id) {
                return "Restraunt Id:"+restraunt.getRestrauntId()+"\n"+"Restraunt Name:"+restraunt.getRestrauntName()+"\n"+"Restaurant Address:"+restraunt.getRestaurantAddress()+"\n"+"Restraunt Number:"+restraunt.getRestrauntNumber()+"\n"+"Restraunt Specialty:"+restraunt.getRestrauntspecialty()+"\n"+"Total Staff:"+restraunt.getTotalStaff()+"\n"+"Restraunt Rating:"+restraunt.getRestrauntRating();
            }
        }
        return "Restraunt ID:"+id+" does not exist.";
    }

    public List<Restraunt> getRestraunts(){
        return restaurantRepo.getRestaurantList();
    }

    public String addRestraunts(List<Restraunt> newList){
        return restaurantRepo.addRestaurants(newList);
    }

    public String updateSpeciality(Integer id, Specility specility){
        for(Restraunt restraunt: restaurantRepo.getRestaurantList()){
            if(restraunt.getRestrauntId()==id){
                restraunt.setRestrauntspecialty(specility);
                return "Restraunt specialty has been updated.";
            }
        }
        return "Restraunt id "+id+" does not exist.";
    }

    public String deleteRestraunt(Integer id){
        for(Restraunt restraunt: restaurantRepo.getRestaurantList()){
            if(restraunt.getRestrauntId()==id){
                restaurantRepo.getRestaurantList().remove(restraunt);
                return "Restraunt with id "+id+" has been deleted.";
            }
        }
        return "Restraunt id "+id+" does not exist.";
    }
}
