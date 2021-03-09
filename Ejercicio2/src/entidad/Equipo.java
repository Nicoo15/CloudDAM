package entidad;

public class Equipo {
	private String nombre;
	private Jugador jugador;
	private String ciudad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Jugador getJugador() {
		return jugador;
	}
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", jugador=" + jugador + ", ciudad=" + ciudad + "]";
	}
	

}
