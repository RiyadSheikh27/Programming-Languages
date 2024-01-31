
package project;


import java.util.Scanner;

public class books {

	book theBooks[] = new book[50];
	public static int count;

	Scanner input = new Scanner(System.in);

	public int compareBookObjects(book b1, book b2)
	{

		if (b1.bookName.equalsIgnoreCase(b2.bookName)) {


			System.out.println(
				"Ticket of this Name Already Exists.");
			return 0;
		}

		// if book serial matches
		if (b1.sNo == b2.sNo) {

			// Print book exists
			System.out.println(
				"Ticket of this ID Card No Already Exists.");

			return 0;
		}
		return 1;
	}

	// Method 2
	// To add book
	public void addBook(book b)
	{

		for (int i = 0; i < count; i++) {

			if (this.compareBookObjects(b, this.theBooks[i])
				== 0)
				return;
		}

		if (count < 50) {

			theBooks[count] = b;
			count++;
		}
		else {

			System.out.println(
				"No Space to Add More Tickets.");
		}
	}

	
	public void searchBySno()
	{

		// Display message
		System.out.println(
			"\t\t\t\tSEARCH BY Id Card NUMBER\n");

		// Class data members
		int sNo;
		System.out.println("Enter ID No of passenger:");
		sNo = input.nextInt();

		int flag = 0;
		System.out.println(
			"ID Card No\t\tPassenger Name\t\tDestination\t\tAvailable Qty\t\tTotal Qty");

		for (int i = 0; i < count; i++) {
			if (sNo == theBooks[i].sNo) {
				System.out.println(
					theBooks[i].sNo + "\t\t"
					+ theBooks[i].bookName + "\t\t"
					+ theBooks[i].authorName + "\t\t"
					+ theBooks[i].bookQtyCopy + "\t\t"
					+ theBooks[i].bookQty);
				flag++;
				return;
			}
		}
		if (flag == 0)
			System.out.println("No Ticket for Serial No "
							+ sNo + " Found.");
	}

	// Method 4
	// To search author by name
	public void searchByAuthorName()
	{

		// Display message
		System.out.println(
			"\t\t\t\tSEARCH BY Destination NAME");

		input.nextLine();

		System.out.println("Enter Destination Name:");
		String authorName = input.nextLine();

		int flag = 0;

		System.out.println(
			"Id Card No\t\tPassenger Name\t\tDestination\t\tAvailable Qty\t\tTotal Qty");

		for (int i = 0; i < count; i++) {

			// if author matches any of its book
			if (authorName.equalsIgnoreCase(
					theBooks[i].authorName)) {

				// Print below corresponding credentials
				System.out.println(
					theBooks[i].sNo + "\t\t"
					+ theBooks[i].bookName + "\t\t"
					+ theBooks[i].authorName + "\t\t"
					+ theBooks[i].bookQtyCopy + "\t\t"
					+ theBooks[i].bookQty);
				flag++;
			}
		}

		// Else no book matches for author
		if (flag == 0)
			System.out.println("No Tickets of " + authorName
							+ " Found.");
	}

	// Method 5
	// To display all books
	public void showAllBooks()
	{

		System.out.println("\t\t\t\tSHOWING ALL Tickets\n");
		System.out.println(
			"ID Card No.\t\t\tPassanger Name\t\t\tDestination\t\t\t Ticket Qty\t\t\tTotal Ticket Qty");

		for (int i = 0; i < count; i++) {

			System.out.println(
				theBooks[i].sNo + "\t\t"
				+ theBooks[i].bookName + "\t\t"
				+ theBooks[i].authorName + "\t\t"
				+ theBooks[i].bookQtyCopy + "\t\t"
				+ theBooks[i].bookQty);
		}
	}

	// Method 6
	// To edit the book
	public void upgradeBookQty()
	{

		System.out.println(
			"\t\t\t\tUPGRADE QUANTITY OF A Ticket\n");
		System.out.println("Enter ID No of Passanger");

		int sNo = input.nextInt();

		for (int i = 0; i < count; i++) {

			if (sNo == theBooks[i].sNo) {

				// Display message
				System.out.println(
					"Enter No of Books to be Added:");

				int addingQty = input.nextInt();
				theBooks[i].bookQty += addingQty;
				theBooks[i].bookQtyCopy += addingQty;

				return;
			}
		}
	}

	// Method 7
	// To create menu
	public void dispMenu()
	{

		// Displaying menu
		System.out.println(
			"----------------------------------------------------------------------------------------------------------");
		System.out.println("Press 1 to Book Seats.");
		System.out.println("Press 0 to Exit From The System.");
		System.out.println(
			"Press 2 to Upgrade Quantity of a Ticket.");
		System.out.println("Press 3 to Search a Ticket.");
		System.out.println("Press 4 to Show All Tickets.");
		System.out.println(
			"-------------------------------------------------------------------------------------------------------");
	}

	// Method 8
	// To search the library
	public int isAvailable(int sNo)
	{

		for (int i = 0; i < count; i++) {
			if (sNo == theBooks[i].sNo) {
				if (theBooks[i].bookQtyCopy > 0) {

					System.out.println(
						"Tiket is Available.");
					return i;
				}
				System.out.println("Ticket is Unavailable");
				return -1;
			}
		}

		System.out.println("No Ticket of ID Card No "
						+ " Available in Library.");
		return -1;
	}

	// Method 9
	// To remove the book from the library
	public book checkOutBook()
	{

		System.out.println(
			"Enter ID No of Ticket to be Checked Out.");
		int sNo = input.nextInt();

		int bookIndex = isAvailable(sNo);

		if (bookIndex != -1) {
			theBooks[bookIndex].bookQtyCopy--;
			return theBooks[bookIndex];
		}
		return null;
	}

	// Method 10
	// To add the Book to the Library
	public void checkInBook(book b)
	{
		for (int i = 0; i < count; i++) {
			if (b.equals(theBooks[i])) {
				theBooks[i].bookQtyCopy++;
				return;
			}
		}
	}
}

