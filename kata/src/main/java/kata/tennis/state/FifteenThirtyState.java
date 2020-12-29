package kata.tennis.state;

import kata.tennis.Player;
import kata.tennis.Player1;
import kata.tennis.TennisGame;

public class FifteenThirtyState implements TennisScoreState {

	@Override
	public void score(TennisGame game, Player player) {
		if (player instanceof Player1) {
			game.setState(new ThirtyAllState());
		} else {
			game.setState(new FifteenFortyState());
		}
	}

	@Override
	public String toString() {
		return "Fifteen Thirty";
	}

}
