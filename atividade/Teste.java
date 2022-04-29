package atividade;

public class Teste {
	
	//Instancia os Objetos Passeio e Carga
	private static Passeio veiculoPasseio = new Passeio();
	private static Carga veiculoCarga = new Carga();
	
	//Cria vetores de carga e passeio
	private static Passeio vetoroPasseio[] = new Passeio[5];
	private static Carga vetorCarga[] = new Carga[5];
	
	//Instancia leitura
	private static Leitura leitura  = new Leitura();
	
	public static void main(String[] args) {
		
		boolean choice = true;
		int opcao = 0;
		
		while(choice == true) {
			System.out.println("\nSistema de Gest�o de Ve�culos - Menu Inicial");
			System.out.println("\n\t1. Cadastrar Ve�culo de Passeio");
			System.out.println("\t2. Cadastrar Ve�culo de Carga");
			System.out.println("\t3. Imprimir Todos os Ve�culos de Passeio");
			System.out.println("\t4. Imprimir Todos os Ve�culos de Carga");
			System.out.println("\t5. Imprimir Ve�culo de Passeio pela Placa");
			System.out.println("\t6. Imprimir Ve�culo de Carga pela Placa");
			System.out.println("\t7. Sair do Sistema");
			
			try {
				opcao = Integer.parseInt(leitura.inserirDados("\nEscolha uma das op��es: "));
			} catch(NumberFormatException erro) {
				System.out.println("A Op��o deve ser um n�mero inteiro");
				leitura.inserirDados("");
				
				continue;
			}
			
			switch(opcao){
			
			case 1:
			case 2:	
			case 3:	
			case 4:
			case 5:	
			case 6:	
			case 7:			
				choice = false;
				break;
			default:
				leitura.inserirDados("\nO valor escolhido deve ser de 1 at� 7");
				break;
			}
			
		}
	}
	
}