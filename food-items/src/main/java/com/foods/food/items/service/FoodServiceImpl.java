package com.foods.food.items.service;

import com.foods.food.items.Repo.FoodRepo;
import com.foods.food.items.entity.FoodItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodRepo foodRepo;
    @Override
    public FoodItems saveitems(FoodItems foodItems) {
        return foodRepo.save(foodItems);
    }

    @Override
    public List<FoodItems> fetchFooditems() {
        return foodRepo.findAll();
    }

    @Override
       public Optional<FoodItems> getAllItems(int id){
        return foodRepo.findById(id);
    }

    @Override
    public void  Deletefooditems(int id) {
        foodRepo.deleteById(id);
    }
}
