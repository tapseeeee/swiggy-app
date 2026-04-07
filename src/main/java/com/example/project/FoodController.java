package com.example.project;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/food")
@CrossOrigin // prevents frontend blocking issues
public class FoodController {

    @GetMapping
    public List<Map<String,String>> getFood(){
        List<Map<String,String>> list = new ArrayList<>();

        list.add(Map.of("name","Pizza","price","200"));
        list.add(Map.of("name","Burger","price","100"));
        list.add(Map.of("name","Fries","price","80"));

        return list;
    }

    @PostMapping("/order")
    public String order(){
        return "Order Placed Successfully";
    }
}