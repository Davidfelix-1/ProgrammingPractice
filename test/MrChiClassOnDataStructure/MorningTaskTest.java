package MrChiClassOnDataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorningTaskTest {

    @Test
    public void testIfArrayCanTakeNumbers(){
        MorningTask morningTask= new MorningTask();
        int [] arrOne = {42, 18, 41, 22, 15, 12};
        morningTask.arrOne();
        System.out.println("First output"+arrOne);
    }
    @Test
    public void testIfArrayCanTakeInFiveNumbers(){
        MorningTask morningTask=new MorningTask();
        int [] arrTwo={42, 18, 41, 23, 15};
        morningTask.arrTwo();
        System.out.println("Second output"+arrTwo);
    }


}