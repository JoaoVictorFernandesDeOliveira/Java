//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

public Produto(String nomeString,double precoDouble,int quantidadeEstoqueInt){
    nome=nomeString;
    preco=precoDouble;
    quantidadeEmEstoque=quantidadeEstoqueInt;
}
public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

public static void main (String[] args){
// Criando um novo objeto (instância) da classe Produto
    // O objeto 'tp' é utilizado para acessar o construtor da classe
    Produto tp = new Produto("Café", 12.50, 50);
// O objeto 'tp' é utilizado para chamar o método
    tp.exibirInformacoes();

}

    }
