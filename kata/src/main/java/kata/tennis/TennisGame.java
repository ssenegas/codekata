package kata.tennis;

import kata.tennis.state.LoveAllState;
import kata.tennis.state.TennisScoreState;

public class TennisGame {

	private TennisScoreState state;
	
	public TennisGame() {
		this(new LoveAllState());
	}
	
	public TennisGame(TennisScoreState state) {
		this.state = state;
	}
	
	public void player1Scores() {
		state.score(this, new Player1());
	}
	
	public void player2Scores() {
		state.score(this, new Player2());
	}
	
	public String score() {
		return state.toString();
	}

	public void setState(TennisScoreState state) {
		this.state = state;
	}
	
	public static class TennisGameBuilder {
		
		private TennisGame game;
		
		public TennisGameBuilder() {
			this.game = new TennisGame();
		}
		
		public TennisGameBuilder(final TennisScoreState state) {
			this.game = new TennisGame(state); 
		}
		
		public TennisGameBuilder player1Scores() {
			this.game.player1Scores();
			return this;
		}
		
		public TennisGameBuilder player2Scores() {
			this.game.player2Scores();
			return this;
		}
		
		public TennisGame build() {
			return game;
		}
	}
}
