package com.leetcode.question_library.is_valid_sudoku;

public class Solution1 {

	public static boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			int[] cols = new int[board.length];
			int[] rows = new int[board.length];
			int[] cubes = new int[board.length];
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != '.') {
					if (cols[board[i][j] - '1'] == 1) {
						return false;
					} else {
						cols[board[i][j] - '1'] = 1;
					}
				}
				if (board[j][i] != '.') {
					if (rows[board[j][i] - '1'] == 1) {
						return false;
					} else {
						rows[board[j][i] - '1'] = 1;
					}
				}
				// 每一宫内行列的变换
				int cubeX = 3 * (i / 3) + j / 3;
				int cubeY = 3 * (i % 3) + j % 3;
				if (board[cubeX][cubeY] != '.') {
					if (cubes[board[cubeX][cubeY] - '1'] == 1) {
						return false;
					} else {
						cubes[board[cubeX][cubeY] - '1'] = 1;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		char number = '9';
		System.out.println(number - '1');
	}
}
