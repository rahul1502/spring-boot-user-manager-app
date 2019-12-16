package com.example.demo.controllers;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/addperson")
    public void addPerson(@RequestBody Person person){

    }

    @GetMapping("/getpersonlist")
    public List<Person> getPersonList(){
        return personService.getPersonList();
    }

    @PostMapping("/updateperson")
    public void updatePerson(@RequestBody Person person){

    }

    @GetMapping("/deleteperson/{id}")
    public int deletePerson(@PathVariable("id") int id) {
        return 0;
    }
}
