/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
 
/**
 *
 * @author student1
 */
public class JavaApplication3 {
    
    public static double multiply(int a,int b) {
        return a*b;
    }
    
    public static double divide(int a,int b) {
        return a/b;
    }
    
    public static long factorialUsingForLoop(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    
    public static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
    }
    
    public static void printMenu(){
        System.out.println("1. Factorial");
        System.out.println("2. Multiply");
        System.out.println("3. Divide");
        System.out.println("4. Exit");
        
        System.out.println("Enter choice");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
                if(isNumeric(input)){
                    long result = factorialUsingForLoop((int) Double.parseDouble(input));
                    userChoice((int) result);
                }
        System.out.println("ERROR!\n");
        printMenu();
    }
    
    public static void userChoice(int choice){
        Scanner in = new Scanner(System.in);
        String input;
        String input1;
        switch(choice){
            case 1:
                System.out.println("Enter number for calculation");
                input = in.nextLine();
                if(isNumeric(input)){
                    long result = factorialUsingForLoop((int) Double.parseDouble(input));
                    System.out.println(result + "\n");
                    printMenu();
                }
                System.out.println("WRONG INPUT!\n");
                printMenu();
                break;
            case 2:
                System.out.println("Enter numbers for calculation");
                in = new Scanner(System.in);
                input = in.nextLine();
                input1 = in.nextLine();
                if(isNumeric(input) && isNumeric(input)){
                    double result = multiply(Integer.parseInt(input), Integer.parseInt(input1));
                    System.out.println(result + "\n");
                    printMenu();
                }
                System.out.println("WRONG INPUT!\n");
                printMenu();
                break;
            case 3:
                System.out.println("Enter numbers for calculation");
                in = new Scanner(System.in);
                input = in.nextLine();
                input1 = in.nextLine();
                if(isNumeric(input) && isNumeric(input)){
                    double result = multiply(Integer.parseInt(input), Integer.parseInt(input1));
                    System.out.println(result + "\n");
                    printMenu();
                }
                System.out.println("WRONG INPUT!\n");
                printMenu();
                break;
            case 4:
                break;
            default:
                System.out.println("WRONG INPUT!\n");
                printMenu();
                break;
        }
    }
    
    public static void main(String[] args) {
        printMenu();
        
    }
    
}
