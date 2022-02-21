package com.rosendo.ejercicioentregable4;

public class Pelicula {
	private String titulo;
	private int estreno;
	private String urlImagen;
	private String sinopsis;
	public Pelicula() {
		super();
	}
	
	public Pelicula(String titulo,String sinopsis, int estreno, String urlImagen ) {
		super();
		this.titulo = titulo;
		this.estreno = estreno;
		this.sinopsis= sinopsis;
		this.urlImagen = urlImagen;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getEstreno() {
		return estreno;
	}

	public void setEstreno(int estreno) {
		this.estreno = estreno;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	

	
}
