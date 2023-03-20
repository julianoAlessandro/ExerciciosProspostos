public class ComputadorTeste2 {

	public static void main(String[] args) {
		Computador2 t = new Computador2();
			t.setMarca("hp");
			t.setModelo("novo");
			t.setCor("black");
			t.setNumeroSerie(123456);
			t.setPreco(5000);
			t.imprimir();
			t.calcularValor();
	
			
			Computador2 g = new Computador2();
			g.setMarca("ibm");
			g.setModelo("zs");
			g.setNumeroSerie(124);
			g.setPreco(7000);
			g.imprimir();
			g.calcularValor();
			boolean ok = g.alterarValor(6000.0);
			if(ok) {
				System.out.println("valor alterado com sucesso");
			}
			else {
				System.out.println("valor invalido");
			}
		

	}

}
