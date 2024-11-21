package lv.acodemy;

import lv.acodemy.object.Car;
import lv.acodemy.object.Dog;

public class ObjectExample {
    public static void main(String[] args) {


    Car audi = new Car("Blue", "RS6");
    audi.start();

    //audi.color = "Blue";
    //audi.model = "RS6";

    audi.setColor("Blue");
    audi.setModel("RS6");




    System.out.println(audi);

        Car bmw = new Car();
        bmw.start();

        // bmw.color = "Black";
        // bmw.model = "GTshka";

        bmw.setColor("Black");
        bmw.setModel("GTshka");

        System.out.println(bmw);

        System.out.println("My car model is " + bmw.getModel() + " and color is: " + bmw.getColor() + "." );


        System.out.println(String.format("My car model is %s and color is: %s.", bmw.getModel(), bmw.getColor() ));

        Dog theSharik = new Dog();
        theSharik.bark();
        theSharik.eat();




    }
}
