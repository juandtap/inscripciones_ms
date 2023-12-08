package ups.inscripciones_ms.services;


import org.springframework.stereotype.Service;
import ups.inscripciones_ms.model.Estudiante;
import ups.inscripciones_ms.repository.EstudianteRepository;

import java.util.List;

@Service
public class EstudianteService {

    private EstudianteRepository estudianteRepository;

    public Estudiante create(Estudiante estudiante){
        return estudianteRepository.save(estudiante);
    }

    public List<Estudiante> listEstudiantes(){
        return estudianteRepository.findAll();
    }

    public void delete(Estudiante estudiante){
        estudianteRepository.delete(estudiante);
    }
}
