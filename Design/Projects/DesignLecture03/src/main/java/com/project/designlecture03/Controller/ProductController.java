package com.project.designlecture03.Controller;

import com.project.designlecture03.Services.ProductService;
import com.project.designlecture03.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    }

    @GetMapping("/{id}")
    public Product getProductById(
            @PathVariable Long id) {
        return productService.getProductById(id)
                .orElse(null); // orElse(null) is a
// placeholder we replace with a real 404 later.
    }
    // continued →
    @PostMapping()
    public Product saveProduct(
            @RequestBody Product product) {
        return productService.addProduct(product);
    }
    @DeleteMapping("/{id}")
    public String deleteProductById(
            @PathVariable Long id) {
        productService.deleteProduct(id);
    }
}