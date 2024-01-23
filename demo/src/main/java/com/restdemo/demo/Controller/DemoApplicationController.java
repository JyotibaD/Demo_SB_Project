package com.restdemo.demo.Controller;

import com.restdemo.demo.model.Demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoApplicationController {

    Demo demo;
    @GetMapping("{demoId}")
    public Demo getDemoDetails(String demoId){
        return demo;
        //return new Demo("101","Jyotiba","762017");
    }

    @PostMapping
    public String addDemoDetails(@RequestBody Demo demo){
        this.demo=demo;
        return "Demo details created successfully..";
    }

    @PutMapping
    public String updateDemoDetails(@RequestBody Demo demo){
        this.demo=demo;
        return "Demo details updated successfully..";
    }

    @DeleteMapping("{demoId}")
    public String updateDemoDetails(String demoId){
        this.demo=null;
        return "Demo details deleted successfully..";
    }
}
