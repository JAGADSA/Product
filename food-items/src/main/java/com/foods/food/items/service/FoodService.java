package com.foods.food.items.service;

import com.foods.food.items.entity.FoodItems;

import java.util.List;
import java.util.Optional;

public interface FoodService {
    public FoodItems saveitems(FoodItems foodItems);

    public List<FoodItems> fetchFooditems();

    Optional<FoodItems> getAllItems(int id);

    public void Deletefooditems(int id);
}
