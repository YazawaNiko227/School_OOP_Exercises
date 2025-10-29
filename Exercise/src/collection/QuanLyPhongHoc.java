package collection;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class QuanLyPhongHoc implements QuanLyImpl{
	
	private List<PhongHoc> danhSach;
	
	public QuanLyPhongHoc() {
		this.danhSach = new ArrayList<PhongHoc>();
	}

	@Override
	public PhongHoc them(PhongHoc phong) {
		if(phong == null || danhSach.contains(phong)) {
			return null;
		}
		danhSach.add(phong);
		return phong;
	}

	@Override
	public PhongHoc xoa(String maPhong) {
		for (int i = 0; i < danhSach.size(); i++) {
			if(danhSach.get(i).getMaPhong().equalsIgnoreCase(maPhong)) {
				return danhSach.remove(i);
			}
		}
		return null;
	}

	@Override
	public PhongHoc capNhat(String maPhong, int soMayTinh) {
		for (PhongHoc phongHoc : danhSach) {
			if (phongHoc.getMaPhong().equalsIgnoreCase(maPhong) && phongHoc instanceof PhongMayTinh pmt) {
				pmt.setSoMayTinh(soMayTinh);
				return pmt;
			}
		}
		return null;
	}

	@Override
	public PhongHoc timKiemPhongHoc(String maPhong) {
		for (PhongHoc phongHoc : danhSach) {
			if (phongHoc.getMaPhong().equalsIgnoreCase(maPhong)) {
				return phongHoc;
			}
		}
		return null;
	}

	@Override
	public List<PhongHoc> sapXepTangDanTheoDayNha() {
		return danhSach.stream().sorted(Comparator.comparing(PhongHoc::getDayNha)).toList();
	}

	@Override
	public List<PhongHoc> sapXepGiamDanTheoDienTich() {
		return danhSach.stream().sorted(Comparator.comparingDouble(PhongHoc::getDienTich).reversed()).toList();
	}

	@Override
	public List<PhongHoc> sapXepTangDanTheoSoBongDenGiamDanTheoDayNha() {
		return danhSach.stream().sorted(Comparator.comparing(PhongHoc::getSoBongDen).thenComparing(PhongHoc::getDayNha, Comparator.reverseOrder())).toList();
	}

	@Override
	public int soLuongPhongHoc() {
		return danhSach.size();
	}

	@Override
	public int tinhTongSoBongDen() {
		return danhSach.stream().mapToInt(PhongHoc::getSoBongDen).sum();
	}

	@Override
	public double tinhTrungBinhDienTich() {
		return danhSach.stream().mapToDouble(PhongHoc::getDienTich).average().orElse(0);
	}

	@Override
	public List<PhongHoc> layDanhSachPhongHocDatChuan() {
		return danhSach.stream().filter(PhongHoc::datChuan).toList();
	}

	@Override
	public List<PhongHoc> layDanhSachPhongMayTinh(int soMay) {
	    return danhSach.stream()
	        .filter(ph -> ph instanceof PhongMayTinh)
	        .map(ph -> (PhongMayTinh) ph)
	        .filter(pmt -> pmt.getSoMayTinh() == soMay)
	        .map(pmt -> (PhongHoc) pmt)	
	        .toList();
	}

	@Override
	public List<PhongHoc> layDanhSachPhongHocCoDienTichLonNhat(int n) {
		return danhSach.stream().sorted(Comparator.comparingDouble(PhongHoc::getDienTich).reversed())
				.limit(n)
				.toList();
	}

	@Override
	public Map<String, List<PhongHoc>> gomNhom1() {
		return danhSach.stream().collect(Collectors.groupingBy(ph -> ph.getClass().getSimpleName()));
	}

	@Override
	public Map<DayNha, Integer> gomNhom2() {
	    return danhSach.stream()
	        .collect(Collectors.groupingBy(
	            PhongHoc::getDayNha,
	            Collectors.collectingAndThen(Collectors.counting(), Long::intValue)
	        ));
	}


	@Override
	public Map<String, List<PhongHoc>> gomNhom3() {
	    return danhSach.stream()
	        .collect(Collectors.groupingBy(ph -> {
	            double dt = ((PhongHoc) ph).getDienTich();
	            if (dt <= 30) return "Phòng nhỏ";
	            else if (dt <= 70) return "Phòng vừa";
	            else return "Phòng lớn";
	        }));
	}

	@Override
	public Map<String, Set<DayNha>> gomNhom4() {
		return danhSach.stream().collect(Collectors.groupingBy(ph -> ph.getClass().getSimpleName()
				, Collectors.mapping(PhongHoc::getDayNha, Collectors.toSet())));
	}

	@Override
	public Map<String, PhongHoc> gomNhom5() {
	    return danhSach.stream()
	        .sorted(Comparator.comparingDouble(PhongHoc::getDienTich).reversed())
	        .collect(Collectors.toMap(
	            PhongHoc::getMaPhong,
	            ph -> ph,
	            (oldValue, newValue) -> oldValue,
	            LinkedHashMap::new 
	        ));
	}


	@Override
	public Map<DayNha, List<PhongHoc>> gomNhom6() {
		return danhSach.stream().collect(Collectors.groupingBy(
				PhongHoc::getDayNha,
				Collectors.collectingAndThen(
						Collectors.toList(),
						list -> list.stream()
						.sorted(Comparator.comparingDouble(PhongHoc::getDienTich).reversed())
						.toList())
				));
	}

}
