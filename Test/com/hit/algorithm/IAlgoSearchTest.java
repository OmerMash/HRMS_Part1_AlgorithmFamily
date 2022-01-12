package com.hit.algorithm;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IAlgoSearchTest {

    @org.junit.jupiter.api.Test
    void specificAgeTest() {
        Person p1 = new Person("omer1", 5, "123456789", "Dev", "2");
        Person p2 = new Person("omer2", 10, "123456789", "Dev", "2");
        Person p3 = new Person("omer3", 60, "123456789", "Dev", "2");
        List<Person> l = new ArrayList<Person>();
        l.add(p1);
        l.add(p2);
        l.add(p3);

        SearchByAge sba = new SearchByAge();
        List<Person> l1 = sba.search(l, 5,5, "");

        for(Person p : l1){
//            assertTrue(p.getAge()>=5 && p.age<=60);
            assertEquals(5,p.getAge());
        }
    }

    @org.junit.jupiter.api.Test
    void rangeOfAge() {
        Person p1 = new Person("omer1", 5, "123456789", "Dev", "2");
        Person p2 = new Person("omer2", 10, "123456789", "Dev", "2");
        Person p3 = new Person("omer3", 60, "123456789", "Dev", "2");
        List<Person> l = new ArrayList<Person>();
        l.add(p1);
        l.add(p2);
        l.add(p3);

        SearchByAge sba = new SearchByAge();
        List<Person> l1 = sba.search(l, 5,10, "");

        for(Person p : l1){
//            assertTrue(p.getAge()>=5 && p.age<=60);
            assertTrue(p.getAge()>=5 && p.getAge()<=10);

        }
    }

    @org.junit.jupiter.api.Test
    void impossibleRange() {
        Person p1 = new Person("omer1", 5, "123456789", "Dev", "2");
        Person p2 = new Person("omer2", 10, "123456789", "Dev", "2");
        Person p3 = new Person("omer3", 60, "123456789", "Dev", "2");
        List<Person> l = new ArrayList<Person>();
        l.add(p1);
        l.add(p2);
        l.add(p3);

        SearchByAge sba = new SearchByAge();
        List<Person> l1 = sba.search(l, 10,5, "");

        for(Person p : l1){
            System.out.println(p);
        }
        System.out.println("printed");

        assertEquals(0,l1.size());

        }
    }




