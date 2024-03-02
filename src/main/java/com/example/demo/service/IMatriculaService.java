package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.MatriculaDTO;
import com.example.demo.repository.modelo.MatriculaTO;

public interface IMatriculaService {
	public void guardar (Matricula matricula);
	public List<MatriculaDTO> reportarMatriculas();
	public void guardarPorCedulaCodigo(String cedula, String codigo, Matricula matricula);
	public void matricularUsuario(MatriculaTO matricula);
}
