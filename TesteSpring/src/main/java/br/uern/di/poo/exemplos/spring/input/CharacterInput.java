package br.uern.di.poo.exemplos.spring.input;

public class CharacterInput {
	
	private String name;
	private int level;
	public CharacterInput() {
		super();
	}
	public CharacterInput(String name, int level) {
		super();
		this.name = name;
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
}
