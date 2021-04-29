package com.bennett.app.ui.models;

import java.util.List;

public class Job {
	
	private String publicId;
	private String name;
	private int hitDie;
	private List<ProficiencyChoice> proficiencyChoices;
	private List<Object> proficiencies;
	private List<SavingThrows> savingThrows;
	private List<Equipment> startingEquipment;
}
