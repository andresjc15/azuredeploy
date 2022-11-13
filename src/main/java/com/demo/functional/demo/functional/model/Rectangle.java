package com.demo.functional.demo.functional.model;

import com.demo.functional.demo.functional.business.Shape;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rectangle implements Shape {

    private Double width;
    private Double height;

    @Override
    public Double area() {
        return width * height;
    }

}
