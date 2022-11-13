package com.demo.functional.demo.functional.business;

import java.util.List;

public class CalculatorArea {

    public Double computeArea(List<Shape> shapes) {
        Double area = 0.0;
        for (Shape shape : shapes) {
            area += shape.area();
        }

        return area;
    }

}
