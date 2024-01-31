
package project;

import java.util.Scanner;

public class book {

	// Class data members
	public int sNo;
	public String bookName;
	public String authorName;
	public int bookQty;
	public int bookQtyCopy;

	// Creating object of Scanner class to
	// read input from users
	Scanner input = new Scanner(System.in);

	// Method
	// To add book details
	public book()
	{
		
		System.out.println("Enter Id No of Passenger:");
		this.sNo = input.nextInt();
		input.nextLine();

		System.out.println("Enter Passenger Name:");
		this.bookName = input.nextLine();

		System.out.println("Enter Destination Name:");
		this.authorName = input.nextLine();

		System.out.println("Enter Quantity of Ticket:");
		this.bookQty = input.nextInt();
		bookQtyCopy = this.bookQty;
	}
}

