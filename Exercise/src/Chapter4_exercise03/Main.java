/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 4 thg 10, 2025 13:40:23
 */
package Chapter4_exercise03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SoftwareHouse company = new SoftwareHouse("TechVision", 10);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị toàn bộ nhân viên");
            System.out.println("3. Tổng lương phải trả hàng tháng");
            System.out.println("4. Sắp xếp nhân viên theo tên");
            System.out.println("5. Hiển thị danh sách lập trình viên");
            System.out.println("6. Cập nhật phòng ban cho người quản lý");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.println("Chọn loại nhân viên:");
                    System.out.println("1. Lập trình viên");
                    System.out.println("2. Người quản lý");
                    System.out.println("3. Trưởng dự án");
                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Mã số: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Lương cơ bản: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();

                    Employee emp = null;
                    if (type == 1) {
                        System.out.print("Ngôn ngữ lập trình: ");
                        String lang = sc.nextLine();
                        emp = new Programmer(id, name, salary, lang);
                    } else if (type == 2) {
                        System.out.print("Phòng ban: ");
                        String dept = sc.nextLine();
                        emp = new Administrator(id, name, salary, dept);
                    } else if (type == 3) {
                        System.out.print("Ngôn ngữ lập trình: ");
                        String lang = sc.nextLine();
                        emp = new ProjectLeader(id, name, salary, lang);
                    }

                    if (company.addEmployee(emp)) {
                        System.out.println("Thêm nhân viên thành công.");
                    } else {
                        System.out.println("Thêm thất bại (trùng mã số hoặc danh sách đầy).");
                    }
                    break;

                case 2:
                    company.displayAllStaff();
                    break;

                case 3:
                    System.out.printf("Tổng lương phải trả: $%,.2f\n", company.getMonthlySalaryBill());
                    break;

                case 4:
                    company.sortAllStaffByName();
                    System.out.println("Đã sắp xếp theo tên.");
                    break;

                case 5:
                    System.out.println("Danh sách lập trình viên:");
                    company.displayListProgrammers();
                    break;

                case 6:
                    System.out.print("Nhập mã số người quản lý: ");
                    int adminId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Phòng ban mới: ");
                    String newDept = sc.nextLine();
                    if (company.updateDepartmentForAdmin(adminId, newDept)) {
                        System.out.println("Cập nhật thành công.");
                    } else {
                        System.out.println("Không tìm thấy người quản lý với mã số đã nhập.");
                    }
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    sc.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}

