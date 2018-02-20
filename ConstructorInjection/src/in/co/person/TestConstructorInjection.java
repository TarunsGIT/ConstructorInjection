package in.co.person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorInjection {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"resources/spring.xml");
		PersonDTO dto = (PersonDTO) context.getBean("PERSON");
		dto.Hello("Tarun");

	}

}
