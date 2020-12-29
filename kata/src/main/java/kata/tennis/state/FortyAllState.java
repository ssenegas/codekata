package kata.tennis.state;

import kata.tennis.Player;
import kata.tennis.Player1;
import kata.tennis.TennisGame;

public class FortyAllState implements TennisScoreState {

	@Override
	public void score(TennisGame game, Player player) {
		game.setState(new AdvantageState(player));
	}

	@Override
	public String toString() {
		return "Forty-all";
	}
}
