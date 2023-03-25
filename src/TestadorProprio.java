/**
 * TSI - POO - Allan Amâncio, Márcio José, Yuri Sousa
 * Testador criado por nós para o nosso projeto
*/
import classes.Estacionamento;


public class TestadorProprio {

	public static void main(String[] args) throws Exception{
		Estacionamento estacionamento = new Estacionamento(10);	//10 vaga

		try {
			System.out.println("Listar geral:");
			for(String s : estacionamento.listarGeral()) {
				System.out.println(s);
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			estacionamento.entrar("AAA1111",1);
			System.out.println("Listar geral novamente:");
			for(String vagas : estacionamento.listarGeral()) {
				System.out.println(vagas);
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			estacionamento.entrar("AAA2222",2);
			System.out.println("Listar geral novamente:");
			for(String vagas : estacionamento.listarGeral()) {
				System.out.println(vagas);
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			estacionamento.sair(1);
			System.out.println("Listar geral novamente:");
			for(String vagas : estacionamento.listarGeral()) {
				System.out.println(vagas);
		}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			estacionamento.entrar("AAA333", 3);
			System.out.println("Listar geral novamente:");
			for(String vagas : estacionamento.listarGeral()) {
				System.out.println(vagas);
		}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			estacionamento.transferir(3, 4);
			System.out.println("Listar geral novamente:");
			for(String vagas : estacionamento.listarGeral()) {
				System.out.println(vagas);
		}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
