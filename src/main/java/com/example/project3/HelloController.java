package com.example.project3;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping ("/buenosdias")
    public String sayBuenosdias() {
        return "Buenos dias gente";
    }
}
