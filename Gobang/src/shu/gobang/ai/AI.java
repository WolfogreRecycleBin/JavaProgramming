package shu.gobang.ai;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 12/24/2015.
 */
public class AI {

	int [][] board;

	public boolean move(int [][] board, int aiChess){
		this.board = board;
		int maxGain = 0;
		int bestRow = 0;
		int bestCol = 0;
		for(int row = 0; row < board.length; ++row)
			for(int col = 0; col < board.length; ++col){
				if(board[row][col] == 0)
				{
					int temp;
					if((temp = getGain(row, col, aiChess)) > maxGain){
						maxGain = temp;
						bestRow = row;
						bestCol = col;
					}
				}
			}
		board[bestRow][bestCol] = aiChess;
		return true;
	}


	private int getGain(int raw, int col, int aiChess){
		return (int)(Math.random() * 100);
	}

}
