package demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import demo.modelo.entidad.Empleado;
import demo.modelo.entidad.Nomina;


@SpringBootApplication
public class Ejercicio1Application {

	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);
		
		Empleado p = context.getBean("empleado", Empleado.class);
		System.out.println(p);
	}

}
