
import java.util.Scanner;

public class TesteTriangulo {
    public static void main(String[] args) {
        double l1, l2, l3;

        Scanner ler = new Scanner(System.in);

        System.out.println("digite o tamanho dos 3 lados de um triangulo");
        l1 = ler.nextDouble();
        l2 = ler.nextDouble();
        l3 = ler.nextDouble();

        if (l1 + l2 > l3 && l2 + l3 > l1 && l3 + l1 > l2) {
            System.out.println("Estes 3 lados formam um triangulo");
            
            if (l1 == l2 && l2 == l3) {
                System.out.println("É um triangulo equilátero");
            } else if (l1 != l2 && l2 != l3 && l1 != l3) {
                System.out.println("É um triangulo escaleno");
            } else { 
                System.out.println("É um triangulo isósceles");
            }
        } else {
            System.out.println("Não é um triangulo");
        }
        
    }
}