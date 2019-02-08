package game;
import java.util.ArrayList;

public class GameBoard {
	/*
	 * This class represents the game board.
	 */
	
	// ATTRIBUTES
	ArrayList<ArrayList<String>> table;
	private int xsize, ysize;
	
	// CONSTRUCTOR
	public GameBoard(int xsize_, int ysize_) {
		assert xsize_>=4 && ysize_>=4 : "Invalid board size!";
		
		this.xsize = xsize_;
		this.ysize = ysize_;
		
	}
	
	
	// METHODS
	// -- Access
	
	
	// -- Implementation
	

}