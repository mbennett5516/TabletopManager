package com.bennett.app.ui.models;

public class Spell {

	private String name;
	private int level;
	private String description;
	private String damageDice;
	private String damageType;
	private boolean prepared;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDamageDice() {
		return damageDice;
	}
	public void setDamageDice(String damageDice) {
		this.damageDice = damageDice;
	}
	public String getDamageType() {
		return damageType;
	}
	public void setDamageType(String damageType) {
		this.damageType = damageType;
	}
	public boolean isPrepared() {
		return prepared;
	}
	public void setPrepared(boolean prepared) {
		this.prepared = prepared;
	}
	
	
}
