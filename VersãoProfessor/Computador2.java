

public class Computador2 {
	private String marca;
	private String cor;
	private String modelo;
	private  long numeroSerie;
	private double preco;
	
	public String getMarca(){
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public long getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(long numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
		
	}
	
	public void imprimir() {
		System.out.println("\nmarca:"+ marca +"\ncor:"+cor+"\nModelo:"+modelo+"\npreço:"+preco+"\nNumeroSerie:"+ numeroSerie);
	}
	
	public void calcularValor() {
		if(marca.equalsIgnoreCase("HP")) {
			//this.preco =  this.preco * 1.3;
			preco *= 1.3;
			return;
			
		}
		if(marca.equalsIgnoreCase("ibm")) {
			//this.preco = this.preco * 1.5;
			preco *= 1.5;
		
			
		}
		
		
		System.out.println("Seu novo preço será:"+preco);
	}
	//fim do método calcular
	
	public boolean alterarValor(double valor) {
		if(valor > 0) {
			//this.preco = valor;
			preco = valor;
			System.out.println("Esse será o novo preço:"+preco);
			return true;
		}
		return false;
		
		
		}
		
	}

	//fim do metodo alterar valor


