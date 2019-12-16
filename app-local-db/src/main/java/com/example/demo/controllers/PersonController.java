package com.example.demo.controllers;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/addperson")
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @GetMapping("/getpersonlist")
    public List<Person> getPersonList(){
        return personService.getPersonList();
    }

    @PostMapping("/updateperson")
    public void updatePerson(@RequestBody Person person){
        personService.updatePerson(person);
    }

    @GetMapping("/deleteperson/{id}")
    public int deletePerson(@PathVariable("id") UUID id) {
        return personService.deletePerson(id);
    }
}
