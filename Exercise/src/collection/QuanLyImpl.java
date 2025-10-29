package collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface QuanLyImpl {
	
	// Viết phương thức thêm một phòng học vào danh sách (thêm được nếu không trùng mã phòng).
	PhongHoc them(PhongHoc phong);
	
	// Viết phương thức để xóa một phòng học nào đó khi biết mã phòng.
	PhongHoc xoa(String maPhong);
	
	// Viết phương thức để cập nhật số máy tính cho một phòng máy tính nào đó khi biết mã phòng.
	PhongHoc capNhat(String maPhong, int soMayTinh);
	
	// Viết phương thức tìm kiếm một phòng học nào đó khi biết mã phòng.
	PhongHoc timKiemPhongHoc(String maPhong);
	
	// Viết phương thức toString() lấy thông tin toàn bộ danh sách các phòng học.
//	void inThongTinDanhSachPhongHoc();
	
	// Viết phương thức để sắp xếp danh sách tăng dần theo dãy nhà.
	List<PhongHoc> sapXepTangDanTheoDayNha();
	
	// Viết phương thức để sắp xếp danh sách giảm dần theo diện tích.
	List<PhongHoc> sapXepGiamDanTheoDienTich();
	
	// Viết phương thức để sắp xếp danh sách tăng dần theo số bóng đèn
	// Nếu cùng số bóng đèn thì giảm dần theo dãy nhà.
	List<PhongHoc> sapXepTangDanTheoSoBongDenGiamDanTheoDayNha();
	
	// Viết phương thức để tính tổng số phòng học.
	int soLuongPhongHoc();
	
	// Viết phương thức để tính tổng số bóng đèn của các phòng học.
	int tinhTongSoBongDen();
	
	// Viết phương thức để tính trung bình diện tích của các phòng học.
	double tinhTrungBinhDienTich();
	
	// Viết các phương thức để lấy danh sách các phòng học đạt chuẩn.
	List<PhongHoc> layDanhSachPhongHocDatChuan();
	
	// Viết các phương thức để lấy danh sách các phòng máy có 60 máy.
	List<PhongHoc> layDanhSachPhongMayTinh(int soMay);
	
	// Viết các phương thức để lấy danh sách n phòng học có diện tích lớn nhất.
	List<PhongHoc> layDanhSachPhongHocCoDienTichLonNhat(int n);
	
	// Viết phương thức gom nhóm các loại phòng
	Map<String, List<PhongHoc>> gomNhom1(); // Khoá: Tên loại phòng
	Map<DayNha, Integer> gomNhom2(); // Khoá: DayNha, Giá trị: Số lượng phòng mỗi nhóm
	Map<String, List<PhongHoc>> gomNhom3(); // Khoá (Diện tích): "Phòng nhỏ" <= 30 "Phòng vừa" <= 70 "Phòng lớn" >70
	Map<String, Set<DayNha>> gomNhom4(); // Khoá: Tên loại phòng, Giá trị: Các dãy trọ không trùng

	Map<String, PhongHoc> gomNhom5(); // Khoá: Mã phòng, Giá trị: Đối tượng, có diện tích giảm dần
	Map<DayNha, List<PhongHoc>> gomNhom6(); // Khoá: DayNha, Giá trị: Danh sách phòng học có diện tích giảm dần
	
}
