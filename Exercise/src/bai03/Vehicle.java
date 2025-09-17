/**
 * 
 */
package bai03;

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
	
	
}
