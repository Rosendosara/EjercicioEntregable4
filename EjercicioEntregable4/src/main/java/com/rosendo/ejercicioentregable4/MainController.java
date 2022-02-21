package com.rosendo.ejercicioentregable4;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class MainController {

	@RequestMapping(value = "/")
	public String getHomePage() {
		return "home.html";
	}
	@RequestMapping(value = "/verpeliculas")
	public String getPaginaTaquilla(Model model) {

		GestorPeliculas gp = new GestorPeliculas();
		ArrayList<Pelicula> peliculas = gp.getPeliculas();
		model.addAttribute("taquilla", peliculas);
		return "taquilla.html";
	}
	@RequestMapping(value = "/verseries")
	public String getPaginaSerie(Model model) {

		GestorSeries gp = new GestorSeries();
		ArrayList<Serie> series = gp.getSeries();
		model.addAttribute("series", series);
		return "series.html";
		
	}

}