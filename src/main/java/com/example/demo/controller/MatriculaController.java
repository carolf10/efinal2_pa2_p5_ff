package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.MatriculaDTO;
import com.example.demo.repository.modelo.MatriculaTO;
import com.example.demo.service.IMatriculaService;

@Controller
@RequestMapping(value = "/matriculas")
public class MatriculaController {
	
	@Autowired
	private IMatriculaService matriculaService;
	
	@GetMapping(value = "/reporteMatriculas")
	public String consultar (MatriculaDTO dto, Model model) {
		List<MatriculaDTO> matriculas = this.matriculaService.reportarMatriculas();
		model.addAttribute("matriculas", matriculas);
		return "vistaListaMatricula";
	}
	
	@GetMapping(value = "/consultarMatricula")
	public String iniciarMatricula(MatriculaTO matriculaTO) {
		return "vistaMatricula";
	}

	@PostMapping (value = "/registrarMatricula")
	public String registrar (MatriculaTO matricula) {
		this.matriculaService.matricularUsuario(matricula);
		return "redirect:/matriculas/consultarMatricula";
	}

}
