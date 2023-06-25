package com.Soham.Restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restraunt {
    private Integer restrauntId;
    private String restrauntName;
    private String  restaurantAddress;
    private String restrauntNumber;
    private Specility restrauntspecialty;
    private Integer totalStaff;
    private Double restrauntRating;
}
