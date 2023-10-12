import java.util.Scanner;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("Intruduzca la cantidad de números que desea ver de la serie ");
        int numero = lectura.nextInt();

        int num1 = 0;
        int num2 = 1;
        int num;

             for (int i = 0; i <= numero; i++) {
                 System.out.print(num1);
                 num = num1 + num2;
                 num1 = num2;
                 num2 = num;
             }
        
            
        }

        }