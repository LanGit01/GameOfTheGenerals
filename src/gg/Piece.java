package gg;

public class Piece {

	public enum Rank {
		PRIVATE,
		SERGEANT
	}

	public Rank rank;
	public int x;
	public int y;
	public int owner;
}
