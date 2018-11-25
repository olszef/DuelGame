package com.WondersDuel.Cards;

public class MilitaryCard extends Card {
	private Integer militaryPoints;

	public MilitaryCard(String age, CardTypes cardType, String cardName, Integer victoryPoints,
			ResourceAmount[] resourceCost, Integer moneyCost, Boolean canCostFree, FreeConditions freeCost,
			Boolean canAllowFree, FreeConditions freeAllow, Integer militaryPoints) {
		super(age, cardType, cardName, victoryPoints, resourceCost, moneyCost, canCostFree, freeCost, canAllowFree,
				freeAllow);
		this.militaryPoints = militaryPoints;
	}

	public Integer getMilitaryPoints() {
		return militaryPoints;
	}

}
