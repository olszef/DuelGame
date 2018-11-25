package com.WondersDuel.Cards;

public class CommercialCard extends Card {
	private Resources[] cheapResources;
	private Integer bonusCoins;
	private CardTypes scoredElements;
	private Resources[] chooseProducedResource;
		
	public CommercialCard(String age, CardTypes cardType, String cardName, Integer victoryPoints,
			ResourceAmount[] resourceCost, Integer moneyCost, Boolean canCostFree, FreeConditions freeCost,
			Boolean canAllowFree, FreeConditions freeAllow, Resources[] cheapResources, Integer bonusCoins,
			CardTypes scoredElements, Resources[] chooseProducedResource) {
		super(age, cardType, cardName, victoryPoints, resourceCost, moneyCost, canCostFree, freeCost, canAllowFree,
				freeAllow);
		this.cheapResources = cheapResources;
		this.bonusCoins = bonusCoins;
		this.scoredElements = scoredElements;
		this.chooseProducedResource = chooseProducedResource;
	}
	
	public Resources[] getCheapResources() {
		return cheapResources;
	}
	public Integer getBonusCoins() {
		return bonusCoins;
	}
	public CardTypes getScoredElements() {
		return scoredElements;
	}
	public Resources[] getChooseProducedResource() {
		return chooseProducedResource;
	}	
}
