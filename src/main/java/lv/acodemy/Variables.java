package lv.acodemy;

public class Variables {
    public static void main(String[] args) {

        // This is my comment

        /*
        This is first line
        This is second line
        This is third line
         */

        // int (integer) - whole number / natural number
        int age =35;
        int currentYear = 2024;
        // currentYear = camel Case
        // current-year = kebab case - never do like this!!!
        // current_year = snake case - never do like this!!!

        int inventoryItemCount = 100;

        System.out.println(age);
        System.out.println(currentYear);
        System.out.println(inventoryItemCount);

        // double (fractional numbers)
        double temperature = 36.6;
        double price = 19.99;
        double distance = 38004.0;


        System.out.println(temperature);
        System.out.println(price);

        //char (symbols)

        char grade = 'A';
        char myInitial = 'N';
        char currentSymbol = '$';

        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(currentSymbol);

        // boolean (logical type, can keep two values: true or false)
        // How to name ? has or is
        // Example: isSummer / if(isSummer){}; / isLoggedIn;
        // Example: hasAccess / if(hasAcces) {};

        boolean hasAcces = true;
        System.out.println(hasAcces);

        boolean isSummer = true;
        System.out.println(isSummer); // \n

        System.out.print("Hello World\n");
        System.out.print("Hello World\n");

        // long
        long phoneNumber = 35433168;

        //float
        float interestRate = 4.5f;

        // Arithmetics operators

        int a = 10;
        int b = 5;
        int sum = a + b; // add
        System.out.println(sum);

        int c = 20;
        int d = 8;
        int difference =  c - d;
        System.out.println(difference);

        int m = 7;
        int n = 3;
        int result =  m * n;
        System.out.println(result);

        int num1 = 10;
        int num2 = 3;
        int division =  num1 / num2;
        System.out.println(division);

        double num3 = 10.0;
        double num4 = 3.0;
        double divResult =  num3 / num4;
        System.out.println(divResult);


        // % (remainder of a division)

        int f = 12;
        int g = 5;
        int remainder = f % g;
        System.out.println(remainder);

        int number = 8;
        boolean inEven = (number % 2 == 0); // == comparison operator
        System.out.println(inEven);

        // increment ++
        // preDecrement --
        // preIncrement
        // decrement --

        number++;
        System.out.println(number);
        number--;
        System.out.println(number);

        int counter = 10;
        counter++;
        int postIncrement = counter++;
        int preIncrement = ++counter;
        System.out.println(postIncrement);
        System.out.println(preIncrement);





    }
}
