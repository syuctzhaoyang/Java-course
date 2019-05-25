package sim2;

public class App {

	public App() {
		Huawei mycellphone1 = new Huawei();
		SimofChinaMobile chinaMobile = new SimofChinaMobile();
		chinaMobile.setNumber("13812345678");
		mycellphone1.setSim(chinaMobile);
		System.out.println(mycellphone1.getBrandname());
		System.out.println(mycellphone1.getphonenumber());
		System.out.println(mycellphone1.getcropname());
		
		System.out.println();
		
		SimofChinaUnicom chinaUnicom = new SimofChinaUnicom();
		chinaUnicom.setNumber("13087654321");
		mycellphone1.setSim(chinaUnicom);
		System.out.println(mycellphone1.getBrandname());
		System.out.println(mycellphone1.getphonenumber());
		System.out.println(mycellphone1.getcropname());
		
		System.out.println();
		
		Iphone mycellphone2 = new Iphone();
		mycellphone2.setSim(chinaUnicom);
		System.out.println(mycellphone2.getBrandname());
		System.out.println(mycellphone2.getphonenumber());
		System.out.println(mycellphone2.getcropname());
		
	}

	public static void main(String[] args) {
		new App();
	}

}
