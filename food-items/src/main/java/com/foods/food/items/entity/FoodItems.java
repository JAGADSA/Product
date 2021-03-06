package com.foods.food.items.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity@NoArgsConstructor@AllArgsConstructor
public class FoodItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO    )
    private int foodPrice;
    private String foodName;
    private String foodType;
}
