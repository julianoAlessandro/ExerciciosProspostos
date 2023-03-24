
import java.util.Scanner;
public class GerenciarConta{
	public Conta cc = new Conta();
	public Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args ) {
		GerenciarConta gc = new GerenciarConta();
		int opcao = 0;
		do {
			System.out.println("Escolha  uma operação para realizar:");
			System.out.println("1. Cadastrar");
			System.out.println("2. Consultar");
			System.out.println("3. Depositar");
			System.out.println("4. Sacar");
			System.out.println("9. SAIR");
			opcao = Integer.parseInt(gc.sc.nextLine());
			
		
		
		switch(opcao) {
		case 1:
			gc.execCadastrar();
			break;
		case 2:
			gc.execConsultar();
			break;
		case 3:
			gc.execDepositar();
			break;
		case 4:
			gc.execSacar();
			break;
		case 9:
			System.out.println("Programa Encerrado");
			break;
		default:
			System.out.println("Opcao inválida");
			
		}
		
		}while(opcao != 9);
		

		
	}//MAIN
// métodos fora do main mas dentro da classe
	public  void execCadastrar() {
	if(cc.getNumConta() != null) {
		System.out.println("Conta já cadastrada");
		return;
		
	}
	System.out.println("Digite o nome do cliente: ");
	cc.setNomeCliente(sc.nextLine());
	System.out.println("Informe a agencia Bancaria:");
	cc.setAgencia(sc.nextLine());
	System.out.println("Digite o numero da conta :");
	cc.setNumConta(sc.nextLine());
	System.out.println("Conta cadastrada com sucesso!");
	}
	
	public void execConsultar() {
		System.out.println("\nSegue abaixo seus dados:");
		cc.imprimir();
	}
	public void execDepositar() {
		double valor;
		System.out.println("Digite o valor que gostaria de depositar:");
		valor = Double.parseDouble(sc.nextLine());
		cc.depositar(valor);
	}
	public void execSacar() {
		double valor;
		System.out.println("Digite o valor a ser sacado :");
		valor = Double.parseDouble(sc.nextLine());
		boolean ok  = cc.sacar(valor);
		if (ok) {
			System.out.println("Saque efetuado com sucesso !");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	
}// classe GerenciarConta