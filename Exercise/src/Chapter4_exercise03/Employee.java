/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 4 thg 10, 2025 13:05:02
 */
package Chapter4_exercise03;

/**
 * 
 */
public abstract class Employee {
    protected final int thePayrollNumber;
    protected String theName;
    protected double theBasicMonthlySalary;

    public Employee(int thePayrollNumber, String theName, double theBasicMonthlySalary) {
        this.thePayrollNumber = thePayrollNumber;
        this.theName = theName;
        this.theBasicMonthlySalary = theBasicMonthlySalary;
    }

    public int getPayrollNumber() {
        return thePayrollNumber;
    }

    public String getName() {
        return theName;
    }

    public void setName(String name) {
        this.theName = name;
    }

    public double getBasicMonthlySalary() {
        return theBasicMonthlySalary;
    }

    public void setBasicMonthlySalary(double salary) {
        this.theBasicMonthlySalary = salary;
    }

    public abstract double getMonthlySalary();

    @Override
    public String toString() {
        return String.format("%-10d %-20s $%,.2f", thePayrollNumber, theName, getMonthlySalary());
    }
}

