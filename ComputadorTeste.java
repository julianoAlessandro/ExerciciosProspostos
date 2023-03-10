public class ComputadorTeste {
	public static void main(String[] args) {
		Computador t = new Computador("HP","vermelho","celta",1.678,1234);
		Computador g = new Computador("ibm","Azul","celta",1.777,12);
		t.imprimir();
		t.calcularValor();
		t.imprimir();
		g.imprimir();
		g.calcularValor();
		g.imprimir();
		g.alterarValor(1);
		
	}

}
