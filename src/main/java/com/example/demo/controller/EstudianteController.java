package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

//http://localhost:8085
@Controller
@RequestMapping(value = "/estudiantes")
public class EstudianteController {
	@Autowired
	private IEstudianteService estudianteService;
	
	@GetMapping(value = "/consultarEstudiante")
	public String consultar (Estudiante estudiante) {
		return "vistaEstudiante";
	}

	@PostMapping (value = "/registrarEstudiante")
	public String registrar (Estudiante estudiante) {
		this.estudianteService.guardar(estudiante);
		return "redirect:/estudiantes/consultarEstudiante";
	}
}
