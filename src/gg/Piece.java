package gg;

public class Piece {
	public final static int NO_POSITION = -1;
	
	private Rank rank;
	private int playerID;
	private boolean alive;
	private int xpos;
	private int ypos;
	
	public Piece(Rank pieceRank, int player_id){
		rank = pieceRank;
		playerID = player_id;
		alive = true;
		xpos = NO_POSITION;
		ypos = NO_POSITION;
	}
	
	public Piece(Piece p){
		rank = p.rank;
		playerID = p.playerID;
		alive = p.alive;
		xpos = p.xpos;
		ypos = p.ypos;
	}
	
	public Rank getRank(){
		return rank;
	}
	
	public int getPlayerID(){
		return playerID;
	}
	
	public boolean isAlive(){
		return alive;
	}
	
	public void kill(){
		alive = false;
	}
	
	public int getX(){
		return xpos;
	}
	
	public int getY(){
		return ypos;
	}
	
	public void setPosition(int x, int y){
		xpos = x;
		ypos = y;
	}
	
	/* TEST */
	public void moveLeft(){
		xpos--;
	}
	
	public void moveRight(){
		xpos++;
	}
	
	public void moveUp(){
		ypos--;
	}
	
	public void moveDown(){
		ypos++;
	}
	
	
	public boolean equals(Piece p){
		if(this.xpos == p.xpos && this.ypos == p.ypos && this.rank == p.rank){
			return true;
		}
		
		return false;
	}
}
