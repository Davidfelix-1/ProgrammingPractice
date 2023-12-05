package ProgrammingPractice;

public class Dog {

    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Angela","German Shepherd");
        Dog myDog2 = new Dog("Bingo","PitBull");
        Dog myDog3 = new Dog("Royal","Chihuahua");

        System.out.println(myDog.getName() + " is " + myDog.getBreed() );
        System.out.println(myDog2.getName() + " is " + myDog2.getBreed() );
        System.out.println(myDog3.getName() + " is " + myDog3.getBreed() );

    }
}
