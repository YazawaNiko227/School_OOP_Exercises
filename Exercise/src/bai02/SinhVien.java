/**
 * 
 */
package bai02;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date17 thg 9, 2025 time17:21:46
 */
public class SinhVien {
	/** 
	  * Mã số của sinh viên 
	  */ 
	 private int masv; 
	 /** 
	  * Họ và tên của sinh viên 
	  */ 
	 private String hoten; 
	 /** 
	  * Điểm lý thuyết 
	  */ 
	 private float diemlt; 
	 /** 
	  * Điểm thực hành 
	  */ 
	 private float diemth; 
	  
	 /** 
	  * Default constructor của lớp SinhVien 
	  */ 
	 public SinhVien() { 
	  this(0, "no-name", 0.0f, 0.0f); 
	 } 
	  
	 /**  
	  * Constructor đầy đủ của lớp SinhVien.  
	  * Dùng để tạo mới một sinh viên khi biết mã số sinh viên, họ và tên, điểm 
	Bài tập Môn: Lập trình hướng đối tượng - Trang 29 
	 
	lý thuyết, điểm thực hành 
	  * @param masv là mã số sinh viên 
	  * @param hoten là họ và tên của sinh viên 
	  * @param diemlt là điểm lý thuyết của sinh viên 
	  * @param diemth là điểm thực hành của sinh viên 
	  */ 
	 public SinhVien(int masv, String hoten, float diemlt, float diemth) { 
	  this.masv = masv; 
	  this.hoten = hoten; 
	  this.diemlt = diemlt; 
	  this.diemth = diemth; 
	 } 
	 
	 /** 
	  * Lấy mã số sinh viên 
	  * @return the masv 
	  */ 
	 public int getMasv() { 
	  return masv; 
	 } 
	 
	 /**Thiết lập mã số sinh viên 
	  * @param masv the masv to set 
	  */ 
	 public void setMasv(int masv) { 
	  this.masv = masv; 
	 } 
	 
	 /** 
	  * Lấy thông tin họ và tên của sinh viên 
	  * @return the hoten 
	  */ 
	 public String getHoten() { 
	  return hoten; 
	 } 
	 
	 /** 
	  * Thiết lập họ và tên sinh viên 
	  * @param hoten the hoten to set 
	  */ 
	 public void setHoten(String hoten) { 
	  this.hoten = hoten; 
	 } 
	 
	 /** 
	  * Lấy điểm lý thuyết của sinh viên 
	  * @return the diemlt 
	  */ 
	 public float getDiemlt() { 
	 
	  return diemlt; 
	 } 
	 
	 /** 
	  * Thay đổi điểm lý thuyết cho sinh viên 
	  * @param diemlt the diemlt to set 
	  */ 
	 public void setDiemlt(float diemlt) { 
	  this.diemlt = diemlt; 
	 } 
	 
	 /** 
	  * Lấy điểm thực hành của sinh viên 
	  * @return the diemth 
	  */ 
	 public float getDiemth() { 
	  return diemth; 
	 } 
	 
	 /** 
	  * Thay đổi điểm thực hành cho sinh viên 
	  * @param diemth the diemth to set 
	  */ 
	 public void setDiemth(float diemth) { 
	  this.diemth = diemth; 
	 } 
	  
	 /** 
	  * Lấy điểm trung bình của sinh viên 
	  * @return the diemtb điểm trung bình 
	  */ 
	 public float getDiemtb() { 
	  return (diemlt + diemth)/2; 
	 } 
	  
	 /** 
	  * Biểu diễn đối tượng sinh viên ở dạng chuỗi  
	  * @return String  
	  */ 
	 @Override 
	 public String toString() { 
	  return String.format("%-5s %-30s %10.2f %10.2f %10.2f", masv, hoten, 
	diemlt, diemth, getDiemtb()); 
	 } 
}
