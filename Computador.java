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
		System.out.println("\nmarca:"+ marca +"\ncor:"+cor+"\nModelo:"+modelo+"\npreço:"+preco+"\nNumeroSerie:"+NumeroSerie);
	}
	
	public void calcularValor() {
		if(marca == "HP" || marca == "hp") {
			this.preco =  this.preco * 1.3;
			
		}
		else if(marca == "IBM"  || marca == "ibm") {
			this.preco = this.preco * 1.5;
		}
		else {
			System.out.println("Seu preço se mantem original ou seja:"+preco);
		}
		System.out.println("Seu novo preço será:"+preco);
	}
	
	public int alterarValor(double valor) {
		if(valor > 0) {
			this.preco = valor;
			System.out.println("Esse será o novo preço:"+valor);
			return 1;
		}
		else {
			return 0;
		}
		
	}

}
