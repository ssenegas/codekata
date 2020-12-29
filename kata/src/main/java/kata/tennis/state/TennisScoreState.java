package kata.tennis.state;

import kata.tennis.Player;
import kata.tennis.TennisGame;

public interface TennisScoreState {
	void score(TennisGame game, Player player);
}