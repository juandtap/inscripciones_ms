package ups.inscripciones_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ups.inscripciones_ms.model.Inscripcion;

public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {
}
