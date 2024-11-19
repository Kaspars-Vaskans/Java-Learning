package lv.acodemy;

public class Methods {
    public static void main(String[] args) {

        // Access modifier (public, private, protected, package-private)
        // Can return specific data type
        // void - if we do not return anything
        // Method name: should be unique, camelCase;
        // Parameters
        // return keyword if we return something


        // To create method
        // [access modifier] [other modifiers] [return type] methodName {
        // method body
        // return [value]



        sayHello();

        greet("Kaspars");
        greet("Alex");
        greet("Bob");
        greet("Jasper");


        System.out.println(add(22, 44));
        int x = add(22, 44);
        System.out.println(x);


        System.out.println(add(12.2, 13.5));

        double a = 12.2;
        double b = 15.5;
        System.out.println(a + b);
    }




    public static void sayHello () {
        System.out.println("Hello");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method overloading

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }



    }

