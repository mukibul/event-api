package com.example.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mukibul
 * @since 26/08/19
 */

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Data
public class ProductAddedOrUpdated implements Event {

    private Long productId;
    private String productName;
    private Double productPrice;
}
