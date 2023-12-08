package ups.inscripciones_ms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ups.inscripciones_ms.model.Inscripcion;
import ups.inscripciones_ms.repository.InscripcionRepository;

import java.util.List;

@Service
public class InscripcionService {
    @Autowired
    private InscripcionRepository inscripcionRepository;

    public Inscripcion create(Inscripcion inscripcion){
        return inscripcionRepository.save(inscripcion);
    }

    public List<Inscripcion> listInscripcion(){
        return inscripcionRepository.findAll();
    }

}
