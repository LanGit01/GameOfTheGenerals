package gg;

import java.util.*;

public class Board {
	//constants
	public final static int ROWS = 8;
	public final static int COLS = 9;
	public final static int PLAYER_1 = 1;
	public final static int PLAYER_2 = 2;
	public enum Direction{
		LEFT, UP, RIGHT, DOWN;
	}
	
	private Vector<Piece> pieces;
	
	public Board(){
		pieces = new Vector<Piece>(42);
		
		//Create player pieces
		addPieces(PLAYER_1);
		addPieces(PLAYER_2);
	}
	
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
	
	public Piece getPieceAt(int x, int y){
		Iterator<Piece> itr = pieces.iterator();
		while(itr.hasNext()){
			Piece p = itr.next();
			if(p.getX() == x && p.getY() == y){
				//If there is an object at position X,Y
				return new Piece(p);
			}
		}
		//If there is no object at position X,Y
		return null;
	}
	
	public void movePiece(Piece p, Direction direction){
		Iterator<Piece> pItr = pieces.iterator();
		
		LocalPieceLoop:
		while(pItr.hasNext()){
			Piece localPiece = pItr.next();
			if(localPiece.equals(p)){
				switch(direction){
					case LEFT:	if(p.getX() > 0){
									p.moveLeft(); 
								}
								break LocalPieceLoop;
					case UP: 	if(p.getY() > 0){
									p.moveUp();
								}
								break LocalPieceLoop;
					case RIGHT: if(p.getX() < COLS-1){
									p.moveRight();
								}
								break LocalPieceLoop;
					case DOWN: 	if(p.getY() < ROWS-1){
									p.moveDown();
								}
								break LocalPieceLoop;
				}
			}
		}
	}
	
}
