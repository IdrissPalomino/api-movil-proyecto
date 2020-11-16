package com.redsocial.service;

import java.util.List;

import com.redsocial.entity.Libro;

public interface LibroService {

	public abstract Libro inserta(Libro obj);
	public abstract List<Libro> listarLibro();
}
