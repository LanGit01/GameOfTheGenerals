package gg;

public class Piece {
	public final static int NO_POSITION = -1;
	
	private Rank rank;
	private int playerID;
	private boolean alive;
	private int xpos;
	private int ypos;
	
	public Piece(Rank rank, int playerID){
		this.rank = rank;
		this.playerID = playerID;
		alive = true;
		xpos = NO_POSITION;
		ypos = NO_POSITION;
	}
	
	/**
	 * @return x position of the piece
	 */
	public int getX(){
		return xpos;
	}

	/**
	 * @return y position of the piece
	 */
	public int getY(){
		return ypos;
	}
	
	/**
	 * @return rank of the piece
	 */
	public Rank getRank(){
		return rank;
	}
	
	/**
	 * @return returns true if piece is alive, otherwise, false
	 */
	public boolean isAlive(){
		return alive;
	}
	
	/**
	 * sets the position of the piece
	 * 
	 * @param x x-position
	 * @param y y-position
	 */
	public void setPosition(int x, int y){
		this.xpos = x;
		this.ypos = y;
	}
	
	public Piece getCopy(){
		Piece p = new Piece(rank, playerID);
		p.alive = alive;
		p.xpos = xpos;
		p.ypos = ypos;
		return p;
	}
	
	/**
	 * Checks if piece <code>p</code> is equal to this object
	 * 
	 * @param p the piece to be compared to
	 * @return true if this object is equal to p, otherwise false
	 */
	public boolean equals(Piece p){
		if(this.playerID == p.playerID && this.rank == p.rank && this.xpos == p.xpos && this.ypos == p.ypos){
			return true;
		}
		
		return false;
	}
}
