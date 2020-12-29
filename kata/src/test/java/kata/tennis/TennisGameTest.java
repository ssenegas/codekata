package kata.tennis;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import kata.tennis.TennisGame.TennisGameBuilder;
import kata.tennis.state.AdvantageState;
import kata.tennis.state.FortyAllState;
import kata.tennis.state.LoveFortyState;
import kata.tennis.state.LoveAllState;
import kata.tennis.state.ThirtyFifteenState;
import kata.tennis.state.ThirtyLoveState;

public class TennisGameTest {
	
	@Test
	public void shouldReturnLoveLoveWhenNoPlayerScored() {
		TennisGameBuilder builder = new TennisGameBuilder();
		
		assertThat(builder.build().score(), is("Love-all"));
	}
	
	@Test
	public void shouldReturnFifteenLoveWhenPlayer1ScoresOnce() {
		TennisGameBuilder builder = new TennisGameBuilder(new LoveAllState()).player1Scores();
		
		assertThat(builder.build().score(), is("Fifteen Love"));
	}
	
	@Test
	public void shouldReturnThirtyLoveWhenPlayer1ScoresTwoTimes() {
		TennisGameBuilder builder = new TennisGameBuilder(new LoveAllState()).player1Scores().player1Scores();
		
		assertThat(builder.build().score(), is("Thirty Love"));
	}
	
	@Test
	public void shouldBeThirtyFifteenWhenPlayer1LeadsThirtyLoveAndPlayer2Scores() {
		TennisGameBuilder builder = new TennisGameBuilder(new ThirtyLoveState()).player2Scores();
		
		assertThat(builder.build().score(), is("Thirty Fifteen"));
	}
	
	@Test
	public void shouldBeThirtyAllWhenPlayer1LeadsThirtyFifteenAndPlayer2Scores() {
		TennisGameBuilder builder = new TennisGameBuilder(new ThirtyFifteenState()).player2Scores();
		
		assertThat(builder.build().score(), is("Thirty-all"));
	}
	
	@Test
	public void shouldReturnAdvantagePlayer2WhenFortyAllAndPlayer2Scores() {
		TennisGameBuilder builder = new TennisGameBuilder(new FortyAllState()).player2Scores();
		
		assertThat(builder.build().score(), is("Advantage Player2"));
	}
	
	@Test
	public void shouldReturnPlayer1WinsWhenAdvantagePlayer1AndPlayer1Scores() {
		TennisGameBuilder builder = new TennisGameBuilder(new AdvantageState(new Player1())).player1Scores();
		
		assertThat(builder.build().score(), is("Game Player1"));
	}
	
	@Test
	public void shouldReturnPlayer2WinsWhenPlayer2LeadsLoveFortyAndPlayer2Scores() {
		TennisGameBuilder builder = new TennisGameBuilder(new LoveFortyState()).player2Scores();
		
		assertThat(builder.build().score(), is("Game Player2"));
	}
}
