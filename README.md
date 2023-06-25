# Restaurant Management System

## Framework and Language

> Framework: SpringBoot Language: Java 8

## Data flow

1.  Controller

    - @PostMapping("addrestraunts"): To add a new list of Restaurants in the Restaurant Management System

    - @GetMapping("restraunt/{id}"): To get info of a existing Restaurant present in Restaurant Management System

    - @GetMapping("restraunts"): To get a list of all existing Restaurants present in Restaurant Management System

    - @PutMapping("restraunts/updateSpeciality/{id}/{speciality}"): To update Specility info of a existing user present in Restaurant Management System

    - @DeleteMapping("restraunt/{id}"): To delete a existing Restaurant present in Restaurant Management System

2.  Services

    - getRestraunt(Integer id): To get info of a existing Restaurant present in Restaurant Management System

    - getRestraunts(): To get a list of all existing Restaurants present in Restaurant Management System

    - addRestraunts(List<Restraunt> newList): To add a new list of Restaurants in the Restaurant Management System

    - updateSpeciality(Integer id, Specility specility) : To update Specility info of a existing user present in Restaurant Management System

    - deleteRestraunt(Integer id): To delete a existing Restaurant present in Restaurant Management System

3.  Repository

    - addRestaurants(List<Restraunt> newList): To add a new list of Restaurants in the Restaurant Management System

    - getRestaurantList(): To get a list of all existing Restaurants present in Restaurant Management System

4.  Database Design

        Conatains Datamembers
            - restrauntId
            - restrauntName
            - restaurantAddress
            - restrauntNumber
            - restrauntspecialty
            - totalStaff
            - restrauntRating

## Data Structure Used in Project

    ArrayList has been used as primay datastructure

## Project Summary

    The Restaurant Management System is a comprehensive software solution designed to facilitate the management and administration of restaurants within system. Its primary objective is to streamline Restaurant-related processes. The system provides a centralized platform that enables administrators to create, read, edit, and delete restaurant accounts.
