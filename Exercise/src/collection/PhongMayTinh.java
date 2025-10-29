package collection;

public class PhongMayTinh extends PhongHoc {

	private int soMayTinh;
	
	public PhongMayTinh(String maPhong, DayNha dayNha, double dienTich, int soBongDen) {
		this(maPhong, dayNha, dienTich, soBongDen, 60);
	}

	public PhongMayTinh(String maPhong, DayNha dayNha, double dienTich, int soBongDen,
			int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setSoMayTinh(soMayTinh);
	}

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		if(soMayTinh < 0) {
			soMayTinh = 60;
		}
		this.soMayTinh = soMayTinh;
	}

	@Override
	public String toString() {
		return String.format("%s | %s", 
				super.toString(),
				soMayTinh
				);
	}

	@Override
	public boolean datChuan() {
		int soMayTinhCanCo = (int) Math.ceil(dienTich / 1.5);
		return duSang() && (soMayTinh >= soMayTinhCanCo);
	}
	
}
