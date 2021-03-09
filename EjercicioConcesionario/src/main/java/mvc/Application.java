package mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.eureka.EnableEurekaServer;

import mvc.modelo.entidad.Coche;
import mvc.modelo.persistencia.DaoCoche;

@SpringBootApplication
@EnableEurekaServer
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		DaoCoche dao = context.getBean("daoCoche", DaoCoche.class);
		
	
	}

}
