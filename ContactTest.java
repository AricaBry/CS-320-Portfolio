package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import projectPackage.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("Contact Id", "FirstN", "LastN", "2051234567", "Street");
		assertTrue(contact.getContactId().equals("Contact Id"));
		assertTrue(contact.getFirstName().equals("FirstN"));
		assertTrue(contact.getLastName().equals("LastN"));
		assertTrue(contact.getPhone().equals("2051234567"));
		assertTrue(contact.getAddress().equals("Street"));
		
	}
	
	@Test
	// Tests whether contact ID is to long
	void testContactIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("45678102111", "FirstN", "LastN", "2051234567", "Street");
		});  
	}
	
	@Test
	// Tests whether contact ID is null
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact(null, "FirstN", "LastN", "2051234567", "Street");
		});  
	}
	
	@Test
	// Tests whether first name is too long
	void testFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("Contact Id", "FirstNcdefg", "LastN", "2051234567", "Street");
		});  
	}
	
	@Test
	// Tests whether first name is null
	void testFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("Contact Id", null, "LastN", "2051234567", "Street");
		});  
	}
	
	@Test
	// Tests whether last name is to long
	void testLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("Contact Id", "FirstN", "LastNtabcde", "2051234567", "Street");
		});  
	}
	
	@Test
	// Tests whether last name is null
	void testLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("Contact Id", "FirstN", null, "2051234567", "Street");
		});  
	}
	
	@Test
	// Tests whether phone is not exactly 10 digits
	void testPhoneNotExact() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("Contact Id", "FirstN", "LastN", "20512345678", "Street");
		});  
	}
	
	@Test
	// Tests whether phone is null
	void testPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("Contact Id", "FirstN", "LastN", null, "Street");
		});  
	}
	
	@Test
	// Tests whether the address is to long
	void testAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("Contact Id", "FirstN", "LastN", "2051234567", "12345678910 Street Name To Long");
		});  
	}
	
	@Test
	// Tests whether the address is null
	void testAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("Contact Id", "FirstN", "LastN", "2051234567", null);
		});  
	}

}
