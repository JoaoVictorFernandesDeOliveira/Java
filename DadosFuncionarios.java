public class DadosFuncionarios {


	
String nome ;
String cargo;
int idade;

DadosFuncionarios ( String nomeInt,String cargoInt,int idadeInt){

	nome = nomeInt;
	cargo = cargoInt;
	idade = idadeInt;
}

DadosFuncionarios (){

}


public static void main (String []args){

DadosFuncionarios funcionario = new DadosFuncionarios();

funcionario.nome = "João";


System.out.println("o nome do funcionario é " + funcionario.nome);
System.out.println("o cargo do funcionario é " + funcionario.cargo);
System.out.println("a idade do funcionario é " + funcionario.idade);
}
}
