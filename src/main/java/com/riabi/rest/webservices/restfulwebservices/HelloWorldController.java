package com.riabi.rest.webservices.restfulwebservices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
// @Controller
public class HelloWorldController {

    //GET
    //URI - /hello-world
    //method - "Hello World"
    //@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    //hello-world-bean
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        throw new RuntimeException("Some Error has happened!");
        //return new HelloWorldBean ("Hello World -- changed");
    }
    // /hello-world/path-variable/Yosra
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean (String.format("Hello World, %s", name) );
    }
}
