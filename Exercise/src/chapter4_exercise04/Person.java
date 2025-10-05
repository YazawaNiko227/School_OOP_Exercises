/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 5 thg 10, 2025 14:23:12
 */
package chapter4_exercise04;

public class Person {
	protected String lastName;
	protected String firstName;
	public Person(String lastName, String firstName) {
		setLastName(lastName);
		setFirstName(firstName);
	}
	public Person() {
		this("Empty","Empty");
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if(lastName == null || lastName.isEmpty()) {
			lastName = "Empty";
		}
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.isEmpty()) {
			firstName = "Empty";
		}
		this.firstName = firstName;
	}
	
	@Override
	public String toString() {
		return lastName + " " + firstName;
	}
}
