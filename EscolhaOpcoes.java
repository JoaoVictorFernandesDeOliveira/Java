import java.util.Scanner;

public class EscolhaOpcoes {

    public static void main(String[] args) {

    int n1,n2,n3,soma,multi;
    int opcao;
    double media;

Scanner ler = new Scanner (System.in);

System.out.println("digite 3 numeros  ");

n1 = ler.nextInt();
n2 = ler.nextInt();
n3 = ler.nextInt();

System.out.println("escolha 1(Pra fazer a media),2(pra somar) ou 3(pra multiplicar) ");
    
opcao = ler.nextInt();


switch (opcao){

case 1 : media = (n1+n2+n3)/3.0;
System.out.println("a media desses numeros é " + media );
break;
case 2 : soma = n1+n2+n3;
System.out.println("a soma desses numeros é " + soma);
break;
case 3 : multi = n1*n2*n3;
    System.out.println("a multiplicação desses numeros é " + multi);
break;



}

    }
    }