package com.hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
        @RequestMapping("/uc1")
                public String hello() {
            return "Hello from BridgeLabz.";
        }
        @GetMapping("/uc2")
               public String SayHelloWithName(@RequestParam String name) {
             return " Hello " + name + " from BridgeLabz";
        }
        @GetMapping("/uc3/{name}")
               public String sayHelloWithPath(@PathVariable String name) {
            return "Hello " + name + " from BridgeLabz";
        }
        @PostMapping("/uc4")
             public String SayHelloWithPost(@RequestBody User user) {
            return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz.";
        }
    @PutMapping("/uc5/{firstName}")
    public String sayHelloWithPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz.";
    }
    }

