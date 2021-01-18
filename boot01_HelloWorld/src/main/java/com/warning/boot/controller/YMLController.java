package com.warning.boot.controller;

import com.warning.boot.bean.Person;
import com.warning.boot.bean.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YMLController {
    @Autowired
    Person person;
    @RequestMapping("/yml")
    public Person testYML(){
        System.out.println(person);
        return person;
    }
}
