/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 4 thg 10, 2025 13:27:57
 */
package Chapter4_exercise03;

/**
 * 
 */
public class ProjectLeader extends Programmer {

    public ProjectLeader(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
        super(thePayrollNumber, theName, theBasicMonthlySalary, theLanguage);
    }

    @Override
    public double getMonthlySalary() {
        return theBasicMonthlySalary * 1.2;
    }

    @Override
    public String toString() {
        return super.toString() + " [Project Leader]";
    }
}

