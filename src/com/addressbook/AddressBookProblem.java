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
	
	//delete contact using person name
	public void deleteContact(String firstName) {
		if (contacts == null)
			System.out.println("Address book is empty");
		else {
			if (contacts.getFirstName().equalsIgnoreCase(firstName)) {
				contacts = null;
				System.out.println("contact deleted");
			} else
				System.out.println("contact is not found");

		}
	}


	// print contact details
	public String toString() {
		return contacts.toString();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to address book System");

		AddressBookProblem addressbook = new AddressBookProblem();
		int choice = 0;
		while (choice != 5) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your choice");
			System.out.println("press 1 -> Add  new contact");
			System.out.println("press 2 -> Edit contact");
			System.out.println("press 3 -> Delete contact");
			System.out.println("press 4 -> Print the Address Book");
			System.out.println("press 5 -> Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addressbook.addContacts();
				break;
			case 2:
				System.out.println("enter the first name of contact you want to edit");
				addressbook.editContact(scanner.next());
				break;
			case 3:
				System.out.println("enter the first name of contact you want to delete");
				addressbook.deleteContact(scanner.next());
				break;
			case 4:
				System.out.println(addressbook.toString());
				break;
			case 5:
				System.exit(choice);
			default:
				System.out.println("press correct choice number");
			}
		}

	}
}
