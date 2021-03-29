package com.addressbook;

import java.util.Scanner;

public class AddressBookProblem {

	Contacts contacts;

	// Add new contact to address book
	public void addContacts() {
		String firstName, lastName, address, city, state, email;
		int zip;
		long number;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name :");
		firstName = sc.nextLine();
		System.out.println("Enter the last name :");
		lastName = sc.nextLine();
		System.out.println("Enter the address :");
		address = sc.nextLine();
		System.out.println("Enter the city :");
		city = sc.nextLine();
		System.out.println("Enter the state :");
		state = sc.nextLine();
		System.out.println("Enter the email :");
		email = sc.nextLine();
		System.out.println("Enter the zip :");
		zip = sc.nextInt();
		System.out.println("Enter the number :");
		number = sc.nextLong();

		contacts = new Contacts(firstName, lastName, address, city, state, zip, number, email);
		System.out.println("Contact added");
	}
	
//edit contacts details
	public void editContact(String firstName) {
		if (contacts == null)
			System.out.println("Address book is empty");
		else {
			if (contacts.getFirstName().equalsIgnoreCase(firstName)) {
				System.out.println("edit the contact details");
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the first name");
				contacts.setFirstName(sc.next());
				System.out.println("enter the last name");
				contacts.setLastName(sc.next());
				System.out.println("enter address");
				contacts.setAddress(sc.next());
				System.out.println("enter the state");
				contacts.setState(sc.next());
				System.out.println("enter the city");
				contacts.setCity(sc.next());
				System.out.println("enter the zip");
				contacts.setZip(sc.nextInt());
				System.out.println("enter mobile number");
				contacts.setNumber(sc.nextLong());
				System.out.println("enter the email");
				contacts.setEmail(sc.next());

				System.out.println("Contact is updated");
			} else
				System.out.println("contact not found");
		}
	}
	
	
	// print contact details
	public String toString() {
		return contacts.toString();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to address book System");

		AddressBookProblem addressbook = new AddressBookProblem();
		Scanner sc = new Scanner(System.in);

		addressbook.addContacts();
		System.out.println("Enter the first name of contact :");
		addressbook.editContact(sc.next());
		System.out.println(addressbook.toString());
	
	}
}
