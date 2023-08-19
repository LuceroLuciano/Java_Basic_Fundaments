package calculator;

import java.util.Scanner;

public class calculator {
  public static void main (String[] args) {
    System.out.println("**** Calculator ***");

    String numberString1 = "";
    String numbreString2 = "";
    float numberFloat1;
    float numberFloat2;
    
    float result;

    // Create an Scanner object for read the input of user
    Scanner scanner = new Scanner(System.in);

    // Ask the user for a number1 
    System.out.print("Ingresa primer numero: ");  
    // Read the number1 
    numberString1 = scanner.nextLine();
    // convert the numberstring to numberfloat
    numberFloat1 = Float.parseFloat(numberString1);
    
    System.out.println("Ingresa segundo numero: ");
    numbreString2 = scanner.nextLine();
    numberFloat2 = Float.parseFloat(numbreString2);

    result = (numberFloat1 + numberFloat2);   
    System.out.println("La suma de los numeros que ingreso es: " + result);

    result = (numberFloat1 - numberFloat2);
    System.out.println("La resta de los numeros que ingreso es: " + result);

    result = (numberFloat1 * numberFloat2);
    System.out.println("La multiplicación de los numeros que ingreso es: " + result);

    result = (numberFloat1 / numberFloat2);
    System.out.println("La division de los numero que ingreso es:  " + result);
  }
}
