import java.util.Scanner;
public class Exercice4 {
    public static void main(String[] argv) {
        float x;
        float y;
        float addition;
        float subtraction;
        float multiplication;
        float division;
        int operation;
        System.out.println("Enter the num1:");
//Reading the value
        Scanner inputValue;
        inputValue =new Scanner(System.in);
        x = inputValue.nextFloat();
        /////////////
        System.out.println("Enter the num552:");
//Reading the value2
        y = inputValue.nextFloat();
        addition = x + y;
        subtraction = x - y;
        multiplication = x * y;
        division = x / y;
        System.out.println("La suma es: " + addition);
        System.out.println("La suma es: " + subtraction);
        System.out.println("La suma es: " + multiplication);
        System.out.println("La suma es: " + division);


    }
}
