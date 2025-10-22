package final_review;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class QuanLyNhanVien {
	private List<NhanVien> quanLy;
	
	public QuanLyNhanVien() {
		quanLy = new ArrayList<NhanVien>();
	}
	
	public boolean themNhanVien(NhanVien nhanVienMoi) {
		if(nhanVienMoi == null || quanLy.contains(nhanVienMoi)) {
			return false;
		}
		quanLy.add(nhanVienMoi);
		return true;
	}
	
	public Map<String, Double> thongKeLuongTrungBinh(){
	    return quanLy.stream().collect(
	    		Collectors.groupingBy(nv -> nv.getClass().getSimpleName()
	    				, Collectors.averagingDouble(nv -> nv.tienLuong())
	    		));
	}
	public List<NhanVien> getDSNhanVienUuTu(){
		return quanLy.stream()
			.filter(nv -> nv instanceof NhanVienBanHang nvbh
					&& nvbh.getDoanhSo() < 2e7)
			.sorted(Comparator.comparingDouble(nv -> ((NhanVienBanHang)nv)
					.getDoanhSo()).reversed())
			.collect(Collectors.toList());
	}
	public List<NhanVien> getDSLonNhat(){
		double maxDoanhSo = quanLy.stream()
				.filter(nv -> nv instanceof NhanVienBanHang)
				.mapToDouble(nv -> ((NhanVienBanHang)nv).getDoanhSo())
				.max()
				.orElse(0);
		return quanLy.stream()
				.filter(nv -> nv instanceof NhanVienBanHang nvbh
						&& nvbh.getDoanhSo() == maxDoanhSo)
				.collect(Collectors.toList());
	}
	public boolean capNhatNhanVien(String maSo, double heSoLuongMoi) {
		for (NhanVien nhanVien : quanLy) {
			if(nhanVien instanceof NhanVienVanPhong nvvp && nvvp.getMaSo().equalsIgnoreCase(maSo)) {
				nvvp.setHeSoLuong(heSoLuongMoi);
				return true;
			}
		}
		return false;
	}
	
	public List<NhanVien> inNhanVien() {
		return quanLy;
	}
}
