package projectPackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Creating ContactService class
public class ContactService {
	
	// Creating a HashMap called contacts
	public Map<String, Contact> contacts = new HashMap<String, Contact>();
	
	// Creating unmodifiable Map
	public Map<String, Contact> getContacts() {
		return Collections.unmodifiableMap(contacts);
	}
	
	// Method for adding a new contact
	public void addContact(Contact contact) {
		// Checks that the contact does not exist already
		if (contacts.containsKey(contact.getContactId())) {
			throw new IllegalArgumentException("Contact already exists");
		}
		contacts.put(contact.getContactId(), contact);
	}
	
	// Deleting contacts per contact ID
	public void deleteContact(Contact contact) {
		// Checks that the contact exists
		if (!contacts.containsKey(contact.getContactId())) {
			throw new IllegalArgumentException("Contact does not exist");
		}
		contacts.remove(contact.getContactId());
	}
	
	// Method for updating first name
	public void updateFirstName(Contact contact, String fName) {
		Contact con = contacts.get(contact.getContactId());
		
		// Checking that the object exists in the map
		if (con != null) {
			con.setFirstName(fName);
		}
	}
	
	// Method for updating last name
	public void updateLastName(Contact contact, String lName) {
		Contact con = contacts.get(contact.getContactId());
		
		if (con != null) {
			con.setLastName(lName);
		}
	}
	
	// Method for updating phone number
	public void updatePhone(Contact contact, String phoneNum) {
		Contact con = contacts.get(contact.getContactId());
		
		if (con != null) {
			con.setPhone(phoneNum);
		}
	}
	
	// Method for updating address
	public void updateAddress(Contact contact, String streetAddress) {
		Contact con = contacts.get(contact.getContactId());
		
		if (con != null) {
			con.setAddress(streetAddress);
		}
	}
}
