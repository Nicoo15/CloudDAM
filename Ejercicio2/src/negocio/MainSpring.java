package negocio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidad.Equipo;
import entidad.Jugador;


public class MainSpring {
	
	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("recursos/context.xml");
		
		Equipo e = context.getBean("equipo", Equipo.class);
		System.out.println(e);
	}

}
