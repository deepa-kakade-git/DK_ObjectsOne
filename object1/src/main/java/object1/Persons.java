package object1;

class Person {
    // Define Instance Variables
    // different for each object!
    String name;
    int age = 0;
    int height;


    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        // Declare and initialize an object
        Person person1 = new Person("John", 30);

        /* Now you can use the Object `person1` */

    }

}
