package test2;

public class App {

	public App() {
		Student student1 = new Student();
		student1.setName("张国庆");
		student1.setAge(20);
		student1.setId(1);
		student1.setGender(true);
		System.out.println(student1.toString());
	}

	public static void main(String[] args) {
		new App();
	}

}
