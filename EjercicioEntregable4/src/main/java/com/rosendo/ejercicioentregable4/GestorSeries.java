package com.rosendo.ejercicioentregable4;

import java.util.ArrayList;

public class GestorSeries {

	public ArrayList<Serie> getSeries() {
		ArrayList<Serie> series=new ArrayList<Serie>();
		series.add(new Serie("Pocoyó", "La historia de Pocoyó",2005,4,"https://sp-ao.shortpixel.ai/client/to_webp,q_glossy,ret_img,w_700,h_474/http://www.mamisybebes.com/wp-content/uploads/2007/08/Pocoyo-logo-post1.jpg"));
		series.add(new Serie("Doraemon", "La historia de Doraemon",1973,4,"https://www.latercera.com/resizer/WpZBplzkLu8X4DNZX4oQB38DjDg=/900x600/smart/arc-anglerfish-arc2-prod-copesa.s3.amazonaws.com/public/6NVTT7OLVRCMLDZ33LWJAAIBQI.png"));
		series.add(new Serie("Peppa Pig", "La historia de Peppa Pig",2004,6,"https://wallery.app/dufovot/peppa-pig-house-wallpaper-500x667.jpg"));
		series.add(new Serie("LadyBug","La historia de LadyBug",2015,4,"https://gaptain.com/blog/wp-content/uploads/2018/05/Juego-Ladybug.jpg"));
		series.add(new Serie("Bob Esponja","La historia de Bob",1999,13,"https://sp-ao.shortpixel.ai/client/to_webp,q_glossy,ret_img,w_960,h_720/https://www.cosas-que-pasan.com/wp-content/uploads/portada-facebook-bob-esponja.jpg"));
		series.add(new Serie("Pokémon","la histoia de pokemon",1997,24,"https://somoskudasai.com/wp-content/uploads/2019/08/portada-pokemon.jpg"));
		return series;
	}

}
