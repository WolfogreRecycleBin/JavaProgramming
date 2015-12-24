package shu.gobang.ai;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 12/24/2015.
 */
public class AI {

	int [][] board;

	public boolean move(int [][] board, int playerChess, int aiChess){
		this.board = board;
		for(int row = 0; row < board.length; ++row)
			for(int col = 0; col < board.length; ++col){
				if(board[row][col] == 0)
				{
					board[row][col] = aiChess;
					return true;
				}
			}
		return false;
	}


}
