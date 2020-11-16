package com.redsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entity.TipoLibro;
import com.redsocial.repository.TipoLibroRepository;

@Service
public class TipoLibroServiceImpl implements TipoLibroService{

	@Autowired
	private TipoLibroRepository repository;

	@Override
	public List<TipoLibro> listaTipolibro() {
		return repository.findAll();
	}
	

}
