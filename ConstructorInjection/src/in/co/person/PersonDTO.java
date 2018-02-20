package in.co.person;

public class PersonDTO {

	private String name;
	private String salutation;
	private int age;

	public PersonDTO(String salutation, int age) {
		this.salutation = salutation;
		this.age = age;

	}

	public void Hello(String name) {
		System.out.println("Hello " + salutation + name + " Age: " + age);
	}

}
