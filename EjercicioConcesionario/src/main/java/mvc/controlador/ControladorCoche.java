package mvc.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mvc.modelo.entidad.Coche;
import mvc.modelo.negocio.GestorCoche;

@Controller
public class ControladorCoche {

	@Autowired
	private GestorCoche gestorCoche;

	@PostMapping("/Coche")
	public String login(@RequestParam("modelo") String modelo, @RequestParam("matricula") String matricula,
			Model model) {

		System.out.println("Entrando login");
		Coche coche = new Coche();
		coche.setModelo(modelo);
		coche.setMatricula(matricula);

		boolean validado = gestorCoche.validar(coche);

		if (validado) {

			model.addAttribute("fecha", new Date());
			List<String> lista = new ArrayList<String>();
			lista.add(modelo);
			lista.add(matricula);
			model.addAttribute("lista", lista);
			return "inicio";
		} else {
			return "errorLogin";
		}
	}
}
