package entidad;

public class Habitacion {
	private TipoHabitacion tipo;
	private double m2;
	

	public TipoHabitacion getTipo() {
		return tipo;
	}

	public void setTipo(TipoHabitacion tipo) {
		this.tipo = tipo;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	

	@Override
	public String toString() {
		return "\n\tHabitacion [tipo=" + tipo + ", m2=" + m2 +  "]";
	}

}
