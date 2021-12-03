package MahadirMuhammadRizky_SQABatch1_Ujian2;

import java.util.Scanner;

public class No9 {
	public static void main(String[] args) {
		// Silakan isi bagian ini
		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("masukan 5 nilai yang ingin dijumlahkan : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println("hasil = " + jumlahArray(arr));

		System.out.println();

		System.out.print("nilai yang ingin dicek dalam array : ");
		System.out.println("hasil = " + cariNilai(arr, scan.nextInt()));

	}

	public static int jumlahArray(int[] nilai) {
		int sum = 0;
		for (int i = 0; i < nilai.length; i++) {
			sum += nilai[i];
		}
		return sum;
	}

	public static boolean cariNilai(int[] arr, int nilai) {
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == nilai)
				return true;
		}
		return false;
	}

}
