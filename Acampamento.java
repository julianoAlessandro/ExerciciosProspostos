public class Acampamento {
	String nome;
	char equipe;
	int idade;
	public Acampamento() {
		
	}
	
	public Acampamento(String nome, char equipe, int idade) {
		this.nome = nome;
		this.equipe = equipe;
		this.idade = idade;
	}
	
	public void  imprimir() {
		System.out.println( "nome:"+ nome + "equipe:" + equipe + "idade:"+ idade);
	}
	
	public void separarGrupo() {
		if(idade > 6 && idade <= 10) {
			this.equipe = 'A';
			
		}
		else if(idade > 10 && idade <= 20) {
			this.equipe = 'B';
			
		}
		else {
			this.equipe = 'C';
	
		}
		
		System.out.println(this.equipe);
		
	}
}
