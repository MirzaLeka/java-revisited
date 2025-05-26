package java2025;

public class LearnProjection {

	public static void main(String[] args) {

		var person = new Person();
		var people = person.getPeople();

		String[] names = people.stream().map(x -> x.name).toArray(String[]::new);

		for (String name: names) {
			  System.out.println(name);
			}

//		for (Person p: people) {
//			  System.out.println(p.name);
//
//			}

	}

}
