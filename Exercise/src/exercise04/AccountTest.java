package exercise04;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountList list = new AccountList();

        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them tai khoan");
            System.out.println("2. So tai khoan hien co");
            System.out.println("3. In thong tin tat ca tai khoan");
            System.out.println("4. Nap tien vao tai khoan");
            System.out.println("5. Rut tien");
            System.out.println("6. Chuyen tien");
            System.out.println("7. Ket thuc");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine(); // xoa bo dem

            switch (choice) {
                case 1:
                    System.out.print("Nhap so tai khoan: ");
                    long number = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Nhap ten tai khoan: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap so du: ");
                    double money = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Trang thai (ACTIVE, INACTIVE, CLOSED): ");
                    String statusStr = sc.nextLine();
                    StatusAccount status = StatusAccount.valueOf(statusStr.toUpperCase());

                    Account acc = new Account(number, name, money, status, "");
                    list.addAccount(acc);
                    System.out.println("Them tai khoan thanh cong!");
                    break;

                case 2:
                    System.out.println("So tai khoan hien co: " + list.getCount());
                    break;

                case 3:
                    list.printAllAccounts();
                    break;

                case 4:
                    System.out.print("Nhap so tai khoan can nap: ");
                    long depositNumber = sc.nextLong();
                    System.out.print("Nhap so tien can nap: ");
                    double depositAmount = sc.nextDouble();
                    int indexDeposit = list.findAccountByNumber(depositNumber);
                    if (indexDeposit != -1) {
                        list.list[indexDeposit].deposit(depositAmount);
                        System.out.println("Nap tien thanh cong!");
                    } else {
                        System.out.println("Khong tim thay tai khoan.");
                    }
                    break;

                case 5:
                    System.out.print("Nhap so tai khoan can rut: ");
                    long withdrawNumber = sc.nextLong();
                    System.out.print("Nhap so tien can rut: ");
                    double withdrawAmount = sc.nextDouble();
                    int indexWithdraw = list.findAccountByNumber(withdrawNumber);
                    if (indexWithdraw != -1) {
                        try {
                            list.list[indexWithdraw].withdraw(withdrawAmount);
                            System.out.println("Rut tien thanh cong!");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Khong tim thay tai khoan.");
                    }
                    break;

                case 6:
                    System.out.print("Nhap so tai khoan nguoi gui: ");
                    long senderNumber = sc.nextLong();
                    System.out.print("Nhap so tai khoan nguoi nhan: ");
                    long receiverNumber = sc.nextLong();
                    System.out.print("Nhap so tien can chuyen: ");
                    double transferAmount = sc.nextDouble();
                    int senderIndex = list.findAccountByNumber(senderNumber);
                    int receiverIndex = list.findAccountByNumber(receiverNumber);
                    if (senderIndex != -1 && receiverIndex != -1) {
                        try {
                            list.list[senderIndex].transfer(list.list[receiverIndex], transferAmount);
                            System.out.println("Chuyen tien thanh cong!");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Khong tim thay tai khoan gui hoac nhan.");
                    }
                    break;

                case 7:
                    System.out.println("Ket thuc chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 7);

        sc.close();
    }
}
