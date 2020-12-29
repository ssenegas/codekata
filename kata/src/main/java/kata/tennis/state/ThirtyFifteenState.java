package kata.tennis.state;

import kata.tennis.Player;
import kata.tennis.Player1;
import kata.tennis.TennisGame;

public class ThirtyFifteenState implements TennisScoreState {

	@Override
	public void score(TennisGame game, Player player) {
		if (player instanceof Player1) {
			game.setState(new FortyFifteenState());
		} else {
			game.setState(new ThirtyAllState());
		}
	}

	@Override
	public String toString() {
		return "Thirty Fifteen";
	}

}
