package HomeWorkTask;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EmployeeFilesTow {
	
	

	private static Scanner S;

	public static void main(String[] args) throws IOException {
		
		EmployeeFilesTow employee = new EmployeeFilesTow();
		S= new Scanner(System.in);
		String filePath="C:/Users/Lenovo/eclipse-workspace/HomeWork/src/HomeWorkTask/records.txt";
		
		File newFiles = createFile(filePath);
		
		
		String id ;
		String name;
		String salary;
		String department;
		
		
		
		System.out.println("please select what do you want to do : ");
		System.out.println("1 : Show the employees list");
		System.out.println("2 : add an new employee ");
		System.out.println("3 : update an exist employee");
		
		int number;
		number=S.nextInt();
		switch (number) {
		case 1:
			readFromFile(newFiles);
			break;
		
		case 2:
			System.out.println(" enter the employee ID : ");
			id = S.next();
			System.out.println(" enter the employee Name : ");
			name = S.next();
			System.out.println(" enter the employee Salary : ");
			salary = S.next();
			System.out.println(" enter the employee Department : ");
			department = S.next();
			writeOnFile(newFiles, id, name, salary, department);
			readFromFile(newFiles);
			break;

		case 3:
			System.out.println(" Please enter the employee ID to Update: ");
			String editTerm;
			editTerm = S.next();
			String newId;
			String newName;
			String newSalary;
			String newDepartment;
				System.out.println(" Please enter the NEW employee ID : ");
				newId=S.next();
				System.out.println(" Please enter the NEW employee Name : ");
				newName=S.next();
				System.out.println(" Please enter the NEW employee Salary : ");
				newSalary=S.next();
				System.out.println(" Please enter the NEW employee Department : ");
				newDepartment=S.next();
				editRecord(filePath,editTerm,newId,newName,newSalary,newDepartment);
				readFromFile(newFiles);
				break;

//   case 4:
//		deleteRecord(filePath,editTerm,newId,newName,newSalary,newDepartment);
//		readFromFile(newFiles);
//		break;

		default:
			System.out.println("please select one number between 1 to 4 \n error Occared");
		}
	
	}
	
	public static File createFile(String filePath) throws IOException {
		File file = new File(filePath);
		if (file.createNewFile()) {
			System.out.println("file created");
		} else {
			System.out.println("file alarady existing");
		}
		return file;
	}
	
	public static void readFromFile(File file) throws FileNotFoundException, IOException {

		FileReader reader = new FileReader(file);
		int i;
		String readFromFile = "";
		while ((i = reader.read()) != -1) {
			readFromFile = readFromFile + ((char) i);
		}
		reader.close();

		System.out.println(readFromFile);
	}
	
	
	
	public static void writeOnFile(File file, String id, String name, String salary, String department)
			throws IOException {
		FileWriter writer = new FileWriter(file.getAbsoluteFile(), true);
		writer.write(id + " , " + name + " , " + salary + " , " + department);
		writer.write(System.lineSeparator()); // new line
		writer.close();
	}
	

	public static void editRecord(String filePath, String editTerm, String newId, String newName, String newSalary,
			String newDepartment) throws IOException {
		String tempFile = "temp.txt";
		File oldFile = new File(filePath);
		File newFile = new File(tempFile);
		String id = "";
		String name = "";
		String salary = "";
		String department = "";
		try {
			FileWriter fw = new FileWriter(tempFile);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			BufferedReader br = new BufferReader();
			S= new Scanner(new File(filePath));
			S.useDelimiter("[,\n]");
			
			while(S.hasNext())
			{
				//System.out.println("Please enter your ID");
				id = S.next();
				//System.out.println("Please enter your Name");
				name = S.next();
				//System.out.println("Please enter your Salary");
				salary = S.next();
				//System.out.println("Please enter your Department");
				department = S.next();
				
				if(id.equals(editTerm)) 
				{
					pw.println(newId + ","+ newName + ","+ newSalary +","+ newDepartment);
				}
				else 
				{
					pw.println(id + ","+ name + ","+ salary +","+ department);
				}
			}
			
			
			S.close();
			pw.flush();
			pw.close();
			oldFile.delete();
			File dump = new File(filePath);
			newFile.renameTo(dump);
			
		} catch (Exception e) {
			System.out.println("Error Occurred");
		}
	}

}