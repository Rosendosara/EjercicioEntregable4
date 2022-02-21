package com.rosendo.ejercicioentregable4;

import java.util.ArrayList;

public class GestorPeliculas {
	
	public ArrayList<Pelicula> getPeliculas(){
		
		ArrayList<Pelicula> peliculas=new ArrayList<Pelicula>();
		
		peliculas.add(new Pelicula("Encanto","En lo alto de las montañas de Colombia hay un lugar encantado llamado Encanto.Aquí, en una casa mágica, vive la extraordinaria familia Madrigal donde todos tienen habilidades fantásticas.",2021,"https://www.elespectadorimaginario.com/wp-content/webpc-passthru.php?src=https://www.elespectadorimaginario.com/wp-content/uploads/encanto_cartel.jpg&nocache=1"));
		peliculas.add(new Pelicula("La Bella y la Bestia","Bella es una guapísima y solitaria joven que se ve obligada a recluirse en el castillo de Bestia, un monstruo que ha secuestrado y encarcelado a su padre después de que éste invadiera sus dominios buscando refugio en una noche de tormenta.",1991,"https://vueltalainfancia.files.wordpress.com/2011/12/caratula-bella-y-bestia.jpg"));
		peliculas.add(new Pelicula("El Rey León","Tras el asesinato de su padre, Simba, un joven león es apartado su reino y tendrá que descubrir con ayuda de amigos de la sabana africana el significado de la responsabilidad y la valentía. Más tarde volverá para recuperar el control de su reino.",2004,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR99XsrvHv18Kc6zjVY-K0YSMA0dMhUqJRHSgIEF-uUfA6XmR-X"));
		peliculas.add(new Pelicula("Del Revés","Crecer puede ser un camino lleno de baches y Riley no es una excepción. Se ve obligada a dejar atrás su vida en el Medio Oeste americano porque su padre encuentra un nuevo trabajo en San Francisco. Como todos nosotros, Riley se deja guiar por sus emociones: Alegría, Miedo, Ira, Enfado y Tristeza. Las emociones viven en el Cuartel General, el centro de control de la mente de Riley, desde donde la ayudan a superar los problemas de la vida cotidiana",2015,"https://buscandolamusica.files.wordpress.com/2017/09/del-reves-1449046696.jpeg?w=676"));
		peliculas.add(new Pelicula("Bichos"," Cada verano, un grupo de salvajes y holgazanes saltamontes, liderados por el temible Hopper y su muy estúpido hermano Molt, asedia una colonia de laboriosas hormigas con el único fin de robarles toda la comida que ellas han recogido poco a poco para afrontar el largo y frío invierno que se avecina",1998,"https://images-3.wuaki.tv/system/artworks/4341/master/bichos-una-aventura-en-miniatura-1558429549.jpeg"));
		peliculas.add(new Pelicula("Monstruos S.A","Monstruos S.A. es la mayor empresa de miedo del mundo, y su principal misión es asustar a los niños entrando al mundo humano a través de sus armarios. Sulley, un imponente personaje de dos metros, piel azul y cuernos, posee el récord de mayor número de sustos a niños.",2001,"https://cloud10.todocoleccion.online/libros-segunda-mano-novela-infantil-y-juvenil/tc/2017/09/09/01/97409147.webp"));
		return peliculas;
	}
}


