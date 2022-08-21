package com.indiaugury.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerDemoApplication {

    @GetMapping("/welcome/{string}")
    public String welcome(@PathVariable String string){
        return "Welcome to springboot docker demo " + string;

    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDockerDemoApplication.class, args);
    }

}
