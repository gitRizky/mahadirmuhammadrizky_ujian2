package MahadirMuhammadRizky_SQABatch1_Ujian2;

import java.util.ArrayList;
import java.util.Scanner;

public class No1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Masukkan nilai maksimal deret = ");
		int batas = in.nextInt();
		cetakFibonacci(batas);
	}

	static void cetakFibonacci(int batas) {
		// silakan isi bagian ini
		int angka = 1;
		int sementara = 0;
		int fibonaci;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(1);

		for (int i = 0; i < batas - 1; i++) {
			fibonaci = angka + sementara;
			sementara = angka;
			angka = fibonaci;
			if (fibonaci > batas) {
				break;
			} else {
				temp.add(fibonaci);
			}

		}

		for (int i : temp) {
			System.out.print(i + " ");
		}
	}
}
