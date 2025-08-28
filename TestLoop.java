public class TestLoop {

	public static void main (String[]args){


		int codigoDeSaida = 9;


		for (int codigoCarteirinha = 1 ;codigoCarteirinha<=10;codigoCarteirinha++){


			if (codigoCarteirinha==codigoDeSaida){
				
System.out.println("codigo de saida encontrado , imterrompendo o loop");
				break;
			}
		if (codigoCarteirinha==3||codigoCarteirinha== 7|| codigoCarteirinha==10){

			System.out.println("codigo aceito da " + codigoCarteirinha + " aceito pelo hospital " );

			continue ; 
		


		}

		System.out.println("estes outros codigos nao sao aceitos "  + codigoCarteirinha);

		}

	}
}