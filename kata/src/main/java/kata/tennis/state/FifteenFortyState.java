package kata.tennis.state;

import kata.tennis.Player;
import kata.tennis.Player1;
import kata.tennis.TennisGame;

public class FifteenFortyState implements TennisScoreState {

	@Override
	public void score(TennisGame game, Player player) {
		if (player instanceof Player1) {
			game.setState(new ThirtyFortyState());
		} else {
			game.setState(new GameState(player));
		}
	}

	@Override
	public String toString() {
		return "Fifteen Forty";
	}

}
