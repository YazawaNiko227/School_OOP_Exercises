package collection;

import java.text.DecimalFormat;
import java.util.Objects;

public abstract class PhongHoc {
	
	protected final String maPhong;
	protected DayNha dayNha;
	protected double dienTich;
	protected int soBongDen;
	
	public PhongHoc(String maPhong, DayNha dayNha, double dienTich, int soBongDen) {
		if(maPhong == null || maPhong.isEmpty()) {
			throw new RuntimeException("Mã phòng không hợp lệ");
		}
		this.maPhong = maPhong;
		setDayNha(dayNha);
		setDienTich(dienTich);
		setSoBongDen(soBongDen);
	}
	
	public DayNha getDayNha() {
		return dayNha;
	}

	public void setDayNha(DayNha dayNha) {
		if(dayNha == null || !(dayNha instanceof DayNha)) {
			throw new RuntimeException("Dãy nhà không hợp lệ");
		}
		this.dayNha = dayNha;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		if(dienTich <= 0.0) {
			throw new RuntimeException("Diện tích lớn hơn 0");
		}
		this.dienTich = dienTich;
	}

	public int getSoBongDen() {
		return soBongDen;
	}

	public void setSoBongDen(int soBongDen) {
		if(dienTich < 0) {
			throw new RuntimeException("Số bóng đèn không âm");
		}
		this.soBongDen = soBongDen;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public abstract boolean datChuan();
	
	protected boolean duSang() {
		int soBongDenCanCo = (int) Math.ceil(dienTich / 10);
		return soBongDen >= soBongDenCanCo;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.0");
		return String.format("%6s | %10s | %10s | %10s | %12s",
				maPhong,
				dayNha,
				df.format(dienTich),
				soBongDen,
				datChuan() ? "Đạt" : "Không đạt"
				);
	}

	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}
	
	
	
}
