package shu.gobang.ai;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 12/25/2015.
 */
public class Umpire {
	public enum Winner {PLAYER1, PLAYER2, UNKNOWN, NONE;}

	int [][] board;

	public Winner getWinner(int [][] board, int player1Chess, int player2Chess){
		this.board = board;
		if(checkWinner(player1Chess))
			return Winner.PLAYER1;
		if(checkWinner(player2Chess))
			return Winner.PLAYER2;
		if(isFull())
			return Winner.NONE;
		return Winner.UNKNOWN;
	}

	private boolean checkWinner(int who){
		for(int row = 0; row < board.length; ++row)
			for(int col = 0; col < board.length; ++col)
			{
				if(checkWinnerHelp(who, 5, row, col, 1, 0))
					return true;
				if(checkWinnerHelp(who, 5, row, col, 1, 1))
					return true;
				if(checkWinnerHelp(who, 5, row, col, 0, 1))
					return true;
			}
		return false;
	}

	private boolean checkWinnerHelp(int who, int remain, int row, int col, int rowMove, int colMove){
		if(remain == 1 && board[row][col] == who)
			return true;
		if(board[row][col] != who)
			return false;
		if(row + rowMove < 0 || row + rowMove > board.length - 1)
			return false;
		if(col + colMove < 0 || col + colMove > board.length - 1)
			return false;
		return checkWinnerHelp(who, remain - 1, row + rowMove, col + colMove, rowMove, colMove);
	}

	private boolean isFull(){
		for(int row = 0; row < board.length; ++row)
			for(int col = 0; col < board.length; ++col)
				if(board[row][col] == 0)
					return false;
		return true;
	}
}
