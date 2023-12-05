package ProgrammingPractice;

public class Personnel {
    private String name;
    private int age;
    private String profession;


    public Personnel(String name, int age, String profession){
        this.name=name;
        this.age=age;
        this.profession=profession;
    }

    public String getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        Personnel personnel = new Personnel("Joshua",34,"Doctor");
          Personnel personnel2 = new Personnel("kennedy",29,"Teacher");
            Personnel personnel3 = new Personnel("Dante",45,"Lawyer");


        System.out.println(personnel.getName() + " is " + personnel.getAge() + " years old and profession is " + personnel.getProfession());
        System.out.println(personnel2.getName() + " is " + personnel2.getAge() + " years old and profession is " + personnel2.getProfession());
        System.out.println(personnel3.getName() + " is " + personnel3.getAge() + " years old and profession is " + personnel3.getProfession());
    }


}
