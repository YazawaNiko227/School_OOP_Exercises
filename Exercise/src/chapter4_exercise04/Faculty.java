/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 5 thg 10, 2025 14:38:02
 */
package chapter4_exercise04;

/**
 * 
 */
public class Faculty extends Person{
	private String facultyID;
	private String office;
	public Faculty(String lastName, String firstName, String facultyID, String office) {
		super(lastName, firstName);
		setFacultyID(facultyID);
		setOffice(office);
	}
	public Faculty(String lastName, String firstName) {
		super(lastName, firstName);
		setFacultyID("Empty");
		setOffice("Empty");
	}
	public String getFacultyID() {
		return facultyID;
	}
	public void setFacultyID(String facultyID) {
		if(facultyID == null || facultyID.isEmpty()) {
			facultyID = "Empty";
		}
		this.facultyID = facultyID;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		if(office == null || office.isEmpty()) {
			office = "Empty";
		}
		this.office = office;
	}
	
	
}
