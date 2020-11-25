package fileTask;


	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileOutputStream;
	import java.io.FileReader;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Scanner;

	public class EmployeesSystemWafaa {
		// Wafaa Abu-Shaireh code 
		////////////////////
		
		// C:\Source\Mine\Test.txt

		public static boolean flag = false;
		public static String filePath;

		public static void main(String ar[]) throws IOException {
			EmployeesSystemWafaa e = new EmployeesSystemWafaa();
			Scanner file = new Scanner(System.in);
			if (flag == false) {
				System.out.println("Enter the file path");
				filePath = file.nextLine();
				flag = true;
			} else {

			}
			System.out.println("");
			System.out.println("");

			System.out.println("You can Choose What do you Want to do \n" + "Enter \n" + " 1 to create new file \n"
					+ "2 to insert new employee \n" + "3 to show all employees \n" + "4 to find employee \n"
					+ "5 to update employee data \n" + "6 to close");
			Scanner choise = new Scanner(System.in);

			switch (choise.next()) {
			case "1":
				e.createFile(filePath);
				EmployeesSystemWafaa.main(ar);
				break;

			case "2":
				e.insert(filePath);
				EmployeesSystemWafaa.main(ar);
				break;

			case "3":
				e.display(filePath);
				EmployeesSystemWafaa.main(ar);
				break;

			case "4":
				e.find(filePath);
				EmployeesSystemWafaa.main(ar);
				break;

			case "5":
				e.update(filePath);
				EmployeesSystemWafaa.main(ar);
				break;

			case "6":
				break;

			default:
				System.err.println("Invalid input , Try again ! ");
				break;
			}
		}

		public File createFile(String filePath) throws IOException {
			File file = new File(filePath);
			if (file.createNewFile()) {
				System.out.println("File Created");

			} else
				System.out.println("File already existing");

			return file;
		}

		public void display(String filePath) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(filePath));
				String s = "";
				while ((s = br.readLine()) != null) {
					String data[] = new String[5];
					data = s.split(",");
					for (int i = 0; i < 5; i++) {
						System.out.print(data[i] + " ");
					}
					System.out.println();
				}
			} catch (Exception e) {
			}

		}

		public void insert(String filePath) {
			Scanner sc = new Scanner(System.in);
			// employee id first_name last_name salary department
			System.out.println("Enter the ID of employee:");
			String id = sc.nextLine();
			System.out.println("Enter the first name of employee:");
			String fn = sc.nextLine();
			System.out.println("Enter the last name of employee:");
			String ln = sc.nextLine();
			System.out.println("Enter the salary of employee:");
			String sl = sc.nextLine();
			System.out.println("Enter the department of employee:");
			String d = sc.nextLine();

			try {
				int c = 0;
				BufferedReader br = new BufferedReader(new FileReader(filePath));
				String s = "";
				while ((s = br.readLine()) != null) {
					String data[] = new String[5];
					data = s.split(",");
					if (data[0].trim().equalsIgnoreCase(id)) {
						c++;

					}

				}
				if (c != 0) {
					System.out.print("This id is already used , try another one ");
				} else {
					File f = new File(filePath);
					PrintWriter pw = new PrintWriter(new FileOutputStream(f, true));
					pw.append(id + "," + fn + "," + ln + "," + sl + "," + d + "\n");
					pw.close();
				}
				System.out.println("");
			} catch (Exception e) {
			}

		}

		public void find(String filePath) {
			Scanner employee = new Scanner(System.in);
			String userName;
			System.out.println("Enter the emplyee name you want to find ");
			userName = employee.nextLine();
	// Read data from file
			try {
				int c = 0;
				BufferedReader br = new BufferedReader(new FileReader(filePath));
				String s = "";
				while ((s = br.readLine()) != null) {
					String data[] = new String[5];
					data = s.split(",");
					if (data[1].trim().equalsIgnoreCase(userName)) {
						System.out.print(data[0] + " " + data[1] + " " + data[2] + " " + data[3] + " " + data[4]);
						System.out.println();
						c++;
					}
				}

				if (c == 0) {
					System.err.println("No Data Match !!");
				}
				System.out.println();

			} catch (Exception e) {

			}

		}

		public void update(String filePath) {
			///////// phase 1
			System.out.println("Enter the ID of employee that you want to update.....");
			Scanner sc = new Scanner(System.in);
			int id_to_change = sc.nextInt();
			String to_change_column_names[] = { "first name:", "last name:", "Salary:", "Department:" };
			int yes_no[] = new int[4];
			String to_update[] = new String[4];

			System.out.println("Select the columns that you want to update (0: No/1: Yes)");
			for (int i = 0; i < 4; i++) {
				System.out.println(to_change_column_names[i] + "");
				int temp = sc.nextInt();
				yes_no[i] = temp;
			}

			//////////////// phase2
			System.out.println("_______________________________________________________");
			System.out.println("Add new values to the columns");
			for (int i = 0; i < 4; i++) {
				System.out.println(to_change_column_names[i] + "");
				if (yes_no[i] == 1) {
					Scanner sc1 = new Scanner(System.in);
					String temp_val = sc1.nextLine();
					to_update[i] = temp_val;
					System.out.println();
				} else {
					System.out.println("Cannot be changed");
				}
			}

			////////////////// phase 3
			StringBuffer sb = new StringBuffer();
			try {
				BufferedReader br = new BufferedReader(new FileReader(filePath));
				String s = "";
				while ((s = br.readLine()) != null) {
					String data[] = new String[6];
					data = s.split(",");
					if (id_to_change == Integer.parseInt(data[0])) {
						String row = data[0] + ",";
						for (int i = 0; i < 4; i++) {
							if (yes_no[i] == 1) {
								row = row + to_update[i] + ",";
							} else {
								row = row + data[i + 1] + ",";
							}

						}
						sb.append(row);
						sb.append("\n");
					} else {
						sb.append(s);
						sb.append("\n");
					}
				}
				System.out.println(sb.toString());

				////////////////// phase 4
				File f = new File(filePath);
				PrintWriter pw = new PrintWriter(new FileOutputStream(f, false));
				pw.print(sb.toString());
				pw.close();
			} catch (Exception e) {

			}
		}

	}



