/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 4 thg 10, 2025 13:24:15
 */
package Chapter4_exercise03;

/**
 * 
 */
public class Programmer extends Employee {
    protected String theLanguage;

    public Programmer(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
        super(thePayrollNumber, theName, theBasicMonthlySalary);
        this.theLanguage = theLanguage;
    }

    public String getLanguage() {
        return theLanguage;
    }

    public void setLanguage(String language) {
        this.theLanguage = language;
    }

    @Override
    public double getMonthlySalary() {
        double allowance = theLanguage.equalsIgnoreCase("Java") ? 0.2 * theBasicMonthlySalary : 0;
        return theBasicMonthlySalary + allowance;
    }

    @Override
    public String toString() {
        return super.toString() + " [Programmer - " + theLanguage + "]";
    }
}
