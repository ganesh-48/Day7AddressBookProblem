package com.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookProblem {
	
	
	//instance variable creating multiple contacts
	String addressBookName;
	ArrayList<Contacts> contactsList = new ArrayList<Contacts>();
	
	public AddressBookProblem(String addressBook) {
		this.addressBookName = addressBookName;
	}
	
	
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

		Contacts contacts = new Contacts(firstName, lastName, address, city, state, zip, number, email);
		System.out.println("Contact added");
		contactsList.add(contacts);
	}

//edit contacts details
	public void editContact(String firstName) {
		if (contactsList.isEmpty())
			System.out.println("Address book is empty");
		else {
			int d = contactsList.size();
			int i;
			for (i = 0; i < contactsList.size(); i++) {
				if (contactsList.get(i).getFirstName().equalsIgnoreCase(firstName)) {
					System.out.println("you want to edit");
					System.out.println("press 1 -> Edit the first name");
					System.out.println("press 2 -> Edit the last name");
					System.out.println("press 3 -> Edit the address");
					System.out.println("press 4 -> Edit the state");
					System.out.println("press 5 -> Edit the city");
					System.out.println("press 6 -> Edit the zipcode");
					System.out.println("press 7 -> Edit the mobile number");
					System.out.println("press 8 -> Edit eamil-id");
					System.out.println("enter your choice");
					Scanner sc = new Scanner(System.in);
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("enter the first name");
						contactsList.get(i).setFirstName(sc.next());
						System.out.println("Contact successfully updated");
						break;
					case 2:
						System.out.println("enter the last name");
						contactsList.get(i).setLastName(sc.next());
						System.out.println("Contact successfully updated");
						break;
					case 3:
						System.out.println("enter address");
						contactsList.get(i).setAddress(sc.next());
						System.out.println("Contact successfully updated");
						break;
					case 4:
						System.out.println("enter the state");
						contactsList.get(i).setState(sc.next());
						System.out.println("Contact successfully updated");
						break;
					case 5:
						System.out.println("enter the city");
						contactsList.get(i).setCity(sc.next());
						System.out.println("Contact successfully updated");
						break;
					case 6:
						System.out.println("enter the zipcode");
						contactsList.get(i).setZip(sc.nextInt());
						System.out.println("Contact successfully updated");
						break;
					case 7:
						System.out.println("enter mobile number");
						contactsList.get(i).setNumber(sc.nextLong());
						System.out.println("Contact successfully updated");
						break;
					case 8:
						System.out.println("enter the email-id");
						contactsList.get(i).setEmail(sc.next());
						System.out.println("Contact successfully updated");
						break;
					default:
						System.out.println("enter the correct choice");
						break;
					}
					break;
				}
			}
			if (d == i)
				System.out.println("contact not found");
		}
	}
	

	
	//delete contact using person name
	public void deleteContact(String firstName) {
		if (contactsList.isEmpty())
			System.out.println("Address book is empty");
		else {
			int d = contactsList.size();
			int i;
			for (i = 0; i < contactsList.size(); i++) {
				if (contactsList.get(i).getFirstName().equalsIgnoreCase(firstName)) {
					Contacts contact = contactsList.get(i);
					contact = null;
					contactsList.remove(i);
					System.out.println("contact deletd successfully");
					break;
				}
			}
			if (d == i)
				System.out.println("contact is not found in address book");

		}
	}


	// print contact details
	public String toString() {
		if (contactsList.isEmpty())
			return "Address book is empty";
		else {
			for (int i = 0; i < contactsList.size(); i++) {
				System.out.println(i + 1 + ". " + contactsList.get(i).toString());
			}
		}
		return "";
	}

	public void deleteAddressBook() {
		if (!contactsList.isEmpty()) {
			for (int i = 0; i < contactsList.size(); i++) {
				Contacts contact = contactsList.get(i);
				contact = null;
				contactsList.remove(i);
			}
		}
	}
}