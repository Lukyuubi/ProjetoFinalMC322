package Heroes;

import java.util.Random;

public class Dado {
	private Random gerador;
	
	public Dado(){
		gerador = new Random();
	}
	public int roll() {
		int n = this.gerador.nextInt(5);
		return n++;
		
	}
}
