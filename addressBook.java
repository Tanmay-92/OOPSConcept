package AddressBook;
import java.util.Scanner;

class contact{
	String fName[];
	String lName[];
	String add[];
	String city[];
	String state[];
	int pin[];
	long phone[];
	String email[];
	
}

public class addressBook {
	
	public static void initializer(contact cObjContact, int arg, Scanner scan) {
		
		cObjContact.fName = new String[arg];
		cObjContact.lName = new String[arg];
		cObjContact.add = new String[arg];
		cObjContact.city = new String[arg];
		cObjContact.state = new String[arg];
		cObjContact.pin = new int[arg];
		cObjContact.phone = new long[arg];
		cObjContact.email = new String[arg];
		
		System.out.println("Please enter the values for the respective contacts:\n");
		
		
		
		for(int i=0;i<arg;i++) {
			System.out.println("This is for contact no -> " + i);
			System.out.println("First Name:");
			cObjContact.fName[i] = scan.next();
			System.out.println("Last Name:");
			cObjContact.lName[i] = scan.next();
			System.out.println("Address:");
			cObjContact.add[i] = scan.next();
			System.out.println("City:");
			cObjContact.city[i] = scan.next();
			System.out.println("State:");
			cObjContact.state[i] = scan.next();
			System.out.println("Pin:");
			cObjContact.pin[i] = scan.nextInt();
			System.out.println("Phone:");
			cObjContact.phone[i] = scan.nextLong();
			System.out.println("Email:");
			cObjContact.email[i] = scan.next();
		}
	}
	
	public static void printObj(contact cObjContact, int arg, Scanner scan) {
		for(int i=0;i<arg;i++) {
			System.out.println("First Name: " + cObjContact.fName[i]);
			System.out.println("Last Name: " + cObjContact.lName[i]);
			System.out.println("Address: " + cObjContact.add[i]);
			System.out.println("City: " + cObjContact.city[i]);
			System.out.println("State: " + cObjContact.state[i]);
			System.out.println("Pin: " + cObjContact.pin[i]);
			System.out.println("Phone: " + cObjContact.phone[i]);
			System.out.println("Email: " + cObjContact.email[i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x = 0;
		System.out.println("Please enter the total contacts you want to create: ");
		x = 2;
		
		contact cObjContact = new contact();
		
		initializer(cObjContact, x, scan);
		printObj(cObjContact, x, scan);
		

	}

}