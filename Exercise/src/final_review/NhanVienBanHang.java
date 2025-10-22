package final_review;

public class NhanVienBanHang extends NhanVien{
	protected double doanhSo;

	public NhanVienBanHang(String maSo, String hoVaTen, String dienThoai, double doanhSo) {
		super(maSo, hoVaTen, dienThoai);
		setDoanhSo(doanhSo);
	}

	public NhanVienBanHang(String maSo, String hoVaTen, String dienThoai) {
		super(maSo, hoVaTen, dienThoai);
		this.doanhSo = 0.0;
	}

	public double getDoanhSo() {
		return doanhSo;
	}

	public void setDoanhSo(double doanhSo) {
		if(doanhSo < 0.0) {
			throw new IllegalArgumentException("Doanh so khong dung.");
		}
		this.doanhSo = doanhSo;
	}

	@Override
	protected double tienLuong() {
		return getLuongCanBan() + ((doanhSo >= 2e7) ? doanhSo * 0.03 : 0.0);
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%s | %s | ", 
				df.format(getDoanhSo()),
				df.format(tienLuong())
				);
	}
}
