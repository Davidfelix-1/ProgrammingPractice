package ProgrammingPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    public void testForTheAreaOfCircle(){
        Circle circle = new Circle();
        circle.setArea(8);
        assertEquals(201.06192982974676,circle.getArea());
    }
    @Test
    public void testForTheCircumference(){
        Circle circle= new Circle();
        circle.setCircumference(5);
        assertEquals(31.428571428571427,circle.getCircumference());
    }

}