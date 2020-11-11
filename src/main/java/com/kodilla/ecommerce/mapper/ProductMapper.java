package com.kodilla.ecommerce.mapper;

import com.kodilla.ecommerce.domain.Product;
import com.kodilla.ecommerce.dto.ProductDto;
import com.kodilla.ecommerce.dto.ProductInCartItemDto;
import com.kodilla.ecommerce.repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class ProductMapper {

    private GroupMapper groupMapper;
    private GroupRepository groupRepository;

    public ProductMapper(@Lazy GroupMapper groupMapper, @Lazy GroupRepository groupRepository) {
        this.groupMapper = groupMapper;
        this.groupRepository = groupRepository;
    }

    public ProductDto mapToProductDto(final Product product) {

        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setTitle(product.getTitle());
        productDto.setPrice(product.getPrice());
        productDto.setQuantity(product.getQuantity());
        return productDto;
    }

    public List<ProductDto> mapToProductDtoList(final List<Product> productList) {
        if(productList == null) {
            return new ArrayList<>();
        }
        return productList.stream()
                .map(this::mapToProductDto)
                .collect(Collectors.toList());
    }

    public ProductInCartItemDto mapToProductInCartItemDto(Product product) {
        ProductInCartItemDto productInCartItemDto = new ProductInCartItemDto();
        productInCartItemDto.setId(product.getId());
        productInCartItemDto.setTitle(product.getTitle());
        productInCartItemDto.setPrice(product.getPrice());
        productInCartItemDto.setDescription(product.getDescription());
        productInCartItemDto.setGroup(groupMapper.mapToGroupInCartDto(product.getGroup()));
        return productInCartItemDto;
    }

}