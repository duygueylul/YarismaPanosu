package YarısmaPanosu;
import java.io.*;

public class Pano {

	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Kaç Kişi: ");
		String k = b.readLine();
		System.out.print("Kaç Soru: ");
		String s = b.readLine();
		
		
		
		
		String[] sorular = new String[new Integer(s)];
		String[][] kCevaplar = new String[new Integer(k)][new Integer(s)];
		
		
		
		for(int i = 0; i < new Integer(s); i++) {
			System.out.print(i + 1 + ". Soru: ");
			sorular[i] = b.readLine();
		}
		
		
		for(int j = 0; j < new Integer(s); j++) {
			for(int k1 = 0; k1 < new Integer(s); k1++) {
				System.out.print(j + 1 + ". Kişinin: ");
				System.out.print(k1 + 1 + ". Sorusu: " + sorular[k1]);
				kCevaplar[j][k1] = b.readLine();
			}
		}
		
		
		
		System.out.println("**********************CEVAP TABLOSU**********************");
		System.out.print("tt");
		
		
		
		for(int y = 0; y < new Integer(k); y++) {
			System.out.print("t");
			System.out.print(y + 1 + ". Kisi");
		}
		System.out.println(" ");
		
		
		
		for(int u = 0; u < new Integer(s); u++) {
			System.out.print(sorular[u]);
			for(int x = 0; x < new Integer(k); x++) {
				System.out.print("tt" + kCevaplar[x][u]);
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		

	}

}
