

public class Acampamento2 {
	private String nome;
	private char equipe;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public  char getEquipe() {
		return equipe;
	}
	public void setEquipe(char equipe) {
		this.equipe = equipe;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void imprimir() {
		System.out.println( "\nnome:"+ nome + "\nequipe:" + equipe + "\nidade:"+ idade);

	}
	
	public void separarGrupo() {
		if (idade < 6) {
			equipe = '-';
		}
		else if(idade >= 6 && idade <= 10) {
			equipe = 'A';
			
		}
		else if(idade > 10 && idade <= 20) {
			equipe = 'B';
			
		}
		else {
			equipe = 'C';
	
		}
		
		System.out.println("\nSua equipe é a:"+equipe);
		
	}

	
	
}
