
import java.util.Scanner;

public class NumeroParOuPositivo{
public static void main (String[]args)	{

int num;

Scanner ler = new Scanner (System.in);

System.out.println("digite um numero inteiro ");

num = ler.nextInt();


if (num%2==0){
	System.out.println("este número é par:" + num );
}
else{
	System.out.println("este número é ímpar:" + num );
}

if (num>0){
	System.out.println("este número é positivo:" + num );
}
else{
	System.out.println("este número é negativo:" + num );
}


}
}