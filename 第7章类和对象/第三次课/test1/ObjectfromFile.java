package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Student{
	int id;
	private String name;
	private double height;
	private boolean gender;
	public Student() {
		super();
	}
	public Student(int id, String name, double height, boolean gender) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", height=" + height + ", gender=" + gender + "]";
	}
	
	
}
public class ObjectfromFile {

	public ObjectfromFile() {
		
		File file = new File("resource.txt");
		char []byt = new char[1024];
		Student []student = null;
		String []record = null;
		try {
			FileReader fr = new FileReader(file);
//			BufferedReader br = new BufferedReader(fr);
//			String line;

			int len = fr.read(byt);
			String s = new String(byt, 0, len);
			record = s.split("\r\n");
			student = new Student[record.length];
			for(int i = 0; i < record.length;i++){
				String field[] = record[i].split("\t");
				int id = Integer.parseInt(field[0]);
				String name = field[1];
				double height = Double.parseDouble(field[2]);
				boolean gender = false;
				if(field[3].equals("ÄÐ")){
					gender = true;
				}
				student[i] = new Student(id, name, height, gender);
			}
			for( Student tmp:student){
				System.out.println(tmp.toString());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new ObjectfromFile();
	}

}
