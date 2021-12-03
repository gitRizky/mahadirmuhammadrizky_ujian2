package MahadirMuhammadRizky_SQABatch1_Ujian2.No7;

public class Tabungan {
	String nama;
	int noRek;
	int saldo;

	public Tabungan(String nama, int noRek, int saldo) {
		// TODO Auto-generated constructor stub
		this.nama = nama;
		this.noRek = noRek;
		this.saldo = saldo;

	}

	public void setor(int uang) {
		// TODO Auto-generated method stub
		System.out.println("Setoran sebesar " + uang + " berhasil dilakukan, saldo anda sekarang " + (saldo + uang));
		saldo += uang;
	}

	public void cekSaldo() {
		// TODO Auto-generated method stub
		System.out.println("Saldo anda saat ini adalah " + saldo);

	}

	public void tarik(int tarik) {
		// TODO Auto-generated method stub
		if (tarik > saldo) {
			System.out.println("Penarikan tidak dapat dilakukan karena saldo anda tidak cukup");

		} else {
			saldo -= tarik;
			System.out.println("Penarikan sebesar " + tarik + " berhasil dilakukan, saldo anda sekarang " + saldo);
		}
	}

}
