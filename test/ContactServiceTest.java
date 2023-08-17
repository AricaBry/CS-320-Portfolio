package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import projectPackage.Contact;
import projectPackage.ContactService;

class ContactServiceTest {

	private ContactService service;

	@BeforeEach
	// service object set up
	public void setUp() {
		service = new ContactService();
	}
	
	@Test
	// testing whether the new object was added successfully
	void testContactAddedSuccessfully() {
		Contact contact = new Contact("1", "FirstN", "LastN", "2051234567", "Street");
		service.addContact(contact);
		assertTrue(service.getContacts().containsKey("1"));
	}
	
	@Test
	// testing whether the contact Id was duplicated
	void testContactAddedExistingId() {
		Contact contact = new Contact("1", "FirstN", "LastN", "2051234567", "Street");
		service.addContact(contact);
		Assertions.assertThrows(IllegalArgumentException.class, ()-> service.addContact(contact));
	}
	
	@Test
	// testing whether the contacted was deleted successfully
	void testContactDeletedSuccessfully() {
		Contact contact = new Contact("1", "FirstN", "LastN", "2051234567", "Street");
		service.addContact(contact);
		service.deleteContact(contact);
		Assertions.assertThrows(IllegalArgumentException.class, ()-> service.deleteContact(contact));
	}
	
	@Test
	// testing whether the first name was updated
	void testFirstNameUpdatedSuccessfully() {
		Contact contact = new Contact("1", "FirstN", "LastN", "2051234567", "Street");
		service.addContact(contact);
		service.updateFirstName(contact, "Belle");
		assertTrue(contact.getFirstName().equals("Belle"));
	}
	
	@Test
	// testing whether the last name was updated
	void testLastNameUpdatedSuccessfully() {
		Contact contact = new Contact("1", "FirstN", "LastN", "2051234567", "Street");
		service.addContact(contact);
		service.updateLastName(contact, "Breeze");
		assertTrue(contact.getLastName().equals("Breeze"));
	}
	
	@Test
	// testing whether the phone number was updated
	void testPhoneUpdatedSuccessfully() {
		Contact contact = new Contact("1", "FirstN", "LastN", "2051234567", "Street");
		service.addContact(contact);
		service.updatePhone(contact, "2051234589");
		assertTrue(contact.getPhone().equals("2051234589"));
	}
	
	@Test
	// testing whether the address was updated
	void testAddressUpdatedSuccessfully() {
		Contact contact = new Contact("1", "FirstN", "LastN", "2051234567", "Street");
		service.addContact(contact);
		service.updateAddress(contact, "12345678910 Street Name");
		assertTrue(contact.getAddress().equals("12345678910 Street Name"));
	}

}
