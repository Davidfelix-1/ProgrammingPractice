package ProgrammingPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    public void testForTheHeightOfRectangle(){
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(40);
        assertEquals(40,rectangle.getHeight());
    }

    @Test
    public void testForTheWidthOfRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(30);
        assertEquals(30,rectangle.getWidth());
    }
    @Test
    public void testForPerimeterOfRectangle(){
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(40);
        assertEquals(40,rectangle.getHeight());
        rectangle.setWidth(30);
        assertEquals(30,rectangle.getWidth());
        rectangle.getPerimeter();
        assertEquals(140.0,rectangle.getPerimeter());
    }
    @Test
    public void testForAreaOfRectangle(){
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(40);
        assertEquals(40,rectangle.getHeight());
        rectangle.setWidth(30);
        assertEquals(30,rectangle.getWidth());
        rectangle.getArea();
        assertEquals(1200.0,rectangle.getArea() );
    }


}