package com.demo.functional.demo.functional;

import com.demo.functional.demo.functional.business.CalculatorArea;
import com.demo.functional.demo.functional.business.Shape;
import com.demo.functional.demo.functional.model.Rectangle;
import com.demo.functional.demo.functional.model.Triangle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@SpringBootApplication
public class DemoFunctionalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoFunctionalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Shape shape1 = new Rectangle(12.00, 10.00);
		Shape shape2 = new Triangle(5.00, 3.00);
		List<Shape> shapes = Arrays.asList(shape1, shape2);

		CalculatorArea calculatorArea = new CalculatorArea();
		Double totalArea = calculatorArea.computeArea(shapes);
		log.info("Areas: ");
		shapes.forEach(item -> {
			log.info(item.area().toString());
			log.info(item.toString());
		});
		log.info(totalArea.toString());

	}
}
