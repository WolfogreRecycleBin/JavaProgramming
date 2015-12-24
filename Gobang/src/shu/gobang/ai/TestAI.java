package shu.gobang.ai;

import java.util.Scanner;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 12/24/2015.
 */
public class TestAI {
	public static void main(String args[]){
		AI ai = new AI();
		Scanner scanner = new Scanner(System.in);
		int [][] board = new int [15][15];
		AI.Winner winner;
		while((winner = ai.move(board,1,2)).equals(AI.Winner.UNKNOWN)){
			for(int[] vs : board) {
				for (int v : vs)
					System.out.print(v + " ");
				System.out.println();
			}
			System.out.println("Please move:");
			board[scanner.nextInt()][scanner.nextInt()] = 1;
		}
		System.out.println("Winner:" + winner);
	}
}
