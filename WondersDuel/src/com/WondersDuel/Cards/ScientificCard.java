package com.WondersDuel.Cards;

public class ScientificCard extends Card {
	private ScientificSymbols symbol;

	public ScientificCard(String age, CardTypes cardType, String cardName, Integer victoryPoints,
			ResourceAmount[] resourceCost, Integer moneyCost, Boolean canCostFree, FreeConditions freeCost,
			Boolean canAllowFree, FreeConditions freeAllow, ScientificSymbols symbol) {
		super(age, cardType, cardName, victoryPoints, resourceCost, moneyCost, canCostFree, freeCost, canAllowFree,
				freeAllow);
		this.symbol = symbol;
	}

	public ScientificSymbols getSymbol() {
		return symbol;
	}

}
