package demo.modelo.entidad;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class Empleado {
	private String nombre;
	private String compañia;
	
	
	
	@Autowired
	private Nomina nomina;
	public Empleado() {
		super();
	}
	public Empleado(String nombre, String compañia) {
		super();
		this.nombre = nombre;
		this.compañia = compañia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	public Nomina getNomina() {
		return nomina;
	}
	public void setNomina(Nomina nomina) {
		this.nomina = nomina;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", compañia=" + compañia + ", nomina=" + nomina + "]";
	}

}
