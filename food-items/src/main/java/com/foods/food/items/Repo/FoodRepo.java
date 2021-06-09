package com.foods.food.items.Repo;

import com.foods.food.items.entity.FoodItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepo extends JpaRepository<FoodItems, Integer> {
}
