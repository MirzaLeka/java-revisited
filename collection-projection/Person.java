package java2025;
import java.util.ArrayList;


public class Person {
	public int id;
	public String name;
	public int age;

	private ArrayList<Person> people = new ArrayList<Person>();

	Person() {
		setPeople();
	}

	Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	void setPeople() {
		people.add(new Person(1, "Mirza", 30));
		people.add(new Person(2, "Armin", 32));
		people.add(new Person(3, "Sead", 39));
		people.add(new Person(4, "Edis", 25));

	}

	ArrayList<Person> getPeople() {
		return people;
	}

}
