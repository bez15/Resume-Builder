
public class ContactInfo {
	private String firstName, lastName, DOB, phoneNo, email;
	
	public ContactInfo() {
		firstName = "";
		lastName = "";
		DOB = "";
		phoneNo = "";
		email = "";
	}
	
	// Accessors
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getDOB() {
		return DOB;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public String getEmail() {
		return email;
	}
	
	// Mutators
	public void setFirstName(String fn) {
		firstName = fn;
	}
	public void setLastName(String ln) {
		lastName = ln;
	}
	public void setDOB(String dob) {
		DOB = dob;
	}
	public void setPhoneNo(String pn) {
		phoneNo = pn;
	}
	public void setEmail(String em) {
		email = em;
	}
	
}
