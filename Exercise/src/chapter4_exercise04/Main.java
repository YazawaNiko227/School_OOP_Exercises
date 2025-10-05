/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 5 thg 10, 2025 15:20:31
 */
package chapter4_exercise04;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Tạo giảng viên
        Faculty faculty = new Faculty("Lê", "Kim Khánh", "CNTT01", "H5.01");

        // Tạo sinh viên
        Student sv1 = new Student("Nguyễn", "Văn B", "123", 2013);
        Student sv2 = new Student("Trần", "Văn C", "124", 2014);
        Student sv3 = new Student("Lê", "Huỳnh", "125", 2013);
        Student sv4 = new Student("Lê", "Huỳnh", "126", 2014);

        // Tạo danh sách ghi danh
        Set<Enrolment> enrolments = new HashSet<>();
        enrolments.add(new Enrolment("Đã đăng ký", "A", 9.5f, sv1));
        enrolments.add(new Enrolment("Đã đăng ký", "B", 7.0f, sv2));
        enrolments.add(new Enrolment("Đã đăng ký", "B+", 8.0f, sv3));
        enrolments.add(new Enrolment("Đã đăng ký", "A", 9.5f, sv4));

        // Tạo khóa học
        Course oopCourse = new Course("0602", "Lập trình hướng đối tượng", 4);

        // Thêm học phần vào khóa học
        oopCourse.addSection("0602", "I (2014-2015)", "H5.01", faculty, enrolments);

        // In thông tin khóa học
        System.out.println("Khóa học: " + oopCourse.getCourseTitle() + " (" + oopCourse.getCredits() + "TC)");
        System.out.println("Thông tin học phần:");
        for (Section section : oopCourse.getSections()) {
            System.out.println("Mã học phần: " + section.getSectionNbr());
            System.out.println("Học kỳ: " + section.getSemester());
            System.out.println("Phòng học: " + section.getRoom());
            System.out.println("Giảng viên: " + section.getFacultyMember() + " (Khoa: " + faculty.getFacultyID() + ")");
            System.out.println("\nDanh sách sinh viên:");
            System.out.printf("%-6s | %-20s | %-8s | %-6s\n", "Mã SV", "Họ tên", "Khóa học", "Điểm TB");
            for (Enrolment e : section.getListEnrolls()) {
                Student s = e.getStudent();
                System.out.printf("%-6s | %-20s | %-8d | %-6.1f\n",
                        s.getStudentID(), s.getLastName() + " " + s.getFirstName(),
                        s.getYearMatriculated(), e.getNumGrade());
            }
            System.out.println("\nTổng số sinh viên: " + section.getListEnrolls().size());
        }
    }
}
