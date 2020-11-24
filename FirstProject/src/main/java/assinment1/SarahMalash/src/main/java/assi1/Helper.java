package assi1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Helper {
	public  void CreateBuuton() { // create an interface for user

		JFrame f = new JFrame("Button Example");
		JButton b = new JButton("Add a User");
		b.setBounds(50, 10, 195, 30);
		f.add(b);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String filePath = "D:\\source\\UpSkilling-Java\\FirstProject\\src\\main\\java\\edu\\hw.txt";
				File file = new File(filePath);
				try {
					createFile(file);
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		});

		JButton c = new JButton("show all data");
		c.setBounds(50, 50, 195, 30);
		f.add(c);
		c.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {
					String allData = readFromFile();
					System.out.println(allData);

				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		});

		JButton d = new JButton("get user`s data");
		d.setBounds(50, 100, 195, 30);
		f.add(d);
		d.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String Data = JOptionPane.showInputDialog("enter search value (ID)");
				String filePath = "D:\\source\\UpSkilling-Java\\FirstProject\\src\\main\\java\\edu\\hw.txt";
				File file = new File(filePath);
				try {
					printInfo(file, Data);
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		});

		JButton z = new JButton("Delete");
		z.setBounds(50, 150, 195, 30);
		f.add(z);
		z.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {
					deleteFile();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		});

		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.setVisible(true);

	}

	public  File createFile(File file) throws IOException { // create a file to read and read from

		file.createNewFile();
		String id = JOptionPane.showInputDialog(" enter user`s id " + " : ");
		writeOnFile(file, id);
		String name = JOptionPane.showInputDialog(" enter user`s name " + " : ");
		writeOnFile(file, name);
		String salary = JOptionPane.showInputDialog(" enter user`s salary " + " : ");
		writeOnFile(file, salary);
		String age = JOptionPane.showInputDialog("enter user`s age" + " : ");
		writeOnFile(file, age);
		writeOnFile(file, "\n");
		return file;

	}

	public  void writeOnFile(File file1, String text) throws IOException {
		FileWriter writer = new FileWriter(file1, true);
		writer.write(text);
		writer.write("\t");
		writer.close();
	}

	public  String readFromFile() throws IOException {
		StringBuilder st = new StringBuilder();
		String saver = "";
		FileReader fr = new FileReader("D:\\source\\UpSkilling-Java\\FirstProject\\src\\main\\java\\edu\\hw.txt");
		BufferedReader textReader = new BufferedReader(fr);
		while ((saver = textReader.readLine()) != null) {

			st.append(saver);
			st.append("\n");
		}

		textReader.close();
		return st.toString();

	}

	public  void printInfo(File file1, String id) throws IOException {

		File f = new File("D:\\source\\UpSkilling-Java\\FirstProject\\src\\main\\java\\edu\\hw.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s = null;
		Pattern letter = Pattern.compile(id);

		while ((s = br.readLine()) != null) {
			Matcher words = letter.matcher(s);
			if (words.find())
				System.out.println(s);

		}
		fr.close();
	}

	public  void deleteFile() throws IOException {
		File f = new File("D:\\source\\UpSkilling-Java\\FirstProject\\src\\main\\java\\edu\\hw.txt");
		FileWriter writer = new FileWriter(f);
		writer.write("");
		writer.close();

	}
}
