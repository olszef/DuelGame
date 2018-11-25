package com.WondersDuel.Boards;

public class MilitaryBoard {
	private Integer conflictPawn = 0;
	private Boolean[] twoCoinToken = {true, true};
	private Boolean[] fiveCoinToken = {true, true};
	
	public Integer CheckMilitaryAction() {
		Integer playerNo = 0;
		if (conflictPawn > 0)
			playerNo = 1;
		else
			playerNo = 0;
		
		Integer position = Math.abs(conflictPawn);		
		if (position >= 9)
			return 100;							
		else if (position >= 3 && position < 6 && twoCoinToken[playerNo])
			return 2;
		else if (position >= 6 && position < 9 && fiveCoinToken[playerNo])
			return 5;
		else
			return 0;
	}

	public Integer CountMilitaryPoints(Integer playerNo) {
		Integer position = Math.abs(conflictPawn);
		if (position > 0 && position < 3)
			return 2;
		else if (position >= 3 && position < 6)
			return 5;
		else if (position >= 6 && position < 9)
			return 10;
		else
			return 0;
	}
	
	public void setConflictPawn(Integer player1MilitaryPoints, Integer player2MilitaryPoints) {
		this.conflictPawn = player1MilitaryPoints - player2MilitaryPoints;
	}
}
