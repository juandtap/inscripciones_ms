package ups.inscripciones_ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ups.inscripciones_ms.model.Estudiante;
import ups.inscripciones_ms.services.EstudianteService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/micro3/inscripciones")
public class InscripcionController {
    @Autowired
    private EstudianteService estudianteService;

    @PostMapping("/guardar")
    public ResponseEntity<Estudiante> save(@RequestBody Estudiante estudiante){
        Estudiante estudianteTemp = estudianteService.create(estudiante);

        try {
            return ResponseEntity.created(new URI("/micro3/inscripciones/guardar" +estudianteTemp.getCedula())).body(estudianteTemp);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Estudiante>> listAll() {
        return ResponseEntity.ok(estudianteService.listEstudiantes());
    }


}
