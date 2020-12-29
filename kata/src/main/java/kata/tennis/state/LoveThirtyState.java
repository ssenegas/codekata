package kata.tennis.state;

import kata.tennis.Player;
import kata.tennis.Player1;
import kata.tennis.TennisGame;

public class LoveThirtyState implements TennisScoreState {

	@Override
	public void score(TennisGame game, Player player) {
		if (player instanceof Player1) {
			game.setState(new FifteenThirtyState());
		} else {
			game.setState(new LoveFortyState());
		}
	}

	@Override
	public String toString() {
		return "Love Thirty";
	}

}
