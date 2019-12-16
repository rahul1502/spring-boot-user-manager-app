package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Repository
public class DummyPersonDatabase implements PersonDao {

    // mock database
    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> getPersonList() {
        return DB;
    }

    @Override
    public int updatePerson(Person person) {
        for(Person personIter: DB){
            if(personIter.getId().equals(person.getId())){
                personIter.setName(person.getName());
            }
        }
        return 1;
    }

    @Override
    public int deletePerson(UUID id) {
        for(Iterator<Person> iter = DB.listIterator(); iter.hasNext(); ){
            Person per = iter.next();
            if(per.getId().equals(id))
                iter.remove();
        }
        return 1;
    }
}
