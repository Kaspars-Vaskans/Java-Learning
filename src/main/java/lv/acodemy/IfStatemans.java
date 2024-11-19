package lv.acodemy;

public class IfStatemans {
    public static void main(String[] args) {

        // Een or Odd

        int number = 7;
        if (number % 2 == 0) {
            System.out.println("The number is even");
        }

        // Check if a number is positive or negative (Assune 0 is possitive)

        number = -5;
        if (number >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }

        // Grade checker (if-else-if)
        // 90 > A
        // 75 -> 89 = B
        // 50 -> 74 = C
        // < 50 = F

        // 1) Create scale variable;
        // 2) Create logic if (score >= 90) -> A
        // 3) Create logic if (score >= 75) -> B
        // 4) Create logic if (score >= 50) -> C
        // 5) Create logic if (score < 50) -> F

        int score = 68;
        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 70) {
            System.out.println("Grade B");
        } else if (score >= 50) {
            System.out.println("Grade C");
        } else if (score < 40) {
            System.out.println("Grade F");
        } else {
            System.out.println("Dont know");
        }



        // Task N1. Check if a person is available to buy alcohol ( If)

        int age = 15;
                if (age >= 18) {
                    System.out.println("You can buy alcohol");
                }

         // Task NR2: Check if a number can be divided by 5:

        int number1 = 5;
                if (number1 % 5 == 0) {
                    System.out.println("Ok");
                }


                //Task Nr3: Check pass or fail;
                // if score >= 50 (passed);
                // all others cases (failed);

        int score1 = 20;
                if (score1 >= 50) {
                    System.out.println("Passed");
                } else {
                    System.out.println("Failed");
                }


                //Task N5. temperature message
                // above 30 (its hot)
                // temperature between 15 and 30

        int temperature = 25;
        if (temperature < 30) {
            System.out.println("Hottt");
        } else if (15 >= temperature && temperature <30) {
            System.out.println("Nice weather");
        } else if (temperature < 15) {
            System.out.println("Cold");
        }





                String color = "Green";
                if (color.equals("Green")) {
                    System.out.println("Go");
                } else if (color.equals("Yellow")) {
                    System.out.println("Slow down");
                } else {
                    System.out.println("Stop");
                }

        sayHello();

    }

    public static void sayHello () {
        System.out.println("Hello");
    }


}

