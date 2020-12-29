package kata.tennis;

public abstract class Player {

	private String name;

	protected Player(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}