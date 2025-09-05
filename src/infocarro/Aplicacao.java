package infocarro;


public class Aplicacao {
public static void main (String[] args){

Carro c = new Carro();
Carro c2 = new Carro("antigo","fiat");
Carro c3 = new Carro("novo","ferrari",2000);
    System.out.println("Carro 1");
c.exibirDetalhes();

    System.out.println("Carro 2");
c2.exibirDetalhes();

    System.out.println("Carro 3");
c3.exibirDetalhes();
}

}
