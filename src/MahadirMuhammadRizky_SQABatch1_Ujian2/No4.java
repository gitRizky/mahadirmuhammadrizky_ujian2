package MahadirMuhammadRizky_SQABatch1_Ujian2;

import java.util.Scanner;

public class No4 {
	public static void main(String[] args) {
		// Silakan isi bagian ini
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan sisa BBM dalam tangki (liter) = ");
		int liter = scan.nextInt();
		System.out.print("Masukkan konsumsi BBM kendaraan (km/liter) = ");
		int kmLiter = scan.nextInt();

		System.out.println("Kendaraan anda dapat menempuh jarak " + hitungSisaJarak(liter, kmLiter)
				+ " kilometer dengan sisa BBM yang ada di tangki");
	}

	static double hitungSisaJarak(double sisa, double jarakPerLiter) {
		double sisaJarak = sisa * jarakPerLiter;
		return sisaJarak;
	}
}
