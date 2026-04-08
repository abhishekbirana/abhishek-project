package com.example.java8features.StreamFilter;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
class Product {
    int id;
    String name;
    double price;

}
public class Main02_Stream_Ex04 {
    public static void main(String[] args) {
        List <Product> products = new ArrayList<>();
        products.add(new Product(1, "HP Laptop", 25000));
        products.add(new Product(2, "Dell Laptop", 30000));
        products.add(new Product(3, "Lenovo Laptop", 28000));
        products.add(new Product(4, "Sony Laptop", 23000));
        products.add(new Product(5, "Apple Laptop", 90000));

        List<Product> updatedProducts = products.stream()
                .filter(product -> product.getPrice() > 25000)
                .collect(Collectors.toList());

        System.out.println(updatedProducts);
    }
}
