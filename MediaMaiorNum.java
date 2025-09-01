import java.util.Scanner;

public class MediaMaiorNum {
    public static void main(String[] args) {

        double n1,n2,n3,media;
Scanner ler = new Scanner(System.in);
System.out.println("digite as 3 notas");
n1 = ler.nextDouble();
        n2 = ler.nextDouble();
        n3 = ler.nextDouble();

        if (n1>n2 && n1>n3){
            System.out.println("o maior numero é " + n1);
        }
        else if (n2>n1 && n2>n3){
            System.out.println("o maior numero é " + n2);
        }else{
            System.out.println("o maior numero é " + n3);
        }


media  = (n1+n2+n3)/3;


   System.out.println("a média das notas é " + media);




    }
      }