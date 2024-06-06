package com.provider.shop.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
public class LiteratureDTO {

    private String libraryItemId;
    private String title;
    private String author;
    private Integer stock;
    private Integer borrowedQuantity;
    private String type;



}