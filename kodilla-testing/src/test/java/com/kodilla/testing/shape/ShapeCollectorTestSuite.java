package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Nested
    @DisplayName("Tests for adding and removing figures")
    class AddRemoveShapes{
        @Test
        void testAddFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(3);
            //When
            boolean result = shapeCollector.addFigure(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(shape.getShapeName(), shapeCollector.showFigures());
        }
        @Test
        void testRemoveFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(2.5);
            shapeCollector.addFigure(shape);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertNull(shapeCollector.showFigures());
        }
        @Test
        void testRemoveNonExistingFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(2.5);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            Assertions.assertFalse(result);
        }

    }
    @Nested
    @DisplayName("Tests for retrieving figures")
    class RetrieveShapes{
        @Test
        void testGetFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(2.5);
            shapeCollector.addFigure(shape);
            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(shape, retrievedShape);
        }
        @Test
        void testGetNonExistingFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(2.5);
            shapeCollector.addFigure(shape);
            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(4);
            //Then
            Assertions.assertNull(retrievedShape);
        }
        @Test
        void testGetNegativeFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(2.5);
            shapeCollector.addFigure(shape);
            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(-4);
            //Then
            Assertions.assertNull(retrievedShape);
        }
        @Test
        void testShowFigures(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Triangle(5, 7.8);
            Shape shape2 = new Square(2);
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            //When
            String result = shape1.getShapeName() + " " + shape2.getShapeName();
            String receivedResult;
            receivedResult = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals(result, receivedResult);
        }

    }
}
