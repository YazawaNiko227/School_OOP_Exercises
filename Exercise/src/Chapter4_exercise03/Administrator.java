/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 4 thg 10, 2025 13:31:12
 */
package Chapter4_exercise03;

/**
 * 
 */
public class Administrator extends Employee {
    private String theDepartment;

    public Administrator(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theDepartment) {
        super(thePayrollNumber, theName, theBasicMonthlySalary);
        this.theDepartment = theDepartment;
    }

    public String getDepartment() {
        return theDepartment;
    }

    public void setDepartment(String department) {
        this.theDepartment = department;
    }

    @Override
    public double getMonthlySalary() {
        return theBasicMonthlySalary * 1.4;
    }

    @Override
    public String toString() {
        return super.toString() + " [Administrator - " + theDepartment + "]";
    }
}

