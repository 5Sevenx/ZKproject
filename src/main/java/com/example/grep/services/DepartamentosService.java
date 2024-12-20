package com.example.grep.services;

import com.example.grep.interfaces.IDepartamentos;
import com.example.grep.models.Departamentos;
import com.example.grep.models.Finalidades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("departamentoService")
public class DepartamentosService {
    @Autowired
    private IDepartamentos departamentosRepository;

    public List<Departamentos> getAllDepartamentos() {
        return departamentosRepository.findAll();
    }

    public Departamentos getDepartamentos(Integer id) {
        return departamentosRepository.findById(id).orElse(null);
    }

    public Departamentos saveDepartamentos(Departamentos departamentos) {
        return departamentosRepository.save(departamentos);
    }
    public void deleteDepartamentos(Integer id) {
        departamentosRepository.deleteById(id);
    }

    public Departamentos getDepartamentoByNombre(String nombreDepartamento) {
        return departamentosRepository.findByNombreDepartamento(nombreDepartamento);
    }
}
