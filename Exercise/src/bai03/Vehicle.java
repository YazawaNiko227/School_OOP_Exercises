/**
 * 
 */
package bai03;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date17 thg 9, 2025 time17:28:22
 */
public class Vehicle {
	private String ownerName;
	private String typeVehicle;
	private int xylanh;
	private double price;
	
	NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}
	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		if(ownerName == null || ownerName.isEmpty()) {
			throw new IllegalArgumentException("Ten khong de trong!");
		}
		this.ownerName = ownerName;
	}
	/**
	 * @return the typeVehicle
	 */
	public String getTypeVehicle() {
		return typeVehicle;
	}
	/**
	 * @param typeVehicle the typeVehicle to set
	 */
	public void setTypeVehicle(String typeVehicle) {
		if(typeVehicle == null || typeVehicle.isEmpty()) {
			throw new IllegalArgumentException("Ten khong de trong!");
		}
		this.typeVehicle = typeVehicle;
	}
	/**
	 * @return the xylanh
	 */
	public int getXylanh() {
		return xylanh;
	}
	/**
	 * @param xylanh the xylanh to set
	 */
	public void setXylanh(int xylanh) {
		if(xylanh <= 0) {
			throw new IllegalArgumentException("Dung tich xe phai lon hon 0");
		}
		this.xylanh = xylanh;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		if(price <= 0) {
			throw new IllegalArgumentException("Gia tien khong hop le");
		}
		this.price = price;
	}
	/**
	 * 
	 */
	public Vehicle() {
		this("no-name","no-name",1,1.0);
	}
	/**
	 * @param ownerName
	 * @param typeVehicle
	 * @param xylanh
	 * @param price
	 */
	public Vehicle(String ownerName, String typeVehicle, int xylanh, double price) {
		setOwnerName(ownerName);
		setTypeVehicle(typeVehicle);
		setXylanh(xylanh);
		setPrice(price);
	}
	
	public double Tax() {
	    if (xylanh < 100) {
	        return price * 0.01;
	    } else if (xylanh < 200) {
	        return price * 0.03;
	    } else {
	        return price * 0.05;
	    }
	}

	public void InputVehicle(Scanner input) {
		System.out.println("Nhap ten chu xe");
		ownerName =  input.nextLine();
		System.out.println("Nhap loai xe");
		typeVehicle = input.nextLine();
		System.out.println("Nhap xylanh");
		xylanh = input.nextInt();
		System.out.println("Nhap gia");
		price = input.nextDouble();
		input.nextLine();
	}
	
	public void showVehicle() {
	    System.out.printf("| %-20s | %-15s | %-10d | %-15s | %-15s |\n",
	            ownerName, typeVehicle, xylanh, nf.format(price), nf.format(Tax()));
	}

	@Override
	public String toString() {
        return String.format("%s | %s | %d | %s | %s",
                ownerName, typeVehicle, xylanh, nf.format(price), nf.format(Tax()));
    }
}
