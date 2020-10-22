package com.kodilla.ecommerce.controller;

import com.kodilla.ecommerce.dto.CartDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/cart")
@RequiredArgsConstructor
public class CartController {

    @RequestMapping(method = RequestMethod.POST, value = "createCart")
    public void createCart(CartDto cartDto) {

    }

    @RequestMapping(method = RequestMethod.GET, value = "getProductsFromCart")
    public List<CartDto> getProductsFromCart() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.POST, value = "addProductsToCart")
    public void addProductsToCart() {

    }


    @RequestMapping(method = RequestMethod.DELETE, value = "deleteProductFromTask")
    public void deleteProductFromTask() {

    }

    @RequestMapping(method = RequestMethod.POST, value = "createOrderFromCart")
    public void createOrderFromCart(CartDto cartDto) {

    }




}
