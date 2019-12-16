package com.example.demo.controllers;

import com.example.demo.dao.PersonRepository;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @PostMapping("/addperson")
    public void addPerson(@RequestBody Person person){

    }

    @GetMapping("/getpersonlist")
    public List<Person> getPersonList(){
        List<Person> personList = new ArrayList<>();
        personRepository.findAll().forEach(person -> personList.add(person));
        return personList;
    }

    @PostMapping("/updateperson")
    public void updatePerson(@RequestBody Person person){

    }

    @GetMapping("/deleteperson/{id}")
    public int deletePerson(@PathVariable("id") int id) {
        return 0;
    }
}
