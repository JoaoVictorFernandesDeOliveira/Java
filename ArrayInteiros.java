import java.util.Scanner;

public class ArrayInteiros {

    public static void main(String[] args) {

    int[] num = new int[10];
int contadorNegativos = 0;
Scanner ler = new Scanner(System.in);

System.out.println(" complete o array com valores inteiros");

    for (int i = 0; i < 10; i++) {
            
            num[i] = ler.nextInt();
        }

for (int i = 0; i < 10; i++) {
            if (num[i] < 0) {
                contadorNegativos++;
            }
        }       
if (contadorNegativos == 0) {
            System.out.println("não tem numeros negativos");
            return;
 }
System.out.println("quantidade de numeros negativos no array : " + contadorNegativos);
    }
      
       
        
    }
