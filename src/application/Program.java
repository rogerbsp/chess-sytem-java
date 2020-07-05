package application;

import boardgame.Board;
import boardgame.Position;

public class Program {

	public static void main(String[] args) {

		
		Board board= new Board(3, 6);

Position position= new Position(3, 5);

System.out.println(position);
System.out.println(board);
	}

}
