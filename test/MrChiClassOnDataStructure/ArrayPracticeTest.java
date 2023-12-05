package MrChiClassOnDataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPracticeTest {

    @Test
    public void testEmptyArray(){
        ArrayPractice arrayPractice= new ArrayPractice();
        assertTrue(arrayPractice.getClients().isEmpty());
        assertEquals(0,arrayPractice.getNumClients());
    }
    @Test
    public void testAddClients(){
        ArrayPractice arrayPractice= new ArrayPractice();
        arrayPractice.addClient("Client1");
        assertFalse(arrayPractice.getClients().isEmpty());
        assertEquals(1,arrayPractice.getNumClients());
    }
    @Test
    public void testAddMultipleClients(){
        ArrayPractice arrayPractice= new ArrayPractice();
        arrayPractice.addClient("client1");
        arrayPractice.addClient("client2");
        arrayPractice.addClient("client3");
        assertEquals(3,arrayPractice.getNumClients());
    }
    @Test
    public void testRemovingNonePresentClients(){
        ArrayPractice arrayPractice= new ArrayPractice();
        assertFalse(arrayPractice.removeClient("NonePresentClients"));
    }

}