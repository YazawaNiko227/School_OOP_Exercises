/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 4 thg 10, 2025 13:03:27
 */
package Chapter4_exercise03;

import java.util.Arrays;

public class SoftwareHouse {
    private Employee[] listStaff;
    private int numberOfStaff;

    public SoftwareHouse(String theName, int capacity) {
        listStaff = new Employee[Math.max(capacity, 10)];
        numberOfStaff = 0;
    }

    public boolean addEmployee(Employee emp) {
        if (emp == null || numberOfStaff >= listStaff.length) return false;
        for (int i = 0; i < numberOfStaff; i++) {
            if (listStaff[i].getPayrollNumber() == emp.getPayrollNumber()) return false;
        }
        listStaff[numberOfStaff++] = emp;
        return true;
    }

    public void displayAllStaff() {
        System.out.printf("%-10s %-20s %-20s\n", "Payroll#", "Name", "Monthly Salary");
        for (int i = 0; i < numberOfStaff; i++) {
            System.out.println(listStaff[i]);
        }
    }

    public double getMonthlySalaryBill() {
        double total = 0;
        for (int i = 0; i < numberOfStaff; i++) {
            total += listStaff[i].getMonthlySalary();
        }
        return total;
    }

    public void sortAllStaffByName() {
        Arrays.sort(listStaff, 0, numberOfStaff, (a, b) -> a.getName().compareToIgnoreCase(b.getName()));
    }

    public void displayListProgrammers() {
        for (int i = 0; i < numberOfStaff; i++) {
            if (listStaff[i] instanceof Programmer && !(listStaff[i] instanceof ProjectLeader)) {
                System.out.println(listStaff[i]);
            }
        }
    }

    public boolean updateDepartmentForAdmin(int aPayrollNo, String deptNew) {
        for (int i = 0; i < numberOfStaff; i++) {
            if (listStaff[i] instanceof Administrator && listStaff[i].getPayrollNumber() == aPayrollNo) {
                ((Administrator) listStaff[i]).setDepartment(deptNew);
                return true;
            }
        }
        return false;
    }
}

