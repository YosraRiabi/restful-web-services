package com.riabi.rest.webservices.restfulwebservices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//Controller
//@RestController
@Controller
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
        return new HelloWorldBean ("Hello World");
    }
    // /hello-world/path-variable/Yosra
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean (String.format("Hello World, %s", name) );
    }
}
