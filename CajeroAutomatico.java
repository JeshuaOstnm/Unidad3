package cajero.automatico;
import java.util.Scanner;
public class CajeroAutomatico {
    
    public static void main(String[] args) {
        int saldo = 2500, retirar, deposito;
        Scanner lectura = new Scanner(System.in);
        while(true)
        {
            System.out.println("BIENVENIDO AL CAJERO AUTOMATICO");
            System.out.println("-----------------------------------");
            System.out.println("PRESIONE 1 PARA RETIRAR SALDO");
            System.out.println("PRESIONE 2 PARA DEPOSITAR SALDO");
            System.out.println("PRESIONE 3 PARA VERIFICAR SU SALDO");
            System.out.println("------------------------------------");
            System.out.print("POR FAVOR SELECCIONE LA OPERACION QUE DESEA REALIZAR:");
            int num = lectura.nextInt();
            switch(num)
            {
                case 1:
                System.out.print("Ingrese la cantidad que quiere retira:");
                retirar = lectura.nextInt();
                if(saldo >= retirar)
                {
                    saldo = saldo - retirar;
                    System.out.println("Cantidad retirada");
                }
                else
                {
                    System.out.println("Saldo insuficuiente");
                }
 
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Ingrese la cantidad a depositar:");
                deposito = lectura.nextInt();
                saldo = saldo + deposito;
                System.out.println("Cantidad depositada con exito");
 
                break;
 
                case 3:
                System.out.println("Saldo : "+saldo);
 
                break;
                
            }
        }
        
    }

    }
