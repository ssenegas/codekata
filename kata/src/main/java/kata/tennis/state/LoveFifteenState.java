package kata.tennis.state;

import kata.tennis.Player;
import kata.tennis.Player1;
import kata.tennis.TennisGame;

public class LoveFifteenState implements TennisScoreState {

	@Override
	public void score(TennisGame game, Player player) {
		if (player instanceof Player1) {
			game.setState(new FifteenAllState());
		} else {
			game.setState(new LoveThirtyState());
		}
	}

	@Override
	public String toString() {
		return "Love Fifteen";
	}
}
