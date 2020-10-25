package com.kodilla.ecommerce.dto;

import com.kodilla.ecommerce.domain.Cart;
import com.kodilla.ecommerce.domain.Order;
import com.kodilla.ecommerce.domain.ProductsGroup;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDto {
    private Long id;
    private String name;
    private Double price;
    private Integer amount;
    private List<Cart> carts = new ArrayList<>();
    private List<ProductsGroup> productGroups = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();
}
