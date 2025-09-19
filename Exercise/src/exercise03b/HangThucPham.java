/**
 * 
 */
package exercise03b;

import java.time.LocalDate;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date19 thg 9, 2025 time22:01:12
 */
public class HangThucPham {
	private String productCode;
	private String productName;
	private double unitPrice;
	private LocalDate productionDate;
	private LocalDate expirationDate;
	/**
	 * @param productCode
	 * @param productName
	 * @param unitPrice
	 * @param productionDate
	 * @param expirationDate
	 */
	public HangThucPham(String productCode, String productName, double unitPrice, LocalDate productionDate,
			LocalDate expirationDate) {
		setProductCode(productCode);
		setProductName(productName);
		setUnitPrice(unitPrice);
		setProductionDate(productionDate);
		setExpirationDate(expirationDate);
	}
	/**
	 * 
	 */
	public HangThucPham(String productCode) {
		this(productCode, "No name", 1.0, LocalDate.now(), LocalDate.now().plusDays(1));
	}
	/**
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}
	/**
	 * @param productCode the productCode to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}
	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	/**
	 * @return the productionDate
	 */
	public LocalDate getProductionDate() {
		return productionDate;
	}
	/**
	 * @param productionDate the productionDate to set
	 */
	public void setProductionDate(LocalDate productionDate) {
		this.productionDate = productionDate;
	}
	/**
	 * @return the expirationDate
	 */
	public LocalDate getExpirationDate() {
		return expirationDate;
	}
	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	
}
	