package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestThreadDemo4 {

	public static void main(String[] args) {
		TakeClass tc = new TakeClass();
		new Thread(tc).start();
		
		

	}
}
class TakeClass implements Runnable{
	Teacher zhao = new Teacher(1, "赵洋", "JAVA语言程序设计");
	
	@Override
	public void run() {
		HaveClass hc = new HaveClass();
		hc.setDaemon(true);
		hc.start();
		for(int i = 1;i <= 100;i++){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			zhao.speak();
			System.out.println(i);
		}
		System.out.println("今天的课程就到这里，下课，同学们再见！");
	}
}
class HaveClass extends Thread{
	StudentPool studentPool = StudentPool.getInstance();
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(Student tmp:studentPool.studentList){
				tmp.speak();
			}
		}
		
	}
}
class Student{
	private int id;
	private String name;
	private boolean gender;
	private int age;
	public Student(int id, String name, boolean gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
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
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age;
	}
	public void speak(){
		System.out.println("我是"+name+", 我跟您学习JAVA语言程序设计这门课！");
	}
}
class Teacher{
	private int id;
	private String name;
	private String course;
	public Teacher(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	public void speak(){
		System.out.println("上课了，我是授课教师，"+name+"，今天我们一起学习"+course+"这门课！");
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Teacher id=" + id + ", name=" + name + ", course=" + course;
	}
	
}
class Constants{
	public static int studentNumber = 10;
}
class StudentPool{
	private static StudentPool studentPool = new StudentPool();
    public static StudentPool getInstance(){
        return studentPool;
    }
    List<Student> studentList = new ArrayList<Student>();
	public List<Student> getStudentList() {
		return studentList;
	}
	String []LASTNAME = {"赵","钱","孙","李","周","吴","郑","王","冯","陈"};
	String []FirstNAME = {"建国","子涵","建军","欣怡","浩宇","梓涵","浩然","佳怡","子轩","馨月"};
	
	private StudentPool() {
		for (int i = 1; i <= Constants.studentNumber; i++) {
			Random random = new Random();
			int lastName_index = random.nextInt(10);
			int firstName_index = random.nextInt(10);
			boolean gender = (firstName_index %2) == 1 ? true :false;
			int age = 20 +(int) (1.5 * random.nextGaussian()); 
			Student student = new Student(i,LASTNAME[lastName_index] + FirstNAME[firstName_index],gender,age);
			studentList.add(student);
		}
	}
}