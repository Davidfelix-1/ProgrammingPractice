package MrChiClassOnDataStructure;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    @Test
    public void testEmptyArrayList(){
        MyArrayList myArrayList =new MyArrayList();
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testArrayListSize(){
        MyArrayList myArrayList =new MyArrayList();
        assertEquals(0,myArrayList.size());
    }
    @Test
    public void testIfArrayListCanAddValue(){
        MyArrayList myArrayList= new MyArrayList();
        assertTrue(myArrayList.isEmpty());
        myArrayList.addValue(1);
    }

}