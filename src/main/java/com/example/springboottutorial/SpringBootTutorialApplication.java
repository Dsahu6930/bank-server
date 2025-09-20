package com.example.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SpringBootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialApplication.class, args);
    }

    // GET routes
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/about")
    public String sayAbout(@RequestParam(value = "myName", defaultValue = "Abhishek") String name) {
        return String.format("Hello %s!", name);
    }

    // POST route example
    @PostMapping("/postData")
    public String postData(@RequestBody User user) {
        // printing received data
        System.out.println("Received: " + user.getName() + " - " + user.getEmail());

        System.out.println("Ended");
        return "Data received: " + user.getName() + " (" + user.getEmail() + ")";
    }
}

// Simple model class for POST data
}
