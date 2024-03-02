package com.example.demo.repository.modelo;

public class MatriculaTO {
	private String cedulaEstudiante;
	private String codMateria1;
	private String codMateria2;
	private String codMateria3;
	private String codMateria4;
	
	public MatriculaTO() {
		
	}
	
	public MatriculaTO(String cedulaEstudiante, String codMateria1, String codMateria2, String codMateria3,
			String codMateria4) {
		super();
		this.cedulaEstudiante = cedulaEstudiante;
		this.codMateria1 = codMateria1;
		this.codMateria2 = codMateria2;
		this.codMateria3 = codMateria3;
		this.codMateria4 = codMateria4;
	}
	public String getCedulaEstudiante() {
		return cedulaEstudiante;
	}
	public void setCedulaEstudiante(String cedulaEstudiante) {
		this.cedulaEstudiante = cedulaEstudiante;
	}
	public String getCodMateria1() {
		return codMateria1;
	}
	public void setCodMateria1(String codMateria1) {
		this.codMateria1 = codMateria1;
	}
	public String getCodMateria2() {
		return codMateria2;
	}
	public void setCodMateria2(String codMateria2) {
		this.codMateria2 = codMateria2;
	}
	public String getCodMateria3() {
		return codMateria3;
	}
	public void setCodMateria3(String codMateria3) {
		this.codMateria3 = codMateria3;
	}
	public String getCodMateria4() {
		return codMateria4;
	}
	public void setCodMateria4(String codMateria4) {
		this.codMateria4 = codMateria4;
	}
	@Override
	public String toString() {
		return "MatriculaTO [cedulaEstudiante=" + cedulaEstudiante + ", codMateria1=" + codMateria1 + ", codMateria2="
				+ codMateria2 + ", codMateria3=" + codMateria3 + ", codMateria4=" + codMateria4 + "]";
	}
	
	
	
}
