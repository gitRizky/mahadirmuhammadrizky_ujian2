package MahadirMuhammadRizky_SQABatch1_Ujian2.No8;

public class Tabungan {
	String nama;
	int noRek, saldo;

	public Tabungan(String string, int i, int j) {
		// TODO Auto-generated constructor stub
		this.nama = string;
		this.noRek = i;
		this.saldo = j;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tabungan nomor " + noRek + " atas nama " + nama + " dengan saldo sebesar " + saldo;
	}

}
