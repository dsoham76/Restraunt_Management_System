package com.Soham.Restaurant.factory;

import com.Soham.Restaurant.model.Restraunt;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {
    @Bean
    public List<Restraunt> getRestrauntList(){
        return new ArrayList<>();
    }
}
