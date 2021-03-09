package mvc.modelo.persistencia;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mvc.modelo.entidad.Coche;

@Repository
public interface DaoCoche extends JpaRepository<Coche, Integer> {

	public Optional<Coche> findByModelo(String modelo);
}
