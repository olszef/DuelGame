package com.WondersDuel.Cards;

public class GuildCard extends Card {
	private CardTypes[] endScoredElements;

	public GuildCard(String age, CardTypes cardType, String cardName, Integer victoryPoints,
			ResourceAmount[] resourceCost, Integer moneyCost, Boolean canCostFree, FreeConditions freeCost,
			Boolean canAllowFree, FreeConditions freeAllow, CardTypes[] endScoredElements) {
		super(age, cardType, cardName, victoryPoints, resourceCost, moneyCost, canCostFree, freeCost, canAllowFree,
				freeAllow);
		this.endScoredElements = endScoredElements;
	}

	public CardTypes[] getEndScoredElements() {
		return endScoredElements;
	}
	
}
