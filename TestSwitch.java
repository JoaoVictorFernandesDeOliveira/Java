
import java.util.Scanner;

public class TestSwitch {


	public static void main (String []args){

		int nivel ;

		Scanner ler = new Scanner (System.in);

		System.out.println ("escolha uma das opções 1(Muito insatisfeito),2(Insatisfeito),3(Neutro),4(Satisfeito),5(Muito satisfeito) "  );

nivel = ler.nextInt();
		switch (nivel){


		case 1 -> System.out.println ("Muito insatisfeito");
		case 2 -> System.out.println (" Insatisfeito");
			case 3 -> System.out.println ("Neutro");
			case 4 -> System.out.println ("Satisfeito");
			case 5 -> System.out.println ("Muito Satisfeito");


	default -> System.out.println ("opção invalida");

		}




		}
	}
