package final_review;

import java.text.DecimalFormat;

public abstract class NhanVien {
	protected final String maSo;
	protected String hoVaTen;
	protected String dienThoai;
	protected double luongCanBan;
	
	DecimalFormat df = new DecimalFormat("###,### VND");
	
	public NhanVien(String maSo, String hoVaTen, String dienThoai) {
		if(maSo == null || maSo.isEmpty()) {
			throw new IllegalArgumentException("Ma so khong dung.");
		}
		this.maSo = maSo;
		setHoVaTen(hoVaTen);
		setDienThoai(dienThoai);
		this.luongCanBan = 1800000;
	}

	public NhanVien() {
		this("Empty", "Empty", "Empty");
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		if(hoVaTen == null || hoVaTen.isEmpty()) {
			throw new IllegalArgumentException("Ho va ten khong dung.");
		}
		this.hoVaTen = hoVaTen;
	}

	public String getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		if(dienThoai == null || dienThoai.isEmpty()) {
			throw new IllegalArgumentException("So dien thoai khong dung.");
		}
		this.dienThoai = dienThoai;
	}

	public String getMaSo() {
		return maSo;
	}

	public double getLuongCanBan() {
		return luongCanBan;
	}
	
	protected abstract double tienLuong();
	
	@Override
	public String toString() {
		return String.format("%10s | %15s | %15s | %10s | ", 
				getMaSo(),
				getHoVaTen(),
				getDienThoai(),
				df.format(getLuongCanBan())
				);
	}
}
