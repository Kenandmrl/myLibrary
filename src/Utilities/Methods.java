package Utilities;

import javax.swing.*;
import java.util.*;
import static java.lang.Math.PI;

public class Methods {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scannerInt = new Scanner(System.in);

    static Random random = new Random();

    public static void typeChangeSI() {
        //Converting the string received from the user to Integer
        //String->Integer

        System.out.print("enter valid string : ");
        String value = scanner.nextLine();
        int conversion = Integer.parseInt(value);
        System.out.println("type conversion :" + conversion);

    }

    public static void typeChangeIS() {
        //Converting valid Integer from user to String
        //Integer->String

        System.out.print("enter valid Integer : ");
        int type = scanner.nextInt();
        String conversion = Integer.toString(type);
        System.out.println("type conversion :" + conversion);

    }

    public static void StringOperations() {
        //String all operations of a text

        System.out.print("Enter text : ");
        String text = scanner.nextLine();
        System.out.println("lenght: " + text.length());
        System.out.println("first letter: " + text.charAt(0));
        System.out.println("last letter: " + text.charAt(text.length() - 1));
        System.out.println("new  text: " + text.replaceFirst("a", "*"));//a->*(target)
        System.out.println("text after remove according to a: " + text.replace("a", ""));
        System.out.println("regextip: " + text.replaceAll("[kenan]", "*"));
        System.out.println("a,b,c -> _ : " + text.replaceAll("[abc]", "_"));
        System.out.println("capital letters -> _ : " + text.replaceAll("[A-Z]", "_"));
        System.out.println("lowercase version: " + text.toLowerCase());
        System.out.println("uppercase version: " + text.toUpperCase());
        System.out.println("trimmed text: " + text.trim());
    }

    public static void equals() {
        System.out.print("Enter text 1 :");
        String text_1 = scanner.nextLine();
        System.out.print("Enter text 2 :");
        String text_2 = scanner.nextLine();

        System.out.println("Are text 1 and text 2 the same?: " + text_1.equals(text_2));//same text_2.equals(text_1)
        System.out.println("Are text 1 and text 2 the same?(equalsignorecase): " + text_1.equalsIgnoreCase(text_2));//no matter big or small

    }

    public static void reverseNumber3(int number) {

        int hundredsDigit = (number / 100) % 10;
        int tensDigit = (number / 10) % 10;
        int onesDigit = number % 10;
        int reverse = onesDigit * 100 + tensDigit * 10 + hundredsDigit;

        System.out.println("reverse number: " + reverse);

    }

    public static void singleOrdouble(int number) {


        if (number % 2 == 1) {
            System.out.println("odd number");
        } else System.out.println("Even number");
    }

    public static void factorial(int number) {

        int Factorial = 1;

        for (int i = 1; i <= number; i++) {
            Factorial *= i; //1*2*3*4*5*.....*i
        }
        System.out.println("factorial of the number you entered: " + Factorial);

    }

    public static void theValueoftheNumber(int number) {

        if (number > 0) {
            System.out.println("pozitive");
        }
        if (number < 0) {
            System.out.println("negative");
        }
        if (number == 0) {
            System.out.println("none");
        }
    }

    public static void greatestFind(int numberOne, int numberTwo, int numberThree) {
        //find the larger of the 3 entered numbers

        /**
         System.out.print("Enter the 1st number: ");
         int numberOne= scanner.nextInt();
         System.out.print("Enter the 2nd number: ");
         int numberTwo= scanner.nextInt();
         System.out.print("Enter the 3rd number: ");
         int numberThree= scanner.nextInt(); */

        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("largest number: " + numberOne);

        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println("largest number: " + numberTwo);

        } else System.out.println("largest number: " + numberThree);
    }

    public static void basiCalculator() {

        System.out.print("Enter the 1st number: ");
        double number1 = scannerInt.nextInt();
        System.out.print("Enter the 2nd number: ");
        double number2 = scannerInt.nextInt();

        System.out.print("for collection: C\nfor extraction: E\nfor multiplication: M\nfor partition: P\nChoose= ");
        String process = scanner.next();

        switch (process.toUpperCase()) {
            case "C":
                System.out.println("Total= " + (number1 + number2));
                break;
            case "E":
                System.out.println("Extraction= " + (number1 - number2));
                break;
            case "M":
                System.out.println("Multiplication= " + (number1 * number2));
                break;
            case "P":
                System.out.println("Divide= " + (number1 / number2));
                break;
            default:
                System.out.println("invalid value!!");
        }
    }

    public static void ReverseaNumberWithWhile(long value) {

        System.out.print("the reverse of your number: ");

        while (value > 0) {
            System.out.print(value % 10);
            value /= 10;
        }
    }

    public static String ReverseTextWithFor(String text) {
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        System.out.println(reverse);

        return reverse;
    }

    public static void InverseOfTextWithStringbuffer(String text) {

        StringBuffer a = new StringBuffer(text);
        System.out.println("reverse text: " + a.reverse());

    }

    public static void theMultiplicationTable() {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + " = " + (i * j));
            }
            System.out.println();//open bottom row for each transaction

        }
    }

    public static void pattern() {
        //Create the following image with *
        // *
        // **
        // ***
        // ****
        // *****
        // *****
        // ****
        // ***
        // **
        // *
        for (int j = 1; j <= 5; j++) {

            for (int i = 1; i <= j; i++)
                System.out.print("*");

            System.out.println();
        }

        for (int j = 4; j > 0; j--) {

            for (int i = 1; i <= j; i++)
                System.out.print("*");

            System.out.println();

        }
    }

    public static void exponentiationOfaNumber() {
        int base = 0, exponent = 0, result = 1;

        base = Integer.parseInt(JOptionPane.showInputDialog("enter the radix :"));
        exponent = Integer.parseInt(JOptionPane.showInputDialog("enter the number base: "));

        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        JOptionPane.showMessageDialog(null, result);
        //JOptionPane.showMessageDialog(null,String.format("%d to the power of %d= %d", base,exponent,result));
        //I am giving null because I will not be connected to any frame.
    }

    public static void randomDizi(int line, int column) {

        int[][] rDizi = new int[line][column];

        for (int i = 0; i < rDizi.length; i++) {
            for (int j = 0; j < rDizi[0].length; j++) {
                rDizi[i][j] = random.nextInt(10);//0-9
                System.out.print(rDizi[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findPrimeNumber(int parameter) {
        //Finding the prime numbers after generating random numbers as the number
        // entered as a parameter and throwing these numbers into an array
        int[] arr = new int[parameter];
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {

            arr[i] = random.nextInt(50) + 1;//1-50
        }
        System.out.println(Arrays.toString(arr) + "\n"); //print+newline

        for (int x = 1; x < arr.length; x++) {

            counter = 0;
            for (int j = 1; j <= arr[x]; j++) {
                if ((arr[x] % j) == 0) //divisible by 1 and itself
                {
                    counter++;
                }
            }
            if (counter == 2)//smallest prime number is 2
            {
                System.out.println(arr[x] + " is a prime number. ");

            }
        }
    }

    public static void hypotenuse(double x, double y) {
        //to find the hypotenuse of a right triangle:x*x+y*y=z*z (hypotenuse(z))
        double hypotenuse = x * x + y * y;
        System.out.println("hypotenuse value(z) :" + Math.sqrt(hypotenuse));

    }

    public static double volumeofSphere(double radius) {
        //volume formula: (4/3)*pi*r^3
        // To use the return value, we must assign it to a double value.

        return (PI * Math.pow(radius, 3.0)) * 4 / 3; //r^3=Math.pow(radius,3.0)
    }

    public static double volumeofThePrism(double lenght, double width, double height) {
        // VolumeofThePrism:lenght*width*height
        // To use the return value, we must assign it to a double value.
        return lenght * width * height;
    }
}
