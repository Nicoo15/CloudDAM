package mvc.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Coche {
	@Id
	@GeneratedValue
	private int vin;
	private String modelo;
	private String matricula;
	
	public int getVin() {
		return vin;
	}
	public void setVin(int vin) {
		this.vin = vin;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		return "Coche [vin=" + vin + ", modelo=" + modelo + ", matricula=" + matricula + ", getVin()=" + getVin()
				+ ", getModelo()=" + getModelo() + ", getMatricula()=" + getMatricula() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
