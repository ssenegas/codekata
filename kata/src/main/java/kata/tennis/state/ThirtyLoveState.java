package kata.tennis.state;

import kata.tennis.Player;
import kata.tennis.Player1;
import kata.tennis.TennisGame;

public class ThirtyLoveState implements TennisScoreState {

	@Override
	public void score(TennisGame game, Player player) {
		if (player instanceof Player1) {
			game.setState(new FortyLoveState());
		} else {
			game.setState(new ThirtyFifteenState());
		}
	}

	@Override
	public String toString() {
		return "Thirty Love";
	}

}
