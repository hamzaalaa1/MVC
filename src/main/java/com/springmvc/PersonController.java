package com.springmvc;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/person")
public class PersonController {
 
    static ArrayList<Person> person1 = new ArrayList<>();
    static int index = -1; 
 
    @RequestMapping(method = RequestMethod.GET )
    // @GetMapping(produces = "application/json")
    public Person getUser() {
         index++;
         person1.add(new Person("hamza",22));
;        return  person1.get(index)  ;
    }
    @RequestMapping(method = RequestMethod.POST)
    public void setUser(Person p) {
         person1.add(p);
     }
}
