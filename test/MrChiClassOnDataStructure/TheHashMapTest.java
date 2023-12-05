package MrChiClassOnDataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TheHashMapTest {
@Test
    public void testEmptyHashMap(){
    TheHashMap<Integer,String>theHashMap= new TheHashMap<>();
    assertEquals(0, theHashMap.size());
    assertFalse(theHashMap.containsKey(1));
    assertNull(theHashMap.get(1));
}
@Test
    public void testAddAndCollectElements(){
    TheHashMap<Integer, String>theHashMap= new TheHashMap<>();
    theHashMap.put(1,"Beans");
    assertTrue(theHashMap.containsKey(1));
    assertEquals("Beans",theHashMap.get(1));
    assertEquals(1,theHashMap.size());
}
@Test
    public void testRemoveElement(){
    TheHashMap<Integer, String>theHashMap= new TheHashMap<>();
    theHashMap.put(1,"Beans");
    theHashMap.remove(1);
    assertFalse(theHashMap.containsKey(1));
    assertNull(theHashMap.get(1));
    assertEquals(0,theHashMap.size());
}
}