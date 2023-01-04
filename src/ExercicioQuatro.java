import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         int quantNumeros;
         int numero;

         System.out.println("Quantidade de números:  ");
         quantNumeros = scan.nextInt();

         int count =0;
         do {
             System.out.println("Numero:  ");
             numero = scan.nextInt();
 
             count = count + 1;
         } while(count < quantNumeros);
    
    }
}
