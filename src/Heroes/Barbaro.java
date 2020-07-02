package Heroes;

public class Barbaro extends Hero {
	public Barbaro() {
		super.setnDadoAtaque(3);
		super.setnDadoDefesa(2);
		super.setVida(8);
		super.setInteligencia(2);
		Dado dadoAtaque = new Dado();
		super.setDadoAtaque(dadoAtaque);
		Dado dadoDefesa = new Dado();
		super.setDadoDefesa(dadoDefesa);
	}
}
