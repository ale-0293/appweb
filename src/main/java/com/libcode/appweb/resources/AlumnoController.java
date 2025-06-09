package com.libcode.appweb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libcode.appweb.entidades.Alumno;
import com.libcode.appweb.negocio.DataService;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    @Autowired
    private DataService dataService;

    // Obtener lista de alumnos
    @GetMapping
    public List<Alumno> getAlumnos() {
        return dataService.getAlumnos();
    }

    // Guardar nuevo alumno
    @PostMapping
    public String saveAlumno(@RequestBody Alumno alumno) {
        dataService.addAlumno(alumno);
        return "Alumno guardado";
    }

    // Editar alumno existente
    @PutMapping
    public String editAlumno(@RequestBody Alumno alumno) {
        dataService.editAlumno(alumno);
        return "Alumno editado";
    }

    // Eliminar alumno por ID
    @DeleteMapping("/{id}")
    public String deleteAlumno(@PathVariable Integer id) {
        Alumno alumno = new Alumno();
        alumno.setId(id);
        dataService.deleteAlumno(alumno);
        return "Alumno eliminado";
    }
}
