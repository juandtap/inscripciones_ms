package ups.inscripciones_ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ups.inscripciones_ms.model.Inscripcion;
import ups.inscripciones_ms.services.InscripcionService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/micro3/inscripciones")
public class InscripcionController {


    @Autowired
    private InscripcionService inscripcionService;

    @PostMapping("/guardar")
    public ResponseEntity<Inscripcion> save(@RequestBody Inscripcion inscripcion){
        Inscripcion inscripcionTemp = inscripcionService.create(inscripcion);

        try {
            return ResponseEntity.created(new URI("/micro3/inscripciones/guardar" +inscripcionTemp.getCedula())).body(inscripcionTemp);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Inscripcion>> listAll() {
        return ResponseEntity.ok(inscripcionService.listInscripcion());
    }


}
