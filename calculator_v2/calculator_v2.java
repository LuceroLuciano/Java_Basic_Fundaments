package calculator_v2;

import java.util.Scanner;

public class calculator_v2 {
  public static void main(String[] args) {
    
    System.out.println("**** BASIC CALCULATOR BY LUCERO ***");

    String numberString1 = "";
    String numbreString2 = "";
    float numberFloat1;
    float numberFloat2;
    String optionByUserString = "";
    int optionByUserInt = 1;
    
    float result;

    // Create an Scanner object for read the input of user
    Scanner scanner = new Scanner(System.in);

    while (optionByUserInt != 0) {
      System.out.print("========================================");
      System.out.println("\n **** MENU DE CALCULADORA ****\n");
      System.out.println("    1) Suma \n");
      System.out.println("    2) Resta  \n");
      System.out.println("    3) Multiplicación \n");
      System.out.println("    4) Division \n");
      System.out.println("    0) Salir del sistema\n");
      System.out.println("================================================");

      // read the option input by user
      System.out.print("Elige una opicón: ");
      optionByUserString = scanner.nextLine();
      optionByUserInt = Integer.parseInt(optionByUserString);

      switch (optionByUserInt) {
        case 1:
          System.out.print("Ingresa primer numero: ");  
          numberString1 = scanner.nextLine();
          numberFloat1 = Float.parseFloat(numberString1);
          
          System.out.print("Ingresa segundo numero: ");
          numbreString2 = scanner.nextLine();

          numberFloat2 = Float.parseFloat(numbreString2);
          result = (numberFloat1 + numberFloat2);   
          System.out.println("La suma de los numeros que ingreso es: " + result);
          break;

        case 2:
          System.out.print("Ingresa primer numero: ");  
          numberString1 = scanner.nextLine();
          numberFloat1 = Float.parseFloat(numberString1);
          
          System.out.print("Ingresa segundo numero: ");
          numbreString2 = scanner.nextLine();
          numberFloat2 = Float.parseFloat(numbreString2);

          result = (numberFloat1 - numberFloat2);
          System.out.println("La resta de los numeros que ingreso es: " + result);
          break;

        case 3:
          System.out.print("Ingresa primer numero: ");  
          numberString1 = scanner.nextLine();
          numberFloat1 = Float.parseFloat(numberString1);
          
          System.out.print("Ingresa segundo numero: ");
          numbreString2 = scanner.nextLine();
          numberFloat2 = Float.parseFloat(numbreString2);

          result = (numberFloat1 * numberFloat2);
          System.out.println("La multiplicación de los numeros que ingreso es: " + result);
          break;

        case 4:
          System.out.print("Ingresa primer numero: ");  
          numberString1 = scanner.nextLine();
          numberFloat1 = Float.parseFloat(numberString1);
          
          System.out.print("Ingresa segundo numero: ");
          numbreString2 = scanner.nextLine();
          numberFloat2 = Float.parseFloat(numbreString2);

          result = (numberFloat1 / numberFloat2);
          System.out.println("La division de los numero que ingreso es:  " + result);
          break;

        default:
          System.out.println("Saliste del sistema. Grcias por tu visita. \nVuelve pronto :)");
      }
    }
  }
}
