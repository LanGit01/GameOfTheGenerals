package gg;

public class Controller {
	private Board board;
	//UI
	
	private int playerID;
	
	public Controller(int playerID, Board board){
		this.playerID = playerID;
		this.board = board;
	}
}
