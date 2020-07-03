package Heroes;

import java.util.ArrayList;

import Itens.Item;

public abstract class Hero {
	private int vida;
	private int inteligencia;
	
	private ArrayList<Item> bag = new ArrayList<Item>();
	
	private Dado dadoAtaque;
	private Dado dadoDefesa;
	
	private int nDadoAtaque;
	private int nDadoDefesa; 
	
	public void setDadoAtaque(Dado dadoAtaque) {
		this.dadoAtaque = dadoAtaque;
	}
	public void setDadoDefesa(Dado dadoDefesa) {
		this.dadoDefesa = dadoDefesa;
	}
	public int getVida() {
		return this.vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getnDadoAtaque() {
		return nDadoAtaque;
	}
	public void setnDadoAtaque(int nDadoAtaque) {
		this.nDadoAtaque = nDadoAtaque;
	}
	public int getnDadoDefesa() {
		return nDadoDefesa;
	}
	public void setnDadoDefesa(int nDadoDefesa) {
		this.nDadoDefesa = nDadoDefesa;
	}
	
}
