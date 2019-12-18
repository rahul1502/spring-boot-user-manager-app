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
    public void deletePerson(@PathVariable("id") int id) {
        personService.deletePerson(id);
    }

    // activation related controllers

    @GetMapping("/activateperson/{id}")
    public void activatePerson(@PathVariable("id") int id) {
        personService.activatePerson(id);
    }

    @GetMapping("/deactivateperson/{id}")
    public void deActivatePerson(@PathVariable("id") int id) {
        personService.deActivatePerson(id);
    }

    @GetMapping("/getactivepersonlist")
    public List<Person> getActivePersonList() {
        return personService.getActivePersonList();
    }
}
