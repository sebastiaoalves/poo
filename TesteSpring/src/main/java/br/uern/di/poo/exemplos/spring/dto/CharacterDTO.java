package br.uern.di.poo.exemplos.spring.dto;

import java.io.Serializable;

public class CharacterDTO implements Serializable {

	private static final long serialVersionUID = -4130069258582677655L;
	
	String name;
	int level, strength, agility, intelligence;
	
	public CharacterDTO() {
	}

	public CharacterDTO(String name, int level, int strength, int agility, int intelligence) {
		super();
		this.name = name;
		this.level = level;
		this.strength = strength;
		this.agility = agility;
		this.intelligence = intelligence;
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

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	@Override
	public String toString() {
		return "CharacterDTO [name=" + name + ", level=" + level + ", strength=" + strength + ", agility=" + agility
				+ ", intelligence=" + intelligence + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agility;
		result = prime * result + intelligence;
		result = prime * result + level;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + strength;
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
		CharacterDTO other = (CharacterDTO) obj;
		if (agility != other.agility)
			return false;
		if (intelligence != other.intelligence)
			return false;
		if (level != other.level)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (strength != other.strength)
			return false;
		return true;
	}
		

}
