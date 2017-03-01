package com.bizruntime.task3.TestingFActort;

public class ShapeFactory {
	
	public Shape getShape(String ShapeType){
		if (ShapeType == null) {
			return null;
		}
		if (ShapeType == "CIRCLE") {
			return new Circle();
		}else if (ShapeType == "RECTANGLE") {
			return new Rectangle();
		}else if (ShapeType == "SQUARE") {
			return new Squre();
		}
		return null;	
	}
}
