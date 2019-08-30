package com.example.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Data
public class ProductAddToCartEvent implements Event {

    private Product product;
    private Long cartId;

    @Data
    public static class Product {
        private Long id;
        private String name;
        private String price;

        public Product(){

        }
        public Product(Long id,String name,String price){
            this.id=id;
            this.name=name;
            this.price=price;
        }
    }

}
