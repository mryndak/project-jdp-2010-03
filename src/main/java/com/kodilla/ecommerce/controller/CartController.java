package com.kodilla.ecommerce.controller;

import com.kodilla.ecommerce.dto.CartDto;
import com.kodilla.ecommerce.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/cart")
@RequiredArgsConstructor
public class CartController {

    @RequestMapping(method = RequestMethod.POST, value = "createCart")
    public void createCart(@RequestBody CartDto cartDto) {

    }

    @RequestMapping(method = RequestMethod.GET, value = "getProductsFromCart")
    public List<ProductDto> getProductsFromCart() {
        List<ProductDto> products = new ArrayList<>();
        ProductDto product1 = new ProductDto();
        ProductDto product2 = new ProductDto();
        products.add(product1);
        products.add(product2);
        return products;
    }

    @RequestMapping(method = RequestMethod.POST, value = "addProductsToCart")
    public void addProductsToCart(@RequestBody CartDto cartDto) {

    }


    @RequestMapping(method = RequestMethod.DELETE, value = "deleteProductFromCart")
    public void deleteProductFromCart(@RequestParam Long productId) {

    }

    @RequestMapping(method = RequestMethod.POST, value = "createOrderFromCart")
    public void createOrderFromCart(@RequestBody CartDto cartDto) {

    }

}
