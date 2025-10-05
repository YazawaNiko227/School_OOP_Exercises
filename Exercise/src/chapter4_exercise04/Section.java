/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 5 thg 10, 2025 14:43:09
 */
package chapter4_exercise04;

import java.util.Set;

/**
 * 
 */
public class Section {
	private String semester;
	private String sectionNbr;
	private String room;
	private Faculty facultyMember;
	private Set<Enrolment> listEnrolls;
	public Section(String semester, String sectionNbr, String room, Faculty facultyMember, Set<Enrolment> listEnrolls) {
		setSemester(semester);
		setSectionNbr(sectionNbr);
		setRoom(room);
		this.facultyMember = facultyMember;
		this.listEnrolls = listEnrolls;
	}
	public Section() {
		setSemester("Empty");
		setSectionNbr("Empty");
		setRoom("Empty");
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		if(semester == null || semester.isEmpty()) {
			semester = "Empty";
		}
		this.semester = semester;
	}
	public String getSectionNbr() {
		return sectionNbr;
	}
	public void setSectionNbr(String sectionNbr) {
		if(sectionNbr == null || sectionNbr.isEmpty()) {
			sectionNbr = "Empty";
		}
		this.sectionNbr = sectionNbr;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		if(room == null || room.isEmpty()) {
			room = "Empty";
		}
		this.room = room;
	}
}
