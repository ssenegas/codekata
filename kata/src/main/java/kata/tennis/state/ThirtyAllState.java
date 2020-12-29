package kata.tennis.state;

import kata.tennis.Player;
import kata.tennis.Player1;
import kata.tennis.TennisGame;

public class ThirtyAllState implements TennisScoreState {

	@Override
	public void score(TennisGame game, Player player) {
		if (player instanceof Player1) {
			game.setState(new FortyThirtyState());
		} else {
			game.setState(new ThirtyFortyState());
		}
	}

	@Override
	public String toString() {
		return "Thirty-all";
	}
}
