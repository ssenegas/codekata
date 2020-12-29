package kata.tennis.state;

import kata.tennis.Player;
import kata.tennis.TennisGame;

public class GameState implements TennisScoreState {

	private Player player;
	
	private GameState() {
	}
	
	public GameState(Player player) {
		this.player = player;
	}
	
	@Override
	public void score(TennisGame game, Player player) {
	}

	@Override
	public String toString() {
		return "Game " + this.player.toString();
	}

}
