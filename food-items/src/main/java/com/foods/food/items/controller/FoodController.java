package com.foods.food.items.controller;

import com.foods.food.items.entity.FoodItems;
import com.foods.food.items.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FoodController {
    @Autowired
    private FoodService foodService;

@PostMapping("/food")
    public FoodItems saveitems(@RequestBody FoodItems foodItems) {
        return foodService.saveitems(foodItems);
    }

    @GetMapping("/food")
public List<FoodItems>fetchFoodItemsList(){
return foodService.fetchFooditems();
}

    @GetMapping("/food/{id}")
    public Optional<FoodItems> getAllItem(@PathVariable("id") int id){
        return foodService.getAllItems(id);
    }
    @DeleteMapping("/food/{id}")
    public  String Deletefooditems(@PathVariable("id")int id) {
    foodService.Deletefooditems(id);
    return ("Application Deleted");

    }
}
