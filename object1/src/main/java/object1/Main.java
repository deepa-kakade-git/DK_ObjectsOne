package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");


        Person person1 = new Person("John ", 30);

        Chair chair = new Chair("wooden", "Red", 4);
        Car car = new Car("Mustang ", " Mach e", 2023, 1000);
        System.out.println("Name :" + person1.name + "Age : " + " " + person1.age + "Height :" + person1.height);
        System.out.println("Make :" + car.getMake() + "Model " + car.getModel() + "Year :" + car.getYear() + "Mileage :" + car.getMileage() );
        System.out.println("Material :" + chair.getMaterial() + "Color :" + chair.getColor() + "Legs :" + chair.getLegs());
    }
}
