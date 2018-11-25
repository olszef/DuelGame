package com.WondersDuel.Wonders;

import com.WondersDuel.Cards.Resources;

public class Wonder {
	private String name;
	private Integer victoryPoints;
	private Integer bonusCoins;
	private Integer militaryPoints;
	private Resources[] chooseProducedResource;
	private SpecialActions[] specialAction;
	private Boolean isBuilt = false;
	
	public Wonder(String name, Integer victoryPoints, Integer bonusCoins, Integer militaryPoints,
			Resources[] chooseProducedResource, SpecialActions[] specialAction) {
		super();
		this.name = name;
		this.victoryPoints = victoryPoints;
		this.bonusCoins = bonusCoins;
		this.militaryPoints = militaryPoints;
		this.chooseProducedResource = chooseProducedResource;
		this.specialAction = specialAction;
	}

	public String getName() {
		return name;
	}

	public Integer getVictoryPoints() {
		return victoryPoints;
	}

	public Integer getBonusCoins() {
		return bonusCoins;
	}

	public Integer getMilitaryPoints() {
		return militaryPoints;
	}

	public Resources[] getChooseProducedResource() {
		return chooseProducedResource;
	}

	public SpecialActions[] getSpecialAction() {
		return specialAction;
	}

	public Boolean getIsBuilt() {
		return isBuilt;
	}

	public void setIsBuilt(Boolean isBuilt) {
		this.isBuilt = isBuilt;
	}
		
}
