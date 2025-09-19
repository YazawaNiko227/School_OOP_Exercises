package exercise03;

import java.util.Scanner;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date 19 thg 9, 2025 time 17:52:59
 */
public class Test {

    public static void main(String[] args) {
    	Vehicle[] xe = new Vehicle[3];
		Scanner input = new Scanner(System.in);
    	
    	boolean exit = true;
    	while(exit) {
    		System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập thông tin và tạo các đối tượng xe1, xe2, xe3");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3. Thoát");
            System.out.print("Chọn: ");
    		
    		int choice = input.nextInt();
    		input.nextLine();
    		switch (choice) {
			case 1:
				System.out.println("1. Nhập thông tin và tạo các đối tượng xe1, xe2, xe3");
				for (int i = 0; i < xe.length; i++) {
					System.out.printf("Nhập thông tin xe%d\n",i);
					xe[i] = new Vehicle();
					xe[i].InputVehicle(input);
				}
				break;
			case 2:
			    System.out.println("Xuất bảng kê khai tiền thuế trước bạ của các xe.");
			    String format = "| %-20s | %-15s | %-10s | %-15s | %-15s |\n";
			    System.out.format(format, "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
			    System.out.println("---------------------------------------------------------------------------------------------");

			    for (int i = 0; i < xe.length; i++) {
			        if (xe[i] != null) {
			            xe[i].showVehicle();
			        } else {
			            System.out.printf("| %-20s | %-15s | %-10s | %-15s | %-15s |\n", "Chưa nhập", "-", "-", "-", "-");
			        }
			    }
			    break;

			case 3:
				System.out.println("3. Thoát.");
				exit = false;
				break;
			default:
				break;
			}
    	}
    	input.close();
    }
}
