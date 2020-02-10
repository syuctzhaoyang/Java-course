package human;

import java.util.ArrayList;
import java.util.List;

public class PersonPool {
	private static PersonPool personPool = null;
	List<Person> personList = new ArrayList<Person>();
	private PersonPool(){
		for(int i =0;i < Constants.personNum;i++){
			Person tmp = new Person(i);
			switch(i / 500){
			case 0 : 
				tmp.setState(State.NORMAL);
				break;
			case 1 : 
				tmp.setState(State.NORMAL + 1);
				break;
			case 3 : 
				tmp.setState(State.NORMAL + 2);
				break;
			case 4 : 
				tmp.setState(State.NORMAL + 3);
				break;
			case 5 : 
				tmp.setState(State.NORMAL + 4);
				break;
			default: 
				tmp.setState(State.NORMAL + 5);
			}

			personList.add(tmp);
		}
	}
	public static PersonPool getInstance(){
		if(personPool == null){
			personPool = new PersonPool();
		}
		return personPool;
	}
	@Override
	public String toString() {
		return "PersonPool []";
	}
	public List<Person> getPersonList(){
		return personList;
	}
}
