package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapeCollector {

    private List<Shape> figures = new ArrayList<>();

    public boolean addFigure(Shape shape){
        figures.add(shape);
        return true;
    }
    public boolean removeFigure(Shape shape){
        if(figures.contains(shape)){
            figures.remove(shape);
            return true;
        }
        return false;
    }
    public Shape getFigure(int figureIndex){
        if(figureIndex >= 0 && figureIndex < figures.size()) {
            return figures.get(figureIndex);
        }
        return  null;
    }
    public String showFigures(){
        if(figures.size() > 0) {
            String result = "";
            Iterator<Shape> figuresIterator = figures.iterator();
            for (Shape shape : figures) {
                result = result + shape.getShapeName() + " ";
            }
            return result.trim();
        }
        return null;
    }
}
