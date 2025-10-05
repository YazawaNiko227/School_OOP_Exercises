/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 5 thg 10, 2025 14:51:31
 */
package chapter4_exercise04;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class Course {
	private String courseNbr;
	private String courseTitle;
	private int credits;
	private Set<Section> section = new HashSet<>();
	public Course(String courseNbr, String courseTitle, int credits) {
		setCourseNbr(courseNbr);
		setCourseTitle(courseTitle);
		setCredits(credits);
	}
	public Course() {
		this("Empty", "Empty", 0);
	}
	public String getCourseNbr() {
		return courseNbr;
	}
	public void setCourseNbr(String courseNbr) {
		if(courseNbr == null || courseNbr.isEmpty()) {
			courseNbr = "Empty";
		}
		this.courseNbr = courseNbr;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		if(courseTitle == null || courseTitle.isEmpty()) {
			courseTitle = "Empty";
		}
		this.courseTitle = courseTitle;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		if(credits < 0) {
			credits = 0;
		}
		this.credits = credits;
	}
	public void addSection(String sectionNbr, String semester, String room, Faculty facultyMember, Set<Enrolment> listEnrolls)
	{
		section.add(new Section(sectionNbr, semester, room, facultyMember, listEnrolls));
	}
	public int getNbrStudents(String sectionNbr) {
		return 0;
	}
}
