package ups.inscripciones_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ups.inscripciones_ms.model.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}
