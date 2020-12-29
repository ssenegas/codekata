package kata.tennis.state;

import kata.tennis.Player;
import kata.tennis.Player1;
import kata.tennis.TennisGame;

public class FifteenAllState implements TennisScoreState {

	@Override
	public void score(TennisGame game, Player player) {
		if (player instanceof Player1) {
			game.setState(new ThirtyFifteenState());
		} else {
			game.setState(new FifteenThirtyState());
		}
	}

	@Override
	public String toString() {
		return "Fifteen-all";
	}
}
