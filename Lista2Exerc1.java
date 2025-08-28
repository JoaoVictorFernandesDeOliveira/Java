
import java.util.Scanner;


public class Lista2Exerc1 {

        public static void main (String [] args){
		
		double valor,aluguelAno1,reajusteAno1,aluguelAno2,reajusteAno2,aluguelAno3,reajusteAno3,aluguelAno4,valorTotal,desconto,valorDesconto,valorComDesconto;
		 

      Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o valor do aluguel ");

		valor = ler.nextDouble();

      aluguelAno1 = valor * 12;
      reajusteAno1 = valor * 1.10 ;
      aluguelAno2 = reajusteAno1 * 12 ; 
      reajusteAno2 = reajusteAno1 * 1.10;
      aluguelAno3 = reajusteAno2 * 12; 
      reajusteAno3 = reajusteAno2 * 1.10 ; 
      aluguelAno4 = reajusteAno3 * 12 ; 

      valorTotal = aluguelAno1 + aluguelAno2 + aluguelAno3 + aluguelAno4 ; 

      System.out.println ("o valor total a que o locador irá receber é " + valorTotal);

      System.out.println (" o valor percentual de desconto que meu pai solicita é  " );

      valorDesconto = ler.nextDouble();

      desconto = valorTotal * (valorDesconto / 100 ) ;

      valorComDesconto = valorTotal - desconto ; 

System.out.println (" o valor final com desconto é " + valorComDesconto );

       
	}
}