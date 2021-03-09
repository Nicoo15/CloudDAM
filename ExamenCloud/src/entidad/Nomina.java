package entidad;

import java.util.Date;;

public class Nomina {
	private int salario;
	private Date fecha;
	public int getSalario() {
		return salario;
	}
	
	@Override
	public String toString() {
		return "Nomina [salario=" + salario + ", fecha=" + fecha + "]";
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
