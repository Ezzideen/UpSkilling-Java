package edu.htu.excption_handleing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.naming.ConfigurationException;

public class FirstTest {

	public static void main(String[] args) {

		CaculateSalary salary = new CaculateSalary() {

			@Override
			public void calculateemployeeSalary() {
				// TODO Auto-generated method stub

			}
		};
		CaculateSalary salary2 = () -> {
			System.out.print("Hello World!");
			System.out.println();
		};

		FirstTest test = new FirstTest();
		try {
			test.test();
		} catch (IOException | ConflictExcption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void writeOnFile(String data) throws IOException {
		FileWriter writer = null;
		try {
			File file = new File("");
			writer = new FileWriter(file);
			writer.write(data);
		} finally {
			if (writer != null) {
				writer.close();
			}
			System.out.println("in finally");
		}
	}

	public void test() throws IOException, ConflictExcption {
		writeOnFile("ali");

		int x = 0;
		int y = 10;

		int total = y / x;

	}

}
