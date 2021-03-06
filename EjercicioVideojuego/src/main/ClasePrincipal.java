package main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidad.Arma;
import entidad.Espada;
import entidad.Guerrero;
import entidad.Curandero;
import entidad.Hechizo;
import entidad.Mago;
import entidad.Personaje;
import entidad.Rezo;
import entidad.Util;
import negocio.Arena;

public class ClasePrincipal {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("resources/context.xml");

		Guerrero p1 = new Guerrero();
		Espada espada = new Espada();

		Curandero p2 = new Curandero();
		Rezo rezo = new Rezo();

		Mago p3 = new Mago();
		Hechizo hechizo = new Hechizo();

		List<Personaje> listaPersonajes = new ArrayList<Personaje>();
		listaPersonajes.add(p1);
		listaPersonajes.add(p2);
		listaPersonajes.add(p3);

		int contrincante1 = Util.generadorNumeros(0, 2);
		int contrincante2 = 0;

		do {
			contrincante2 = Util.generadorNumeros(0, 2);
		} while (contrincante1 == contrincante2);

		Personaje luchador1 = listaPersonajes.get(contrincante1);
		Personaje luchador2 = listaPersonajes.get(contrincante2);

		Arena arena = new Arena(luchador1, luchador2);
		Personaje pg = arena.combate();

		System.out.println("Ha ganado la batalla" + pg.getNombre());
	}

}