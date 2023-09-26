/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1.pkgif.statement_o;
import java.util.Scanner;
/**
 *
 * @author Jacqueline Sarabia
 */
public class Practica1IfStatement_O {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        int numero;
        System.out.println("Ingresa un numero");
        numero = lectura.nextInt();
        
        if (numero % 2 == 0)
        {
            System.out.println("El numero ingresado es par");
        } 
        else 
        {
            System.out.println("El numero ingresado es impar");
        }

        lectura.close();
    }
    
}
