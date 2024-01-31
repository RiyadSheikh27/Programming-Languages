
package project;


import java.util.Scanner;


public class Library {
    
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);

		
		System.out.println(
			"********************Welcome To The Tuhin's Airline System!********************");
		System.out.println(
			"				 Select From The Following Options:			 ");
		System.out.println(
			"**********************************************************************");

		books ob = new books();
		
		students obStudent = new students();

		int choice;
		int searchChoice;

		
		do {

			ob.dispMenu();
			choice = input.nextInt();

			
			switch (choice) {

				
			case 1:
				book b = new book();
				ob.addBook(b);
				break;

				
			case 2:
				ob.upgradeBookQty();
				break;

			
			case 3:

				System.out.println(
					" press 1 to Search with ID Card No.");
				System.out.println(
					" Press 2 to Search with Passenger's Destination Name.");
				searchChoice = input.nextInt();

				// Nested switch
				switch (searchChoice) {

					// Case
				case 1:
					ob.searchBySno();
					break;

					// Case
				case 2:
					ob.searchByAuthorName();
				}
				break;

				// Case
			case 4:
				ob.showAllBooks();
				break;

	

				
			default:

				System.out.println("ENTER BETWEEN 0 TO 4.");
			}

		}

		
		while (choice != 0);
	}
}

