package com.d4_prototype.d4_prototype;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrototypeController {

    @RequestMapping("/")
    public String getHello(){
        return "Movie Theater Management System";
    }
}
