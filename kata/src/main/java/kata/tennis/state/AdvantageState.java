package kata.tennis.state;

import kata.tennis.Player;
import kata.tennis.Player1;
import kata.tennis.TennisGame;

public class AdvantageState implements TennisScoreState {

	private Player player;
	
	private AdvantageState() {
	}
	
	public AdvantageState(Player player) {
		this.player = player;
	}

	@Override
	public void score(TennisGame game, Player player) {
		if (this.player.toString().equals(player.toString())) {
			game.setState(new GameState(player));
		} else {
			game.setState(new DeuceState());
		}
	}

	@Override
	public String toString() {
		return "Advantage " + player.toString();
	}
}
