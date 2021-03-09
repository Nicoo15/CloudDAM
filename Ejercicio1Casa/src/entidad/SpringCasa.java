package entidad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCasa {

	public static ApplicationContext context;
	static {
		context = new ClassPathXmlApplicationContext("context.xml");
		System.out.println("Contexto cargado.");
	}

	public static void main(String[] args) {

		Casa c = context.getBean("casa", Casa.class);
		System.out.println(c);

	}

}