package com.project.designlecture03.Services;
import com.project.designlecture03.dto.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(
            Long id) {
        return products.stream()
                .filter(p ->
                        p.getId().equals(id))
                .findFirst();
    }

    public Product addProduct(
            Product product) {
        product.setId(nextId);
        nextId += 1L;
        products.add(product);
        return product;
    }
    public String deleteProduct(Long id) {
        boolean isDeleted =
                products.removeIf(p ->
                        p.getId().equals(id));
        if (isDeleted) {
            return "Deleted successfully";
        } else {
            return "ID not found";
        }
    }
}