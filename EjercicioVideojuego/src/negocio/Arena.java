package negocio;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import entidad.Personaje;

@Component
@Scope("prototype")
public class Arena {

	@Autowired
	private Personaje p1;
	@Autowired
	private Personaje p2;

	public Arena(Personaje p1, Personaje p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Personaje combate() {
		Personaje pi = null;
		Personaje pf = null;

		System.out.println("Inicia combate: " + pi.getNombre());

		Scanner sc = new Scanner(System.in);

		do {
			pi.atacar(pf);

			if (pf.getPuntosVida() <= 0) {
				return pi;
			}

			pf.atacar(pi);

			if (pi.getPuntosVida() <= 0) {
				return pf;
			}

			System.out.println("Puntos de vida de " + pi.getNombre());
			System.out.println(pi.getPuntosVida());
			System.out.println("Puntos de vida de " + pf.getNombre());
			System.out.println(pf.getPuntosVida());
			System.out.println("Turno pasado, pulse enter");
			System.out.println();
			sc.nextLine();
		} while (true);
	}
}