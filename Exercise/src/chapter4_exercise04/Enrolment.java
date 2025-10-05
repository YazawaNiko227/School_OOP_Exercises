/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 5 thg 10, 2025 14:44:23
 */
package chapter4_exercise04;

/**
 * 
 */
public class Enrolment {
	private String status;
	private String grade;
	private float numGrade;
	private Student student;
	public Enrolment(String status, String grade, float numGrade, Student student) {
		setStatus(status);
		setGrade(grade);
		setNumGrade(numGrade);
		this.student = student;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		if(status == null || status.isEmpty()) {
			status = "Empty";
		}
		this.status = status;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		if(grade == null || grade.isEmpty()) {
			grade = "Empty";
		}
		this.grade = grade;
	}
	public float getNumGrade() {
		return numGrade;
	}
	public void setNumGrade(float numGrade) {
		if(numGrade < 0.0) {
			numGrade = (float) 0.0;
		}
		this.numGrade = numGrade;
	}
	public Student getStudent() {
	    return student;
	}

	public void setStudent(Student student) {
	    this.student = student;
	}
}
