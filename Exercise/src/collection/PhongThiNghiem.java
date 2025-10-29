package collection;

public class PhongThiNghiem extends PhongHoc {
	
	private String chuyenNganh;
	private int sucChua;
	private boolean coBonRua;
	
	public PhongThiNghiem(String maPhong, DayNha dayNha, double dienTich, int soBongDen) {
		this(maPhong, dayNha, dienTich, soBongDen, "Chưa xác định", 30, false);
	}
	
	public PhongThiNghiem(String maPhong, DayNha dayNha, double dienTich, int soBongDen,
			String chuyenNganh, int sucChua, boolean coBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setChuyenNganh(chuyenNganh);
		setSucChua(sucChua);
		setCoBonRua(coBonRua);
	}
	
	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		if(chuyenNganh == null || chuyenNganh.isEmpty()) {
			chuyenNganh = "Chưa xác định";
		}
		this.chuyenNganh = chuyenNganh;
	}

	public int getSucChua() {
		return sucChua;
	}

	public void setSucChua(int sucChua) {
		if(sucChua <= 0) {
			sucChua = 30;
		}
		this.sucChua = sucChua;
	}

	public boolean isCoBonRua() {
		return coBonRua;
	}

	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}

	@Override
	public String toString() {
		return String.format("%s | %s, %s, %s", 
				super.toString(),
				chuyenNganh,
				sucChua,
				coBonRua ? "Có bồn rửa" : "Không bồn rửa"
				);
	}

	@Override
	public boolean datChuan() {
		return duSang() && coBonRua;
	}
	
}
