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

}
