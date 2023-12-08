package ups.inscripciones_ms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ups.inscripciones_ms.model.Curso;
import ups.inscripciones_ms.repository.CursoRepository;

import java.util.List;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public Curso create(Curso curso){
        return cursoRepository.save(curso);
    }

    public List<Curso> listCursos(){
        return cursoRepository.findAll();
    }

    public void delete(Curso curso) {
        cursoRepository.delete(curso);
    }
}
