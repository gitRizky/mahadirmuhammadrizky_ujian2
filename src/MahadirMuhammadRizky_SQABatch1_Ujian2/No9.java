package MahadirMuhammadRizky_SQABatch1_Ujian2;

import java.util.Scanner;

public class No9 {
	public static void main(String[]args) {
		// Silakan isi bagian ini
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan Jarak (kilometer) = ");
		int jarak = scan.nextInt();
		System.out.print("Masukan waktu (jam) = ");
		int waktu = scan.nextInt();
		
		System.out.println("Kecepatan rata-rata anda adalah " + hitungKecepatan(jarak, waktu) + " km/jam");
		
	}
		static double hitungKecepatan(double jarak,  double waktu) {
		//Silakan isi bagian ini dan ganti “anu” dengan kode yang tepat
			return jarak/waktu;
		}

}
