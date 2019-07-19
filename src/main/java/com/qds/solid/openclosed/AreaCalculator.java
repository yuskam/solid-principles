package com.qds.solid.openclosed;

public class AreaCalculator {

	public double calculate(Object[] shapes) {
		double area = 0.;

		for (Object shape : shapes) {

			if (shape instanceof Rectangle) {

				Rectangle rectangle = (Rectangle) shape;
				area += rectangle.getWidth() * rectangle.getHeight();
			}

			if (shape instanceof Circle) {
				Circle circle = (Circle) shape;
				area += circle.getRadius() * circle.getRadius() * Math.PI;
			}
		}

		return area;

	}
}
