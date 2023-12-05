package ProgrammingPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

@Test
public void testIfPersonHasAName(){
Person person = new Person();
person.setName("Brandon");
}

@Test
public void testForTheAgeOfPerson(){
Person person = new Person();
person.setName("Brandon");
assertNotNull("Brandon",person.getName());
person.setAge(50);
assertEquals(50,person.getAge());
}

}