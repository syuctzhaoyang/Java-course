package human;

import java.util.Random;


public class Test {
	String []LASTNAME = {"赵","钱","孙","李","周","吴","郑","王","冯","陈"};
	String []FirstNAME = {"建国","子涵","建军","欣怡","浩宇","梓涵","浩然","佳怡","子轩","馨月"};
	Student []students;
	public Test() {
		students = new Student[Constants.studentNumber];
		for (int i = 0; i < Constants.studentNumber; i++) {
			Random random = new Random();
			int lastName_index = random.nextInt(10);
			int firstName_index = random.nextInt(10);
			students[i]= new Student(i+1,LASTNAME[lastName_index] + FirstNAME[firstName_index]);
		}
		for (Student tmp : students) {
			System.out.println(tmp);
		}
	}

	public static void main(String[] args) {
		new Test();
		
	}

}
class Constants{
	public static int studentNumber = 10;
}
class Student{
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		super();
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
	@Override
	public String toString() {
		return "Student id=" + id + ", name=" + name;
	}

}