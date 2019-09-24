package hotel;

public class Animal {

	private String nome;
	private String tipo;
	private int idade;
	
	public Animal(String nome, String tipo, int idade) {
		
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
		
	}
	
	public String getNome() {
		
		return this.nome;
		
	}
	
	public String getTipo() {
		
		return this.tipo;
		
	}
	
	public int getIdade() {
		
		return this.idade;
		
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}
	
	public void setTipo(String tipo) {
		
		this.tipo = tipo;
		
	}
	
	public void setIdade(int idade) {
		
		this.idade = idade;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	
	
	
}
