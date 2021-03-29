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

	// print contact details
	public String toString() {
		return contacts.toString();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to address book System");

		AddressBookProblem addressbook = new AddressBookProblem();
		addressbook.addContacts();
		System.out.println(addressbook.toString());
	}
}
