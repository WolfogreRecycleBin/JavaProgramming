package shu.gobang.ai;

import java.util.Scanner;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 12/24/2015.
 */
public class TestAI {
	public static void main(String args[]){
		AI ai = new AI();
		Umpire umpire = new Umpire();
		Scanner scanner = new Scanner(System.in);
		int [][] board = new int [15][15];
		boolean myTurn = true;
		while(umpire.getWinner(board,1,2).equals(Umpire.Winner.UNKNOWN)){
			if(myTurn) {
				System.out.println("Please move:");
				board[scanner.nextInt()][scanner.nextInt()] = 1;
				myTurn = false;
			}else{
				System.out.println("AI moving...");
				ai.move(board,1,2);
				myTurn = true;
			}
			for(int[] vs : board) {
				for (int v : vs)
					System.out.print(v + " ");
				System.out.println();
			}
		}
		System.out.println("Winner:" + umpire.getWinner(board,1,2));
	}
}
