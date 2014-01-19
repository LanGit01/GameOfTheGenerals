package gg;

public class State {
	private int turnPlayer; //turn(the player who performed action, not the next turn) - anong data type
	private Piece pieceMoved; // the piece that moved this turn
	private Piece pieceKilled; // the piece that was killed this turn
	private int newPieceX;
	private int newPieceY;
	
	public State(int turnPlayer, Piece pieceMoved, Piece pieceKilled, int newPieceX, int newPieceY){
		this.turnPlayer = turnPlayer;
		this.pieceMoved = pieceMoved;
		this.pieceKilled = pieceKilled;
		this.newPieceX = newPieceX;
		this.newPieceY = newPieceY;
	}
	
	public int getTurnPlayer(){
		return turnPlayer;
	}
	
	public Piece getPieceMoved(){
		return pieceMoved;
	}
	
	public Piece getPieceKilled(){
		return pieceKilled;
	}
	
	public int getNewX(){
		return newPieceX;
	}
	
	public int getNewY(){
		return newPieceY;
	}
}
