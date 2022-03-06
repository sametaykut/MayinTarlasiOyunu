import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {

	int rowNumber,colNumber,size;
	int [][] map;
	int [][] board;
	Random rand = new Random ();
	Scanner scan = new Scanner (System.in);
	boolean game = true;

	MayinTarlasi(int rowNumber, int colNumber){
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.map = new int [rowNumber][colNumber];
		this.board = new int [rowNumber][colNumber];
		this.size = rowNumber*colNumber;
	}
	
	public void run() {
		int col,row,success = 0;
		prepareGame();
		print(map);
		System.out.println("Oyun baþladý");
		while (game) {
			print(board);
			System.out.print("Satýr :");
			row =scan.nextInt();
			System.out.print("Sütun :");
			col =scan.nextInt();
			if (row < 0 || row >= rowNumber) {
				System.out.println("Geçersiz Koordinat!");
				continue;
			}
			if (col < 0 || col >= colNumber) {
				System.out.println("Geçersiz Koordinat!");
				continue;
			}
			if (map[row][col] != -1) {
				checkMayin(row,col);
				success++;
				if(success == (size - (size/4))) {
					System.out.println("Baþardýnýz. Hiçbir mayýna basmadýnýz.");
					break;
				}
			}else {
				game=false;
				System.out.println("Game Over");
			}
		}
		
	}
	
	public void prepareGame() {
		int randRow,randCol,count = 0;
		while (count != size/4) {
			randRow = rand.nextInt(rowNumber);
			randCol = rand.nextInt(colNumber);
			if (map[randRow][randCol] != -1) {
				map[randRow][randCol]= -1;
				count++;
			}	
		}
	}
	public void print(int[][] array) {
		for (int i = 0; i < array.length;i++) {
			for (int j =0; j < array[i].length; j++ ) {
				if(array[i][j] >= 0) {
					System.out.print(" ");
				}
				System.out.print( array [i][j] + " ");
			}
			System.out.println();
		}
	}
	public void checkMayin(int r , int c) {
	 if ((c < colNumber-1)&& (map[r][c] == 0)) {
		if (map[r][c+1] == -1) {
			board[r][c]++;
		}
		if ((r < rowNumber-1) && (map[r+1][c] == -1)) {
			board[r][c]++;
		}
		if ((r > 0) && (map[r-1][c] == -1)) {
			board[r][c]++;
		}
		if ((c > 0) && (map[r][c-1] == -1)) {
			board[r][c]++;
		}
		if (board [r][c] == 0) {
			board[r][c] = -2;
		}
	 }
	 }
}
