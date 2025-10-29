package collection;

public class PhongLyThuyet extends PhongHoc {

	private boolean coMayChieu;
	
	public PhongLyThuyet(String maPhong, DayNha dayNha, double dienTich, int soBongDen) {
		this(maPhong, dayNha, dienTich, soBongDen, false);
	}

	public PhongLyThuyet(String maPhong, DayNha dayNha, double dienTich, int soBongDen,
			boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setCoMayChieu(coMayChieu);
	}

	public boolean isCoMayChieu() {
		return coMayChieu;
	}

	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}

	@Override
	public String toString() {
		return String.format("%s | %s", 
				super.toString(),
				coMayChieu ? "Có máy chiếu" : "Không máy chiếu"
				);
	}

	@Override
	public boolean datChuan() {
		return duSang() && coMayChieu;
	}
	
}
