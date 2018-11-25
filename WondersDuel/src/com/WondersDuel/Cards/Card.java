package com.WondersDuel.Cards;

public class Card {
	private String age;
	private CardTypes cardType;
	private String cardName;
	private Integer victoryPoints;
	private ResourceAmount[] resourceCost;
	private Integer moneyCost;
	private Boolean canCostFree;
	private FreeConditions freeCost;
	private Boolean canAllowFree;
	private FreeConditions freeAllow;
	
	public Card(String age, CardTypes cardType, String cardName, Integer victoryPoints,
			ResourceAmount[] resourceCost, Integer moneyCost, Boolean canCostFree, FreeConditions freeCost,
			Boolean canAllowFree, FreeConditions freeAllow) {
		super();
		this.age = age;
		this.cardType = cardType;
		this.cardName = cardName;
		this.victoryPoints = victoryPoints;
		this.resourceCost = resourceCost;
		this.moneyCost = moneyCost;
		this.canCostFree = canCostFree;
		this.freeCost = freeCost;
		this.canAllowFree = canAllowFree;
		this.freeAllow = freeAllow;
	}

	public String getAge() {
		return age;
	}

	public CardTypes getCardType() {
		return cardType;
	}

	public String getCardName() {
		return cardName;
	}

	public Integer getVictoryPoints() {
		return victoryPoints;
	}

	public ResourceAmount[] getResourceCost() {
		return resourceCost;
	}

	public Integer getMoneyCost() {
		return moneyCost;
	}

	public Boolean getCanCostFree() {
		return canCostFree;
	}

	public FreeConditions getFreeCost() {
		return freeCost;
	}

	public Boolean getCanAllowFree() {
		return canAllowFree;
	}

	public FreeConditions getFreeAllow() {
		return freeAllow;
	}	
}
