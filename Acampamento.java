public class Acampamento {
	String nome;
	char equipe;
	int idade;
	public Acampamento() {
		
	}
	//Passagem  de valor sem usar parametros, agora eu preciso chamar ele
	
	public Acampamento(String nome, char equipe, int idade) {
		this.nome = nome;
		this.equipe = equipe;
		this.idade = idade;
	}
	// passagem de atributos por parametro
	
	public void  imprimir() {
		System.out.println( "\nnome:"+ nome + "\nequipe:" + equipe + "\nidade:"+ idade);
	}
	
	public void separarGrupo() {
		if(idade >= 6 && idade <= 10) {
			this.equipe = 'A';
			
		}
		else if(idade > 10 && idade <= 20) {
			this.equipe = 'B';
			
		}
		else {
			this.equipe = 'C';
	
		}
		
		System.out.println("Sua equipe é : "+this.equipe);
		
	}
}
