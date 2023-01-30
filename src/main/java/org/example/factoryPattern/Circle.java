package org.example.factoryPattern;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing "+this.getClass().getSimpleName());
    }
}
