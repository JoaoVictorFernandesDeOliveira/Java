import java.util.Scanner;

public class ArrayValores {

    public static void main(String[] args) {

      
        double[] d = new double[10];
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println(" digite 10 valores double para o array 'd':");
       
        for (int i = 0; i < 10; i++) {            
            d[i] = ler.nextDouble(); 
        }
        
       
        }
        
     
    }
