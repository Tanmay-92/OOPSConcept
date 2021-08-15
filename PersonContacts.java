package AddressBook;

import java.util.Scanner;
class Contacts{
	String fName[];
	String lName[];
	String add[];
	String city[];
	String state[];
	int pin[];
	long phone[];
	String email[];
}
public class PersonContacts {
	public static void Getting_info(Contacts ObjContacts, Scanner info,int arg) {
		ObjContacts.fName = new String[arg];
		ObjContacts.lName = new String[arg];
		ObjContacts.add = new String[arg];
		ObjContacts.city = new String[arg];
		ObjContacts.state = new String[arg];
		ObjContacts.pin = new int[arg];
		ObjContacts.phone = new long[arg];
		ObjContacts.email = new String[arg];
		System.out.println("Please enter the values for the respective contacts:\n");
		
		
		
		for(int i=0;i<arg;i++) {
			System.out.println("First Name:");
			ObjContacts.fName[i] = info.next();
			System.out.println("Last Name:");
			ObjContacts.lName[i] = info.next();
			System.out.println("Address:");
			ObjContacts.add[i] = info.next();
			System.out.println("City:");
			ObjContacts.city[i] = info.next();
			System.out.println("State:");
			ObjContacts.state[i] = info.next();
			System.out.println("Pin:");
			ObjContacts.pin[i] = info.nextInt();
			System.out.println("Phone:");
			ObjContacts.phone[i] = info.nextLong();
			System.out.println("Email:");
			ObjContacts.email[i] = info.next();
		}
		
	}
	public static void Showing_Stored_Data(Contacts ObjContacts, Scanner info ,int arg) {
		for(int i=0;i<arg;i++) {
			System.out.println("First Name: " + ObjContacts.fName[i]);
			System.out.println("Last Name: " + ObjContacts.lName[i]);
			System.out.println("Address: " + ObjContacts.add[i]);
			System.out.println("City: " + ObjContacts.city[i]);
			System.out.println("State: " + ObjContacts.state[i]);
			System.out.println("Pin: " + ObjContacts.pin[i]);
			System.out.println("Phone: " + ObjContacts.phone[i]);
			System.out.println("Email: " + ObjContacts.email[i]);
		}
		
	}
	

	
	public static void main(String[] args) {
		System.out.println("Enter your Personal Data");
		int x=1;
		Contacts ObjContacts = new Contacts();
		Scanner info = new Scanner(System.in);
	
		Getting_info( ObjContacts, info , x);
		Showing_Stored_Data(ObjContacts, info , x);

	}

}
