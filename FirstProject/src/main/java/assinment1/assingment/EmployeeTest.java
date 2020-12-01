package assinment1.assingment;

import java.io.IOException;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter add to add employee \n" + "update to edit employee \n"
				+ "delete to remove employee \n" + "search to search for employee \n" + "exit to close");
		Scanner scanner = new Scanner(System.in);
		switch (scanner.next().toLowerCase()) {
		case "add":
			EmployeeManagement.add();
			EmployeeTest.main(args);
			break;
		case "update":
			EmployeeManagement.update();
			EmployeeTest.main(args);
			break;
		case "delete":
			EmployeeManagement.delete();
			EmployeeTest.main(args);
			break;
		case "search":
			EmployeeManagement.search();
			EmployeeTest.main(args);
		case "exit":
			break;
		default:
			System.err.println("Invalid input try again");
			EmployeeTest.main(args);

		}
	}
}
