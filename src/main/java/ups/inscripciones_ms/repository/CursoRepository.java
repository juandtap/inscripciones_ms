package ups.inscripciones_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ups.inscripciones_ms.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
