

 import java.util.Scanner;

public class OrdenarValores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

System.out.println("Digite os 3 valores");
 int v1 = ler.nextInt();
 int v2 = ler.nextInt();
int v3 = ler.nextInt();

System.out.println("Digite o código de condição ('c' para crescente, 'd' para decrescente):");
 char codigo = ler.next().charAt(0);

 switch (codigo) {
    case 'c':
                System.out.println("Valores em ordem crescente:");
 if (v1 <= v2 && v2 <= v3) {
                    System.out.println("crescente" + v1 + v2 + v3);
    } else if (v1 <= v3 && v3 <= v2) {
                    System.out.println("crescente" + v1 + v3 + v2);
    } else if (v2 <= v1 && v1 <= v3) {
                    System.out.println("crescente" + v2 + v1 + v3);
     } else if (v2 <= v3 && v3 <= v1) {
                    System.out.println("crescente" + v2 + v3 + v1);
             } else if (v3 <= v1 && v1 <= v2) {
        System.out.println("crescente" + v3 + v1 + v2);
     } else {
                    System.out.println("crescente" + v3 + v2 + v1);
         }
                break;
    case 'd':
                System.out.println("Valores em ordem decrescente:");
if (v1 >= v2 && v2 >= v3) {
        System.out.println("decrescente" + v1 + v2 + v3);
} else if (v1 >= v3 && v3 >= v2) {
            System.out.println("decrescente" + v1 + v3 + v2);
     } else if (v2 >= v1 && v1 >= v3) {
                    System.out.println("decrescente" + v2 + v1 + v3);
        } else if (v2 >= v3 && v3 >= v1) {
                System.out.println("decrescente" + v2 + v3 + v1);
        } else if (v3 >= v1 && v1 >= v2) {
            System.out.println("decrescente" + v3 + v1 + v2);
    } else {
        ystem.out.println("decrescente" + v3 + v2 + v1);
        }
                break;
default:
     System.out.println("Código de condição inválido. Use 'c' ou 'd'.");
        break;
}
ler.close();
    }
}