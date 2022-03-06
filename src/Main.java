import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int row , column;
		System.out.println("Mayýn Tarlasý Oyununa Hoþgeldiniz...");
		System.out.println("Lütfen oynamak istediðiniz boyutlarý giriniz ");
		System.out.print("Satýr sayýsýný giriniz :");
		row = scan.nextInt();
		System.out.print("Sütun sayýsýný giriniz :");
		column = scan.nextInt();
		MayinTarlasi mayin = new MayinTarlasi(row,column);
		mayin.run();
	}

}
