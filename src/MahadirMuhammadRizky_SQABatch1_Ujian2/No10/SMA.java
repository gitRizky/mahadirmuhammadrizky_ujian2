package MahadirMuhammadRizky_SQABatch1_Ujian2.No10;

public class SMA implements Sekolah {

	String nama;
	String alamat;
	String jenjang;

	void sma() {

	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public void setJenjang(String jenjang) {
		this.jenjang = jenjang;
	}

	@Override
	public void nama() {
		// TODO Auto-generated method stub
		System.out.println(nama);

	}

	@Override
	public void alamat() {
		// TODO Auto-generated method stub
		System.out.println(alamat);

	}

	@Override
	public void jenjang() {
		// TODO Auto-generated method stub
		System.out.println(jenjang);
	}

}
