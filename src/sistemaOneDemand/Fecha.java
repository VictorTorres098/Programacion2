package sistemaOneDemand;

public class Fecha {
	private Integer dia;
	private Integer mes;
	private Integer anio;
	
	public Fecha(Integer dia, Integer mes, Integer anio) {
		if( dia > 31 || mes > 12) {
			throw new RuntimeException("Los datos ingresados no son validos");			
		}
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	public Integer getDia() {
		return dia;
	}
	public Integer getMes() {
		return mes;
	}
	public Integer getAnio() {
		return anio;
	}
	public String toString() {
		return dia.toString()+"/"+mes.toString()+"/"+anio.toString();
	}
	

}
