package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class MatriculaRepositoryImpl implements IMatriculaRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);

	}

	@Override
	@Transactional (value = TxType.NOT_SUPPORTED)
	public List<MatriculaDTO> seleccionarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<MatriculaDTO> myQuery = this.entityManager.createQuery("select new com.example.demo.repository.modelo.MatriculaDTO(m.estudiante.cedula, m.materia.codigo, m.nombreHilo, m.fechaMatricula) from Matricula m", MatriculaDTO.class);
		return myQuery.getResultList();
	}

}
