package Heroes;

public class Feiticeiro extends Hero implements ArvoreMagia{
	private Dado dadoMagia = new Dado();
	
	public Feiticeiro() {
		super.setnDadoAtaque(1);
		super.setnDadoDefesa(2);
		super.setVida(4);
		super.setInteligencia(6);
		Dado dadoAtaque = new Dado();
		super.setDadoAtaque(dadoAtaque);
		Dado dadoDefesa = new Dado();
		super.setDadoDefesa(dadoDefesa);
	}

	@Override
	public void SimpleHeal() {
		if(dadoMagia.roll() > this.getInteligencia()) {
			throw new HeroException("O Feiticeiro não conseguiu se curar");
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
			throw new HeroException("O Feiticeiro não conseguiu lançar MagicMissile");
		}else {
			
		}
		
	}

	@Override
	public void Fireball() {
		if(dadoMagia.roll() > this.getInteligencia()) {
			throw new HeroException("O Feiticeiro não conseguiu jogar Fireball");
		}else {
		
		}
	}

	@Override
	public void Teleport() {
		if(dadoMagia.roll() > this.getInteligencia()) {
			throw new HeroException("O Feiticeiro não conseguiu teleportar");
		}else {
		}
		
	}
}
