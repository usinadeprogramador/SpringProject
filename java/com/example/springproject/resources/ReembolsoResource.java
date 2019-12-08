package com.example.springproject.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.springproject.models.Reembolso;

import com.example.springproject.repository.ReembolsoRepository;

@RestController
@RequestMapping(value="/api")
public class ReembolsoResource {
	
	@Autowired
	ReembolsoRepository reembolsoRepository;
	
	@GetMapping("/reembolsos")
	public List<Reembolso> listaReembolsos(){
		return reembolsoRepository.findAll();
	}
	
}
