public class Computador {
	String marca;
	String cor;
	String modelo;
	double preco;
	long NumeroSerie;
	
	public Computador(String marca,String cor,String modelo,double preco,long NumeroSerie) {
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
		this.NumeroSerie = NumeroSerie;
		
	}//Fim da passagem de parametro 
	
	public void imprimir() {
		System.out.println("marca:"+ marca +"cor:"+cor+"Modelo:"+modelo+"preço:"+preco+"NumeroSerie:"+NumeroSerie);
	}
	
	public void calcularValor() {
		if(marca == "HP" || marca == "hp") {
			preco =  preco * 1.3;
			
		}
		else if(marca == "IBM"  || marca == "ibm") {
			preco = preco * 1.5;
		}
		else {
			System.out.println("Seu preço se mantem original ou seja:"+preco);
		}
		System.out.println("Seu novo preço será:"+preco);
	}
	
	public int alterarValor(double valor) {
		if(valor > 0) {
			preco = valor;
			System.out.println("Esse será o novo preço:"+valor);
			return 1;
		}
		else {
			return 0;
		}
		
	}

}