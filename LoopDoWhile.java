public class LoopDoWhile {

	public static void  main (String[]args){

		int soma = 0 ;

		int numero = 10;
	
do {

soma = soma + numero;
numero -- ;


} while (numero > 0 );

System.out.println("A soma dos números inteiros positivos é: " + soma);
	}


}