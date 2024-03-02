package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.IMateriaRepository;
import com.example.demo.repository.IMatriculaRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.MatriculaDTO;
import com.example.demo.repository.modelo.MatriculaTO;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
	@Autowired
	private IMatriculaRepository matriculaRepository;
	@Autowired
	private IMateriaRepository materiaRepository;
	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void guardar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.insertar(matricula);
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public List<MatriculaDTO> reportarMatriculas() {
		// TODO Auto-generated method stub
		return this.matriculaRepository.seleccionarTodos();
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void guardarPorCedulaCodigo(String cedula, String codigo, Matricula matricula) {
		// TODO Auto-generated method stub
		Estudiante estudiante = this.estudianteRepository.seleccionarPorCedula(cedula);
		Materia materia= this.materiaRepository.seleccionarPorCodigo(codigo);
		
		matricula.setEstudiante(estudiante);
		matricula.setMateria(materia);
		matricula.setFechaMatricula(LocalDateTime.now());
		this.guardar(matricula);
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void matricularUsuario(MatriculaTO matricula) {
		// TODO Auto-generated method stub
		Materia materia1 = new Materia();
		materia1.setCodigo(matricula.getCodMateria1());
		Materia materia2 = new Materia();
		materia2.setCodigo(matricula.getCodMateria2());
		Materia materia3 = new Materia();
		materia3.setCodigo(matricula.getCodMateria3());
		Materia materia4 = new Materia();
		materia4.setCodigo(matricula.getCodMateria4());

		Matricula matricula1 = new Matricula();
		matricula1.setMateria(materia1);
		Matricula matricula2 = new Matricula();
		matricula2.setMateria(materia2);
		Matricula matricula3 = new Matricula();
		matricula3.setMateria(materia3);
		Matricula matricula4 = new Matricula();
		matricula4.setMateria(materia4);

		List<Matricula> matriculas = new ArrayList<>();

		matriculas.add(matricula1);
		matriculas.add(matricula2);
		matriculas.add(matricula3);
		matriculas.add(matricula4);
		
		//Uso de la programacion en paralelo y funcional
		matriculas.parallelStream().forEach(matriculaFinal -> {
			String hilo = Thread.currentThread().getName();
			matriculaFinal.setNombreHilo(hilo);
			this.guardarPorCedulaCodigo(matricula.getCedulaEstudiante(), matriculaFinal.getMateria().getCodigo(), matriculaFinal);

		});
	}

}
