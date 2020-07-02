package Heroes;

public class Anao extends Hero{
	public Anao() {
		super.setnDadoAtaque(2);
		super.setnDadoDefesa(2);
		super.setVida(7);
		super.setInteligencia(3);
		Dado dadoAtaque = new Dado();
		super.setDadoAtaque(dadoAtaque);
		Dado dadoDefesa = new Dado();
		super.setDadoDefesa(dadoDefesa);
	}
}
