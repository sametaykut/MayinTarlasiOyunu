import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int row , column;
		System.out.println("May�n Tarlas� Oyununa Ho�geldiniz...");
		System.out.println("L�tfen oynamak istedi�iniz boyutlar� giriniz ");
		System.out.print("Sat�r say�s�n� giriniz :");
		row = scan.nextInt();
		System.out.print("S�tun say�s�n� giriniz :");
		column = scan.nextInt();
		MayinTarlasi mayin = new MayinTarlasi(row,column);
		mayin.run();
	}

}
