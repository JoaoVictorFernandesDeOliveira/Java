package infocarro;

public class Carro {

    String marcaDoCarro;
    String modeloDoCarro;
    int anoDoCarro;


    public Carro(){
    marcaDoCarro =  "Desconhecida";
    modeloDoCarro =  "Desconhecido";
    anoDoCarro =  0;
    }
    public Carro(String marca,String modelo){
        modeloDoCarro= modelo;
        marcaDoCarro= marca;
        anoDoCarro=  0;
    }
    public Carro (String marca,String modelo,int ano){
        marcaDoCarro= marca;
        modeloDoCarro= modelo;
        anoDoCarro= ano;
    }
public void exibirDetalhes(){
    System.out.println("marca"+marcaDoCarro);
    System.out.println("modelo"+modeloDoCarro);
    System.out.println("ano"+anoDoCarro);
    System.out.println();
    }

}

