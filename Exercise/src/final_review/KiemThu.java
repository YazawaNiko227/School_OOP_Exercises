package final_review;

import java.util.List;
import java.util.Map;

public class KiemThu {
    public static void main(String[] args) {
        QuanLyNhanVien quanLy = new QuanLyNhanVien();

        System.out.println("Thêm nhân viên:");

        // Kiểm thử dữ liệu sai
        try {
            NhanVien vp1 = new NhanVienVanPhong("VP001", "Nguyễn Văn An", "0909123456", 0.5); // hệ số lương sai
            quanLy.themNhanVien(vp1);
        } catch (Exception e) {
            System.out.println("Lỗi tạo VP001: " + e.getMessage());
        }

        try {
            NhanVien bh1 = new NhanVienBanHang("BH001", "Ngô Thị Hoa", "0909123461", -1); // doanh số sai
            quanLy.themNhanVien(bh1);
        } catch (Exception e) {
            System.out.println("Lỗi tạo BH001: " + e.getMessage());
        }

        // Dữ liệu hợp lệ
        NhanVien vp2 = new NhanVienVanPhong("VP002", "Trần Thị Bình", "0909123457", 3.0);
        NhanVien vp3 = new NhanVienVanPhong("VP003", "Lê Văn Cường", "0909123458", 4.2);
        NhanVien vp4 = new NhanVienVanPhong("VP003", "Phạm Thị Dung", "0909123459", 2.8); // trùng mã
        NhanVien vp5 = new NhanVienVanPhong("VP005", "Hoàng Văn Em", "0909123460", 3.6);

        NhanVien bh2 = new NhanVienBanHang("BH002", "Đặng Văn Hùng", "0909123462", 25000000);
        NhanVien bh3 = new NhanVienBanHang("BH003", "Vũ Thị Lan", "0909123463", 12000000);
        NhanVien bh4 = new NhanVienBanHang("BH004", "Trịnh Văn Minh", "0909123464", 25000000); // trùng doanh số lớn nhất
        NhanVien bh5 = new NhanVienBanHang("BH005", "Bùi Thị Ngọc", "0909123465", 20000000);

        NhanVien[] danhSach = {vp2, vp3, vp4, vp5, bh2, bh3, bh4, bh5};

        for (NhanVien nv : danhSach) {
            if (quanLy.themNhanVien(nv)) {
                System.out.printf("Thêm %s - %s: Thành công.%n", nv.getMaSo(), nv.getHoVaTen());
            } else {
                System.out.printf("Thêm %s - %s: Lỗi (trùng mã hoặc null).%n", nv.getMaSo(), nv.getHoVaTen());
            }
        }

        // Thống kê lương trung bình
        System.out.println("\nThống kê lương trung bình:");
        Map<String, Double> thongKe = quanLy.thongKeLuongTrungBinh();
        thongKe.forEach((loai, luongTB) ->
            System.out.printf("%s: %.2f VND%n", loai, luongTB)
        );

        // Lấy danh sách nhân viên ưu tú (doanh số < 20 triệu)
        System.out.println("\nNhân viên bán hàng ưu tú (doanh số < 20 triệu):");
        List<NhanVien> uuTu = quanLy.getDSNhanVienUuTu();
        if (uuTu.isEmpty()) {
            System.out.println("Không có nhân viên ưu tú.");
        } else {
            uuTu.forEach(System.out::println);
        }

        // Lấy danh sách nhân viên có doanh số lớn nhất
        System.out.println("\nNhân viên bán hàng có doanh số lớn nhất:");
        List<NhanVien> lonNhat = quanLy.getDSLonNhat();
        lonNhat.forEach(System.out::println);

        // Cập nhật hệ số lương đúng
        System.out.println("\nCập nhật hệ số lương cho VP002:");
        boolean capNhat1 = quanLy.capNhatNhanVien("VP002", 4.0);
        System.out.println(capNhat1 ? "Cập nhật thành công." : "Không tìm thấy nhân viên.");

        // Cập nhật hệ số lương sai (mã không tồn tại)
        System.out.println("\nCập nhật hệ số lương cho VP999:");
        boolean capNhat2 = quanLy.capNhatNhanVien("VP999", 3.5);
        System.out.println(capNhat2 ? "Cập nhật thành công." : "Không tìm thấy nhân viên.");

        // Cập nhật hệ số lương sai (giá trị không hợp lệ)
        System.out.println("\nCập nhật hệ số lương cho VP005 với giá trị sai:");
        try {
            quanLy.capNhatNhanVien("VP005", 0.5);
        } catch (Exception e) {
            System.out.println("Lỗi cập nhật: " + e.getMessage());
        }

        // In lại thông tin sau cập nhật
        System.out.println("\nThông tin nhân viên sau cập nhật:");
        thongKe = quanLy.thongKeLuongTrungBinh();
        thongKe.forEach((loai, luongTB) ->
            System.out.printf("%s: %.2f VND%n", loai, luongTB)
        );
    }
}
