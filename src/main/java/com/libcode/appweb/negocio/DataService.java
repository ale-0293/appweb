package com.libcode.appweb.negocio;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.libcode.appweb.entidades.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Service
public class DataService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Alumno> getAlumnos() {
        Query query = entityManager.createQuery("SELECT a FROM Alumno a ORDER BY a.id ASC");
        return query.getResultList();
    }

    @Transactional
    public void addAlumno(Alumno alumno) {
        entityManager.persist(alumno);
    }

    @Transactional
    public void editAlumno(Alumno alumno) {
        entityManager.merge(alumno);
    }

    @Transactional
    public void deleteAlumno(Alumno alumno) {
        entityManager.remove(
                entityManager.contains(alumno)
                        ? alumno
                        : entityManager.merge(alumno)
        );
    }
}
