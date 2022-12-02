package com.symund;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }

    //Direct Wiring
/*  @Bean
    Person person(){
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car());//direct wiring (calling the other object's method inside another)
        return p;
    }
*/
    //Autowiring
    @Bean
    Person person(Car car){ // pass as a parameter
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car);
        return p;
    }

}
