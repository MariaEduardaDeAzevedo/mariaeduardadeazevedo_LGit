package hotel;

import java.util.HashMap;

public class Recepcao {

	private HashMap<Animal, Estadia> estadias;
	private int hospedes;
	
	public Recepcao() {
		
		this.estadias = new HashMap<>();
		
	}
	
	public void checkIn(String nome, String tipo, int idade, int valor, int dias) {
		
		Animal animal = new Animal(nome,tipo, idade);
		
		this.estadias.put(animal, new Estadia(animal, valor, dias));
		
		this.hospedes ++;
		
	}
	
}
