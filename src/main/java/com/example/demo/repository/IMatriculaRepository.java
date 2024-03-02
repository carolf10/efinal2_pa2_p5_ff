package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.MatriculaDTO;

public interface IMatriculaRepository {
	public void insertar (Matricula matricula);
	public List<MatriculaDTO> seleccionarTodos();
}
