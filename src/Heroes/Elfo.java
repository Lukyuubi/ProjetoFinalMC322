package Heroes;

public class Elfo extends Hero implements ArvoreMagia {
	private Dado dadoMagia = new Dado();
	
	public Elfo(){
		super.setnDadoAtaque(2);
		super.setnDadoDefesa(2);
		super.setVida(6);
		super.setInteligencia(4);
		Dado dadoAtaque = new Dado();
		super.setDadoAtaque(dadoAtaque);
		Dado dadoDefesa = new Dado();
		super.setDadoDefesa(dadoDefesa);
	}

	@Override
	public void SimpleHeal() {
		if(dadoMagia.roll() > this.getInteligencia()) {
			throw new HeroException("O Elfo não conseguiu se curar");
		}else {
			int cura;
			int vida;
			cura = dadoMagia.roll();
			vida = getVida();
			this.setVida(vida+cura);
		}
	}

	@Override
	public void MagicMissile() {
		if(dadoMagia.roll() > this.getInteligencia()) {
			throw new HeroException("O Elfo não conseguiu usar MagicMissile");
		}else {
			
		}
	}

	@Override
	public void Fireball() {
		if(dadoMagia.roll() > this.getInteligencia()) {
			throw new HeroException("O Elfo não conseguiu lançar Fireball");
		}else {
			
		}
	}

	@Override
	public void Teleport() {
		if(dadoMagia.roll() > this.getInteligencia()) {
			throw new HeroException("O Elfo não conseguiu teleportar");
		}else {
			
		}
	}
	
}
