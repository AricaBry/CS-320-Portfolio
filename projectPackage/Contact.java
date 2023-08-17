package projectPackage;

/* Arica Bryant
* 7/30/2023
* CS-320
*/

// Creating Contact class
public class Contact {
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	// Constructor and Validator
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		validateContactId(contactId);
		validateFirstName(firstName);
		validateLastName(lastName);
		validatePhone(phone);
		validateAddress(address);
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	// Method that validates the contact id
	private void validateContactId(String contactId) {
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
	}
	
	// Method that validates the first name
	private void validateFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
	}
	
	// Method that validates the last name
	private void validateLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
	}
	
	// Method that validates the phone
	private void validatePhone(String phone) {
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
	}
	
	// Method that validates the address
	private void validateAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
	}
	
	// Getter Methods
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	// Setter Methods
	public void setFirstName(String nFirstName) {	
		validateFirstName(nFirstName);
		this.firstName = nFirstName;
	}
	
	public void setLastName(String nLastName) {
		validateLastName(nLastName);
		this.lastName = nLastName;
	}
	
	public void setPhone(String nPhone) {
		validatePhone(nPhone);
		this.phone = nPhone;
	}
	
	public void setAddress(String nAddress) {
		validateAddress(nAddress);
		this.address = nAddress;
	}
}
