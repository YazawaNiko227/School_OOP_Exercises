package final_review;

public class NhanVienVanPhong extends NhanVien{
	protected double heSoLuong;

	public NhanVienVanPhong(String maSo, String hoVaTen, String dienThoai, double heSoLuong) {
		super(maSo, hoVaTen, dienThoai);
		setHeSoLuong(heSoLuong);
	}
	
	public NhanVienVanPhong(String maSo, String hoVaTen, String dienThoai) {
		super(maSo, hoVaTen, dienThoai);
		this.heSoLuong = 1.86;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		if(heSoLuong < 1.86 || heSoLuong > 8.69) {
			throw new IllegalArgumentException("He so luong khong dung.");
		}
		this.heSoLuong = heSoLuong;
	}

	@Override
	protected double tienLuong() {
		return getLuongCanBan() * getHeSoLuong();
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%s | %s | ", 
				getHeSoLuong(),
				df.format(tienLuong())
				);
	}
}
