package mvc.modelo.negocio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.modelo.entidad.Coche;
import mvc.modelo.persistencia.DaoCoche;

@Service
public class GestorCoche {

	@Autowired
	private DaoCoche daoCoche;

	public boolean validar(Coche coche) {
		Optional<Coche> userBBDD = daoCoche.findByModelo(coche.getModelo());

		if (!userBBDD.isPresent()) {
			return false;
		}

		if (coche.getMatricula().equals(userBBDD.get().getMatricula())) {
			return true;
		} else {
			return false;
		}
	}
}
