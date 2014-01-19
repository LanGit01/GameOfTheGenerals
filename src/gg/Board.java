package gg;

import java.util.*;

public class Board {
	//constants
	public final static int ROWS = 8;
	public final static int COLS = 9;
	public final static int PLAYER_1 = 1;
	public final static int PLAYER_2 = 2;
	
	
	private Vector<Piece> pieces;
	
	public Board(){
		pieces = new Vector<Piece>(42);
		
		//Create player pieces
		addPieces(PLAYER_1);
		addPieces(PLAYER_2);
	}
	
	/**
	 * Initializes pieces for <code>playerNum</code>
	 * 
	 * @param playerNum the player identification
	 */
	private void addPieces(int playerNum){
		//Create Flag, and two spies
		pieces.add(new Piece(Rank.FLAG, playerNum));
		pieces.add(new Piece(Rank.SPY, playerNum));
		pieces.add(new Piece(Rank.SPY, playerNum));
		
		//Create 6 privates
		for(int i = 0; i < 5; i++){
			pieces.add(new Piece(Rank.PRIVATE, playerNum));
		}
		
		//Create one for each remaining ranks
		for(Rank r: Rank.values()){
			if(r == Rank.FLAG || r == Rank.SPY){
				continue;
			}
			pieces.add(new Piece(r, playerNum));
		}
	}
	
	/**
	 * Asks for the piece in the position <code>x</code>,<code>y</code>
	 * 
	 * @param x x-position
	 * @param y y-position
	 * @return a copy of the piece, or null if there is no piece at x,y
	 */
	public Piece getPieceAt(int x, int y){
		Iterator<Piece> itr = pieces.iterator();
		while(itr.hasNext()){
			Piece p = itr.next();
			if(p.getX() == x && p.getY() == y){
				//If there is an object at position X,Y
				return p.getCopy();
			}
		}
		//If there is no object at position X,Y
		return null;
	}
	
	/**
	 * Sets the position of <code>piece</code> to <code>newX</code>,<code>newY</code>
	 * 
	 * @param piece the piece to move
	 * @param newX the new x-position
	 * @param newY the new y-position
	 */
	public void setPiece(Piece piece, int newX, int newY){
		Iterator<Piece> itr = pieces.iterator();
		while(itr.hasNext()){
			Piece p = itr.next();
			if(p.equals(piece)){
				p.setPosition(newX, newY);
				break;
			}
		}
	}
	
	/**
	 * Removes <code>piece</code> from the list of playable pieces
	 * 
	 * @param piece the piece to be removed
	 */
	public void kill(Piece piece){
		Iterator<Piece> itr = pieces.iterator();
		
		while(itr.hasNext()){
			Piece p = itr.next();
			if(p.equals(piece)){
				//kill peace here... need code
				itr.remove();
			}
		}
	}
	
}
