package chapter4_exercise04;

import java.time.LocalDate;

public class Student extends Person{
	private String studentID;
	private int yearMatriculated;
	public Student(String lastName, String firstName, String studentID, int yearMatriculated) {
		super(lastName, firstName);
		setStudentID(studentID);
		setYearMatriculated(yearMatriculated);
	}
	public Student(String lastName, String firstName) {
		super(lastName, firstName);
		setStudentID("Empty");
		setYearMatriculated(LocalDate.now().getYear());
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		if(studentID == null || studentID.isEmpty()) {
			studentID = "Empty";
		}
		this.studentID = studentID;
	}
	public int getYearMatriculated() {
		return yearMatriculated;
	}
	public void setYearMatriculated(int yearMatriculated) {
		if(yearMatriculated > LocalDate.now().getYear()) {
			yearMatriculated = LocalDate.now().getYear();
		}
		this.yearMatriculated = yearMatriculated;
	}
	@Override
	public String toString() {
	    return getLastName() + " " + getFirstName() + " " + studentID;
	}
}
