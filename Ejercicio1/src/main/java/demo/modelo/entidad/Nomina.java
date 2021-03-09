package demo.modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
@Scope("prototype")
public class Nomina {
	private int Salario;
	private Date fecha;
	public int getSalario() {
		return Salario;
	}
	@Autowired
	public void setSalario(int salario) {
		Salario = salario;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Nomina [Salario=" + Salario + ", fecha=" + fecha + "]";
	}

}


