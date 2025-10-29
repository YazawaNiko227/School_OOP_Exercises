package collection;

import java.util.ArrayList;
import java.util.List;

public class KiemThu {
	
	public static void main(String[] args) {
		List<PhongHoc> ds = taoDuLieuMau();
		String headerLine = String.format("%6s | %10s | %10s | %10s | %12s | %s",
				"Mã", "Dãy nhà", "Diện tích", "Bóng đèn", "Đánh giá", "Bổ sung");
		
		System.out.println(headerLine + "\n" + "-".repeat(100));
		QuanLyPhongHoc quanLyPhongHoc = new QuanLyPhongHoc();
		for (PhongHoc phongHoc : ds) {
			try {
				System.out.println(quanLyPhongHoc.them(phongHoc));
			} catch (Exception e) {
				System.out.println("Thêm không thành công");
			}
		}
		System.out.println(headerLine + "\n" + "-".repeat(100));
		System.out.println(quanLyPhongHoc);		
		
	}

	private static List<PhongHoc> taoDuLieuMau(){
		List<PhongHoc> danhSach = new ArrayList<>();
		danhSach.add(new PhongLyThuyet("LT101", DayNha.A, 75.0, 8, true));
		danhSach.add(new PhongLyThuyet("LT102", DayNha.B, 60.0, 6, false));
		danhSach.add(new PhongLyThuyet("LT103", DayNha.C, 90.5, 10, true));
		danhSach.add(new PhongLyThuyet("LT104", DayNha.D, 55.5, 5, false));
		danhSach.add(new PhongLyThuyet("LT105", DayNha.V, 100.0, 12, true));
		danhSach.add(new PhongLyThuyet("LT106", DayNha.X, 65.0, 7, true));
		danhSach.add(new PhongLyThuyet("LT107", DayNha.A, 80.0, 9, false));
		danhSach.add(new PhongMayTinh("MT201", DayNha.A, 65.0, 6, 45));
		danhSach.add(new PhongMayTinh("MT202", DayNha.B, 80.0, 8, 50));
		danhSach.add(new PhongMayTinh("MT203", DayNha.C, 100.0, 10, 60));
		danhSach.add(new PhongMayTinh("MT204", DayNha.D, 70.0, 7, 48));
		danhSach.add(new PhongMayTinh("MT205", DayNha.V, 90.0, 9, 55));
		danhSach.add(new PhongMayTinh("MT206", DayNha.X, 85.0, 8, 58));
		danhSach.add(new PhongMayTinh("MT207", DayNha.B, 95.0, 11, 62));
		danhSach.add(new PhongThiNghiem("TN301", DayNha.A, 70.0, 6, "Hóa học", 35, true));
		danhSach.add(new PhongThiNghiem("TN302", DayNha.B, 90.0, 9, "Sinh học", 40, true));
		danhSach.add(new PhongThiNghiem("TN303", DayNha.C, 85.0, 8, "Vật lý", 38, false));
		danhSach.add(new PhongThiNghiem("TN304", DayNha.D, 110.0, 12, "Công nghệ thực phẩm", 50, true));
		danhSach.add(new PhongThiNghiem("TN305", DayNha.V, 60.0, 5, "Hóa phân tích", 30, false));
		danhSach.add(new PhongThiNghiem("TN306", DayNha.X, 100.0, 10, "Môi trường", 45, true));
		danhSach.add(new PhongThiNghiem("TN307", DayNha.A, 75.0, 7, "Kỹ thuật điện", 42, false));
		return danhSach;
	}
}
