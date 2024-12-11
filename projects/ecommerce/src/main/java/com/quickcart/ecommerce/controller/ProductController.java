package com.quickcart.ecommerce.controller;

import com.quickcart.ecommerce.model.Product;
import com.quickcart.ecommerce.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping({"/", "/products"})
    public String getProducts(Model productModel) {
        // TODO 6: declare a List of Product objects and initialize it with an empty ArrayList
        List<Product> products = productService.getAllProducts();

        // TODO 7: create three new Product objects, namely, Laptop, Smartphone, and Headphones with details
        Product laptop = new Product(1001L, "Laptop", "A laptop for work and play", 500.0);
        Product smartphone = new Product(1002L, "Smartphone", "A powerful smartphone with excellent camera", 300.0);
        Product headphones = new Product(1003L, "Headphones", "Wireless headphones with noise cancellation", 150.0);

        // TODO 8: add the three Product objects to the List of products
        products.add(laptop);
        products.add(smartphone);
        products.add(headphones);

        // TODO 9: add the List of products to the Model object with the key "products"
        productModel.addAttribute("products", products);

        // TODO 10: return the view name "products" as a String
        return "products";
    }
}
