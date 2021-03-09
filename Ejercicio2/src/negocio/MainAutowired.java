package negocio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidad.Jugador;

public class MainAutowired {
	
	private static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("recursos/autowired.xml");
		
		Jugador j = context.getBean("jugador", Jugador.class);
		System.out.println(j);
		
	}
}