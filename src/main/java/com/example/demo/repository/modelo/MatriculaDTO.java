package com.example.demo.repository.modelo;

import java.time.LocalDateTime;

public class MatriculaDTO {
	private String cedulaEstudiante;
	private String codigoMateria;
	private String nombreHilo;
	private LocalDateTime fechaMatricula;
	
	public MatriculaDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public MatriculaDTO(String cedulaEstudiante, String codigoMateria, String nombreHilo,
			LocalDateTime fechaMatricula) {
		super();
		this.cedulaEstudiante = cedulaEstudiante;
		this.codigoMateria = codigoMateria;
		this.nombreHilo = nombreHilo;
		this.fechaMatricula = fechaMatricula;
	}

	public String getCedulaEstudiante() {
		return cedulaEstudiante;
	}

	public void setCedulaEstudiante(String cedulaEstudiante) {
		this.cedulaEstudiante = cedulaEstudiante;
	}

	public String getCodigoMateria() {
		return codigoMateria;
	}

	public void setCodigoMateria(String codigoMateria) {
		this.codigoMateria = codigoMateria;
	}

	public String getNombreHilo() {
		return nombreHilo;
	}

	public void setNombreHilo(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}

	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	@Override
	public String toString() {
		return "MatriculaDTO [cedulaEstudiante=" + cedulaEstudiante + ", codigoMateria=" + codigoMateria
				+ ", nombreHilo=" + nombreHilo + ", fechaMatricula=" + fechaMatricula + "]";
	}


}
