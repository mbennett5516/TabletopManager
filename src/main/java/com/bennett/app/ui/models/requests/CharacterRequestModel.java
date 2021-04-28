package com.bennett.app.ui.models.requests;

import java.util.List;
import java.util.Map;

import com.bennett.app.ui.models.AttackOrSpell;
import com.bennett.app.ui.models.Spell;

public class CharacterRequestModel {

	private String name;
	private boolean milestoneLeveling;
	private boolean fixedHpIncreaseOnLevelUp;
	private boolean privateCharacter;
	private String race;
	private Map<String, Integer> jobs;
	private String background;
	private String alignment;
	private double exp;
	private int age;
	private String height;
	private String weight;
	private String eyes;
	private String skin;
	private String hair;
	private Map<String, Integer> abilityScores;
	private boolean inspiration;
	private int proficiencyBonus;
	private Map<String, Integer> savingThrows;
	private Map<String, Integer> skills;
	private int passiveWisdomPerception;
	private int hitPointMaximum;
	private int currentHitPoints;
	private Map<String, Integer> hitDice;
	private int deathSaveSuccesses;
	private int deathSaveFailures;
	private String personalityTraits;
	private String ideals;
	private String bonds;
	private String flaws;
	private List<AttackOrSpell> attacksAndSpells;
	private List<String> otherProficienciesAndLanguages;
	private List<String> equipment;
	private List<String> featuresAndTraits;
	private String characterAppearance;
	private List<String> alliesAndOrganizations;
	private String backstory;
	private List<String> additionalFeaturesAndTraits;
	private List<String> treasure;
	private Map<String, Integer> money;
	private List<String> spellcastingClass;
	private Map<String, String> spellcastingAbility;
	private Map<String, Integer> spellSaveDC;
	private Map<String, Integer> spellAttackBonus;
	private List<Spell> cantrips;
	private List<Spell> spellsLevelOne;
	private List<Spell> spellsLevelTwo;
	private List<Spell> spellsLevelThree;
	private List<Spell> spellsLevelFour;
	private List<Spell> spellsLevelFive;
	private List<Spell> spellsLevelSix;
	private List<Spell> spellsLevelSeven;
	private List<Spell> spellsLevelEight;
	private List<Spell> spellsLevelNine;
	private int spellSlotsLevelOne;
	private int spellSlotsLevelTwo;
	private int spellSlotsLevelThree;
	private int spellSlotsLevelFour;
	private int spellSlotsLevelFive;
	private int spellSlotsLevelSix;
	private int spellSlotsLevelSeven;
	private int spellSlotsLevelEight;
	private int spellSlotsLevelNine;
	private int expendedSpellSlotsLevelOne;
	private int expendedSpellSlotsLevelTwo;
	private int expendedSpellSlotsLevelThree;
	private int expendedSpellSlotsLevelFour;
	private int expendedSpellSlotsLevelFive;
	private int expendedSpellSlotsLevelSix;
	private int expendedSpellSlotsLevelSeven;
	private int expendedSpellSlotsLevelEight;
	private int expendedSpellSlotsLevelNine;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMilestoneLeveling() {
		return milestoneLeveling;
	}

	public void setMilestoneLeveling(boolean milestoneLeveling) {
		this.milestoneLeveling = milestoneLeveling;
	}

	public boolean isFixedHpIncreaseOnLevelUp() {
		return fixedHpIncreaseOnLevelUp;
	}

	public void setFixedHpIncreaseOnLevelUp(boolean fixedHpIncreaseOnLevelUp) {
		this.fixedHpIncreaseOnLevelUp = fixedHpIncreaseOnLevelUp;
	}

	public boolean isPrivateCharacter() {
		return privateCharacter;
	}

	public void setPrivateCharacter(boolean privateCharacter) {
		this.privateCharacter = privateCharacter;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public Map<String, Integer> getJobs() {
		return jobs;
	}

	public void setJobs(Map<String, Integer> jobs) {
		this.jobs = jobs;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getEyes() {
		return eyes;
	}

	public void setEyes(String eyes) {
		this.eyes = eyes;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public String getHair() {
		return hair;
	}

	public void setHair(String hair) {
		this.hair = hair;
	}

	public Map<String, Integer> getAbilityScores() {
		return abilityScores;
	}

	public void setAbilityScores(Map<String, Integer> abilityScores) {
		this.abilityScores = abilityScores;
	}

	public boolean hasInspiration() {
		return inspiration;
	}

	public void setInspiration(boolean inspiration) {
		this.inspiration = inspiration;
	}

	public int getProficiencyBonus() {
		return proficiencyBonus;
	}

	public void setProficiencyBonus(int proficiencyBonus) {
		this.proficiencyBonus = proficiencyBonus;
	}

	public Map<String, Integer> getSavingThrows() {
		return savingThrows;
	}

	public void setSavingThrows(Map<String, Integer> savingThrows) {
		this.savingThrows = savingThrows;
	}

	public Map<String, Integer> getSkills() {
		return skills;
	}

	public void setSkills(Map<String, Integer> skills) {
		this.skills = skills;
	}

	public int getPassiveWisdomPerception() {
		return passiveWisdomPerception;
	}

	public void setPassiveWisdomPerception(int passiveWisdomPerception) {
		this.passiveWisdomPerception = passiveWisdomPerception;
	}

	public int getHitPointMaximum() {
		return hitPointMaximum;
	}

	public void setHitPointMaximum(int hitPointMaximum) {
		this.hitPointMaximum = hitPointMaximum;
	}

	public int getCurrentHitPoints() {
		return currentHitPoints;
	}

	public void setCurrentHitPoints(int currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
	}

	public Map<String, Integer> getHitDice() {
		return hitDice;
	}

	public void setHitDice(Map<String, Integer> hitDice) {
		this.hitDice = hitDice;
	}

	public int getDeathSaveSuccesses() {
		return deathSaveSuccesses;
	}

	public void setDeathSaveSuccesses(int deathSaveSuccesses) {
		this.deathSaveSuccesses = deathSaveSuccesses;
	}

	public int getDeathSaveFailures() {
		return deathSaveFailures;
	}

	public void setDeathSaveFailures(int deathSaveFailures) {
		this.deathSaveFailures = deathSaveFailures;
	}

	public String getPersonalityTraits() {
		return personalityTraits;
	}

	public void setPersonalityTraits(String personalityTraits) {
		this.personalityTraits = personalityTraits;
	}

	public String getIdeals() {
		return ideals;
	}

	public void setIdeals(String ideals) {
		this.ideals = ideals;
	}

	public String getBonds() {
		return bonds;
	}

	public void setBonds(String bonds) {
		this.bonds = bonds;
	}

	public String getFlaws() {
		return flaws;
	}

	public void setFlaws(String flaws) {
		this.flaws = flaws;
	}

	public List<AttackOrSpell> getAttacksAndSpells() {
		return attacksAndSpells;
	}

	public void setAttacksAndSpells(List<AttackOrSpell> attacksAndSpells) {
		this.attacksAndSpells = attacksAndSpells;
	}

	public List<String> getOtherProficienciesAndLanguages() {
		return otherProficienciesAndLanguages;
	}

	public void setOtherProficienciesAndLanguages(List<String> otherProficienciesAndLanguages) {
		this.otherProficienciesAndLanguages = otherProficienciesAndLanguages;
	}

	public List<String> getEquipment() {
		return equipment;
	}

	public void setEquipment(List<String> equipment) {
		this.equipment = equipment;
	}

	public List<String> getFeaturesAndTraits() {
		return featuresAndTraits;
	}

	public void setFeaturesAndTraits(List<String> featuresAndTraits) {
		this.featuresAndTraits = featuresAndTraits;
	}

	public String getCharacterAppearance() {
		return characterAppearance;
	}

	public void setCharacterAppearance(String characterAppearance) {
		this.characterAppearance = characterAppearance;
	}

	public List<String> getAlliesAndOrganizations() {
		return alliesAndOrganizations;
	}

	public void setAlliesAndOrganizations(List<String> alliesAndOrganizations) {
		this.alliesAndOrganizations = alliesAndOrganizations;
	}

	public String getBackstory() {
		return backstory;
	}

	public void setBackstory(String backstory) {
		this.backstory = backstory;
	}

	public List<String> getAdditionalFeaturesAndTraits() {
		return additionalFeaturesAndTraits;
	}

	public void setAdditionalFeaturesAndTraits(List<String> additionalFeaturesAndTraits) {
		this.additionalFeaturesAndTraits = additionalFeaturesAndTraits;
	}

	public List<String> getTreasure() {
		return treasure;
	}

	public void setTreasure(List<String> treasure) {
		this.treasure = treasure;
	}

	public Map<String, Integer> getMoney() {
		return money;
	}

	public void setMoney(Map<String, Integer> money) {
		this.money = money;
	}

	public List<String> getSpellcastingClass() {
		return spellcastingClass;
	}

	public void setSpellcastingClass(List<String> spellcastingClass) {
		this.spellcastingClass = spellcastingClass;
	}

	public Map<String, String> getSpellcastingAbility() {
		return spellcastingAbility;
	}

	public void setSpellcastingAbility(Map<String, String> spellcastingAbility) {
		this.spellcastingAbility = spellcastingAbility;
	}

	public Map<String, Integer> getSpellSaveDC() {
		return spellSaveDC;
	}

	public void setSpellSaveDC(Map<String, Integer> spellSaveDC) {
		this.spellSaveDC = spellSaveDC;
	}

	public Map<String, Integer> getSpellAttackBonus() {
		return spellAttackBonus;
	}

	public void setSpellAttackBonus(Map<String, Integer> spellAttackBonus) {
		this.spellAttackBonus = spellAttackBonus;
	}

	public List<Spell> getCantrips() {
		return cantrips;
	}

	public void setCantrips(List<Spell> cantrips) {
		this.cantrips = cantrips;
	}

	public List<Spell> getSpellsLevelOne() {
		return spellsLevelOne;
	}

	public void setSpellsLevelOne(List<Spell> spellsLevelOne) {
		this.spellsLevelOne = spellsLevelOne;
	}

	public List<Spell> getSpellsLevelTwo() {
		return spellsLevelTwo;
	}

	public void setSpellsLevelTwo(List<Spell> spellsLevelTwo) {
		this.spellsLevelTwo = spellsLevelTwo;
	}

	public List<Spell> getSpellsLevelThree() {
		return spellsLevelThree;
	}

	public void setSpellsLevelThree(List<Spell> spellsLevelThree) {
		this.spellsLevelThree = spellsLevelThree;
	}

	public List<Spell> getSpellsLevelFour() {
		return spellsLevelFour;
	}

	public void setSpellsLevelFour(List<Spell> spellsLevelFour) {
		this.spellsLevelFour = spellsLevelFour;
	}

	public List<Spell> getSpellsLevelFive() {
		return spellsLevelFive;
	}

	public void setSpellsLevelFive(List<Spell> spellsLevelFive) {
		this.spellsLevelFive = spellsLevelFive;
	}

	public List<Spell> getSpellsLevelSix() {
		return spellsLevelSix;
	}

	public void setSpellsLevelSix(List<Spell> spellsLevelSix) {
		this.spellsLevelSix = spellsLevelSix;
	}

	public List<Spell> getSpellsLevelSeven() {
		return spellsLevelSeven;
	}

	public void setSpellsLevelSeven(List<Spell> spellsLevelSeven) {
		this.spellsLevelSeven = spellsLevelSeven;
	}

	public List<Spell> getSpellsLevelEight() {
		return spellsLevelEight;
	}

	public void setSpellsLevelEight(List<Spell> spellsLevelEight) {
		this.spellsLevelEight = spellsLevelEight;
	}

	public List<Spell> getSpellsLevelNine() {
		return spellsLevelNine;
	}

	public void setSpellsLevelNine(List<Spell> spellsLevelNine) {
		this.spellsLevelNine = spellsLevelNine;
	}

	public int getSpellSlotsLevelOne() {
		return spellSlotsLevelOne;
	}

	public void setSpellSlotsLevelOne(int spellSlotsLevelOne) {
		this.spellSlotsLevelOne = spellSlotsLevelOne;
	}

	public int getSpellSlotsLevelTwo() {
		return spellSlotsLevelTwo;
	}

	public void setSpellSlotsLevelTwo(int spellSlotsLevelTwo) {
		this.spellSlotsLevelTwo = spellSlotsLevelTwo;
	}

	public int getSpellSlotsLevelThree() {
		return spellSlotsLevelThree;
	}

	public void setSpellSlotsLevelThree(int spellSlotsLevelThree) {
		this.spellSlotsLevelThree = spellSlotsLevelThree;
	}

	public int getSpellSlotsLevelFour() {
		return spellSlotsLevelFour;
	}

	public void setSpellSlotsLevelFour(int spellSlotsLevelFour) {
		this.spellSlotsLevelFour = spellSlotsLevelFour;
	}

	public int getSpellSlotsLevelFive() {
		return spellSlotsLevelFive;
	}

	public void setSpellSlotsLevelFive(int spellSlotsLevelFive) {
		this.spellSlotsLevelFive = spellSlotsLevelFive;
	}

	public int getSpellSlotsLevelSix() {
		return spellSlotsLevelSix;
	}

	public void setSpellSlotsLevelSix(int spellSlotsLevelSix) {
		this.spellSlotsLevelSix = spellSlotsLevelSix;
	}

	public int getSpellSlotsLevelSeven() {
		return spellSlotsLevelSeven;
	}

	public void setSpellSlotsLevelSeven(int spellSlotsLevelSeven) {
		this.spellSlotsLevelSeven = spellSlotsLevelSeven;
	}

	public int getSpellSlotsLevelEight() {
		return spellSlotsLevelEight;
	}

	public void setSpellSlotsLevelEight(int spellSlotsLevelEight) {
		this.spellSlotsLevelEight = spellSlotsLevelEight;
	}

	public int getSpellSlotsLevelNine() {
		return spellSlotsLevelNine;
	}

	public void setSpellSlotsLevelNine(int spellSlotsLevelNine) {
		this.spellSlotsLevelNine = spellSlotsLevelNine;
	}

	public int getExpendedSpellSlotsLevelOne() {
		return expendedSpellSlotsLevelOne;
	}

	public void setExpendedSpellSlotsLevelOne(int expendedSpellSlotsLevelOne) {
		this.expendedSpellSlotsLevelOne = expendedSpellSlotsLevelOne;
	}

	public int getExpendedSpellSlotsLevelTwo() {
		return expendedSpellSlotsLevelTwo;
	}

	public void setExpendedSpellSlotsLevelTwo(int expendedSpellSlotsLevelTwo) {
		this.expendedSpellSlotsLevelTwo = expendedSpellSlotsLevelTwo;
	}

	public int getExpendedSpellSlotsLevelThree() {
		return expendedSpellSlotsLevelThree;
	}

	public void setExpendedSpellSlotsLevelThree(int expendedSpellSlotsLevelThree) {
		this.expendedSpellSlotsLevelThree = expendedSpellSlotsLevelThree;
	}

	public int getExpendedSpellSlotsLevelFour() {
		return expendedSpellSlotsLevelFour;
	}

	public void setExpendedSpellSlotsLevelFour(int expendedSpellSlotsLevelFour) {
		this.expendedSpellSlotsLevelFour = expendedSpellSlotsLevelFour;
	}

	public int getExpendedSpellSlotsLevelFive() {
		return expendedSpellSlotsLevelFive;
	}

	public void setExpendedSpellSlotsLevelFive(int expendedSpellSlotsLevelFive) {
		this.expendedSpellSlotsLevelFive = expendedSpellSlotsLevelFive;
	}

	public int getExpendedSpellSlotsLevelSix() {
		return expendedSpellSlotsLevelSix;
	}

	public void setExpendedSpellSlotsLevelSix(int expendedSpellSlotsLevelSix) {
		this.expendedSpellSlotsLevelSix = expendedSpellSlotsLevelSix;
	}

	public int getExpendedSpellSlotsLevelSeven() {
		return expendedSpellSlotsLevelSeven;
	}

	public void setExpendedSpellSlotsLevelSeven(int expendedSpellSlotsLevelSeven) {
		this.expendedSpellSlotsLevelSeven = expendedSpellSlotsLevelSeven;
	}

	public int getExpendedSpellSlotsLevelEight() {
		return expendedSpellSlotsLevelEight;
	}

	public void setExpendedSpellSlotsLevelEight(int expendedSpellSlotsLevelEight) {
		this.expendedSpellSlotsLevelEight = expendedSpellSlotsLevelEight;
	}

	public int getExpendedSpellSlotsLevelNine() {
		return expendedSpellSlotsLevelNine;
	}

	public void setExpendedSpellSlotsLevelNine(int expendedSpellSlotsLevelNine) {
		this.expendedSpellSlotsLevelNine = expendedSpellSlotsLevelNine;
	}

}
