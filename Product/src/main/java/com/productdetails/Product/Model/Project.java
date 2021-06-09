package com.productdetails.Product.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data@NoArgsConstructor@AllArgsConstructor
@Entity

public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int price;
    private String  name;
    private String detail;
}
